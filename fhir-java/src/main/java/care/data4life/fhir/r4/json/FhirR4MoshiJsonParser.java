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

import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;

import care.data4life.fhir.FhirException;
import care.data4life.fhir.json.FhirJsonParser;
import care.data4life.fhir.r4.model.Canonical;
import care.data4life.fhir.r4.model.FhirDate;
import care.data4life.fhir.r4.model.FhirDateTime;
import care.data4life.fhir.r4.model.FhirDecimal;
import care.data4life.fhir.r4.model.FhirInstant;
import care.data4life.fhir.r4.model.FhirR4Base;
import care.data4life.fhir.r4.model.FhirTime;


public class FhirR4MoshiJsonParser implements FhirJsonParser<FhirR4Base> {

    private Moshi moshi;

    FhirR4MoshiJsonParser(Moshi moshi) {
        this.moshi = moshi;
    }

    public FhirR4MoshiJsonParser() {
        this.moshi = new Moshi.Builder()
                .add(new FhirR4BaseAdapterFactory())
                .add(URL.class, new FhirUrlJsonAdapter().nullSafe())
                .add(BigDecimal.class, new BigDecimalJsonAdapter())
                .add(FhirDate.class, new FhirDateJsonAdapter().nullSafe())
                .add(FhirDateTime.class, new FhirDateTimeJsonAdapter().nullSafe())
                .add(FhirDecimal.class, new FhirDecimalJsonAdapter().nullSafe())
                .add(FhirInstant.class, new FhirInstantJsonAdapter().nullSafe())
                .add(FhirTime.class, new FhirTimeJsonAdapter().nullSafe())
                .add(Canonical.class, new CanonicalJsonAdapter())
                .build();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends FhirR4Base> T fromJson(Class<T> fhirType, String fhirJson) throws FhirException {
        try {
            return (T) moshi.adapter(FhirR4Base.class).fromJson(fhirJson);
        } catch (IOException e) {
            throw new FhirException(FhirException.ErrorType.DECODE, FhirException.ErrorCode.FAILED_TO_PARSE_JSON, e.getMessage());
        }
    }

    @Override
    public <T extends FhirR4Base> String toJson(T fhirObject) throws FhirException {
        return moshi.adapter(FhirR4Base.class).toJson(fhirObject);
    }

}
