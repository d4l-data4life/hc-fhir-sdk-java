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

package care.data4life.fhir.stu3.util;

import java.util.TimeZone;
import java.util.regex.Pattern;

import javax.annotation.Nullable;

import care.data4life.fhir.stu3.model.FhirDate;
import care.data4life.fhir.stu3.model.FhirDateTime;
import care.data4life.fhir.stu3.model.FhirInstant;
import care.data4life.fhir.stu3.model.FhirTime;
import care.data4life.fhir.util.Preconditions;

public final class FhirDateTimeParser {

    private static final String DATE_FORMAT_REGEX = "-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?";
    private static final Pattern DATE_PATTERN = Pattern.compile(DATE_FORMAT_REGEX);

    private static final String DATE_TIME_FORMAT_REGEX = "-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?";
    private static final Pattern DATE_TIME_PATTERN = Pattern.compile(DATE_TIME_FORMAT_REGEX);

    private static final String INSTANT_FORMAT_REGEX = "-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))))";
    private static final Pattern INSTANT_PATTERN = Pattern.compile(INSTANT_FORMAT_REGEX);

    private static final String TIME_FORMAT_REGEX = "([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?";
    private static final Pattern TIME_PATTERN = Pattern.compile(TIME_FORMAT_REGEX);

    private static final String ZERO_OFFSET_GMT_REGEX = "^GMT[+-]00:00$";
    static final Pattern ZERO_OFFSET_GMT_PATTERN = Pattern.compile(ZERO_OFFSET_GMT_REGEX);

    static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);


    private FhirDateTimeParser() {
    }


    public static FhirDate parseDate(String date) {
        Preconditions.checkArgument(DATE_PATTERN.matcher(date).matches());

        int length = date.length();
        int offset = 0;
        int year = parseInt(date, offset, offset += 4);

        Integer month = null;
        Integer day = null;
        if (offset + 1 < length) {
            offset++; // -
            month = parseInt(date, offset, offset += 2);

            if (offset + 1 < length) {
                offset++; // -
                day = parseInt(date, offset, length);
            }
        }

        return new FhirDate(year, month, day);
    }

    public static FhirDateTime parseDateTime(String dateTime) {
        Preconditions.checkArgument(DATE_TIME_PATTERN.matcher(dateTime).matches(), "date time is not in allowed format: " + DATE_TIME_FORMAT_REGEX);
        FhirDate date = null;
        FhirTime time = null;
        TimeZone timeZone = null;

        String[] splitDateTime = dateTime.split("T");
        date = parseDate(splitDateTime[0]);

        if (splitDateTime.length > 1) {
            String timeTimeZone = splitDateTime[1];
            String[] timeSplit = timeTimeZone.split("(?=(Z|\\+|-))");
            time = parseTime(timeSplit[0]);
            timeZone = parseTimeZone(timeSplit[1]);
        }

        return new FhirDateTime(date, time, timeZone);
    }

    public static FhirInstant parseInstant(String instant) {
        Preconditions.checkArgument(INSTANT_PATTERN.matcher(instant).matches(), "instant is not in allowed format: " + INSTANT_FORMAT_REGEX);
        return new FhirInstant(parseDateTime(instant));
    }

    public static FhirTime parseTime(String time) {
        Preconditions.checkArgument(TIME_PATTERN.matcher(time).matches(), "time is not in allowed format: " + TIME_FORMAT_REGEX);

        int length = time.length();
        int offset = 0;
        int hour = parseInt(time, offset, offset += 2);
        offset++;
        int minute = parseInt(time, offset, offset += 2);
        offset++;
        Integer second = parseInt(time, offset, offset += 2);

        Integer fractionOfSecond = null;
        Integer fractionPadding = null;
        if (offset + 1 < length) {
            offset++;
            fractionOfSecond = parseInt(time, offset, length);
            fractionPadding = parseIntLeftPadding(time, offset, length);
        }

        return new FhirTime(hour, minute, second, fractionOfSecond, fractionPadding);
    }


    @Nullable
    private static TimeZone parseTimeZone(String timeZoneString) {
        TimeZone timeZone = null;

        int offset = 0;
        char timeZoneIndicator = timeZoneString.charAt(offset);

        if (timeZoneIndicator == 'Z') {
            timeZone = TIMEZONE_Z;
        } else {
            String timezoneOffset = timeZoneString.substring(offset);

            String timeZoneId = GMT_ID + timezoneOffset;

            timeZone = TimeZone.getTimeZone(timeZoneId);
        }


        return timeZone;
    }


    private static int parseInt(String value, int beginIndex, int endIndex) throws NumberFormatException {
        if (beginIndex < 0 || endIndex > value.length() || beginIndex > endIndex) {
            throw new NumberFormatException(value);
        }
        // use same logic as in Integer.parseInt() but less generic we're not supporting negative values
        int i = beginIndex;
        int result = 0;
        int digit;
        if (i < endIndex) {
            digit = Character.digit(value.charAt(i++), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + value.substring(beginIndex, endIndex));
            }
            result = -digit;
        }
        while (i < endIndex) {
            digit = Character.digit(value.charAt(i++), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + value.substring(beginIndex, endIndex));
            }
            result *= 10;
            result -= digit;
        }
        return -result;
    }

    @Nullable
    private static Integer parseIntLeftPadding(String value, int beginIndex, int endIndex) throws NumberFormatException {
        if (beginIndex < 0 || endIndex > value.length() || beginIndex > endIndex) {
            throw new NumberFormatException(value);
        }

        int i = beginIndex;
        int count = 0;
        int digit;
        if (i < endIndex) {
            digit = Character.digit(value.charAt(i++), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + value.substring(beginIndex, endIndex));
            }
            if (digit == 0) {
                count++;
            } else {
                return null;
            }
        }
        while (i < endIndex) {
            digit = Character.digit(value.charAt(i++), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + value.substring(beginIndex, endIndex));
            }
            if (digit == 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
