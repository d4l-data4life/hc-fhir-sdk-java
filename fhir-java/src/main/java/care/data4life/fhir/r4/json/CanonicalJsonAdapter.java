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
import care.data4life.fhir.r4.model.Canonical;

public class CanonicalJsonAdapter extends JsonAdapter<Canonical> {
    private final static String DELIMITER = "|";

    @Nullable
    @Override
    public Canonical fromJson(JsonReader reader) throws IOException {
        if (reader.peek() == JsonReader.Token.NULL) {
            return null;
        }
        String value = reader.nextString();
        if (value.contains("|")) {
            String[] result = value.split("\\" + DELIMITER);
            return new Canonical(result[0], result[1]);
        }

        return new Canonical(value);
    }

    private String buildUrl(Canonical canonical) {
        if (canonical.version != null && !canonical.version.isEmpty()) {
            return canonical.url + DELIMITER + canonical.version;
        } else {
            return canonical.url;
        }
    }

    @Override
    public void toJson(JsonWriter writer, @Nullable Canonical value) throws IOException {
        if (value != null) {
            writer.value(buildUrl(value));
        } else {
            writer.nullValue();
        }
    }
}
