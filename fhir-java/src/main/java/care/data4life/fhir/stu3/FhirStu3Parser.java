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

package care.data4life.fhir.stu3;

import care.data4life.fhir.FhirException;
import care.data4life.fhir.FhirParser;
import care.data4life.fhir.json.FhirJsonParser;
import care.data4life.fhir.stu3.json.FhirStu3MoshiJsonParser;
import care.data4life.fhir.stu3.model.FhirStu3Base;

public final class FhirStu3Parser implements FhirParser<FhirStu3Base> {

    private FhirJsonParser jsonParser;

    public FhirStu3Parser() {
        this.jsonParser = new FhirStu3MoshiJsonParser();
    }

    @Override
    public <T extends FhirStu3Base> T toFhir(Class<T> fhirType, String fhirJson) throws FhirException {
        return jsonParser.fromJson(fhirType, fhirJson);
    }

    @Override
    public <T extends FhirStu3Base> String fromFhir(T fhirObject) throws FhirException {
        return jsonParser.toJson(fhirObject);
    }
}
