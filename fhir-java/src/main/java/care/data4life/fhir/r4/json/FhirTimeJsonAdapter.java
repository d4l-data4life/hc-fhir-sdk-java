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

package care.data4life.fhir.r4.json;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;

import java.io.IOException;

import javax.annotation.Nullable;

import care.data4life.fhir.r4.model.FhirTime;
import care.data4life.fhir.r4.util.FhirDateTimeFormatter;
import care.data4life.fhir.r4.util.FhirDateTimeParser;

public class FhirTimeJsonAdapter extends JsonAdapter<FhirTime> {

    @Nullable
    @Override
    public FhirTime fromJson(JsonReader reader) throws IOException {
        return FhirDateTimeParser.parseTime(reader.nextString());
    }

    @Override
    public void toJson(JsonWriter writer, @Nullable FhirTime value) throws IOException {
        if (value != null) {
            writer.value(FhirDateTimeFormatter.formatTime(value));
        }
    }
}
