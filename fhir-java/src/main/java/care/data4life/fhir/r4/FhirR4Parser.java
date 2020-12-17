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

package care.data4life.fhir.r4;

import care.data4life.fhir.FhirException;
import care.data4life.fhir.FhirParser;
import care.data4life.fhir.json.FhirJsonParser;
import care.data4life.fhir.r4.json.FhirR4MoshiJsonParser;
import care.data4life.fhir.r4.model.FhirR4Base;

public final class FhirR4Parser implements FhirParser<FhirR4Base> {

    private final FhirJsonParser<FhirR4Base> jsonParser;

    public FhirR4Parser() {
        this.jsonParser = new FhirR4MoshiJsonParser();
    }

    @Override
    public <T extends FhirR4Base> T toFhir(Class<T> fhirType, String fhirJson) throws FhirException {
        return (T) jsonParser.fromJson(fhirType, fhirJson);
    }

    @Override
    public <T extends FhirR4Base> String fromFhir(T fhirObject) throws FhirException {
        return jsonParser.toJson(fhirObject);
    }
}
