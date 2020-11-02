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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.annotation.Nullable;

import care.data4life.fhir.stu3.model.FhirDate;
import care.data4life.fhir.stu3.model.FhirDateTime;
import care.data4life.fhir.stu3.model.FhirInstant;
import care.data4life.fhir.stu3.model.FhirTime;

public final class FhirDateTimeConverter {

    private FhirDateTimeConverter() {
    }

    public static FhirDate toFhirDate(Date date) {
        return convertToFhirDate(date, null);
    }

    public static Date fromFhirDate(FhirDate fhirDate) {
        return convertToDate(fhirDate.getYear(), fhirDate.getMonth(), fhirDate.getDay(), null, null,
                null, null, null, null);
    }

    public static FhirDateTime toFhirDateTime(Date date) {
        Calendar calendar = getCalender(null);
        calendar.setTime(date);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour > 0) {
            TimeZone timeZone = TimeZone.getDefault();
            return new FhirDateTime(convertToFhirDate(date, timeZone),
                    convertToFhirTime(date, timeZone, false), TimeZone.getDefault());
        } else {
            return new FhirDateTime(convertToFhirDate(date, null), null, null);
        }
    }

    public static Date fromFhirDateTime(FhirDateTime fhirDateTime) {
        if (fhirDateTime.getTime() != null) {
            return convertToDate(fhirDateTime.getDate().getYear(), fhirDateTime.getDate().getMonth(),
                    fhirDateTime.getDate().getDay(), fhirDateTime.getTime().getHour(),
                    fhirDateTime.getTime().getMinute(), fhirDateTime.getTime().getSecond(),
                    fhirDateTime.getTime().getFractionOfSecond(), fhirDateTime.getTime().getFractionPadding(),
                    fhirDateTime.getTimeZone());
        } else {
            return convertToDate(fhirDateTime.getDate().getYear(), fhirDateTime.getDate().getMonth(),
                    fhirDateTime.getDate().getDay(), null, null, null, null, null,
                    fhirDateTime.getTimeZone());
        }
    }

    public static FhirInstant toFhirInstant(Date date) {
        TimeZone timeZone = TimeZone.getDefault();
        return new FhirInstant(
                new FhirDateTime(convertToFhirDate(date, timeZone), convertToFhirTime(date, timeZone, true),
                        TimeZone.getDefault()));
    }

    public static Date fromFhirInstant(FhirInstant fhirInstant) {
        return convertToDate(fhirInstant.getDateTime().getDate().getYear(),
                fhirInstant.getDateTime().getDate().getMonth(),
                fhirInstant.getDateTime().getDate().getDay(), fhirInstant.getDateTime().getTime().getHour(),
                fhirInstant.getDateTime().getTime().getMinute(),
                fhirInstant.getDateTime().getTime().getSecond(),
                fhirInstant.getDateTime().getTime().getFractionOfSecond(),
                fhirInstant.getDateTime().getTime().getFractionPadding(),
                fhirInstant.getDateTime().getTimeZone());
    }

    public static FhirTime toFhirTime(Date date) {
        return convertToFhirTime(date, null, false);
    }

    public static Date fromFhirTime(FhirTime fhirTime) {
        return convertToDate(null, null, null, fhirTime.getHour(), fhirTime.getMinute(),
                fhirTime.getSecond(), fhirTime.getFractionOfSecond(), fhirTime.getFractionPadding(), null);
    }

    private static Date convertToDate(
            @Nullable Integer year,
            @Nullable Integer month,
            @Nullable Integer day,
            @Nullable Integer hour,
            @Nullable Integer minute,
            @Nullable Integer second,
            @Nullable Integer fractionOfSecond,
            @Nullable Integer fractionPadding,
            @Nullable TimeZone timeZone
    ) {
        Calendar calendar = getCalender(timeZone);

        calendar.set(Calendar.YEAR, year != null ? year : 1970);
        calendar.set(Calendar.MONTH, month != null ? month - 1 : 0);
        calendar.set(Calendar.DAY_OF_MONTH, day != null ? day : 1);

        calendar.set(Calendar.HOUR_OF_DAY, hour != null ? hour : 0);
        calendar.set(Calendar.MINUTE, minute != null ? minute : 0);
        calendar.set(Calendar.SECOND, second != null ? second : 0);

        if (fractionOfSecond != null) {
            int correctionFactor = fractionPadding != null ? fractionPadding : 0;

            if (fractionOfSecond > 1000) {
                int length = String.valueOf(fractionOfSecond).length();
                correctionFactor += length - 3;
            }

            if (correctionFactor > 0) {
                double fraction = fractionOfSecond / Math.pow(10.0, correctionFactor);
                calendar.set(Calendar.MILLISECOND, (int) Math.round(fraction));
            } else {
                calendar.set(Calendar.MILLISECOND, fractionOfSecond);
            }
        }

        return calendar.getTime();
    }

    private static FhirDate convertToFhirDate(Date date, @Nullable TimeZone timeZone) {
        Calendar calendar = getCalender(timeZone);
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new FhirDate(year, month, day);
    }

    private static FhirTime convertToFhirTime(Date date, @Nullable TimeZone timeZone,
                                              boolean isInstant) {
        Calendar calendar = getCalender(timeZone);
        calendar.setTime(date);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int milliseconds = calendar.get(Calendar.MILLISECOND);
        int padding = 0;
        if (milliseconds > 0) {
            if (milliseconds > 100) {
                padding = 0;
            } else if (milliseconds > 10) {
                padding = 1;
            } else {
                padding = 2;
            }
        }

        if (isInstant) {
            return new FhirTime(hour, minute, second >= 0 ? second : null,
                    milliseconds > 0 ? milliseconds : null, padding > 0 ? padding : null);
        } else {
            return new FhirTime(hour, minute, second > 0 ? second : null,
                    milliseconds > 0 ? milliseconds : null, padding > 0 ? padding : null);
        }
    }

    private static Calendar getCalender(@Nullable TimeZone timeZone) {
        Calendar calendar = new GregorianCalendar(0, 0, 0);
        calendar.setTimeZone(timeZone != null ? timeZone : TimeZone.getTimeZone("GMT"));
        calendar.setLenient(false);
        return calendar;
    }
}
