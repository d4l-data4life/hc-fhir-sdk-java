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

package care.data4life.fhir.r4.model;

import com.squareup.moshi.Json;


/**
 * This value set contract specific codes for status.
 *
 * @see <a href="http://hl7.org/fhir/contract-publicationstatus">ContractResourcePublicationStatusCodes</a>
 */
public enum CodeSystemContractResourcePublicationStatusCodes {

    /**
     * Contract is augmented with additional information to correct errors in a predecessor or to
     * updated values in a predecessor. Usage: Contract altered within effective time. Precedence
     * Order = 9. Comparable FHIR and v.3 status codes: revised; replaced.
     */
    @Json(name = "amended")
    AMENDED,

    /**
     * Contract is augmented with additional information that was missing from a predecessor
     * Contract. Usage: Contract altered within effective time. Precedence Order = 9. Comparable
     * FHIR and v.3 status codes: updated, replaced.
     */
    @Json(name = "appended")
    APPENDED,

    /**
     * Contract is terminated due to failure of the Grantor and/or the Grantee to fulfil one or more
     * contract provisions. Usage: Abnormal contract termination. Precedence Order = 10. Comparable
     * FHIR and v.3 status codes: stopped; failed; aborted.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * Contract is pended to rectify failure of the Grantor or the Grantee to fulfil contract
     * provision(s). E.g., Grantee complaint about Grantor's failure to comply with contract
     * provisions. Usage: Contract pended. Precedence Order = 7. Comparable FHIR and v.3 status
     * codes: on hold; pended; suspended.
     */
    @Json(name = "disputed")
    DISPUTED,

    /**
     * Contract was created in error. No Precedence Order.  Status may be applied to a Contract with
     * any status.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Contract execution pending; may be executed when either the Grantor or the Grantee accepts
     * the contract provisions by signing. I.e., where either the Grantor or the Grantee has signed,
     * but not both. E.g., when an insurance applicant signs the insurers application, which
     * references the policy. Usage: Optional first step of contract execution activity.  May be
     * skipped and contracting activity moves directly to executed state. Precedence Order = 3.
     * Comparable FHIR and v.3 status codes: draft; preliminary; planned; intended; active.
     */
    @Json(name = "executable")
    EXECUTABLE,

    /**
     * Contract is activated for period stipulated when both the Grantor and Grantee have signed it.
     * Usage: Required state for normal completion of contracting activity.  Precedence Order = 6.
     * Comparable FHIR and v.3 status codes: accepted; completed.
     */
    @Json(name = "executed")
    EXECUTED,

    /**
     * Contract execution is suspended while either or both the Grantor and Grantee propose and
     * consider new or revised contract provisions. I.e., where the party which has not signed
     * proposes changes to the terms.  E .g., a life insurer declines to agree to the signed
     * application because the life insurer has evidence that the applicant, who asserted to being
     * younger or a non-smoker to get a lower premium rate - but offers instead to agree to a higher
     * premium based on the applicants actual age or smoking status. Usage: Optional contract
     * activity between executable and executed state. Precedence Order = 4. Comparable FHIR and v.3
     * status codes: in progress; review; held.
     */
    @Json(name = "negotiable")
    NEGOTIABLE,

    /**
     * Contract is a proposal by either the Grantor or the Grantee. Aka - A Contract hard copy or
     * electronic 'template', 'form' or 'application'. E.g., health insurance application; consent
     * directive form. Usage: Beginning of contract negotiation, which may have been completed as a
     * precondition because used for 0..* contracts. Precedence Order = 2. Comparable FHIR and v.3
     * status codes: requested; new.
     */
    @Json(name = "offered")
    OFFERED,

    /**
     * Contract template is available as the basis for an application or offer by the Grantor or
     * Grantee. E.g., health insurance policy; consent directive policy.  Usage: Required initial
     * contract activity, which may have been completed as a precondition because used for 0..*
     * contracts. Precedence Order = 1. Comparable FHIR and v.3 status codes: proposed; intended.
     */
    @Json(name = "policy")
    POLICY,

    /**
     * Execution of the Contract is not completed because either or both the Grantor and Grantee
     * decline to accept some or all of the contract provisions. Usage: Optional contract activity
     * between executable and abnormal termination. Precedence Order = 5. Comparable FHIR and v.3
     * status codes:  stopped; cancelled.
     */
    @Json(name = "rejected")
    REJECTED,

    /**
     * Beginning of a successor Contract at the termination of predecessor Contract lifecycle.
     * Usage: Follows termination of a preceding Contract that has reached its expiry date.
     * Precedence Order = 13. Comparable FHIR and v.3 status codes: superseded.
     */
    @Json(name = "renewed")
    RENEWED,

    /**
     * A Contract that is rescinded.  May be required prior to replacing with an updated Contract.
     * Comparable FHIR and v.3 status codes: nullified.
     */
    @Json(name = "revoked")
    REVOKED,

    /**
     * Contract is reactivated after being pended because of faulty execution. *E.g., competency of
     * the signer(s), or where the policy is substantially different from and did not accompany the
     * application/form so that the applicant could not compare them. Aka - ''reactivated''. Usage:
     * Optional stage where a pended contract is reactivated. Precedence Order = 8. Comparable FHIR
     * and v.3 status codes: reactivated.
     */
    @Json(name = "resolved")
    RESOLVED,

    /**
     * Contract reaches its expiry date. It might or might not be renewed or renegotiated. Usage:
     * Normal end of contract period. Precedence Order = 12. Comparable FHIR and v.3 status codes:
     * Obsoleted.
     */
    @Json(name = "terminated")
    TERMINATED,
}
