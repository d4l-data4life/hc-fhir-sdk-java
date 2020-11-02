/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package care.data4life.fhir.r4.util;

import java.util.TimeZone;

import javax.annotation.Nullable;

import care.data4life.fhir.r4.model.FhirDate;
import care.data4life.fhir.r4.model.FhirDateTime;
import care.data4life.fhir.r4.model.FhirInstant;
import care.data4life.fhir.r4.model.FhirTime;

import static care.data4life.fhir.r4.util.FhirDateTimeParser.ZERO_OFFSET_GMT_PATTERN;

public final class FhirDateTimeFormatter {

    private static final String DATE_FORMAT_FULL = "%Y-%M-%D";
    private static final String DATE_FORMAT_YEAR_MONTH = "%Y-%M";
    private static final String DATE_FORMAT_YEAR = "%Y";
    private static final String DATE_TIME_FORMAT = "%Y-%M-%DT%h:%m:%s%z";
    private static final String INSTANT_FORMAT = "%Y-%M-%DT%h:%m:%s%z";
    private static final String TIME_FORMAT = "%h:%m:%s";

    private FhirDateTimeFormatter() {
    }

    public static String formatDate(FhirDate date) {
        if (date.getMonth() != null && date.getDay() != null) {
            return doFormat(DATE_FORMAT_FULL, date.getYear(), date.getMonth(), date.getDay(), null, null,
                    null, null, null, null);
        } else if (date.getMonth() != null) {
            return doFormat(DATE_FORMAT_YEAR_MONTH, date.getYear(), date.getMonth(), null, null, null,
                    null, null, null, null);
        } else {
            return doFormat(DATE_FORMAT_YEAR, date.getYear(), null, null, null, null, null, null, null,
                    null);
        }
    }

    public static String formatDateTime(FhirDateTime dateTime) {
        if (dateTime.getTime() != null) {
            return doFormat(DATE_TIME_FORMAT, dateTime.getDate().getYear(), dateTime.getDate().getMonth(),
                    dateTime.getDate().getDay(), dateTime.getTime().getHour(), dateTime.getTime().getMinute(),
                    dateTime.getTime().getSecond(), dateTime.getTime().getFractionOfSecond(),
                    dateTime.getTime().getFractionPadding(), dateTime.getTimeZone());
        } else {
            return formatDate(dateTime.getDate());
        }
    }

    public static String formatInstant(FhirInstant instant) {
        return doFormat(INSTANT_FORMAT, instant.getDateTime().getDate().getYear(),
                instant.getDateTime().getDate().getMonth(), instant.getDateTime().getDate().getDay(),
                instant.getDateTime().getTime().getHour(), instant.getDateTime().getTime().getMinute(),
                instant.getDateTime().getTime().getSecond(),
                instant.getDateTime().getTime().getFractionOfSecond(),
                instant.getDateTime().getTime().getFractionPadding(), instant.getDateTime().getTimeZone());
    }

    public static String formatTime(FhirTime time) {
        return doFormat(TIME_FORMAT, null, null, null, time.getHour(), time.getMinute(),
                time.getSecond(), time.getFractionOfSecond(), time.getFractionPadding(), null);
    }

    private static String doFormat(
            String format,
            @Nullable Integer year,
            @Nullable Integer month,
            @Nullable Integer day,
            @Nullable Integer hour,
            @Nullable Integer minute,
            @Nullable Integer second,
            @Nullable Integer fractionOfSecond,
            @Nullable Integer fractionPadding,
            @Nullable TimeZone timeZone
    ) throws IllegalArgumentException {

        int fidx = 0;
        int flen = format.length();
        StringBuilder buffer = new StringBuilder();

        while (fidx < flen) {
            char fch = format.charAt(fidx++);

            if (fch != '%') {  // not a meta character
                buffer.append(fch);
                continue;
            }

            // seen meta character. we don't do error check against the format
            switch (format.charAt(fidx++)) {
                case 'Y': // year
                    formatYear(year, buffer);
                    break;

                case 'M': // month
                    formatMonth(month, buffer);
                    break;

                case 'D': // day
                    formatDay(day, buffer);
                    break;

                case 'h': // hour
                    formatHour(hour, buffer);
                    break;

                case 'm': // minutes
                    formatMinute(minute, buffer);
                    break;

                case 's': // parse seconds.
                    formatSecond(second, fractionOfSecond, fractionPadding, buffer);
                    break;

                case 'z': // time zone
                    formatTimeZone(timeZone, buffer);
                    break;

                default:
                    // illegal meta character. impossible.
                    throw new InternalError();
            }
        }

        return buffer.toString();
    }

    private static void formatYear(@Nullable Integer year, StringBuilder buf) {
        String s;
        if (year == null) {
            s = "";
        } else if (year <= 0) { // negative value
            s = Integer.toString(1 - year);
        } else // positive value
        {
            s = Integer.toString(year);
        }

        while (s.length() < 4) {
            s = '0' + s;
        }

        if (year != null && year <= 0) {
            s = '-' + s;
        }

        buf.append(s);
    }

    private static void formatMonth(@Nullable Integer month, StringBuilder buf) {
        formatTwoDigits(month, buf);
    }

    private static void formatDay(@Nullable Integer day, StringBuilder buf) {
        formatTwoDigits(day, buf);
    }

    private static void formatHour(@Nullable Integer hour, StringBuilder buf) {
        formatTwoDigits(hour, buf);
    }

    private static void formatMinute(@Nullable Integer minute, StringBuilder buffer) {
        formatTwoDigits(minute, buffer);
    }

    private static void formatSecond(@Nullable Integer second, @Nullable Integer fractionOfSecond,
                                     @Nullable Integer fractionPadding, StringBuilder buffer) {
        formatTwoDigits(second, buffer);
        if (fractionOfSecond != null && fractionOfSecond > 0) {
            buffer.append('.');
            if (fractionPadding != null) {
                String fraction = String.valueOf(fractionOfSecond);
                buffer.append(
                        String.format(("%0" + (fractionPadding + fraction.length()) + "d"), fractionOfSecond));
            } else {
                buffer.append(Integer.toString(fractionOfSecond));
            }
        }
    }

    /**
     * formats time zone specifier.
     */
    private static void formatTimeZone(@Nullable TimeZone timeZone, StringBuilder buffer) {
        if (timeZone == null) return;

        TimeZone.getTimeZone("UTC");

        int offset = timeZone.getRawOffset();

        if (offset == 0 && !ZERO_OFFSET_GMT_PATTERN.matcher(timeZone.getID()).matches()) {
            buffer.append('Z');
            return;
        }

        if (offset >= 0) {
            buffer.append('+');
        } else {
            buffer.append('-');
            offset *= -1;
        }

        offset /= 60 * 1000; // offset is in milli-seconds

        formatTwoDigits(offset / 60, buffer);
        buffer.append(':');
        formatTwoDigits(offset % 60, buffer);
    }

    /**
     * formats Integer into two-character-wide string.
     */
    private static void formatTwoDigits(@Nullable Integer n, StringBuilder buffer) {
        if (n == null) {
            buffer.append("00");
        } else {
            // n is always non-negative.
            if (n < 10) buffer.append('0');
            buffer.append(n);
        }
    }
}
