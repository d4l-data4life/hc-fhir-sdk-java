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

package care.data4life.fhir.stu3.model;

import com.squareup.moshi.Json;

/**
 * CodeSystems.java
 *
 * Generated from FHIR 3.0.1.11917 on 2020-07-29
 */
public class CodeSystems {

  /**
   * A type defined by FHIR that is an abstract type
   *
   * @see <a href="http://hl7.org/fhir/abstract-types">AbstractType</a>
   */
  public enum AbstractType {

    /**
     * A place holder that means any kind of data type
     */
    @Json(name = "Type")
    TYPE,

    /**
     * A place holder that means any kind of resource
     */
    @Json(name = "Any")
    ANY,
  }

  /**
   * Indicates whether the account is available to be used.
   *
   * @see <a href="http://hl7.org/fhir/account-status">AccountStatus</a>
   */
  public enum AccountStatus {

    /**
     * This account is active and may be used.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * This account is inactive and should not be used to track financial information.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Defines behavior for an action or a group for how many times that item may be repeated
   *
   * @see <a href="http://hl7.org/fhir/action-cardinality-behavior">ActionCardinalityBehavior</a>
   */
  public enum ActionCardinalityBehavior {

    /**
     * The action may only be selected one time
     */
    @Json(name = "single")
    SINGLE,

    /**
     * The action may be selected multiple times
     */
    @Json(name = "multiple")
    MULTIPLE,
  }

  /**
   * Defines the kinds of conditions that can appear on actions
   *
   * @see <a href="http://hl7.org/fhir/action-condition-kind">ActionConditionKind</a>
   */
  public enum ActionConditionKind {

    /**
     * The condition describes whether or not a given action is applicable
     */
    @Json(name = "applicability")
    APPLICABILITY,

    /**
     * The condition is a starting condition for the action
     */
    @Json(name = "start")
    START,

    /**
     * The condition is a stop, or exit condition for the action
     */
    @Json(name = "stop")
    STOP,
  }

  /**
   * Defines organization behavior of a group
   *
   * @see <a href="http://hl7.org/fhir/action-grouping-behavior">ActionGroupingBehavior</a>
   */
  public enum ActionGroupingBehavior {

    /**
     * Any group marked with this behavior should be displayed as a visual group to the end user
     */
    @Json(name = "visual-group")
    VISUAL_GROUP,

    /**
     * A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so
     */
    @Json(name = "logical-group")
    LOGICAL_GROUP,

    /**
     * A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times per day". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of "AtMostOne", unless it's a required action, in which case, it would be "ExactlyOne"
     */
    @Json(name = "sentence-group")
    SENTENCE_GROUP,
  }

  /**
   * List of allowable action which this resource can request.
   *
   * @see <a href="http://hl7.org/fhir/actionlist">ActionList</a>
   */
  public enum ActionList {

    /**
     * Cancel, reverse or nullify the target resource.
     */
    @Json(name = "cancel")
    CANCEL,

    /**
     * Check for previously un-read/ not-retrieved resources.
     */
    @Json(name = "poll")
    POLL,

    /**
     * Re-process the target resource.
     */
    @Json(name = "reprocess")
    REPROCESS,

    /**
     * Retrieve the processing status of the target resource.
     */
    @Json(name = "status")
    STATUS,
  }

  /**
   * The type of participant for the action
   *
   * @see <a href="http://hl7.org/fhir/action-participant-type">ActionParticipantType</a>
   */
  public enum ActionParticipantType {

    /**
     * The participant is the patient under evaluation
     */
    @Json(name = "patient")
    PATIENT,

    /**
     * The participant is a practitioner involved in the patient's care
     */
    @Json(name = "practitioner")
    PRACTITIONER,

    /**
     * The participant is a person related to the patient
     */
    @Json(name = "related-person")
    RELATED_PERSON,
  }

  /**
   * Defines selection frequency behavior for an action or group
   *
   * @see <a href="http://hl7.org/fhir/action-precheck-behavior">ActionPrecheckBehavior</a>
   */
  public enum ActionPrecheckBehavior {

    /**
     * An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider "pre-checking" such an action as a convenience for the user
     */
    @Json(name = "yes")
    YES,

    /**
     * An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not "pre-check" such an action
     */
    @Json(name = "no")
    NO,
  }

  /**
   * Defines the types of relationships between actions
   *
   * @see <a href="http://hl7.org/fhir/action-relationship-type">ActionRelationshipType</a>
   */
  public enum ActionRelationshipType {

    /**
     * The action must be performed before the start of the related action
     */
    @Json(name = "before-start")
    BEFORE_START,

    /**
     * The action must be performed before the related action
     */
    @Json(name = "before")
    BEFORE,

    /**
     * The action must be performed before the end of the related action
     */
    @Json(name = "before-end")
    BEFORE_END,

    /**
     * The action must be performed concurrent with the start of the related action
     */
    @Json(name = "concurrent-with-start")
    CONCURRENT_WITH_START,

    /**
     * The action must be performed concurrent with the related action
     */
    @Json(name = "concurrent")
    CONCURRENT,

    /**
     * The action must be performed concurrent with the end of the related action
     */
    @Json(name = "concurrent-with-end")
    CONCURRENT_WITH_END,

    /**
     * The action must be performed after the start of the related action
     */
    @Json(name = "after-start")
    AFTER_START,

    /**
     * The action must be performed after the related action
     */
    @Json(name = "after")
    AFTER,

    /**
     * The action must be performed after the end of the related action
     */
    @Json(name = "after-end")
    AFTER_END,
  }

  /**
   * Defines requiredness behavior for selecting an action or an action group
   *
   * @see <a href="http://hl7.org/fhir/action-required-behavior">ActionRequiredBehavior</a>
   */
  public enum ActionRequiredBehavior {

    /**
     * An action with this behavior must be included in the actions processed by the end user; the end user may not choose not to include this action
     */
    @Json(name = "must")
    MUST,

    /**
     * An action with this behavior may be included in the set of actions processed by the end user
     */
    @Json(name = "could")
    COULD,

    /**
     * An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included
     */
    @Json(name = "must-unless-documented")
    MUST_UNLESS_DOCUMENTED,
  }

  /**
   * Defines selection behavior of a group
   *
   * @see <a href="http://hl7.org/fhir/action-selection-behavior">ActionSelectionBehavior</a>
   */
  public enum ActionSelectionBehavior {

    /**
     * Any number of the actions in the group may be chosen, from zero to all
     */
    @Json(name = "any")
    ANY,

    /**
     * All the actions in the group must be selected as a single unit
     */
    @Json(name = "all")
    ALL,

    /**
     * All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected
     */
    @Json(name = "all-or-none")
    ALL_OR_NONE,

    /**
     * The end user must choose one and only one of the selectable actions in the group. The user may not choose none of the actions in the group
     */
    @Json(name = "exactly-one")
    EXACTLY_ONE,

    /**
     * The end user may choose zero or at most one of the actions in the group
     */
    @Json(name = "at-most-one")
    AT_MOST_ONE,

    /**
     * The end user must choose a minimum of one, and as many additional as desired
     */
    @Json(name = "one-or-more")
    ONE_OR_MORE,
  }

  /**
   * The type of action to be performed
   *
   * @see <a href="http://hl7.org/fhir/action-type">ActionType</a>
   */
  public enum ActionType {

    /**
     * The action is to create a new resource
     */
    @Json(name = "create")
    CREATE,

    /**
     * The action is to update an existing resource
     */
    @Json(name = "update")
    UPDATE,

    /**
     * The action is to remove an existing resource
     */
    @Json(name = "remove")
    REMOVE,

    /**
     * The action is to fire a specific event
     */
    @Json(name = "fire-event")
    FIRE_EVENT,
  }

  /**
   * High-level categorization of the type of activity
   *
   * @see <a href="http://hl7.org/fhir/activity-definition-category">ActivityDefinitionCategory</a>
   */
  public enum ActivityDefinitionCategory {

    /**
     * The activity is intended to provide or is related to treatment of the patient
     */
    @Json(name = "treatment")
    TREATMENT,

    /**
     * The activity is intended to provide or is related to education of the patient
     */
    @Json(name = "education")
    EDUCATION,

    /**
     * The activity is intended to perform or is related to assessment of the patient
     */
    @Json(name = "assessment")
    ASSESSMENT,
  }

  /**
   * The type of an address (physical / postal)
   *
   * @see <a href="http://hl7.org/fhir/address-type">AddressType</a>
   */
  public enum AddressType {

    /**
     * Mailing addresses - PO Boxes and care-of addresses.
     */
    @Json(name = "postal")
    POSTAL,

    /**
     * A physical address that can be visited.
     */
    @Json(name = "physical")
    PHYSICAL,

    /**
     * An address that is both physical and postal.
     */
    @Json(name = "both")
    BOTH,
  }

  /**
   * The use of an address
   *
   * @see <a href="http://hl7.org/fhir/address-use">AddressUse</a>
   */
  public enum AddressUse {

    /**
     * A communication address at a home.
     */
    @Json(name = "home")
    HOME,

    /**
     * An office address. First choice for business related contacts during business hours.
     */
    @Json(name = "work")
    WORK,

    /**
     * A temporary address. The period can provide more detailed information.
     */
    @Json(name = "temp")
    TEMP,

    /**
     * This address is no longer in use (or was never correct, but retained for records).
     */
    @Json(name = "old")
    OLD,
  }

  /**
   * The gender of a person used for administrative purposes.
   *
   * @see <a href="http://hl7.org/fhir/administrative-gender">AdministrativeGender</a>
   */
  public enum AdministrativeGender {

    /**
     * Male
     */
    @Json(name = "male")
    MALE,

    /**
     * Female
     */
    @Json(name = "female")
    FEMALE,

    /**
     * Other
     */
    @Json(name = "other")
    OTHER,

    /**
     * Unknown
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Overall categorization of the event, e.g. real or potential
   *
   * @see <a href="http://hl7.org/fhir/adverse-event-category">AdverseEventCategory</a>
   */
  public enum AdverseEventCategory {

    /**
     * AE
     */
    @Json(name = "AE")
    AE,

    /**
     * PAE
     */
    @Json(name = "PAE")
    PAE,
  }

  /**
   * TODO
   *
   * @see <a href="http://hl7.org/fhir/adverse-event-causality">AdverseEventCausality</a>
   */
  public enum AdverseEventCausality {

    /**
     * causality1
     */
    @Json(name = "causality1")
    CAUSALITY1,

    /**
     * causality2
     */
    @Json(name = "causality2")
    CAUSALITY2,
  }

  /**
   * TODO
   *
   * @see <a href="http://hl7.org/fhir/adverse-event-causality-assess">AdverseEventCausalityAssessment</a>
   */
  public enum AdverseEventCausalityAssessment {

    /**
     * assess1
     */
    @Json(name = "assess1")
    ASSESS1,

    /**
     * assess2
     */
    @Json(name = "assess2")
    ASSESS2,
  }

  /**
   * TODO
   *
   * @see <a href="http://hl7.org/fhir/adverse-event-causality-method">AdverseEventCausalityMethod</a>
   */
  public enum AdverseEventCausalityMethod {

    /**
     * method1
     */
    @Json(name = "method1")
    METHOD1,

    /**
     * method2
     */
    @Json(name = "method2")
    METHOD2,
  }

  /**
   * TODO
   *
   * @see <a href="http://hl7.org/fhir/adverse-event-causality-result">AdverseEventCausalityResult</a>
   */
  public enum AdverseEventCausalityResult {

    /**
     * result1
     */
    @Json(name = "result1")
    RESULT1,

    /**
     * result2
     */
    @Json(name = "result2")
    RESULT2,
  }

  /**
   * TODO (and should this be required?)
   *
   * @see <a href="http://hl7.org/fhir/adverse-event-outcome">AdverseEventOutcome</a>
   */
  public enum AdverseEventOutcome {

    /**
     * resolved
     */
    @Json(name = "resolved")
    RESOLVED,

    /**
     * recovering
     */
    @Json(name = "recovering")
    RECOVERING,

    /**
     * ongoing
     */
    @Json(name = "ongoing")
    ONGOING,

    /**
     * resolvedWithSequelae
     */
    @Json(name = "resolvedWithSequelae")
    RESOLVEDWITHSEQUELAE,

    /**
     * fatal
     */
    @Json(name = "fatal")
    FATAL,

    /**
     * unknown
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Overall seriousness of this event for the patient
   *
   * @see <a href="http://hl7.org/fhir/adverse-event-seriousness">AdverseEventSeriousness</a>
   */
  public enum AdverseEventSeriousness {

    /**
     * mild
     */
    @Json(name = "Mild")
    MILD,

    /**
     * moderate
     */
    @Json(name = "Moderate")
    MODERATE,

    /**
     * severe
     */
    @Json(name = "Severe")
    SEVERE,
  }

  /**
   * How resource references can be aggregated.
   *
   * @see <a href="http://hl7.org/fhir/resource-aggregation-mode">AggregationMode</a>
   */
  public enum AggregationMode {

    /**
     * The reference is a local reference to a contained resource.
     */
    @Json(name = "contained")
    CONTAINED,

    /**
     * The reference to a resource that has to be resolved externally to the resource that includes the reference.
     */
    @Json(name = "referenced")
    REFERENCED,

    /**
     * The resource the reference points to will be found in the same bundle as the resource that includes the reference.
     */
    @Json(name = "bundled")
    BUNDLED,
  }

  /**
   * Category of an identified substance.
   *
   * @see <a href="http://hl7.org/fhir/allergy-intolerance-category">AllergyIntoleranceCategory</a>
   */
  public enum AllergyIntoleranceCategory {

    /**
     * Any substance consumed to provide nutritional support for the body.
     */
    @Json(name = "food")
    FOOD,

    /**
     * Substances administered to achieve a physiological effect.
     */
    @Json(name = "medication")
    MEDICATION,

    /**
     * Any substances that are encountered in the environment, including any substance not already classified as food, medication, or biologic.
     */
    @Json(name = "environment")
    ENVIRONMENT,

    /**
     * A preparation that is synthesized from living organisms or their products, especially a human or animal protein, such as a hormone or antitoxin, that is used as a diagnostic, preventive, or therapeutic agent. Examples of biologic medications include: vaccines; allergenic extracts, which are used for both diagnosis and treatment (for example, allergy shots); gene therapies; cellular therapies.  There are other biologic products, such as tissues, that are not typically associated with allergies.
     */
    @Json(name = "biologic")
    BIOLOGIC,
  }

  /**
   * Statement about the degree of clinical certainty that a specific substance was the cause of the manifestation in a reaction event.
   *
   * @see <a href="http://hl7.org/fhir/reaction-event-certainty">AllergyIntoleranceCertainty</a>
   */
  public enum AllergyIntoleranceCertainty {

    /**
     * There is a low level of clinical certainty that the reaction was caused by the identified substance.
     */
    @Json(name = "unlikely")
    UNLIKELY,

    /**
     * There is a high level of clinical certainty that the reaction was caused by the identified substance.
     */
    @Json(name = "likely")
    LIKELY,

    /**
     * There is a very high level of clinical certainty that the reaction was due to the identified substance, which may include clinical evidence by testing or rechallenge.
     */
    @Json(name = "confirmed")
    CONFIRMED,

    /**
     * The clinical certainty that the reaction was caused by the identified substance is unknown.  It is an explicit assertion that certainty is not known.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * The clinical status of the allergy or intolerance.
   *
   * @see <a href="http://hl7.org/fhir/allergy-clinical-status">AllergyIntoleranceClinicalStatus</a>
   */
  public enum AllergyIntoleranceClinicalStatus {

    /**
     * An active record of a risk of a reaction to the identified substance.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * An inactivated record of a risk of a reaction to the identified substance.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * A reaction to the identified substance has been clinically reassessed by testing or re-exposure and considered to be resolved.
     */
    @Json(name = "resolved")
    RESOLVED,
  }

  /**
   * Estimate of the potential clinical harm, or seriousness, of a reaction to an identified substance.
   *
   * @see <a href="http://hl7.org/fhir/allergy-intolerance-criticality">AllergyIntoleranceCriticality</a>
   */
  public enum AllergyIntoleranceCriticality {

    /**
     * Worst case result of a future exposure is not assessed to be life-threatening or having high potential for organ system failure.
     */
    @Json(name = "low")
    LOW,

    /**
     * Worst case result of a future exposure is assessed to be life-threatening or having high potential for organ system failure.
     */
    @Json(name = "high")
    HIGH,

    /**
     * Unable to assess the worst case result of a future exposure.
     */
    @Json(name = "unable-to-assess")
    UNABLE_TO_ASSESS,
  }

  /**
   * Clinical assessment of the severity of a reaction event as a whole, potentially considering multiple different manifestations.
   *
   * @see <a href="http://hl7.org/fhir/reaction-event-severity">AllergyIntoleranceSeverity</a>
   */
  public enum AllergyIntoleranceSeverity {

    /**
     * Causes mild physiological effects.
     */
    @Json(name = "mild")
    MILD,

    /**
     * Causes moderate physiological effects.
     */
    @Json(name = "moderate")
    MODERATE,

    /**
     * Causes severe physiological effects.
     */
    @Json(name = "severe")
    SEVERE,
  }

  /**
   * The risk of an adverse reaction (allergy or intolerance) for this patient upon exposure to the substance (including pharmaceutical products).
   *
   * @see <a href="http://hl7.org/fhir/allerg-intol-substance-exp-risk">AllergyIntoleranceSubstanceExposureRisk</a>
   */
  public enum AllergyIntoleranceSubstanceExposureRisk {

    /**
     * Known risk of allergy or intolerance reaction upon exposure to the specified substance.
     */
    @Json(name = "known-reaction-risk")
    KNOWN_REACTION_RISK,

    /**
     * No known risk of allergy or intolerance reaction upon exposure to the specified substance.
     */
    @Json(name = "no-known-reaction-risk")
    NO_KNOWN_REACTION_RISK,
  }

  /**
   * Identification of the underlying physiological mechanism for a Reaction Risk.
   *
   * @see <a href="http://hl7.org/fhir/allergy-intolerance-type">AllergyIntoleranceType</a>
   */
  public enum AllergyIntoleranceType {

    /**
     * A propensity for hypersensitivity reaction(s) to a substance.  These reactions are most typically type I hypersensitivity, plus other "allergy-like" reactions, including pseudoallergy.
     */
    @Json(name = "allergy")
    ALLERGY,

    /**
     * A propensity for adverse reactions to a substance that is not judged to be allergic or "allergy-like".  These reactions are typically (but not necessarily) non-immune.  They are to some degree idiosyncratic and/or individually specific (i.e. are not a reaction that is expected to occur with most or all patients given similar circumstances).
     */
    @Json(name = "intolerance")
    INTOLERANCE,
  }

  /**
   * Assertion about certainty associated with a propensity, or potential risk, of a reaction to the identified substance.
   *
   * @see <a href="http://hl7.org/fhir/allergy-verification-status">AllergyIntoleranceVerificationStatus</a>
   */
  public enum AllergyIntoleranceVerificationStatus {

    /**
     * A low level of certainty about the propensity for a reaction to the identified substance.
     */
    @Json(name = "unconfirmed")
    UNCONFIRMED,

    /**
     * A high level of certainty about the propensity for a reaction to the identified substance, which may include clinical evidence by testing or rechallenge.
     */
    @Json(name = "confirmed")
    CONFIRMED,

    /**
     * A propensity for a reaction to the identified substance has been disproven with a high level of clinical certainty, which may include testing or rechallenge, and is refuted.
     */
    @Json(name = "refuted")
    REFUTED,

    /**
     * The statement was entered in error and is not valid.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * The free/busy status of an appointment.
   *
   * @see <a href="http://hl7.org/fhir/appointmentstatus">AppointmentStatus</a>
   */
  public enum AppointmentStatus {

    /**
     * None of the participant(s) have finalized their acceptance of the appointment request, and the start/end time may not be set yet.
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * Some or all of the participant(s) have not finalized their acceptance of the appointment request.
     */
    @Json(name = "pending")
    PENDING,

    /**
     * All participant(s) have been considered and the appointment is confirmed to go ahead at the date/times specified.
     */
    @Json(name = "booked")
    BOOKED,

    /**
     * Some of the patients have arrived.
     */
    @Json(name = "arrived")
    ARRIVED,

    /**
     * This appointment has completed and may have resulted in an encounter.
     */
    @Json(name = "fulfilled")
    FULFILLED,

    /**
     * The appointment has been cancelled.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * Some or all of the participant(s) have not/did not appear for the appointment (usually the patient).
     */
    @Json(name = "noshow")
    NOSHOW,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * The type of direction to use for assertion.
   *
   * @see <a href="http://hl7.org/fhir/assert-direction-codes">AssertionDirectionType</a>
   */
  public enum AssertionDirectionType {

    /**
     * The assertion is evaluated on the response. This is the default value.
     */
    @Json(name = "response")
    RESPONSE,

    /**
     * The assertion is evaluated on the request.
     */
    @Json(name = "request")
    REQUEST,
  }

  /**
   * The type of operator to use for assertion.
   *
   * @see <a href="http://hl7.org/fhir/assert-operator-codes">AssertionOperatorType</a>
   */
  public enum AssertionOperatorType {

    /**
     * Default value. Equals comparison.
     */
    @Json(name = "equals")
    EQUALS,

    /**
     * Not equals comparison.
     */
    @Json(name = "notEquals")
    NOTEQUALS,

    /**
     * Compare value within a known set of values.
     */
    @Json(name = "in")
    IN,

    /**
     * Compare value not within a known set of values.
     */
    @Json(name = "notIn")
    NOTIN,

    /**
     * Compare value to be greater than a known value.
     */
    @Json(name = "greaterThan")
    GREATERTHAN,

    /**
     * Compare value to be less than a known value.
     */
    @Json(name = "lessThan")
    LESSTHAN,

    /**
     * Compare value is empty.
     */
    @Json(name = "empty")
    EMPTY,

    /**
     * Compare value is not empty.
     */
    @Json(name = "notEmpty")
    NOTEMPTY,

    /**
     * Compare value string contains a known value.
     */
    @Json(name = "contains")
    CONTAINS,

    /**
     * Compare value string does not contain a known value.
     */
    @Json(name = "notContains")
    NOTCONTAINS,

    /**
     * Evaluate the fluentpath expression as a boolean condition.
     */
    @Json(name = "eval")
    EVAL,
  }

  /**
   * The type of response code to use for assertion.
   *
   * @see <a href="http://hl7.org/fhir/assert-response-code-types">AssertionResponseTypes</a>
   */
  public enum AssertionResponseTypes {

    /**
     * Response code is 200.
     */
    @Json(name = "okay")
    OKAY,

    /**
     * Response code is 201.
     */
    @Json(name = "created")
    CREATED,

    /**
     * Response code is 204.
     */
    @Json(name = "noContent")
    NOCONTENT,

    /**
     * Response code is 304.
     */
    @Json(name = "notModified")
    NOTMODIFIED,

    /**
     * Response code is 400.
     */
    @Json(name = "bad")
    BAD,

    /**
     * Response code is 403.
     */
    @Json(name = "forbidden")
    FORBIDDEN,

    /**
     * Response code is 404.
     */
    @Json(name = "notFound")
    NOTFOUND,

    /**
     * Response code is 405.
     */
    @Json(name = "methodNotAllowed")
    METHODNOTALLOWED,

    /**
     * Response code is 409.
     */
    @Json(name = "conflict")
    CONFLICT,

    /**
     * Response code is 410.
     */
    @Json(name = "gone")
    GONE,

    /**
     * Response code is 412.
     */
    @Json(name = "preconditionFailed")
    PRECONDITIONFAILED,

    /**
     * Response code is 422.
     */
    @Json(name = "unprocessable")
    UNPROCESSABLE,
  }

  /**
   * Indicator for type of action performed during the event that generated the event
   *
   * @see <a href="http://hl7.org/fhir/audit-event-action">AuditEventAction</a>
   */
  public enum AuditEventAction {

    /**
     * Create a new database object, such as placing an order.
     */
    @Json(name = "C")
    C,

    /**
     * Display or print data, such as a doctor census.
     */
    @Json(name = "R")
    R,

    /**
     * Update data, such as revise patient information.
     */
    @Json(name = "U")
    U,

    /**
     * Delete items, such as a doctor master file record.
     */
    @Json(name = "D")
    D,

    /**
     * Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.
     */
    @Json(name = "E")
    E,
  }

  /**
   * Indication of the degree of conformance expectations associated with a binding.
   *
   * @see <a href="http://hl7.org/fhir/binding-strength">BindingStrength</a>
   */
  public enum BindingStrength {

    /**
     * To be conformant, the concept in this element SHALL be from the specified value set
     */
    @Json(name = "required")
    REQUIRED,

    /**
     * To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
     */
    @Json(name = "extensible")
    EXTENSIBLE,

    /**
     * Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
     */
    @Json(name = "preferred")
    PREFERRED,

    /**
     * Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
     */
    @Json(name = "example")
    EXAMPLE,
  }

  /**
   * Indicates the purpose of a bundle - how it was intended to be used.
   *
   * @see <a href="http://hl7.org/fhir/bundle-type">BundleType</a>
   */
  public enum BundleType {

    /**
     * The bundle is a document. The first resource is a Composition.
     */
    @Json(name = "document")
    DOCUMENT,

    /**
     * The bundle is a message. The first resource is a MessageHeader.
     */
    @Json(name = "message")
    MESSAGE,

    /**
     * The bundle is a transaction - intended to be processed by a server as an atomic commit.
     */
    @Json(name = "transaction")
    TRANSACTION,

    /**
     * The bundle is a transaction response. Because the response is a transaction response, the transaction has succeeded, and all responses are error free.
     */
    @Json(name = "transaction-response")
    TRANSACTION_RESPONSE,

    /**
     * The bundle is a transaction - intended to be processed by a server as a group of actions.
     */
    @Json(name = "batch")
    BATCH,

    /**
     * The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.
     */
    @Json(name = "batch-response")
    BATCH_RESPONSE,

    /**
     * The bundle is a list of resources from a history interaction on a server.
     */
    @Json(name = "history")
    HISTORY,

    /**
     * The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.
     */
    @Json(name = "searchset")
    SEARCHSET,

    /**
     * The bundle is a set of resources collected into a single package for ease of distribution.
     */
    @Json(name = "collection")
    COLLECTION,
  }

  /**
   * How a capability statement is intended to be used.
   *
   * @see <a href="http://hl7.org/fhir/capability-statement-kind">CapabilityStatementKind</a>
   */
  public enum CapabilityStatementKind {

    /**
     * The CapabilityStatement instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point.
     */
    @Json(name = "instance")
    INSTANCE,

    /**
     * The CapabilityStatement instance represents the capabilities of a system or piece of software, independent of a particular installation.
     */
    @Json(name = "capability")
    CAPABILITY,

    /**
     * The CapabilityStatement instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.
     */
    @Json(name = "requirements")
    REQUIREMENTS,
  }

  /**
   * Indicates where the activity is at in its overall life cycle.
   *
   * @see <a href="http://hl7.org/fhir/care-plan-activity-status">CarePlanActivityStatus</a>
   */
  public enum CarePlanActivityStatus {

    /**
     * Activity is planned but no action has yet been taken.
     */
    @Json(name = "not-started")
    NOT_STARTED,

    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     */
    @Json(name = "scheduled")
    SCHEDULED,

    /**
     * Activity has been started but is not yet complete.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Activity was started but has temporarily ceased with an expectation of resumption at a future time.
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * The activities have been completed (more or less) as planned.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The activities have been ended prior to completion (perhaps even before they were started).
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * The authoring system doesn't know the current state of the activity.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Codes indicating the degree of authority/intentionality associated with a care plan
   *
   * @see <a href="http://hl7.org/fhir/care-plan-intent">CarePlanIntent</a>
   */
  public enum CarePlanIntent {

    /**
     * The care plan is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act
     */
    @Json(name = "proposal")
    PROPOSAL,

    /**
     * The care plan represents an intention to ensure something occurs without providing an authorization for others to act
     */
    @Json(name = "plan")
    PLAN,

    /**
     * The care plan represents a request/demand and authorization for action
     */
    @Json(name = "order")
    ORDER,

    /**
     * The care plan represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.
     *
     * Refer to [[[RequestGroup]]] for additional information on how this status is used
     */
    @Json(name = "option")
    OPTION,
  }

  /**
   * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
   *
   * @see <a href="http://hl7.org/fhir/care-plan-status">CarePlanStatus</a>
   */
  public enum CarePlanStatus {

    /**
     * The plan is in development or awaiting use but is not yet intended to be acted upon.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The plan is intended to be followed and used as part of patient care.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The plan has been temporarily stopped but is expected to resume in the future.
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The plan is no longer in use and is not expected to be followed or used in patient care.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The plan was entered in error and voided.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The plan has been terminated prior to reaching completion (though it may have been replaced by a new plan).
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * The authoring system doesn't know the current state of the care plan.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Indicates the type of care team.
   *
   * @see <a href="http://hl7.org/fhir/care-team-category">CareTeamCategory</a>
   */
  public enum CareTeamCategory {

    /**
     * This type of team focuses on one specific type of incident, which is non-patient specific. The incident is determined by the context of use.  For example, code team (code red, code blue, medical emergency treatment) or the PICC line team.
     */
    @Json(name = "event")
    EVENT,

    /**
     * This type of team focuses on one specific encounter. The encounter is determined by the context of use.  For example, during an inpatient encounter, the nutrition support care team
     */
    @Json(name = "encounter")
    ENCOUNTER,

    /**
     * This type of team focuses on one specific episode of care with a defined time period or self-limiting process (e.g. 10 visits). The episode of care is determined by the context of use.  For example, a maternity care team over 9 months.
     */
    @Json(name = "episode")
    EPISODE,

    /**
     * This type of team focuses on overall care coordination managing one or more conditions across the continuum of care ensuring there are smooth transitions of care. The members of the team are determined or selected by an individual or organization. When determined by an organization, the team may be assigned or based on the person's enrollment in a particular program. For example, disease management team or patient centered medical home team.
     */
    @Json(name = "longitudinal")
    LONGITUDINAL,

    /**
     * This type of team focuses on one specific condition. The condition is determined by the context of use.  For example, a disease management team focused on one condition (e.g. diabetes).
     */
    @Json(name = "condition")
    CONDITION,

    /**
     * This type of team is responsible for establishing, conducting, coordinating and monitoring the outcomes of clinical trials. The team focuses on research, clinical care and education.
     */
    @Json(name = "clinical-research")
    CLINICAL_RESEARCH,
  }

  /**
   * Indicates the status of the care team.
   *
   * @see <a href="http://hl7.org/fhir/care-team-status">CareTeamStatus</a>
   */
  public enum CareTeamStatus {

    /**
     * The care team has been drafted and proposed, but not yet participating in the coordination and delivery of care.
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * The care team is currently participating in the coordination and delivery of care.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The care team is temporarily on hold or suspended and not participating in the coordination and delivery of care.
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The care team was, but is no longer, participating in the coordination and delivery of care.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The care team should have never existed.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Codes identifying the stage lifecycle stage of a ChargeItem
   *
   * @see <a href="http://hl7.org/fhir/chargeitem-status">ChargeItemStatus</a>
   */
  public enum ChargeItemStatus {

    /**
     * The charge item has been entered, but the charged service is not  yet complete, so it shall not be billed yet but might be used in the context of pre-authorization
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * The charge item is ready for billing
     */
    @Json(name = "billable")
    BILLABLE,

    /**
     * The charge item has been determined to be not billable (e.g. due to rules associated with the billing code)
     */
    @Json(name = "not-billable")
    NOT_BILLABLE,

    /**
     * The processing of the charge was aborted
     */
    @Json(name = "aborted")
    ABORTED,

    /**
     * The charge item has been billed (e.g. a billing engine has generated financial transactions by applying the associated ruled for the charge item to the context of the Encounter, and placed them into Claims/Invoices
     */
    @Json(name = "billed")
    BILLED,

    /**
     * The charge item has been entered in error and should not be processed for billing
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this charge item  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Direction in which lists of question options should be displayed
   *
   * @see <a href="http://hl7.org/fhir/choice-list-orientation">ChoiceListOrientation</a>
   */
  public enum ChoiceListOrientation {

    /**
     * List choices along the horizontal axis
     */
    @Json(name = "horizontal")
    HORIZONTAL,

    /**
     * List choices down the vertical axis
     */
    @Json(name = "vertical")
    VERTICAL,
  }

  /**
   * The type of Claim payee Resource
   *
   * @see <a href="http://hl7.org/fhir/ex-payee-resource-type">ClaimPayeeResourceType</a>
   */
  public enum ClaimPayeeResourceType {

    /**
     * Organization resource
     */
    @Json(name = "organization")
    ORGANIZATION,

    /**
     * Patient resource
     */
    @Json(name = "patient")
    PATIENT,

    /**
     * Practitioner resource
     */
    @Json(name = "practitioner")
    PRACTITIONER,

    /**
     * RelatedPerson resource
     */
    @Json(name = "relatedperson")
    RELATEDPERSON,
  }

  /**
   * Identifies whether a useContext represents a context or classification for the element
   *
   * @see <a href="http://hl7.org/fhir/classification-or-context">ClassificationOrContext</a>
   */
  public enum ClassificationOrContext {

    /**
     * Indicates the useContext is a classification - e.g. Administrative, financial, etc.
     */
    @Json(name = "classification")
    CLASSIFICATION,

    /**
     * Indicates the useContext is a context - a domain of use - e.g. Particular country, organization or system
     */
    @Json(name = "context")
    CONTEXT,
  }

  /**
   * The workflow state of a clinical impression.
   *
   * @see <a href="http://hl7.org/fhir/clinical-impression-status">ClinicalImpressionStatus</a>
   */
  public enum ClinicalImpressionStatus {

    /**
     * The assessment is still on-going and results are not yet final.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The assessment is done and the results are final.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This assessment was never actually done and the record is erroneous (e.g. Wrong patient).
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * How much of the content of the code system - the concepts and codes it defines - are represented in a code system resource
   *
   * @see <a href="http://hl7.org/fhir/codesystem-content-mode">CodeSystemContentMode</a>
   */
  public enum CodeSystemContentMode {

    /**
     * None of the concepts defined by the code system are included in the code system resource
     */
    @Json(name = "not-present")
    NOT_PRESENT,

    /**
     * A few representative concepts are included in the code system resource
     */
    @Json(name = "example")
    EXAMPLE,

    /**
     * A subset of the code system concepts are included in the code system resource
     */
    @Json(name = "fragment")
    FRAGMENT,

    /**
     * All the concepts defined by the code system are included in the code system resource
     */
    @Json(name = "complete")
    COMPLETE,
  }

  /**
   * The meaning of the hierarchy of concepts in a code system
   *
   * @see <a href="http://hl7.org/fhir/codesystem-hierarchy-meaning">CodeSystemHierarchyMeaning</a>
   */
  public enum CodeSystemHierarchyMeaning {

    /**
     * No particular relationship between the concepts can be assumed, except what can be determined by inspection of the definitions of the elements (possible reasons to use this: importing from a source where this is not defined, or where various parts of the hierarchy have different meanings)
     */
    @Json(name = "grouped-by")
    GROUPED_BY,

    /**
     * A hierarchy where the child concepts have an IS-A relationship with the parents - that is, all the properties of the parent are also true for its child concepts
     */
    @Json(name = "is-a")
    IS_A,

    /**
     * Child elements list the individual parts of a composite whole (e.g. body site)
     */
    @Json(name = "part-of")
    PART_OF,

    /**
     * Child concepts in the hierarchy may have only one parent, and there is a presumption that the code system is a "closed world" meaning all things must be in the hierarchy. This results in concepts such as "not otherwise classified."
     */
    @Json(name = "classified-with")
    CLASSIFIED_WITH,
  }

  /**
   * Codes for general categories of communications such as alerts, instruction, etc.
   *
   * @see <a href="http://hl7.org/fhir/communication-category">CommunicationCategory</a>
   */
  public enum CommunicationCategory {

    /**
     * The communication conveys an alert.
     */
    @Json(name = "alert")
    ALERT,

    /**
     * The communication conveys a notification.
     */
    @Json(name = "notification")
    NOTIFICATION,

    /**
     * The communication conveys a reminder.
     */
    @Json(name = "reminder")
    REMINDER,

    /**
     * The communication conveys instruction.
     */
    @Json(name = "instruction")
    INSTRUCTION,
  }

  /**
   * Codes for the reason why a communication was not done.
   *
   * @see <a href="http://hl7.org/fhir/communication-not-done-reason">CommunicationNotDoneReason</a>
   */
  public enum CommunicationNotDoneReason {

    /**
     * The communication was not done due to an unknown reason.
     */
    @Json(name = "unknown")
    UNKNOWN,

    /**
     * The communication was not done due to a system error.
     */
    @Json(name = "system-error")
    SYSTEM_ERROR,

    /**
     * The communication was not done due to an invalid phone number.
     */
    @Json(name = "invalid-phone-number")
    INVALID_PHONE_NUMBER,

    /**
     * The communication was not done due to the recipient being unavailable.
     */
    @Json(name = "recipient-unavailable")
    RECIPIENT_UNAVAILABLE,

    /**
     * The communication was not done due to a family objection.
     */
    @Json(name = "family-objection")
    FAMILY_OBJECTION,

    /**
     * The communication was not done due to a patient objection.
     */
    @Json(name = "patient-objection")
    PATIENT_OBJECTION,
  }

  /**
   * Which compartment a compartment definition describes
   *
   * @see <a href="http://hl7.org/fhir/compartment-type">CompartmentType</a>
   */
  public enum CompartmentType {

    /**
     * The compartment definition is for the patient compartment
     */
    @Json(name = "Patient")
    PATIENT,

    /**
     * The compartment definition is for the encounter compartment
     */
    @Json(name = "Encounter")
    ENCOUNTER,

    /**
     * The compartment definition is for the related-person compartment
     */
    @Json(name = "RelatedPerson")
    RELATEDPERSON,

    /**
     * The compartment definition is for the practitioner compartment
     */
    @Json(name = "Practitioner")
    PRACTITIONER,

    /**
     * The compartment definition is for the device compartment
     */
    @Json(name = "Device")
    DEVICE,
  }

  /**
   * The composite scoring method of the measure
   *
   * @see <a href="http://hl7.org/fhir/composite-measure-scoring">CompositeMeasureScoring</a>
   */
  public enum CompositeMeasureScoring {

    /**
     * Opportunity scoring combines the scores from component measures by combining the numerators and denominators for each component
     */
    @Json(name = "opportunity")
    OPPORTUNITY,

    /**
     * All-or-nothing scoring includes an individual in the numerator of the composite measure if they are in the numerators of all of the component measures in which they are in the denominator
     */
    @Json(name = "all-or-nothing")
    ALL_OR_NOTHING,

    /**
     * Linear scoring gives an individual a score based on the number of numerators in which they appear
     */
    @Json(name = "linear")
    LINEAR,

    /**
     * Weighted scoring gives an individual a score based on a weighted factor for each component numerator in which they appear
     */
    @Json(name = "weighted")
    WEIGHTED,
  }

  /**
   * The way in which a person authenticated a composition.
   *
   * @see <a href="http://hl7.org/fhir/composition-attestation-mode">CompositionAttestationMode</a>
   */
  public enum CompositionAttestationMode {

    /**
     * The person authenticated the content in their personal capacity.
     */
    @Json(name = "personal")
    PERSONAL,

    /**
     * The person authenticated the content in their professional capacity.
     */
    @Json(name = "professional")
    PROFESSIONAL,

    /**
     * The person authenticated the content and accepted legal responsibility for its content.
     */
    @Json(name = "legal")
    LEGAL,

    /**
     * The organization authenticated the content as consistent with their policies and procedures.
     */
    @Json(name = "official")
    OFFICIAL,
  }

  /**
   * The workflow/clinical status of the composition.
   *
   * @see <a href="http://hl7.org/fhir/composition-status">CompositionStatus</a>
   */
  public enum CompositionStatus {

    /**
     * This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified.
     */
    @Json(name = "preliminary")
    PRELIMINARY,

    /**
     * This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.
     */
    @Json(name = "final")
    FINAL,

    /**
     * The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as "final" and the composition is complete and verified by an authorized person.
     */
    @Json(name = "amended")
    AMENDED,

    /**
     * The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * The degree of equivalence between concepts.
   *
   * @see <a href="http://hl7.org/fhir/concept-map-equivalence">ConceptMapEquivalence</a>
   */
  public enum ConceptMapEquivalence {

    /**
     * The concepts are related to each other, and have at least some overlap in meaning, but the exact relationship is not known
     */
    @Json(name = "relatedto")
    RELATEDTO,

    /**
     * The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical).
     */
    @Json(name = "equivalent")
    EQUIVALENT,

    /**
     * The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identical or irrelevant (i.e. intentionally identical).
     */
    @Json(name = "equal")
    EQUAL,

    /**
     * The target mapping is wider in meaning than the source concept.
     */
    @Json(name = "wider")
    WIDER,

    /**
     * The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).
     */
    @Json(name = "subsumes")
    SUBSUMES,

    /**
     * The target mapping is narrower in meaning than the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.
     */
    @Json(name = "narrower")
    NARROWER,

    /**
     * The target mapping specializes the meaning of the source concept (e.g. the target is-a source).
     */
    @Json(name = "specializes")
    SPECIALIZES,

    /**
     * The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.
     */
    @Json(name = "inexact")
    INEXACT,

    /**
     * There is no match for this concept in the destination concept system.
     */
    @Json(name = "unmatched")
    UNMATCHED,

    /**
     * This is an explicit assertion that there is no mapping between the source and target concept.
     */
    @Json(name = "disjoint")
    DISJOINT,
  }

  /**
   * Defines which action to take if there is no match in the group.
   *
   * @see <a href="http://hl7.org/fhir/conceptmap-unmapped-mode">ConceptMapGroupUnmappedMode</a>
   */
  public enum ConceptMapGroupUnmappedMode {

    /**
     * Use the code as provided in the $translate request
     */
    @Json(name = "provided")
    PROVIDED,

    /**
     * Use the code explicitly provided in the group.unmapped
     */
    @Json(name = "fixed")
    FIXED,

    /**
     * Use the map identified by the canonical URL in URL
     */
    @Json(name = "other-map")
    OTHER_MAP,
  }

  /**
   * Enumeration indicating whether the condition is currently active, inactive, or has been resolved.
   *
   * @see <a href="http://hl7.org/fhir/condition-state">ConditionState</a>
   */
  public enum ConditionState {

    /**
     * The condition is active.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The condition is inactive, but not resolved.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The condition is resolved.
     */
    @Json(name = "resolved")
    RESOLVED,
  }

  /**
   * The verification status to support or decline the clinical status of the condition or diagnosis.
   *
   * @see <a href="http://hl7.org/fhir/condition-ver-status">ConditionVerificationStatus</a>
   */
  public enum ConditionVerificationStatus {

    /**
     * This is a tentative diagnosis - still a candidate that is under consideration.
     */
    @Json(name = "provisional")
    PROVISIONAL,

    /**
     * One of a set of potential (and typically mutually exclusive) diagnoses asserted to further guide the diagnostic process and preliminary treatment.
     */
    @Json(name = "differential")
    DIFFERENTIAL,

    /**
     * There is sufficient diagnostic and/or clinical evidence to treat this as a confirmed condition.
     */
    @Json(name = "confirmed")
    CONFIRMED,

    /**
     * This condition has been ruled out by diagnostic and clinical evidence.
     */
    @Json(name = "refuted")
    REFUTED,

    /**
     * The statement was entered in error and is not valid.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The condition status is unknown.  Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * A code that indicates how the server supports conditional delete.
   *
   * @see <a href="http://hl7.org/fhir/conditional-delete-status">ConditionalDeleteStatus</a>
   */
  public enum ConditionalDeleteStatus {

    /**
     * No support for conditional deletes.
     */
    @Json(name = "not-supported")
    NOT_SUPPORTED,

    /**
     * Conditional deletes are supported, but only single resources at a time.
     */
    @Json(name = "single")
    SINGLE,

    /**
     * Conditional deletes are supported, and multiple resources can be deleted in a single interaction.
     */
    @Json(name = "multiple")
    MULTIPLE,
  }

  /**
   * A code that indicates how the server supports conditional read.
   *
   * @see <a href="http://hl7.org/fhir/conditional-read-status">ConditionalReadStatus</a>
   */
  public enum ConditionalReadStatus {

    /**
     * No support for conditional deletes.
     */
    @Json(name = "not-supported")
    NOT_SUPPORTED,

    /**
     * Conditional reads are supported, but only with the If-Modified-Since HTTP Header.
     */
    @Json(name = "modified-since")
    MODIFIED_SINCE,

    /**
     * Conditional reads are supported, but only with the If-None-Match HTTP Header.
     */
    @Json(name = "not-match")
    NOT_MATCH,

    /**
     * Conditional reads are supported, with both If-Modified-Since and If-None-Match HTTP Headers.
     */
    @Json(name = "full-support")
    FULL_SUPPORT,
  }

  /**
   * Indicates the degree of adherence to a specified behavior or capability expected for a system to be deemed conformant with a specification.
   *
   * @see <a href="http://hl7.org/fhir/conformance-expectation">ConformanceExpectation</a>
   */
  public enum ConformanceExpectation {

    /**
     * Support for the specified capability is required to be considered conformant.
     */
    @Json(name = "SHALL")
    SHALL,

    /**
     * Support for the specified capability is strongly encouraged, and failure to support it should only occur after careful consideration.
     */
    @Json(name = "SHOULD")
    SHOULD,

    /**
     * Support for the specified capability is not necessary to be considered conformant, and the requirement should be considered strictly optional.
     */
    @Json(name = "MAY")
    MAY,

    /**
     * Support for the specified capability is strongly discouraged and should occur only after careful consideration.
     */
    @Json(name = "SHOULD-NOT")
    SHOULD_NOT,
  }

  /**
   * How a resource reference is interpreted when testing consent restrictions
   *
   * @see <a href="http://hl7.org/fhir/consent-data-meaning">ConsentDataMeaning</a>
   */
  public enum ConsentDataMeaning {

    /**
     * The consent applies directly to the instance of the resource
     */
    @Json(name = "instance")
    INSTANCE,

    /**
     * The consent applies directly to the instance of the resource and instances it refers to
     */
    @Json(name = "related")
    RELATED,

    /**
     * The consent applies directly to the instance of the resource and instances that refer to it
     */
    @Json(name = "dependents")
    DEPENDENTS,

    /**
     * The consent applies to instances of resources that are authored by
     */
    @Json(name = "authoredby")
    AUTHOREDBY,
  }

  /**
   * How an exception statement is applied, such as adding additional consent or removing consent
   *
   * @see <a href="http://hl7.org/fhir/consent-except-type">ConsentExceptType</a>
   */
  public enum ConsentExceptType {

    /**
     * Consent is denied for actions meeting these rules
     */
    @Json(name = "deny")
    DENY,

    /**
     * Consent is provided for actions meeting these rules
     */
    @Json(name = "permit")
    PERMIT,
  }

  /**
   * Indicates the state of the consent
   *
   * @see <a href="http://hl7.org/fhir/consent-state-codes">ConsentState</a>
   */
  public enum ConsentState {

    /**
     * The consent is in development or awaiting use but is not yet intended to be acted upon.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The consent has been proposed but not yet agreed to by all parties. The negotiation stage.
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * The consent is to be followed and enforced.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The consent has been rejected by one or more of the parties.
     */
    @Json(name = "rejected")
    REJECTED,

    /**
     * The consent is terminated or replaced.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The consent was created wrongly (e.g. wrong patient) and should be ignored
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * SHALL applications comply with this constraint?
   *
   * @see <a href="http://hl7.org/fhir/constraint-severity">ConstraintSeverity</a>
   */
  public enum ConstraintSeverity {

    /**
     * If the constraint is violated, the resource is not conformant.
     */
    @Json(name = "error")
    ERROR,

    /**
     * If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.
     */
    @Json(name = "warning")
    WARNING,
  }

  /**
   * Telecommunications form for contact point
   *
   * @see <a href="http://hl7.org/fhir/contact-point-system">ContactPointSystem</a>
   */
  public enum ContactPointSystem {

    /**
     * The value is a telephone number used for voice calls. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    @Json(name = "phone")
    PHONE,

    /**
     * The value is a fax machine. Use of full international numbers starting with + is recommended to enable automatic dialing support but not required.
     */
    @Json(name = "fax")
    FAX,

    /**
     * The value is an email address.
     */
    @Json(name = "email")
    EMAIL,

    /**
     * The value is a pager number. These may be local pager numbers that are only usable on a particular pager system.
     */
    @Json(name = "pager")
    PAGER,

    /**
     * A contact that is not a phone, fax, pager or email address and is expressed as a URL.  This is intended for various personal contacts including blogs, Skype, Twitter, Facebook, etc. Do not use for email addresses.
     */
    @Json(name = "url")
    URL,

    /**
     * A contact that can be used for sending an sms message (e.g. mobide phones, some landlines)
     */
    @Json(name = "sms")
    SMS,

    /**
     * A contact that is not a phone, fax, page or email address and is not expressible as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions may be used to distinguish "other" contact types.
     */
    @Json(name = "other")
    OTHER,
  }

  /**
   * Use of contact point
   *
   * @see <a href="http://hl7.org/fhir/contact-point-use">ContactPointUse</a>
   */
  public enum ContactPointUse {

    /**
     * A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     */
    @Json(name = "home")
    HOME,

    /**
     * An office contact point. First choice for business related contacts during business hours.
     */
    @Json(name = "work")
    WORK,

    /**
     * A temporary contact point. The period can provide more detailed information.
     */
    @Json(name = "temp")
    TEMP,

    /**
     * This contact point is no longer in use (or was never correct, but retained for records).
     */
    @Json(name = "old")
    OLD,

    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     */
    @Json(name = "mobile")
    MOBILE,
  }

  /**
   * The content or mime type.
   *
   * @see <a href="http://hl7.org/fhir/content-type">ContentType</a>
   */
  public enum ContentType {

    /**
     * XML content-type corresponding to the application/fhir+xml mime-type.
     */
    @Json(name = "xml")
    XML,

    /**
     * JSON content-type corresponding to the application/fhir+json mime-type.
     */
    @Json(name = "json")
    JSON,

    /**
     * RDF content-type corresponding to the text/turtle mime-type.
     */
    @Json(name = "ttl")
    TTL,

    /**
     * Prevent the use of the corresponding http header.
     */
    @Json(name = "none")
    NONE,
  }

  /**
   * The type of contributor
   *
   * @see <a href="http://hl7.org/fhir/contributor-type">ContributorType</a>
   */
  public enum ContributorType {

    /**
     * An author of the content of the module
     */
    @Json(name = "author")
    AUTHOR,

    /**
     * An editor of the content of the module
     */
    @Json(name = "editor")
    EDITOR,

    /**
     * A reviewer of the content of the module
     */
    @Json(name = "reviewer")
    REVIEWER,

    /**
     * An endorser of the content of the module
     */
    @Json(name = "endorser")
    ENDORSER,
  }

  /**
   * Copy Number Event
   *
   * @see <a href="http://hl7.org/fhir/copy-number-event">CopyNumberEvent</a>
   */
  public enum CopyNumberEvent {

    /**
     * amplificaiton
     */
    @Json(name = "amp")
    AMP,

    /**
     * deletion
     */
    @Json(name = "del")
    DEL,

    /**
     * loss of function
     */
    @Json(name = "lof")
    LOF,
  }

  /**
   * Used to specify why the normally expected content of the data element is missing.
   *
   * @see <a href="http://hl7.org/fhir/data-absent-reason">DataAbsentReason</a>
   */
  public enum DataAbsentReason {

    /**
     * The value is not known.
     */
    @Json(name = "unknown")
    UNKNOWN,

    /**
     * The source human does not know the value.
     */
    @Json(name = "asked")
    ASKED,

    /**
     * There is reason to expect (from the workflow) that the value may become known.
     */
    @Json(name = "temp")
    TEMP,

    /**
     * The workflow didn't lead to this value being known.
     */
    @Json(name = "not-asked")
    NOT_ASKED,

    /**
     * The information is not available due to security, privacy or related reasons.
     */
    @Json(name = "masked")
    MASKED,

    /**
     * The source system wasn't capable of supporting this element.
     */
    @Json(name = "unsupported")
    UNSUPPORTED,

    /**
     * The content of the data is represented in the resource narrative.
     */
    @Json(name = "astext")
    ASTEXT,

    /**
     * Some system or workflow process error means that the information is not available.
     */
    @Json(name = "error")
    ERROR,

    /**
     * NaN, standing for not a number, is a numeric data type value representing an undefined or unrepresentable value.
     */
    @Json(name = "NaN")
    NAN,

    /**
     * The value is not available because the observation procedure (test, etc.) was not performed.
     */
    @Json(name = "not-performed")
    NOT_PERFORMED,
  }

  /**
   * Indicates the degree of precision of the data element definition.
   *
   * @see <a href="http://hl7.org/fhir/dataelement-stringency">DataElementStringency</a>
   */
  public enum DataElementStringency {

    /**
     * The data element is sufficiently well-constrained that multiple pieces of data captured according to the constraints of the data element will be comparable (though in some cases, a degree of automated conversion/normalization may be required).
     */
    @Json(name = "comparable")
    COMPARABLE,

    /**
     * The data element is fully specified down to a single value set, single unit of measure, single data type, etc.  Multiple pieces of data associated with this data element are fully comparable.
     */
    @Json(name = "fully-specified")
    FULLY_SPECIFIED,

    /**
     * The data element allows multiple units of measure having equivalent meaning; e.g. "cc" (cubic centimeter) and "mL" (milliliter).
     */
    @Json(name = "equivalent")
    EQUIVALENT,

    /**
     * The data element allows multiple units of measure that are convertable between each other (e.g. inches and centimeters) and/or allows data to be captured in multiple value sets for which a known mapping exists allowing conversion of meaning.
     */
    @Json(name = "convertable")
    CONVERTABLE,

    /**
     * A convertable data element where unit conversions are different only by a power of 10; e.g. g, mg, kg.
     */
    @Json(name = "scaleable")
    SCALEABLE,

    /**
     * The data element is unconstrained in units, choice of data types and/or choice of vocabulary such that automated comparison of data captured using the data element is not possible.
     */
    @Json(name = "flexible")
    FLEXIBLE,
  }

  /**
   * The type of an element - one of the FHIR data types.
   *
   * @see <a href="http://hl7.org/fhir/data-types">DataType</a>
   */
  public enum DataType {

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
     */
    @Json(name = "Address")
    ADDRESS,

    /**
     * A duration of time during which an organism (or a process) has existed.
     */
    @Json(name = "Age")
    AGE,

    /**
     * A  text note which also  contains information about who made the statement and when.
     */
    @Json(name = "Annotation")
    ANNOTATION,

    /**
     * For referring to data content defined in other formats.
     */
    @Json(name = "Attachment")
    ATTACHMENT,

    /**
     * Base definition for all elements that are defined inside a resource - but not those in a data type.
     */
    @Json(name = "BackboneElement")
    BACKBONEELEMENT,

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
     */
    @Json(name = "CodeableConcept")
    CODEABLECONCEPT,

    /**
     * A reference to a code defined by a terminology system.
     */
    @Json(name = "Coding")
    CODING,

    /**
     * Specifies contact information for a person or organization.
     */
    @Json(name = "ContactDetail")
    CONTACTDETAIL,

    /**
     * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
     */
    @Json(name = "ContactPoint")
    CONTACTPOINT,

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
     */
    @Json(name = "Contributor")
    CONTRIBUTOR,

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     */
    @Json(name = "Count")
    COUNT,

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
     */
    @Json(name = "DataRequirement")
    DATAREQUIREMENT,

    /**
     * A length - a value with a unit that is a physical distance.
     */
    @Json(name = "Distance")
    DISTANCE,

    /**
     * Indicates how the medication is/was taken or should be taken by the patient.
     */
    @Json(name = "Dosage")
    DOSAGE,

    /**
     * A length of time.
     */
    @Json(name = "Duration")
    DURATION,

    /**
     * Base definition for all elements in a resource.
     */
    @Json(name = "Element")
    ELEMENT,

    /**
     * Captures constraints on each element within the resource, profile, or extension.
     */
    @Json(name = "ElementDefinition")
    ELEMENTDEFINITION,

    /**
     * Optional Extension Element - found in all resources.
     */
    @Json(name = "Extension")
    EXTENSION,

    /**
     * A human's name with the ability to identify parts and usage.
     */
    @Json(name = "HumanName")
    HUMANNAME,

    /**
     * A technical identifier - identifies some entity uniquely and unambiguously.
     */
    @Json(name = "Identifier")
    IDENTIFIER,

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource.
     */
    @Json(name = "Meta")
    META,

    /**
     * An amount of economic utility in some recognized currency.
     */
    @Json(name = "Money")
    MONEY,

    /**
     * A human-readable formatted text, including images.
     */
    @Json(name = "Narrative")
    NARRATIVE,

    /**
     * The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
     */
    @Json(name = "ParameterDefinition")
    PARAMETERDEFINITION,

    /**
     * A time period defined by a start and end date and optionally time.
     */
    @Json(name = "Period")
    PERIOD,

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
     */
    @Json(name = "Quantity")
    QUANTITY,

    /**
     * A set of ordered Quantities defined by a low and high limit.
     */
    @Json(name = "Range")
    RANGE,

    /**
     * A relationship of two Quantity values - expressed as a numerator and a denominator.
     */
    @Json(name = "Ratio")
    RATIO,

    /**
     * A reference from one resource to another.
     */
    @Json(name = "Reference")
    REFERENCE,

    /**
     * Related artifacts such as additional documentation, justification, or bibliographic references.
     */
    @Json(name = "RelatedArtifact")
    RELATEDARTIFACT,

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
     */
    @Json(name = "SampledData")
    SAMPLEDDATA,

    /**
     * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different signature approaches have different utilities.
     */
    @Json(name = "Signature")
    SIGNATURE,

    /**
     * simpleQuantity
     */
    @Json(name = "SimpleQuantity")
    SIMPLEQUANTITY,

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
     */
    @Json(name = "Timing")
    TIMING,

    /**
     * A description of a triggering event.
     */
    @Json(name = "TriggerDefinition")
    TRIGGERDEFINITION,

    /**
     * Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
     */
    @Json(name = "UsageContext")
    USAGECONTEXT,

    /**
     * A stream of bytes
     */
    @Json(name = "base64Binary")
    BASE64BINARY,

    /**
     * Value of "true" or "false"
     */
    @Json(name = "boolean")
    BOOLEAN,

    /**
     * A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
     */
    @Json(name = "code")
    CODE,

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     */
    @Json(name = "date")
    DATE,

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     */
    @Json(name = "dateTime")
    DATETIME,

    /**
     * A rational number with implicit precision
     */
    @Json(name = "decimal")
    DECIMAL,

    /**
     * Any combination of letters, numerals, "-" and ".", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
     */
    @Json(name = "id")
    ID,

    /**
     * An instant in time - known at least to the second
     */
    @Json(name = "instant")
    INSTANT,

    /**
     * A whole number
     */
    @Json(name = "integer")
    INTEGER,

    /**
     * A string that may contain markdown syntax for optional processing by a mark down presentation engine
     */
    @Json(name = "markdown")
    MARKDOWN,

    /**
     * An OID represented as a URI
     */
    @Json(name = "oid")
    OID,

    /**
     * An integer with a value that is positive (e.g. >0)
     */
    @Json(name = "positiveInt")
    POSITIVEINT,

    /**
     * A sequence of Unicode characters
     */
    @Json(name = "string")
    STRING,

    /**
     * A time during the day, with no date specified
     */
    @Json(name = "time")
    TIME,

    /**
     * An integer with a value that is not negative (e.g. >= 0)
     */
    @Json(name = "unsignedInt")
    UNSIGNEDINT,

    /**
     * String of characters used to identify a name or a resource
     */
    @Json(name = "uri")
    URI,

    /**
     * A UUID, represented as a URI
     */
    @Json(name = "uuid")
    UUID,

    /**
     * XHTML format, as defined by W3C, but restricted usage (mainly, no active content)
     */
    @Json(name = "xhtml")
    XHTML,
  }

  /**
   * The days of the week.
   *
   * @see <a href="http://hl7.org/fhir/days-of-week">DaysOfWeek</a>
   */
  public enum DaysOfWeek {

    /**
     * Monday
     */
    @Json(name = "mon")
    MON,

    /**
     * Tuesday
     */
    @Json(name = "tue")
    TUE,

    /**
     * Wednesday
     */
    @Json(name = "wed")
    WED,

    /**
     * Thursday
     */
    @Json(name = "thu")
    THU,

    /**
     * Friday
     */
    @Json(name = "fri")
    FRI,

    /**
     * Saturday
     */
    @Json(name = "sat")
    SAT,

    /**
     * Sunday
     */
    @Json(name = "sun")
    SUN,
  }

  /**
   * Codes identifying the lifecycle stage of a definition
   *
   * @see <a href="http://hl7.org/fhir/definition-status">DefinitionStatus</a>
   */
  public enum DefinitionStatus {

    /**
     * The definition is in the design stage and is not yet considered to be "ready for use"
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The definition is considered ready for use
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The definition should no longer be used
     */
    @Json(name = "withdrawn")
    WITHDRAWN,

    /**
     * The authoring system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * High-level categorization of the definition, used for searching, sorting, and filtering
   *
   * @see <a href="http://hl7.org/fhir/definition-topic">DefinitionTopic</a>
   */
  public enum DefinitionTopic {

    /**
     * The definition is related to treatment of the patient
     */
    @Json(name = "treatment")
    TREATMENT,

    /**
     * The definition is related to education of the patient
     */
    @Json(name = "education")
    EDUCATION,

    /**
     * The definition is related to assessment of the patient
     */
    @Json(name = "assessment")
    ASSESSMENT,
  }

  /**
   * Indicates the potential degree of impact of the identified issue on the patient.
   *
   * @see <a href="http://hl7.org/fhir/detectedissue-severity">DetectedIssueSeverity</a>
   */
  public enum DetectedIssueSeverity {

    /**
     * Indicates the issue may be life-threatening or has the potential to cause permanent injury.
     */
    @Json(name = "high")
    HIGH,

    /**
     * Indicates the issue may result in noticeable adverse consequences but is unlikely to be life-threatening or cause permanent injury.
     */
    @Json(name = "moderate")
    MODERATE,

    /**
     * Indicates the issue may result in some adverse consequences but is unlikely to substantially affect the situation of the subject.
     */
    @Json(name = "low")
    LOW,
  }

  /**
   * Codes representing the current status of the device - on, off, suspended, etc.
   *
   * @see <a href="http://hl7.org/fhir/operational-status">DeviceComponentOperationalStatus</a>
   */
  public enum DeviceComponentOperationalStatus {

    /**
     * The device is off.
     */
    @Json(name = "off")
    OFF,

    /**
     * The device is fully operational.
     */
    @Json(name = "on")
    ON,

    /**
     * The device is not ready.
     */
    @Json(name = "not-ready")
    NOT_READY,

    /**
     * The device is ready but not actively operating.
     */
    @Json(name = "standby")
    STANDBY,

    /**
     * The device transducer is diconnected.
     */
    @Json(name = "transduc-discon")
    TRANSDUC_DISCON,

    /**
     * The device hardware is disconnected.
     */
    @Json(name = "hw-discon")
    HW_DISCON,

    /**
     * The device was entered in error.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Codes identifying groupings of parameters; e.g. Cardiovascular.
   *
   * @see <a href="http://hl7.org/fhir/parameter-group">DeviceComponentParameterGroup</a>
   */
  public enum DeviceComponentParameterGroup {

    /**
     * Haemodynamic Parameter Group - MDC_PGRP_HEMO
     */
    @Json(name = "haemodynamic")
    HAEMODYNAMIC,

    /**
     * ECG Parameter Group - MDC_PGRP_ECG
     */
    @Json(name = "ecg")
    ECG,

    /**
     * Respiratory Parameter Group - MDC_PGRP_RESP
     */
    @Json(name = "respiratory")
    RESPIRATORY,

    /**
     * Ventilation Parameter Group - MDC_PGRP_VENT
     */
    @Json(name = "ventilation")
    VENTILATION,

    /**
     * Neurological Parameter Group - MDC_PGRP_NEURO
     */
    @Json(name = "neurological")
    NEUROLOGICAL,

    /**
     * Drug Delivery Parameter Group - MDC_PGRP_DRUG
     */
    @Json(name = "drug-delivery")
    DRUG_DELIVERY,

    /**
     * Fluid Chemistry Parameter Group - MDC_PGRP_FLUID
     */
    @Json(name = "fluid-chemistry")
    FLUID_CHEMISTRY,

    /**
     * Blood Chemistry Parameter Group - MDC_PGRP_BLOOD_CHEM
     */
    @Json(name = "blood-chemistry")
    BLOOD_CHEMISTRY,

    /**
     * Miscellaneous Parameter Group - MDC_PGRP_MISC
     */
    @Json(name = "miscellaneous")
    MISCELLANEOUS,
  }

  /**
   * Describes the state of a metric calibration.
   *
   * @see <a href="http://hl7.org/fhir/metric-calibration-state">DeviceMetricCalibrationState</a>
   */
  public enum DeviceMetricCalibrationState {

    /**
     * The metric has not been calibrated.
     */
    @Json(name = "not-calibrated")
    NOT_CALIBRATED,

    /**
     * The metric needs to be calibrated.
     */
    @Json(name = "calibration-required")
    CALIBRATION_REQUIRED,

    /**
     * The metric has been calibrated.
     */
    @Json(name = "calibrated")
    CALIBRATED,

    /**
     * The state of calibration of this metric is unspecified.
     */
    @Json(name = "unspecified")
    UNSPECIFIED,
  }

  /**
   * Describes the type of a metric calibration.
   *
   * @see <a href="http://hl7.org/fhir/metric-calibration-type">DeviceMetricCalibrationType</a>
   */
  public enum DeviceMetricCalibrationType {

    /**
     * Metric calibration method has not been identified.
     */
    @Json(name = "unspecified")
    UNSPECIFIED,

    /**
     * Offset metric calibration method
     */
    @Json(name = "offset")
    OFFSET,

    /**
     * Gain metric calibration method
     */
    @Json(name = "gain")
    GAIN,

    /**
     * Two-point metric calibration method
     */
    @Json(name = "two-point")
    TWO_POINT,
  }

  /**
   * Describes the category of the metric.
   *
   * @see <a href="http://hl7.org/fhir/metric-category">DeviceMetricCategory</a>
   */
  public enum DeviceMetricCategory {

    /**
     * DeviceObservations generated for this DeviceMetric are measured.
     */
    @Json(name = "measurement")
    MEASUREMENT,

    /**
     * DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.
     */
    @Json(name = "setting")
    SETTING,

    /**
     * DeviceObservations generated for this DeviceMetric are calculated.
     */
    @Json(name = "calculation")
    CALCULATION,

    /**
     * The category of this DeviceMetric is unspecified.
     */
    @Json(name = "unspecified")
    UNSPECIFIED,
  }

  /**
   * Describes the typical color of representation.
   *
   * @see <a href="http://hl7.org/fhir/metric-color">DeviceMetricColor</a>
   */
  public enum DeviceMetricColor {

    /**
     * Color for representation - black.
     */
    @Json(name = "black")
    BLACK,

    /**
     * Color for representation - red.
     */
    @Json(name = "red")
    RED,

    /**
     * Color for representation - green.
     */
    @Json(name = "green")
    GREEN,

    /**
     * Color for representation - yellow.
     */
    @Json(name = "yellow")
    YELLOW,

    /**
     * Color for representation - blue.
     */
    @Json(name = "blue")
    BLUE,

    /**
     * Color for representation - magenta.
     */
    @Json(name = "magenta")
    MAGENTA,

    /**
     * Color for representation - cyan.
     */
    @Json(name = "cyan")
    CYAN,

    /**
     * Color for representation - white.
     */
    @Json(name = "white")
    WHITE,
  }

  /**
   * Describes the operational status of the DeviceMetric.
   *
   * @see <a href="http://hl7.org/fhir/metric-operational-status">DeviceMetricOperationalStatus</a>
   */
  public enum DeviceMetricOperationalStatus {

    /**
     * The DeviceMetric is operating and will generate DeviceObservations.
     */
    @Json(name = "on")
    ON,

    /**
     * The DeviceMetric is not operating.
     */
    @Json(name = "off")
    OFF,

    /**
     * The DeviceMetric is operating, but will not generate any DeviceObservations.
     */
    @Json(name = "standby")
    STANDBY,

    /**
     * The DeviceMetric was entered in error.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Codes for device specification types such as serial number, part number, hardware revision, software revision, etc.
   *
   * @see <a href="http://hl7.org/fhir/specification-type">DeviceSpecificationSpecType</a>
   */
  public enum DeviceSpecificationSpecType {

    /**
     * Unspecified Production Specification - MDC_ID_PROD_SPEC_UNSPECIFIED
     */
    @Json(name = "unspecified")
    UNSPECIFIED,

    /**
     * Serial Number - MDC_ID_PROD_SPEC_SERIAL
     */
    @Json(name = "serial-number")
    SERIAL_NUMBER,

    /**
     * Part Number - MDC_ID_PROD_SPEC_PART
     */
    @Json(name = "part-number")
    PART_NUMBER,

    /**
     * Hardware Revision - MDC_ID_PROD_SPEC_HW
     */
    @Json(name = "hardware-revision")
    HARDWARE_REVISION,

    /**
     * Software Revision - MDC_ID_PROD_SPEC_SW
     */
    @Json(name = "software-revision")
    SOFTWARE_REVISION,

    /**
     * Firmware Revision - MDC_ID_PROD_SPEC_FW
     */
    @Json(name = "firmware-revision")
    FIRMWARE_REVISION,

    /**
     * Protocol Revision - MDC_ID_PROD_SPEC_PROTOCOL
     */
    @Json(name = "protocol-revision")
    PROTOCOL_REVISION,

    /**
     * GMDN - MDC_ID_PROD_SPEC_GMDN
     */
    @Json(name = "gmdn")
    GMDN,
  }

  /**
   * A coded concept indicating the current status of a the Device Usage
   *
   * @see <a href="http://hl7.org/fhir/device-statement-status">DeviceUseStatementStatus</a>
   */
  public enum DeviceUseStatementStatus {

    /**
     * The device is still being used.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The device is no longer being used.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The statement was recorded incorrectly.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The device may be used at some time in the future.
     */
    @Json(name = "intended")
    INTENDED,

    /**
     * Actions implied by the statement have been permanently halted, before all of them occurred.
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * Actions implied by the statement have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    @Json(name = "on-hold")
    ON_HOLD,
  }

  /**
   * The status of the diagnostic report as a whole.
   *
   * @see <a href="http://hl7.org/fhir/diagnostic-report-status">DiagnosticReportStatus</a>
   */
  public enum DiagnosticReportStatus {

    /**
     * The existence of the report is registered, but there is nothing yet available.
     */
    @Json(name = "registered")
    REGISTERED,

    /**
     * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
     */
    @Json(name = "partial")
    PARTIAL,

    /**
     * Verified early results are available, but not all  results are final.
     */
    @Json(name = "preliminary")
    PRELIMINARY,

    /**
     * The report is complete and verified by an authorized person.
     */
    @Json(name = "final")
    FINAL,

    /**
     * Subsequent to being final, the report has been modified.  This includes any change in the results, diagnosis, narrative text, or other content of a report that has been issued.
     */
    @Json(name = "amended")
    AMENDED,

    /**
     * Subsequent to being final, the report has been modified  to correct an error in the report or referenced results.
     */
    @Json(name = "corrected")
    CORRECTED,

    /**
     * Subsequent to being final, the report has been modified by adding new content. The existing content is unchanged.
     */
    @Json(name = "appended")
    APPENDED,

    /**
     * The report is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * The report has been withdrawn following a previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this request. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Whether the media is a photo, video, or audio
   *
   * @see <a href="http://hl7.org/fhir/digital-media-type">DigitalMediaType</a>
   */
  public enum DigitalMediaType {

    /**
     * The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents
     */
    @Json(name = "photo")
    PHOTO,

    /**
     * The media consists of a series of frames that capture a moving image
     */
    @Json(name = "video")
    VIDEO,

    /**
     * The media consists of a sound recording
     */
    @Json(name = "audio")
    AUDIO,
  }

  /**
   * How an element value is interpreted when discrimination is evaluated
   *
   * @see <a href="http://hl7.org/fhir/discriminator-type">DiscriminatorType</a>
   */
  public enum DiscriminatorType {

    /**
     * The slices have different values in the nominated element
     */
    @Json(name = "value")
    VALUE,

    /**
     * The slices are differentiated by the presence or absence of the nominated element
     */
    @Json(name = "exists")
    EXISTS,

    /**
     * The slices have different values in the nominated element, as determined by testing them against the applicable ElementDefinition.pattern[x]
     */
    @Json(name = "pattern")
    PATTERN,

    /**
     * The slices are differentiated by type of the nominated element to a specifed profile
     */
    @Json(name = "type")
    TYPE,

    /**
     * The slices are differentiated by conformance of the nominated element to a specifed profile
     */
    @Json(name = "profile")
    PROFILE,
  }

  /**
   * Whether the application produces or consumes documents.
   *
   * @see <a href="http://hl7.org/fhir/document-mode">DocumentMode</a>
   */
  public enum DocumentMode {

    /**
     * The application produces documents of the specified type.
     */
    @Json(name = "producer")
    PRODUCER,

    /**
     * The application consumes documents of the specified type.
     */
    @Json(name = "consumer")
    CONSUMER,
  }

  /**
   * The status of the document reference.
   *
   * @see <a href="http://hl7.org/fhir/document-reference-status">DocumentReferenceStatus</a>
   */
  public enum DocumentReferenceStatus {

    /**
     * This is the current reference for this document.
     */
    @Json(name = "current")
    CURRENT,

    /**
     * This reference has been superseded by another reference.
     */
    @Json(name = "superseded")
    SUPERSEDED,

    /**
     * This reference was created in error.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * The type of relationship between documents.
   *
   * @see <a href="http://hl7.org/fhir/document-relationship-type">DocumentRelationshipType</a>
   */
  public enum DocumentRelationshipType {

    /**
     * This document logically replaces or supersedes the target document.
     */
    @Json(name = "replaces")
    REPLACES,

    /**
     * This document was generated by transforming the target document (e.g. format or language conversion).
     */
    @Json(name = "transforms")
    TRANSFORMS,

    /**
     * This document is a signature of the target document.
     */
    @Json(name = "signs")
    SIGNS,

    /**
     * This document adds additional information to the target document.
     */
    @Json(name = "appends")
    APPENDS,
  }

  /**
   * The status of the location.
   *
   * @see <a href="http://hl7.org/fhir/encounter-location-status">EncounterLocationStatus</a>
   */
  public enum EncounterLocationStatus {

    /**
     * The patient is planned to be moved to this location at some point in the future.
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * The patient is currently at this location, or was between the period specified.
     *
     * A system may update these records when the patient leaves the location to either reserved, or completed
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * This location is held empty for this patient.
     */
    @Json(name = "reserved")
    RESERVED,

    /**
     * The patient was at this location during the period specified.
     *
     * Not to be used when the patient is currently at the location
     */
    @Json(name = "completed")
    COMPLETED,
  }

  /**
   * Current state of the encounter
   *
   * @see <a href="http://hl7.org/fhir/encounter-status">EncounterStatus</a>
   */
  public enum EncounterStatus {

    /**
     * The Encounter has not yet started.
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * The Patient is present for the encounter, however is not currently meeting with a practitioner.
     */
    @Json(name = "arrived")
    ARRIVED,

    /**
     * The patient has been assessed for the priority of their treatment based on the severity of their condition.
     */
    @Json(name = "triaged")
    TRIAGED,

    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     */
    @Json(name = "onleave")
    ONLEAVE,

    /**
     * The Encounter has ended.
     */
    @Json(name = "finished")
    FINISHED,

    /**
     * The Encounter has ended before it has begun.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The encounter status is unknown. Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * The status of the endpoint
   *
   * @see <a href="http://hl7.org/fhir/endpoint-status">EndpointStatus</a>
   */
  public enum EndpointStatus {

    /**
     * This endpoint is expected to be active and can be used
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * This endpoint is temporarily unavailable
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken
     */
    @Json(name = "error")
    ERROR,

    /**
     * This endpoint is no longer to be used
     */
    @Json(name = "off")
    OFF,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * This endpoint is not intended for production usage.
     */
    @Json(name = "test")
    TEST,
  }

  /**
   * The status of the episode of care.
   *
   * @see <a href="http://hl7.org/fhir/episode-of-care-status">EpisodeOfCareStatus</a>
   */
  public enum EpisodeOfCareStatus {

    /**
     * This episode of care is planned to start at the date specified in the period.start. During this status, an organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to make resources available to provide care services.
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * This episode has been placed on a waitlist, pending the episode being made active (or cancelled).
     */
    @Json(name = "waitlist")
    WAITLIST,

    /**
     * This episode of care is current.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * This episode of care is on hold, the organization has limited responsibility for the patient (such as while on respite).
     */
    @Json(name = "onhold")
    ONHOLD,

    /**
     * This episode of care is finished and the organization is not expecting to be providing further care to the patient. Can also be known as "closed", "completed" or other similar terms.
     */
    @Json(name = "finished")
    FINISHED,

    /**
     * The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * The mode of a message capability statement.
   *
   * @see <a href="http://hl7.org/fhir/event-capability-mode">EventCapabilityMode</a>
   */
  public enum EventCapabilityMode {

    /**
     * The application sends requests and receives responses.
     */
    @Json(name = "sender")
    SENDER,

    /**
     * The application receives requests and sends responses.
     */
    @Json(name = "receiver")
    RECEIVER,
  }

  /**
   * Codes identifying the stage lifecycle stage of a event
   *
   * @see <a href="http://hl7.org/fhir/event-status">EventStatus</a>
   */
  public enum EventStatus {

    /**
     * The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.
     */
    @Json(name = "preparation")
    PREPARATION,

    /**
     * The event is currently occurring
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * The event has been temporarily stopped but is expected to resume in the future
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The event was  prior to the full completion of the intended actions
     */
    @Json(name = "aborted")
    ABORTED,

    /**
     * The event has now concluded
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Real world event relating to the schedule.
   *
   * @see <a href="http://hl7.org/fhir/event-timing">EventTiming</a>
   */
  public enum EventTiming {

    /**
     * event occurs during the morning
     */
    @Json(name = "MORN")
    MORN,

    /**
     * event occurs during the afternoon
     */
    @Json(name = "AFT")
    AFT,

    /**
     * event occurs during the evening
     */
    @Json(name = "EVE")
    EVE,

    /**
     * event occurs during the night
     */
    @Json(name = "NIGHT")
    NIGHT,

    /**
     * event occurs [offset] after subject goes to sleep
     */
    @Json(name = "PHS")
    PHS,
  }

  /**
   * A code specifying the state of the resource instance.
   *
   * @see <a href="http://hl7.org/fhir/explanationofbenefit-status">ExplanationOfBenefitStatus</a>
   */
  public enum ExplanationOfBenefitStatus {

    /**
     * The resource instance is currently in-force.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The resource instance is withdrawn, rescinded or reversed.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * A new resource instance the contents of which is not complete.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The resource instance was entered in error.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * How an extension context is interpreted.
   *
   * @see <a href="http://hl7.org/fhir/extension-context">ExtensionContext</a>
   */
  public enum ExtensionContext {

    /**
     * The context is all elements matching a particular resource element path.
     */
    @Json(name = "resource")
    RESOURCE,

    /**
     * The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).
     */
    @Json(name = "datatype")
    DATATYPE,

    /**
     * The context is a particular extension from a particular profile, a uri that identifies the extension definition.
     */
    @Json(name = "extension")
    EXTENSION,
  }

  /**
   * A set of common concept properties for use on coded systems through out the FHIR eco-system.
   *
   * @see <a href="http://hl7.org/fhir/concept-properties">FHIRDefinedConceptProperties</a>
   */
  public enum FHIRDefinedConceptProperties {

    /**
     * True if the concept is not considered active - e.g. not a valid concept any more. Property type is boolean, default value is false
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The date at which a concept was deprecated. Concepts that are deprecated but not inactive can still be used, but their use is discouraged, and they should be expected to be made inactive in a future release. Property type is dateTime
     */
    @Json(name = "deprecated")
    DEPRECATED,

    /**
     * The concept is not intended to be chosen by the user - only intended to be used as a selector for other concepts. Note, though, that the interpretation of this is highly contextual; all concepts are selectable in some context. Property type is boolean, default value is false
     */
    @Json(name = "notSelectable")
    NOTSELECTABLE,

    /**
     * The concept identified in this property is a parent of the concept on which it is a property. The property type will be 'code'. The meaning of 'parent' is defined by the hierarchyMeaning attribute
     */
    @Json(name = "parent")
    PARENT,

    /**
     * The concept identified in this property is a child of the concept on which it is a property. The property type will be 'code'. The meaning of 'child' is defined by the hierarchyMeaning attribute
     */
    @Json(name = "child")
    CHILD,
  }

  /**
   * The availability status of the device.
   *
   * @see <a href="http://hl7.org/fhir/device-status">FHIRDeviceStatus</a>
   */
  public enum FHIRDeviceStatus {

    /**
     * The Device is available for use.  Note: This means for *implanted devices*  the device is implanted in the patient.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The Device is no longer available for use (e.g. lost, expired, damaged).  Note: This means for *implanted devices*  the device has been removed from the patient.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The Device was entered in error and voided.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The status of the device has not been determined.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * The set of interactions defined by the RESTful part of the FHIR specification.
   *
   * @see <a href="http://hl7.org/fhir/restful-interaction">FHIRRestfulInteractions</a>
   */
  public enum FHIRRestfulInteractions {

    /**
     * Read the current state of the resource.
     */
    @Json(name = "read")
    READ,

    /**
     * Read the state of a specific version of the resource.
     */
    @Json(name = "vread")
    VREAD,

    /**
     * Update an existing resource by its id (or create it if it is new).
     */
    @Json(name = "update")
    UPDATE,

    /**
     * Update an existing resource by posting a set of changes to it.
     */
    @Json(name = "patch")
    PATCH,

    /**
     * Delete a resource.
     */
    @Json(name = "delete")
    DELETE,

    /**
     * Retrieve the change history for a particular resource, type of resource, or the entire system.
     */
    @Json(name = "history")
    HISTORY,

    /**
     * Retrieve the change history for a particular resource.
     */
    @Json(name = "history-instance")
    HISTORY_INSTANCE,

    /**
     * Retrieve the change history for all resources of a particular type.
     */
    @Json(name = "history-type")
    HISTORY_TYPE,

    /**
     * Retrieve the change history for all resources on a system.
     */
    @Json(name = "history-system")
    HISTORY_SYSTEM,

    /**
     * Create a new resource with a server assigned id.
     */
    @Json(name = "create")
    CREATE,

    /**
     * Search a resource type or all resources based on some filter criteria.
     */
    @Json(name = "search")
    SEARCH,

    /**
     * Search all resources of the specified type based on some filter criteria.
     */
    @Json(name = "search-type")
    SEARCH_TYPE,

    /**
     * Search all resources based on some filter criteria.
     */
    @Json(name = "search-system")
    SEARCH_SYSTEM,

    /**
     * Get a Capability Statement for the system.
     */
    @Json(name = "capabilities")
    CAPABILITIES,

    /**
     * Update, create or delete a set of resources as a single transaction.
     */
    @Json(name = "transaction")
    TRANSACTION,

    /**
     * perform a set of a separate interactions in a single http operation
     */
    @Json(name = "batch")
    BATCH,

    /**
     * Perform an operation as defined by an OperationDefinition.
     */
    @Json(name = "operation")
    OPERATION,
  }

  /**
   * A code to indicate if the substance is actively used
   *
   * @see <a href="http://hl7.org/fhir/substance-status">FHIRSubstanceStatus</a>
   */
  public enum FHIRSubstanceStatus {

    /**
     * The substance is considered for use or reference
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The substance is considered for reference, but not for use
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The substance was entered in error
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Codes describing the reason why a family member history was not done.
   *
   * @see <a href="http://hl7.org/fhir/history-not-done-reason">FamilyHistoryNotDoneReason</a>
   */
  public enum FamilyHistoryNotDoneReason {

    /**
     * Patient does not know the subject, e.g. the biological parent of an adopted patient.
     */
    @Json(name = "subject-unknown")
    SUBJECT_UNKNOWN,

    /**
     * The patient withheld or refused to share the information.
     */
    @Json(name = "withheld")
    WITHHELD,

    /**
     * Information cannot be obtained; e.g. unconscious patient
     */
    @Json(name = "unable-to-obtain")
    UNABLE_TO_OBTAIN,

    /**
     * Patient does not have the information now, but can provide the information at a later date.
     */
    @Json(name = "deferred")
    DEFERRED,
  }

  /**
   * A code that identifies the status of the family history record.
   *
   * @see <a href="http://hl7.org/fhir/history-status">FamilyHistoryStatus</a>
   */
  public enum FamilyHistoryStatus {

    /**
     * Some health information is known and captured, but not complete - see notes for details.
     */
    @Json(name = "partial")
    PARTIAL,

    /**
     * All available related health information is captured as of the date (and possibly time) when the family member history was taken.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Health information for this individual is unavailable/unknown.
     */
    @Json(name = "health-unknown")
    HEALTH_UNKNOWN,
  }

  /**
   * The kind of operation to perform as a part of a property based filter.
   *
   * @see <a href="http://hl7.org/fhir/filter-operator">FilterOperator</a>
   */
  public enum FilterOperator {

    /**
     * The specified property of the code equals the provided value.
     */
    @Json(name = "=")
    EQUAL,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (i.e. include child codes)
     */
    @Json(name = "is-a")
    IS_A,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself (i.e. include child codes)
     */
    @Json(name = "descendent-of")
    DESCENDENT_OF,

    /**
     * The specified property of the code does not have an is-a relationship with the provided value.
     */
    @Json(name = "is-not-a")
    IS_NOT_A,

    /**
     * The specified property of the code  matches the regex specified in the provided value.
     */
    @Json(name = "regex")
    REGEX,

    /**
     * The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
     */
    @Json(name = "in")
    IN,

    /**
     * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
     */
    @Json(name = "not-in")
    NOT_IN,

    /**
     * Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (e.g. include parent codes)
     */
    @Json(name = "generalizes")
    GENERALIZES,

    /**
     * The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values)
     */
    @Json(name = "exists")
    EXISTS,
  }

  /**
   * Indicates whether this flag is active and needs to be displayed to a user, or whether it is no longer needed or entered in error.
   *
   * @see <a href="http://hl7.org/fhir/flag-status">FlagStatus</a>
   */
  public enum FlagStatus {

    /**
     * A current flag that should be displayed to a user. A system may use the category to determine which roles should view the flag.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The flag does not need to be displayed any more.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The flag was added in error, and should no longer be displayed.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Codes indicating whether the goal has been accepted by a stakeholder
   *
   * @see <a href="http://hl7.org/fhir/goal-acceptance-status">GoalAcceptanceStatus</a>
   */
  public enum GoalAcceptanceStatus {

    /**
     * Stakeholder supports pursuit of the goal
     */
    @Json(name = "agree")
    AGREE,

    /**
     * Stakeholder is not in support of the pursuit of the goal
     */
    @Json(name = "disagree")
    DISAGREE,

    /**
     * Stakeholder has not yet made a decision on whether they support the goal
     */
    @Json(name = "pending")
    PENDING,
  }

  /**
   * Types of relationships between two goals
   *
   * @see <a href="http://hl7.org/fhir/goal-relationship-type">GoalRelationshipType</a>
   */
  public enum GoalRelationshipType {

    /**
     * Indicates that the target goal is one which must be met before striving for the current goal
     */
    @Json(name = "predecessor")
    PREDECESSOR,

    /**
     * Indicates that the target goal is a desired objective once the current goal is met
     */
    @Json(name = "successor")
    SUCCESSOR,

    /**
     * Indicates that this goal has been replaced by the target goal
     */
    @Json(name = "replacement")
    REPLACEMENT,

    /**
     * Indicates that the target goal is considered to be a "piece" of attaining this goal.
     */
    @Json(name = "milestone")
    MILESTONE,

    /**
     * Indicates that the relationship is not covered by one of the pre-defined codes.  (An extension may convey more information about the meaning of the relationship.)
     */
    @Json(name = "other")
    OTHER,
  }

  /**
   * Indicates whether the goal has been met and is still being targeted
   *
   * @see <a href="http://hl7.org/fhir/goal-status">GoalStatus</a>
   */
  public enum GoalStatus {

    /**
     * A goal is proposed for this patient
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * A proposed goal was accepted or acknowledged
     */
    @Json(name = "accepted")
    ACCEPTED,

    /**
     * A goal is planned for this patient
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again)
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * The goal is on schedule for the planned timelines
     */
    @Json(name = "on-target")
    ON_TARGET,

    /**
     * The goal is ahead of the planned timelines
     */
    @Json(name = "ahead-of-target")
    AHEAD_OF_TARGET,

    /**
     * The goal is behind the planned timelines
     */
    @Json(name = "behind-target")
    BEHIND_TARGET,

    /**
     * The goal has been met, but ongoing activity is needed to sustain the goal objective
     */
    @Json(name = "sustaining")
    SUSTAINING,

    /**
     * The goal has been met and no further action is needed
     */
    @Json(name = "achieved")
    ACHIEVED,

    /**
     * The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * The previously accepted goal is no longer being sought
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * The goal was entered in error and voided.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * A proposed goal was rejected
     */
    @Json(name = "rejected")
    REJECTED,
  }

  /**
   * How a compartment must be linked
   *
   * @see <a href="http://hl7.org/fhir/graph-compartment-rule">GraphCompartmentRule</a>
   */
  public enum GraphCompartmentRule {

    /**
     * The compartment must be identical (the same literal reference)
     */
    @Json(name = "identical")
    IDENTICAL,

    /**
     * The compartment must be the same - the record must be about the same patient, but the reference may be different
     */
    @Json(name = "matching")
    MATCHING,

    /**
     * The compartment must be different
     */
    @Json(name = "different")
    DIFFERENT,

    /**
     * The compartment rule is defined in the accompanying FHIRPath expression
     */
    @Json(name = "custom")
    CUSTOM,
  }

  /**
   * Types of resources that are part of group
   *
   * @see <a href="http://hl7.org/fhir/group-type">GroupType</a>
   */
  public enum GroupType {

    /**
     * Group contains "person" Patient resources
     */
    @Json(name = "person")
    PERSON,

    /**
     * Group contains "animal" Patient resources
     */
    @Json(name = "animal")
    ANIMAL,

    /**
     * Group contains healthcare practitioner resources
     */
    @Json(name = "practitioner")
    PRACTITIONER,

    /**
     * Group contains Device resources
     */
    @Json(name = "device")
    DEVICE,

    /**
     * Group contains Medication resources
     */
    @Json(name = "medication")
    MEDICATION,

    /**
     * Group contains Substance resources
     */
    @Json(name = "substance")
    SUBSTANCE,
  }

  /**
   * The status of a guidance response
   *
   * @see <a href="http://hl7.org/fhir/guidance-response-status">GuidanceResponseStatus</a>
   */
  public enum GuidanceResponseStatus {

    /**
     * The request was processed successfully
     */
    @Json(name = "success")
    SUCCESS,

    /**
     * The request was processed successfully, but more data may result in a more complete evaluation
     */
    @Json(name = "data-requested")
    DATA_REQUESTED,

    /**
     * The request was processed, but more data is required to complete the evaluation
     */
    @Json(name = "data-required")
    DATA_REQUIRED,

    /**
     * The request is currently being processed
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * The request was not processed successfully
     */
    @Json(name = "failure")
    FAILURE,

    /**
     * The response was entered in error
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * How a dependency is represented when the guide is published.
   *
   * @see <a href="http://hl7.org/fhir/guide-dependency-type">GuideDependencyType</a>
   */
  public enum GuideDependencyType {

    /**
     * The guide is referred to by URL.
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * The guide is embedded in this guide when published.
     */
    @Json(name = "inclusion")
    INCLUSION,
  }

  /**
   * The kind of an included page.
   *
   * @see <a href="http://hl7.org/fhir/guide-page-kind">GuidePageKind</a>
   */
  public enum GuidePageKind {

    /**
     * This is a page of content that is included in the implementation guide. It has no particular function.
     */
    @Json(name = "page")
    PAGE,

    /**
     * This is a page that represents a human readable rendering of an example.
     */
    @Json(name = "example")
    EXAMPLE,

    /**
     * This is a page that represents a list of resources of one or more types.
     */
    @Json(name = "list")
    LIST,

    /**
     * This is a page showing where an included guide is injected.
     */
    @Json(name = "include")
    INCLUDE,

    /**
     * This is a page that lists the resources of a given type, and also creates pages for all the listed types as other pages in the section.
     */
    @Json(name = "directory")
    DIRECTORY,

    /**
     * This is a page that creates the listed resources as a dictionary.
     */
    @Json(name = "dictionary")
    DICTIONARY,

    /**
     * This is a generated page that contains the table of contents.
     */
    @Json(name = "toc")
    TOC,

    /**
     * This is a page that represents a presented resource. This is typically used for generated conformance resource presentations.
     */
    @Json(name = "resource")
    RESOURCE,
  }

  /**
   * An HL7 administrative unit that owns artifacts in the FHIR specification
   *
   * @see <a href="http://hl7.org/fhir/hl7-work-group">HL7Workgroup</a>
   */
  public enum HL7Workgroup {

    /**
     * Community Based Collaborative Care (http://www.hl7.org/Special/committees/cbcc/index.cfm)
     */
    @Json(name = "cbcc")
    CBCC,

    /**
     * Clinical Decision Support (http://www.hl7.org/Special/committees/dss/index.cfm)
     */
    @Json(name = "cds")
    CDS,

    /**
     * Clinical Quality Information (http://www.hl7.org/Special/committees/cqi/index.cfm)
     */
    @Json(name = "cqi")
    CQI,

    /**
     * Clinical Genomics (http://www.hl7.org/Special/committees/clingenomics/index.cfm)
     */
    @Json(name = "cg")
    CG,

    /**
     * Health Care Devices (http://www.hl7.org/Special/committees/healthcaredevices/index.cfm)
     */
    @Json(name = "dev")
    DEV,

    /**
     * Electronic Health Records (http://www.hl7.org/special/committees/ehr/index.cfm)
     */
    @Json(name = "ehr")
    EHR,

    /**
     * FHIR Infrastructure (http://www.hl7.org/Special/committees/fiwg/index.cfm)
     */
    @Json(name = "fhir")
    FHIR,

    /**
     * Financial Management (http://www.hl7.org/Special/committees/fm/index.cfm)
     */
    @Json(name = "fm")
    FM,

    /**
     * Health Standards Integration (http://www.hl7.org/Special/committees/hsi/index.cfm)
     */
    @Json(name = "hsi")
    HSI,

    /**
     * Imaging Integration (http://www.hl7.org/Special/committees/imagemgt/index.cfm)
     */
    @Json(name = "ii")
    II,

    /**
     * Infrastructure And Messaging (http://www.hl7.org/special/committees/inm/index.cfm)
     */
    @Json(name = "inm")
    INM,

    /**
     * Implementable Technology Specifications (http://www.hl7.org/special/committees/xml/index.cfm)
     */
    @Json(name = "its")
    ITS,

    /**
     * Orders and Observations (http://www.hl7.org/Special/committees/orders/index.cfm)
     */
    @Json(name = "oo")
    OO,

    /**
     * Patient Administration (http://www.hl7.org/Special/committees/pafm/index.cfm)
     */
    @Json(name = "pa")
    PA,

    /**
     * Patient Care (http://www.hl7.org/Special/committees/patientcare/index.cfm)
     */
    @Json(name = "pc")
    PC,

    /**
     * Public Health and Emergency Response (http://www.hl7.org/Special/committees/pher/index.cfm)
     */
    @Json(name = "pher")
    PHER,

    /**
     * Pharmacy (http://www.hl7.org/Special/committees/medication/index.cfm)
     */
    @Json(name = "phx")
    PHX,

    /**
     * Regulated Clinical Research Information Management (http://www.hl7.org/Special/committees/rcrim/index.cfm)
     */
    @Json(name = "rcrim")
    RCRIM,

    /**
     * Structured Documents (http://www.hl7.org/Special/committees/structure/index.cfm)
     */
    @Json(name = "sd")
    SD,

    /**
     * Security (http://www.hl7.org/Special/committees/secure/index.cfm)
     */
    @Json(name = "sec")
    SEC,

    /**
     * US Realm Taskforce (http://wiki.hl7.org/index.php?title=US_Realm_Task_Force)
     */
    @Json(name = "us")
    US,

    /**
     * Vocabulary (http://www.hl7.org/Special/committees/Vocab/index.cfm)
     */
    @Json(name = "vocab")
    VOCAB,

    /**
     * Application Implementation and Design (http://www.hl7.org/Special/committees/java/index.cfm)
     */
    @Json(name = "aid")
    AID,
  }

  /**
   * HTTP verbs (in the HTTP command line).
   *
   * @see <a href="http://hl7.org/fhir/http-verb">HTTPVerb</a>
   */
  public enum HTTPVerb {

    /**
     * HTTP GET
     */
    @Json(name = "GET")
    GET,

    /**
     * HTTP POST
     */
    @Json(name = "POST")
    POST,

    /**
     * HTTP PUT
     */
    @Json(name = "PUT")
    PUT,

    /**
     * HTTP DELETE
     */
    @Json(name = "DELETE")
    DELETE,
  }

  /**
   * A code that represents the preferred display order of the components of a human name
   *
   * @see <a href="http://hl7.org/fhir/name-assembly-order">HumanNameAssemblyOrder</a>
   */
  public enum HumanNameAssemblyOrder {

    /**
     * NL1
     */
    @Json(name = "NL1")
    NL1,

    /**
     * NL2
     */
    @Json(name = "NL2")
    NL2,

    /**
     * NL3
     */
    @Json(name = "NL3")
    NL3,

    /**
     * NL4
     */
    @Json(name = "NL4")
    NL4,
  }

  /**
   * Identifies the purpose for this identifier, if known .
   *
   * @see <a href="http://hl7.org/fhir/identifier-use">IdentifierUse</a>
   */
  public enum IdentifierUse {

    /**
     * The identifier recommended for display and use in real-world interactions.
     */
    @Json(name = "usual")
    USUAL,

    /**
     * The identifier considered to be most trusted for the identification of this item.
     */
    @Json(name = "official")
    OFFICIAL,

    /**
     * A temporary identifier.
     */
    @Json(name = "temp")
    TEMP,

    /**
     * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
     */
    @Json(name = "secondary")
    SECONDARY,
  }

  /**
   * The level of confidence that this link represents the same actual person, based on NIST Authentication Levels.
   *
   * @see <a href="http://hl7.org/fhir/identity-assuranceLevel">IdentityAssuranceLevel</a>
   */
  public enum IdentityAssuranceLevel {

    /**
     * Little or no confidence in the asserted identity's accuracy.
     */
    @Json(name = "level1")
    LEVEL1,

    /**
     * Some confidence in the asserted identity's accuracy.
     */
    @Json(name = "level2")
    LEVEL2,

    /**
     * High confidence in the asserted identity's accuracy.
     */
    @Json(name = "level3")
    LEVEL3,

    /**
     * Very high confidence in the asserted identity's accuracy.
     */
    @Json(name = "level4")
    LEVEL4,
  }

  /**
   * A set codes that define the functional status of an implanted device.
   *
   * @see <a href="http://hl7.org/fhir/implant-status">ImplantStatus</a>
   */
  public enum ImplantStatus {

    /**
     * The implanted device is working normally
     */
    @Json(name = "functional")
    FUNCTIONAL,

    /**
     * The implanted device is not working
     */
    @Json(name = "non-functional")
    NON_FUNCTIONAL,

    /**
     * The implanted device has been turned off
     */
    @Json(name = "disabled")
    DISABLED,

    /**
     * the functional status of the implant has not been determined
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * How the issue affects the success of the action.
   *
   * @see <a href="http://hl7.org/fhir/issue-severity">IssueSeverity</a>
   */
  public enum IssueSeverity {

    /**
     * The issue caused the action to fail, and no further checking could be performed.
     */
    @Json(name = "fatal")
    FATAL,

    /**
     * The issue is sufficiently important to cause the action to fail.
     */
    @Json(name = "error")
    ERROR,

    /**
     * The issue is not important enough to cause the action to fail, but may cause it to be performed suboptimally or in a way that is not as desired.
     */
    @Json(name = "warning")
    WARNING,

    /**
     * The issue has no relation to the degree of success of the action.
     */
    @Json(name = "information")
    INFORMATION,
  }

  /**
   * A code that describes the type of issue.
   *
   * @see <a href="http://hl7.org/fhir/issue-type">IssueType</a>
   */
  public enum IssueType {

    /**
     * Content invalid against the specification or a profile.
     */
    @Json(name = "invalid")
    INVALID,

    /**
     * A structural issue in the content such as wrong namespace, or unable to parse the content completely, or invalid json syntax.
     */
    @Json(name = "structure")
    STRUCTURE,

    /**
     * A required element is missing.
     */
    @Json(name = "required")
    REQUIRED,

    /**
     * An element value is invalid.
     */
    @Json(name = "value")
    VALUE,

    /**
     * A content validation rule failed - e.g. a schematron rule.
     */
    @Json(name = "invariant")
    INVARIANT,

    /**
     * An authentication/authorization/permissions issue of some kind.
     */
    @Json(name = "security")
    SECURITY,

    /**
     * The client needs to initiate an authentication process.
     */
    @Json(name = "login")
    LOGIN,

    /**
     * The user or system was not able to be authenticated (either there is no process, or the proferred token is unacceptable).
     */
    @Json(name = "unknown")
    UNKNOWN,

    /**
     * User session expired; a login may be required.
     */
    @Json(name = "expired")
    EXPIRED,

    /**
     * The user does not have the rights to perform this action.
     */
    @Json(name = "forbidden")
    FORBIDDEN,

    /**
     * Some information was not or may not have been returned due to business rules, consent or privacy rules, or access permission constraints.  This information may be accessible through alternate processes.
     */
    @Json(name = "suppressed")
    SUPPRESSED,

    /**
     * Processing issues. These are expected to be final e.g. there is no point resubmitting the same content unchanged.
     */
    @Json(name = "processing")
    PROCESSING,

    /**
     * The resource or profile is not supported.
     */
    @Json(name = "not-supported")
    NOT_SUPPORTED,

    /**
     * An attempt was made to create a duplicate record.
     */
    @Json(name = "duplicate")
    DUPLICATE,

    /**
     * The reference provided was not found. In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the content is not found further into the application architecture.
     */
    @Json(name = "not-found")
    NOT_FOUND,

    /**
     * Provided content is too long (typically, this is a denial of service protection type of error).
     */
    @Json(name = "too-long")
    TOO_LONG,

    /**
     * The code or system could not be understood, or it was not valid in the context of a particular ValueSet.code.
     */
    @Json(name = "code-invalid")
    CODE_INVALID,

    /**
     * An extension was found that was not acceptable, could not be resolved, or a modifierExtension was not recognized.
     */
    @Json(name = "extension")
    EXTENSION,

    /**
     * The operation was stopped to protect server resources; e.g. a request for a value set expansion on all of SNOMED CT.
     */
    @Json(name = "too-costly")
    TOO_COSTLY,

    /**
     * The content/operation failed to pass some business rule, and so could not proceed.
     */
    @Json(name = "business-rule")
    BUSINESS_RULE,

    /**
     * Content could not be accepted because of an edit conflict (i.e. version aware updates) (In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the conflict is discovered further into the application architecture.)
     */
    @Json(name = "conflict")
    CONFLICT,

    /**
     * Not all data sources typically accessed could be reached, or responded in time, so the returned information may not be complete.
     */
    @Json(name = "incomplete")
    INCOMPLETE,

    /**
     * Transient processing issues. The system receiving the error may be able to resubmit the same content once an underlying issue is resolved.
     */
    @Json(name = "transient")
    TRANSIENT,

    /**
     * A resource/record locking failure (usually in an underlying database).
     */
    @Json(name = "lock-error")
    LOCK_ERROR,

    /**
     * The persistent store is unavailable; e.g. the database is down for maintenance or similar action.
     */
    @Json(name = "no-store")
    NO_STORE,

    /**
     * An unexpected internal error has occurred.
     */
    @Json(name = "exception")
    EXCEPTION,

    /**
     * An internal timeout has occurred.
     */
    @Json(name = "timeout")
    TIMEOUT,

    /**
     * The system is not prepared to handle this request due to load management.
     */
    @Json(name = "throttled")
    THROTTLED,

    /**
     * A message unrelated to the processing success of the completed operation (examples of the latter include things like reminders of password expiry, system maintenance times, etc.).
     */
    @Json(name = "informational")
    INFORMATIONAL,
  }

  /**
   * The type of knowledge asset this library contains
   *
   * @see <a href="http://hl7.org/fhir/library-type">LibraryType</a>
   */
  public enum LibraryType {

    /**
     * The resource is a shareable library of formalized knowledge
     */
    @Json(name = "logic-library")
    LOGIC_LIBRARY,

    /**
     * The resource is a definition of an information model
     */
    @Json(name = "model-definition")
    MODEL_DEFINITION,

    /**
     * The resource is a collection of knowledge assets
     */
    @Json(name = "asset-collection")
    ASSET_COLLECTION,

    /**
     * The resource defines the dependencies, parameters, and data requirements for a particular module or evaluation context
     */
    @Json(name = "module-definition")
    MODULE_DEFINITION,
  }

  /**
   * The type of link between this patient resource and another patient resource.
   *
   * @see <a href="http://hl7.org/fhir/link-type">LinkType</a>
   */
  public enum LinkType {

    /**
     * The patient resource containing this link must no longer be used. The link points forward to another patient resource that must be used in lieu of the patient resource that contains this link.
     */
    @Json(name = "replaced-by")
    REPLACED_BY,

    /**
     * The patient resource containing this link is the current active patient record. The link points back to an inactive patient resource that has been merged into this resource, and should be consulted to retrieve additional referenced information.
     */
    @Json(name = "replaces")
    REPLACES,

    /**
     * The patient resource containing this link is in use and valid but not considered the main source of information about a patient. The link points forward to another patient resource that should be consulted to retrieve additional patient information.
     */
    @Json(name = "refer")
    REFER,

    /**
     * The patient resource containing this link is in use and valid, but points to another patient resource that is known to contain data about the same person. Data in this resource might overlap or contradict information found in the other patient resource. This link does not indicate any relative importance of the resources concerned, and both should be regarded as equally valid.
     */
    @Json(name = "seealso")
    SEEALSO,
  }

  /**
   * Used to distinguish different roles a resource can play within a set of linked resources
   *
   * @see <a href="http://hl7.org/fhir/linkage-type">LinkageType</a>
   */
  public enum LinkageType {

    /**
     * The record represents the "source of truth" (from the perspective of this Linkage resource) for the underlying event/condition/etc.
     */
    @Json(name = "source")
    SOURCE,

    /**
     * The record represents the alternative view of the underlying event/condition/etc.  The record may still be actively maintained, even though it is not considered to be the source of truth.
     */
    @Json(name = "alternate")
    ALTERNATE,

    /**
     * The record represents an obsolete record of the underlyng event/condition/etc.  It is not expected to be actively maintained.
     */
    @Json(name = "historical")
    HISTORICAL,
  }

  /**
   * The processing mode that applies to this list
   *
   * @see <a href="http://hl7.org/fhir/list-mode">ListMode</a>
   */
  public enum ListMode {

    /**
     * This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes
     */
    @Json(name = "working")
    WORKING,

    /**
     * This list was prepared as a snapshot. It should not be assumed to be current
     */
    @Json(name = "snapshot")
    SNAPSHOT,

    /**
     * A list that indicates where changes have been made or recommended
     */
    @Json(name = "changes")
    CHANGES,
  }

  /**
   * The current state of the list
   *
   * @see <a href="http://hl7.org/fhir/list-status">ListStatus</a>
   */
  public enum ListStatus {

    /**
     * The list is considered to be an active part of the patient's record.
     */
    @Json(name = "current")
    CURRENT,

    /**
     * The list is "old" and should no longer be considered accurate or relevant.
     */
    @Json(name = "retired")
    RETIRED,

    /**
     * The list was never accurate.  It is retained for medico-legal purposes only.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Indicates whether a resource instance represents a specific location or a class of locations.
   *
   * @see <a href="http://hl7.org/fhir/location-mode">LocationMode</a>
   */
  public enum LocationMode {

    /**
     * The Location resource represents a specific instance of a location (e.g. Operating Theatre 1A).
     */
    @Json(name = "instance")
    INSTANCE,

    /**
     * The Location represents a class of locations (e.g. Any Operating Theatre) although this class of locations could be constrained within a specific boundary (such as organization, or parent location, address etc.).
     */
    @Json(name = "kind")
    KIND,
  }

  /**
   * Indicates whether the location is still in use.
   *
   * @see <a href="http://hl7.org/fhir/location-status">LocationStatus</a>
   */
  public enum LocationStatus {

    /**
     * The location is operational.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The location is temporarily closed.
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The location is no longer used.
     */
    @Json(name = "inactive")
    INACTIVE,
  }

  /**
   * A Master Patient Index (MPI) assessment of whether a candidate patient record is a match or not.
   *
   * @see <a href="http://hl7.org/fhir/match-grade">MatchGrade</a>
   */
  public enum MatchGrade {

    /**
     * This record meets the matching criteria to be automatically considered as a full match.
     */
    @Json(name = "certain")
    CERTAIN,

    /**
     * This record is a close match, but not a certain match. Additional review (e.g. by a human) may be required before using this as a match.
     */
    @Json(name = "probable")
    PROBABLE,

    /**
     * This record may be a matching one. Additional review (e.g. by a human) SHOULD be performed before using this as a match.
     */
    @Json(name = "possible")
    POSSIBLE,

    /**
     * This record is known not to be a match. Note that usually non-matching records are not returned, but in some cases records previously or likely considered as a match may specifically be negated by the matching engine
     */
    @Json(name = "certainly-not")
    CERTAINLY_NOT,
  }

  /**
   * Flags an element as having unlimited repetitions
   *
   * @see <a href="http://hl7.org/fhir/question-max-occurs">MaxOccurs</a>
   */
  public enum MaxOccurs {

    /**
     * Element can repeat an unlimited number of times
     */
    @Json(name = "*")
    MAX,
  }

  /**
   * Different measurement principle supported by the device.
   *
   * @see <a href="http://hl7.org/fhir/measurement-principle">MeasmntPrinciple</a>
   */
  public enum MeasmntPrinciple {

    /**
     * Measurement principle isn't in the list.
     */
    @Json(name = "other")
    OTHER,

    /**
     * Measurement is done using the chemical principle.
     */
    @Json(name = "chemical")
    CHEMICAL,

    /**
     * Measurement is done using the electrical principle.
     */
    @Json(name = "electrical")
    ELECTRICAL,

    /**
     * Measurement is done using the impedance principle.
     */
    @Json(name = "impedance")
    IMPEDANCE,

    /**
     * Measurement is done using the nuclear principle.
     */
    @Json(name = "nuclear")
    NUCLEAR,

    /**
     * Measurement is done using the optical principle.
     */
    @Json(name = "optical")
    OPTICAL,

    /**
     * Measurement is done using the thermal principle.
     */
    @Json(name = "thermal")
    THERMAL,

    /**
     * Measurement is done using the biological principle.
     */
    @Json(name = "biological")
    BIOLOGICAL,

    /**
     * Measurement is done using the mechanical principle.
     */
    @Json(name = "mechanical")
    MECHANICAL,

    /**
     * Measurement is done using the acoustical principle.
     */
    @Json(name = "acoustical")
    ACOUSTICAL,

    /**
     * Measurement is done using the manual principle.
     */
    @Json(name = "manual")
    MANUAL,
  }

  /**
   * The intended usage for supplemental data elements in the measure
   *
   * @see <a href="http://hl7.org/fhir/measure-data-usage">MeasureDataUsage</a>
   */
  public enum MeasureDataUsage {

    /**
     * The data is intended to be provided as additional information alongside the measure results
     */
    @Json(name = "supplemental-data")
    SUPPLEMENTAL_DATA,

    /**
     * The data is intended to be used to calculate and apply a risk adjustment model for the measure
     */
    @Json(name = "risk-adjustment-factor")
    RISK_ADJUSTMENT_FACTOR,
  }

  /**
   * The type of population
   *
   * @see <a href="http://hl7.org/fhir/measure-population">MeasurePopulationType</a>
   */
  public enum MeasurePopulationType {

    /**
     * The initial population refers to all patients or events to be evaluated by a quality measure involving patients who share a common set of specified characterstics. All patients or events counted (for example, as numerator, as denominator) are drawn from the initial population
     */
    @Json(name = "initial-population")
    INITIAL_POPULATION,

    /**
     * The upper portion of a fraction used to calculate a rate, proportion, or ratio. Also called the measure focus, it is the target process, condition, event, or outcome. Numerator criteria are the processes or outcomes expected for each patient, or event defined in the denominator. A numerator statement describes the clinical action that satisfies the conditions of the measure
     */
    @Json(name = "numerator")
    NUMERATOR,

    /**
     * Numerator exclusion criteria define patients or events to be removed from the numerator. Numerator exclusions are used in proportion and ratio measures to help narrow the numerator (for inverted measures)
     */
    @Json(name = "numerator-exclusion")
    NUMERATOR_EXCLUSION,

    /**
     * The lower portion of a fraction used to calculate a rate, proportion, or ratio. The denominator can be the same as the initial population, or a subset of the initial population to further constrain the population for the purpose of the measure
     */
    @Json(name = "denominator")
    DENOMINATOR,

    /**
     * Denominator exclusion criteria define patients or events that should be removed from the denominator before determining if numerator criteria are met. Denominator exclusions are used in proportion and ratio measures to help narrow the denominator. For example, patients with bilateral lower extremity amputations would be listed as a denominator exclusion for a measure requiring foot exams
     */
    @Json(name = "denominator-exclusion")
    DENOMINATOR_EXCLUSION,

    /**
     * Denominator exceptions are conditions that should remove a patient or event from the denominator of a measure only if the numerator criteria are not met. Denominator exception allows for adjustment of the calculated score for those providers with higher risk populations. Denominator exception criteria are only used in proportion measures
     */
    @Json(name = "denominator-exception")
    DENOMINATOR_EXCEPTION,

    /**
     * Measure population criteria define the patients or events for which the individual observation for the measure should be taken. Measure populations are used for continuous variable measures rather than numerator and denominator criteria
     */
    @Json(name = "measure-population")
    MEASURE_POPULATION,

    /**
     * Measure population criteria define the patients or events that should be removed from the measure population before determining the outcome of one or more continuous variables defined for the measure observation. Measure population exclusion criteria are used within continuous variable measures to help narrow the measure population
     */
    @Json(name = "measure-population-exclusion")
    MEASURE_POPULATION_EXCLUSION,

    /**
     * Defines the individual observation to be performed for each patient or event in the measure population. Measure observations for each case in the population are aggregated to determine the overall measure score for the population
     */
    @Json(name = "measure-observation")
    MEASURE_OBSERVATION,
  }

  /**
   * The status of the measure report
   *
   * @see <a href="http://hl7.org/fhir/measure-report-status">MeasureReportStatus</a>
   */
  public enum MeasureReportStatus {

    /**
     * The report is complete and ready for use
     */
    @Json(name = "complete")
    COMPLETE,

    /**
     * The report is currently being generated
     */
    @Json(name = "pending")
    PENDING,

    /**
     * An error occurred attempting to generate the report
     */
    @Json(name = "error")
    ERROR,
  }

  /**
   * The type of the measure report
   *
   * @see <a href="http://hl7.org/fhir/measure-report-type">MeasureReportType</a>
   */
  public enum MeasureReportType {

    /**
     * An individual report that provides information on the performance for a given measure with respect to a single patient
     */
    @Json(name = "individual")
    INDIVIDUAL,

    /**
     * A patient list report that includes a listing of patients that satisfied each population criteria in the measure
     */
    @Json(name = "patient-list")
    PATIENT_LIST,

    /**
     * A summary report that returns the number of patients in each population criteria for the measure
     */
    @Json(name = "summary")
    SUMMARY,
  }

  /**
   * The scoring type of the measure
   *
   * @see <a href="http://hl7.org/fhir/measure-scoring">MeasureScoring</a>
   */
  public enum MeasureScoring {

    /**
     * The measure score is defined using a proportion
     */
    @Json(name = "proportion")
    PROPORTION,

    /**
     * The measure score is defined using a ratio
     */
    @Json(name = "ratio")
    RATIO,

    /**
     * The score is defined by a calculation of some quantity
     */
    @Json(name = "continuous-variable")
    CONTINUOUS_VARIABLE,

    /**
     * The measure is a cohort definition
     */
    @Json(name = "cohort")
    COHORT,
  }

  /**
   * The type of measure (includes codes from 2.16.840.1.113883.1.11.20368)
   *
   * @see <a href="http://hl7.org/fhir/measure-type">MeasureType</a>
   */
  public enum MeasureType {

    /**
     * A measure which focuses on a process which leads to a certain outcome, meaning that a scientific basis exists for believing that the process, when executed well, will increase the probability of achieving a desired outcome
     */
    @Json(name = "process")
    PROCESS,

    /**
     * A measure that indicates the result of the performance (or non-performance) of a function or process
     */
    @Json(name = "outcome")
    OUTCOME,

    /**
     * A measure that focuses on a health care provider's capacity, systems, and processes to provide high-quality care
     */
    @Json(name = "structure")
    STRUCTURE,

    /**
     * A measure that focuses on patient-reported information such as patient engagement or patient experience measures
     */
    @Json(name = "patient-reported-outcome")
    PATIENT_REPORTED_OUTCOME,

    /**
     * A measure that combines multiple component measures in to a single quality measure
     */
    @Json(name = "composite")
    COMPOSITE,
  }

  /**
   * A coded concept describing where the medication administered is expected to occur
   *
   * @see <a href="http://hl7.org/fhir/medication-admin-category">MedicationAdministrationCategory</a>
   */
  public enum MedicationAdministrationCategory {

    /**
     * Includes administrations in an inpatient or acute care setting
     */
    @Json(name = "inpatient")
    INPATIENT,

    /**
     * Includes administrations in an outpatient setting (for example, Emergency Department, Outpatient Clinic, Outpatient Surgery, Doctor's office)
     */
    @Json(name = "outpatient")
    OUTPATIENT,

    /**
     * Includes administrations by the patient in their home (this would include long term care or nursing homes, hospices, etc)
     */
    @Json(name = "community")
    COMMUNITY,
  }

  /**
   * A set of codes indicating the current status of a MedicationAdministration.
   *
   * @see <a href="http://hl7.org/fhir/medication-admin-status">MedicationAdministrationStatus</a>
   */
  public enum MedicationAdministrationStatus {

    /**
     * The administration has started but has not yet completed.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * All actions that are implied by the administration have occurred.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The administration was entered in error and therefore nullified.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the administration have been permanently halted, before all of them occurred.
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * The authoring system does not know which of the status values currently applies for this request. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * A coded concept defining the kind of container a medication package is packaged in
   *
   * @see <a href="http://hl7.org/fhir/medication-package-form">MedicationContainer</a>
   */
  public enum MedicationContainer {

    /**
     * A sealed glass capsule containing a liquid
     */
    @Json(name = "ampoule")
    AMPOULE,

    /**
     * A container, typically made of glass or plastic and with a narrow neck, used for storing liquids.
     */
    @Json(name = "bottle")
    BOTTLE,

    /**
     * A container with a flat base and sides, typically square or rectangular and having a lid.
     */
    @Json(name = "box")
    BOX,

    /**
     * A device of various configuration and composition used with a syringe for the application of anesthetic or other materials to a patient.
     */
    @Json(name = "cartridge")
    CARTRIDGE,

    /**
     * A package intended to store pharmaceuticals.
     */
    @Json(name = "container")
    CONTAINER,

    /**
     * A long, hollow cylinder of metal, plastic, glass, etc., for holding medications, typically creams or ointments
     */
    @Json(name = "tube")
    TUBE,

    /**
     * A dose of medicine prepared in an individual package for convenience, safety or monitoring.
     */
    @Json(name = "unitdose")
    UNITDOSE,

    /**
     * A small container, typically cylindrical and made of glass, used especially for holding liquid medications.
     */
    @Json(name = "vial")
    VIAL,
  }

  /**
   * A code describing where the dispensed medication is expected to be consumed or administered
   *
   * @see <a href="http://hl7.org/fhir/medication-dispense-category">MedicationDispenseCategory</a>
   */
  public enum MedicationDispenseCategory {

    /**
     * Includes dispenses for medications to be administered or consumed in an inpatient or acute care setting
     */
    @Json(name = "inpatient")
    INPATIENT,

    /**
     * Includes dispenses for medications to be administered or consumed in an outpatient setting (for example, Emergency Department, Outpatient Clinic, Outpatient Surgery, Doctor's office)
     */
    @Json(name = "outpatient")
    OUTPATIENT,

    /**
     * Includes dispenses for medications to be administered or consumed by the patient in their home (this would include long term care or nursing homes, hospices, etc)
     */
    @Json(name = "community")
    COMMUNITY,
  }

  /**
   * A coded concept specifying the state of the dispense event.
   *
   * @see <a href="http://hl7.org/fhir/medication-dispense-status">MedicationDispenseStatus</a>
   */
  public enum MedicationDispenseStatus {

    /**
     * The core event has not started yet, but some staging activities have begun (e.g. initial compounding or packaging of medication). Preparation stages may be tracked for billing purposes.
     */
    @Json(name = "preparation")
    PREPARATION,

    /**
     * The dispense has started but has not yet completed.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended"
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * All actions that are implied by the dispense have occurred.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The dispense was entered in error and therefore nullified.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the dispense have been permanently halted, before all of them occurred.
     */
    @Json(name = "stopped")
    STOPPED,
  }

  /**
   * A coded concept identifying where the medication ordered is expected to be consumed or administered
   *
   * @see <a href="http://hl7.org/fhir/medication-request-category">MedicationRequestCategory</a>
   */
  public enum MedicationRequestCategory {

    /**
     * Includes orders for medications to be administered or consumed in an inpatient or acute care setting
     */
    @Json(name = "inpatient")
    INPATIENT,

    /**
     * Includes orders for medications to be administered or consumed in an outpatient setting (for example, Emergency Department, Outpatient Clinic, Outpatient Surgery, Doctor's office)
     */
    @Json(name = "outpatient")
    OUTPATIENT,

    /**
     * Includes orders for medications to be administered or consumed by the patient in their home (this would include long term care or nursing homes, hospices, etc)
     */
    @Json(name = "community")
    COMMUNITY,
  }

  /**
   * The kind of medication order
   *
   * @see <a href="http://hl7.org/fhir/medication-request-intent">MedicationRequestIntent</a>
   */
  public enum MedicationRequestIntent {

    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act
     */
    @Json(name = "proposal")
    PROPOSAL,

    /**
     * The request represents an intension to ensure something occurs without providing an authorization for others to act
     */
    @Json(name = "plan")
    PLAN,

    /**
     * The request represents a request/demand and authorization for action
     */
    @Json(name = "order")
    ORDER,

    /**
     * The request represents an instance for the particular order, for example a medication administration record.
     */
    @Json(name = "instance-order")
    INSTANCE_ORDER,
  }

  /**
   * Identifies the level of importance to be assigned to actioning the request
   *
   * @see <a href="http://hl7.org/fhir/medication-request-priority">MedicationRequestPriority</a>
   */
  public enum MedicationRequestPriority {

    /**
     * The order has a normal priority .
     */
    @Json(name = "routine")
    ROUTINE,

    /**
     * The order should be urgently.
     */
    @Json(name = "urgent")
    URGENT,

    /**
     * The order is time-critical.
     */
    @Json(name = "stat")
    STAT,

    /**
     * The order should be acted on as soon as possible.
     */
    @Json(name = "asap")
    ASAP,
  }

  /**
   * A coded concept specifying the state of the prescribing event. Describes the lifecycle of the prescription
   *
   * @see <a href="http://hl7.org/fhir/medication-request-status">MedicationRequestStatus</a>
   */
  public enum MedicationRequestStatus {

    /**
     * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called "suspended".
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * The prescription has been withdrawn.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * All actions that are implied by the prescription have occurred.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The prescription was entered in error.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the prescription are to be permanently halted, before all of them occurred.
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * The prescription is not yet 'actionable', i.e. it is a work in progress, requires sign-off or verification, and needs to be run through decision support process.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The authoring system does not know which of the status values currently applies for this request
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * A coded concept identifying where the medication included in the medicationstatement is expected to be consumed or administered
   *
   * @see <a href="http://hl7.org/fhir/medication-statement-category">MedicationStatementCategory</a>
   */
  public enum MedicationStatementCategory {

    /**
     * Includes orders for medications to be administered or consumed in an inpatient or acute care setting
     */
    @Json(name = "inpatient")
    INPATIENT,

    /**
     * Includes orders for medications to be administered or consumed in an outpatient setting (for example, Emergency Department, Outpatient Clinic, Outpatient Surgery, Doctor's office)
     */
    @Json(name = "outpatient")
    OUTPATIENT,

    /**
     * Includes orders for medications to be administered or consumed by the patient in their home (this would include long term care or nursing homes, hospices, etc)
     */
    @Json(name = "community")
    COMMUNITY,

    /**
     * Includes statements about medication use, including over the counter medication, provided by the patient, agent or another provider
     */
    @Json(name = "patientspecified")
    PATIENTSPECIFIED,
  }

  /**
   * A coded concept indicating the current status of a MedicationStatement.
   *
   * @see <a href="http://hl7.org/fhir/medication-statement-status">MedicationStatementStatus</a>
   */
  public enum MedicationStatementStatus {

    /**
     * The medication is still being taken.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The medication is no longer being taken.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The statement was recorded incorrectly.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The medication may be taken at some time in the future.
     */
    @Json(name = "intended")
    INTENDED,

    /**
     * Actions implied by the statement have been permanently halted, before all of them occurred.
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * Actions implied by the statement have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    @Json(name = "on-hold")
    ON_HOLD,
  }

  /**
   * A coded concept identifying level of certainty if patient has taken or has not taken the medication
   *
   * @see <a href="http://hl7.org/fhir/medication-statement-taken">MedicationStatementTaken</a>
   */
  public enum MedicationStatementTaken {

    /**
     * Positive assertion that patient has taken medication
     */
    @Json(name = "y")
    Y,

    /**
     * Negative assertion that patient has not taken medication
     */
    @Json(name = "n")
    N,

    /**
     * Unknown assertion if patient has taken medication
     */
    @Json(name = "unk")
    UNK,

    /**
     * Patient reporting does not apply
     */
    @Json(name = "na")
    NA,
  }

  /**
   * A coded concept defining if the medication is in active use
   *
   * @see <a href="http://hl7.org/fhir/medication-status">MedicationStatus</a>
   */
  public enum MedicationStatus {

    /**
     * The medication is available for use
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The medication is not available for use
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The medication was entered in error
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * One of the message events defined as part of FHIR.
   *
   * @see <a href="http://hl7.org/fhir/message-events">MessageEvent</a>
   */
  public enum MessageEvent {

    /**
     * The definition of a code system is used to create a simple collection of codes suitable for use for data entry or validation. An expanded code system will be returned, or an error message.
     */
    @Json(name = "CodeSystem-expand")
    CODESYSTEM_EXPAND,

    /**
     * Change the status of a Medication Administration to show that it is complete.
     */
    @Json(name = "MedicationAdministration-Complete")
    MEDICATIONADMINISTRATION_COMPLETE,

    /**
     * Someone wishes to record that the record of administration of a medication is in error and should be ignored.
     */
    @Json(name = "MedicationAdministration-Nullification")
    MEDICATIONADMINISTRATION_NULLIFICATION,

    /**
     * Indicates that a medication has been recorded against the patient's record.
     */
    @Json(name = "MedicationAdministration-Recording")
    MEDICATIONADMINISTRATION_RECORDING,

    /**
     * Update a Medication Administration record.
     */
    @Json(name = "MedicationAdministration-Update")
    MEDICATIONADMINISTRATION_UPDATE,

    /**
     * Notification of a change to an administrative resource (either create or update). Note that there is no delete, though some administrative resources have status or period elements for this use.
     */
    @Json(name = "admin-notify")
    ADMIN_NOTIFY,

    /**
     * Notification to convey information.
     */
    @Json(name = "communication-request")
    COMMUNICATION_REQUEST,

    /**
     * Provide a diagnostic report, or update a previously provided diagnostic report.
     */
    @Json(name = "diagnosticreport-provide")
    DIAGNOSTICREPORT_PROVIDE,

    /**
     * Provide a simple observation or update a previously provided simple observation.
     */
    @Json(name = "observation-provide")
    OBSERVATION_PROVIDE,

    /**
     * Notification that two patient records actually identify the same patient.
     */
    @Json(name = "patient-link")
    PATIENT_LINK,

    /**
     * Notification that previous advice that two patient records concern the same patient is now considered incorrect.
     */
    @Json(name = "patient-unlink")
    PATIENT_UNLINK,

    /**
     * The definition of a value set is used to create a simple collection of codes suitable for use for data entry or validation. An expanded value set will be returned, or an error message.
     */
    @Json(name = "valueset-expand")
    VALUESET_EXPAND,
  }

  /**
   * The impact of the content of a message.
   *
   * @see <a href="http://hl7.org/fhir/message-significance-category">MessageSignificanceCategory</a>
   */
  public enum MessageSignificanceCategory {

    /**
     * The message represents/requests a change that should not be processed more than once; e.g., making a booking for an appointment.
     */
    @Json(name = "Consequence")
    CONSEQUENCE,

    /**
     * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.
     */
    @Json(name = "Currency")
    CURRENCY,

    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.
     */
    @Json(name = "Notification")
    NOTIFICATION,
  }

  /**
   * The protocol used for message transport.
   *
   * @see <a href="http://hl7.org/fhir/message-transport">MessageTransport</a>
   */
  public enum MessageTransport {

    /**
     * The application sends or receives messages using HTTP POST (may be over http: or https:).
     */
    @Json(name = "http")
    HTTP,

    /**
     * The application sends or receives messages using File Transfer Protocol.
     */
    @Json(name = "ftp")
    FTP,

    /**
     * The application sends or receives messages using HL7's Minimal Lower Level Protocol.
     */
    @Json(name = "mllp")
    MLLP,
  }

  /**
   * HL7-defined table of codes which identify conditions under which acknowledgments are required to be returned in response to a message.
   *
   * @see <a href="http://hl7.org/fhir/messageheader-response-request">MessageheaderResponseRequest</a>
   */
  public enum MessageheaderResponseRequest {

    /**
     * initiator expects a response for this message
     */
    @Json(name = "always")
    ALWAYS,

    /**
     * initiator expects a response only if in error
     */
    @Json(name = "on-error")
    ON_ERROR,

    /**
     * initiator does not expect a response
     */
    @Json(name = "never")
    NEVER,

    /**
     * initiator expects a response only if successful
     */
    @Json(name = "on-success")
    ON_SUCCESS,
  }

  /**
   * This value set is suitable for use with the provenance resource. It is derived from, but not compatible with, the HL7 v3 Purpose of use Code system.
   *
   * @see <a href="http://healthit.gov/nhin/purposeofuse">NHINPurposeOfUse</a>
   */
  public enum NHINPurposeOfUse {

    /**
     * Treatment
     */
    @Json(name = "TREATMENT")
    TREATMENT,

    /**
     * Payment
     */
    @Json(name = "PAYMENT")
    PAYMENT,

    /**
     * Healthcare Operations
     */
    @Json(name = "OPERATIONS")
    OPERATIONS,

    /**
     * System Administration
     */
    @Json(name = "SYSADMIN")
    SYSADMIN,

    /**
     * Fraud detection
     */
    @Json(name = "FRAUD")
    FRAUD,

    /**
     * Use or disclosure of Psychotherapy Notes
     */
    @Json(name = "PSYCHOTHERAPY")
    PSYCHOTHERAPY,

    /**
     * Use or disclosure by the covered entity for its own training programs
     */
    @Json(name = "TRAINING")
    TRAINING,

    /**
     * Use or disclosure by the covered entity to defend itself in a legal action
     */
    @Json(name = "LEGAL")
    LEGAL,

    /**
     * Marketing
     */
    @Json(name = "MARKETING")
    MARKETING,

    /**
     * Use and disclosure for facility directories
     */
    @Json(name = "DIRECTORY")
    DIRECTORY,

    /**
     * Disclose to a family member, other relative, or a close personal friend of the individual
     */
    @Json(name = "FAMILY")
    FAMILY,

    /**
     * Uses and disclosures with the individual present.
     */
    @Json(name = "PRESENT")
    PRESENT,

    /**
     * Permission cannot practicably be provided because of the individual's incapacity or an emergency.
     */
    @Json(name = "EMERGENCY")
    EMERGENCY,

    /**
     * Use and disclosures for disaster relief purposes.
     */
    @Json(name = "DISASTER")
    DISASTER,

    /**
     * Uses and disclosures for public health activities.
     */
    @Json(name = "PUBLICHEALTH")
    PUBLICHEALTH,

    /**
     * Disclosures about victims of abuse, neglect or domestic violence.
     */
    @Json(name = "ABUSE")
    ABUSE,

    /**
     * Uses and disclosures for health oversight activities.
     */
    @Json(name = "OVERSIGHT")
    OVERSIGHT,

    /**
     * Disclosures for judicial and administrative proceedings.
     */
    @Json(name = "JUDICIAL")
    JUDICIAL,

    /**
     * Disclosures for law enforcement purposes.
     */
    @Json(name = "LAW")
    LAW,

    /**
     * Uses and disclosures about decedents.
     */
    @Json(name = "DECEASED")
    DECEASED,

    /**
     * Uses and disclosures for cadaveric organ,  eye or tissue donation purposes
     */
    @Json(name = "DONATION")
    DONATION,

    /**
     * Uses and disclosures for research purposes.
     */
    @Json(name = "RESEARCH")
    RESEARCH,

    /**
     * Uses and disclosures to avert a serious threat to health or safety.
     */
    @Json(name = "THREAT")
    THREAT,

    /**
     * Uses and disclosures for specialized government functions.
     */
    @Json(name = "GOVERNMENT")
    GOVERNMENT,

    /**
     * Disclosures for workers' compensation.
     */
    @Json(name = "WORKERSCOMP")
    WORKERSCOMP,

    /**
     * Disclosures for insurance or disability coverage determination
     */
    @Json(name = "COVERAGE")
    COVERAGE,

    /**
     * Request of the Individual
     */
    @Json(name = "REQUEST")
    REQUEST,
  }

  /**
   * The use of a human name
   *
   * @see <a href="http://hl7.org/fhir/name-use">NameUse</a>
   */
  public enum NameUse {

    /**
     * Known as/conventional/the one you normally use
     */
    @Json(name = "usual")
    USUAL,

    /**
     * The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called "legal name".
     */
    @Json(name = "official")
    OFFICIAL,

    /**
     * A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.
     */
    @Json(name = "temp")
    TEMP,

    /**
     * A name that is used to address the person in an informal manner, but is not part of their formal or usual name
     */
    @Json(name = "nickname")
    NICKNAME,

    /**
     * Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons)
     */
    @Json(name = "anonymous")
    ANONYMOUS,

    /**
     * This name is no longer in use (or was never correct, but retained for records)
     */
    @Json(name = "old")
    OLD,

    /**
     * A name used prior to changing name because of marriage. This name use is for use by applications that collect and store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are constantly changing. This term is not gender specific. The use of this term does not imply any particular history for a person's name
     */
    @Json(name = "maiden")
    MAIDEN,
  }

  /**
   * Identifies the style of unique identifier used to identify a namespace.
   *
   * @see <a href="http://hl7.org/fhir/namingsystem-identifier-type">NamingSystemIdentifierType</a>
   */
  public enum NamingSystemIdentifierType {

    /**
     * An ISO object identifier; e.g. 1.2.3.4.5.
     */
    @Json(name = "oid")
    OID,

    /**
     * A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.
     */
    @Json(name = "uuid")
    UUID,

    /**
     * A uniform resource identifier (ideally a URL - uniform resource locator); e.g. http://unitsofmeasure.org.
     */
    @Json(name = "uri")
    URI,

    /**
     * Some other type of unique identifier; e.g. HL7-assigned reserved string such as LN for LOINC.
     */
    @Json(name = "other")
    OTHER,
  }

  /**
   * Identifies the purpose of the naming system.
   *
   * @see <a href="http://hl7.org/fhir/namingsystem-type">NamingSystemType</a>
   */
  public enum NamingSystemType {

    /**
     * The naming system is used to define concepts and symbols to represent those concepts; e.g. UCUM, LOINC, NDC code, local lab codes, etc.
     */
    @Json(name = "codesystem")
    CODESYSTEM,

    /**
     * The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).
     */
    @Json(name = "identifier")
    IDENTIFIER,

    /**
     * The naming system is used as the root for other identifiers and naming systems.
     */
    @Json(name = "root")
    ROOT,
  }

  /**
   * The status of a resource narrative
   *
   * @see <a href="http://hl7.org/fhir/narrative-status">NarrativeStatus</a>
   */
  public enum NarrativeStatus {

    /**
     * The contents of the narrative are entirely generated from the structured data in the content.
     */
    @Json(name = "generated")
    GENERATED,

    /**
     * The contents of the narrative are entirely generated from the structured data in the content and some of the content is generated from extensions
     */
    @Json(name = "extensions")
    EXTENSIONS,

    /**
     * The contents of the narrative may contain additional information not found in the structured data. Note that there is no computable way to determine what the extra information is, other than by human inspection
     */
    @Json(name = "additional")
    ADDITIONAL,

    /**
     * The contents of the narrative are some equivalent of "No human-readable text provided in this case"
     */
    @Json(name = "empty")
    EMPTY,
  }

  /**
   * The presentation types of notes.
   *
   * @see <a href="http://hl7.org/fhir/note-type">NoteType</a>
   */
  public enum NoteType {

    /**
     * Display the note.
     */
    @Json(name = "display")
    DISPLAY,

    /**
     * Print the note on the form.
     */
    @Json(name = "print")
    PRINT,

    /**
     * Print the note for the operator.
     */
    @Json(name = "printoper")
    PRINTOPER,
  }

  /**
   * Codes specifying the state of the request. Describes the lifecycle of the nutrition order.
   *
   * @see <a href="http://hl7.org/fhir/nutrition-request-status">NutritionOrderStatus</a>
   */
  public enum NutritionOrderStatus {

    /**
     * The request has been proposed.
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * The request is in preliminary form prior to being sent.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The request has been planned.
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * The request has been placed.
     */
    @Json(name = "requested")
    REQUESTED,

    /**
     * The request is 'actionable', but not all actions that are implied by it have occurred yet.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * Actions implied by the request have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * All actions that are implied by the order have occurred and no continuation is planned (this will rarely be made explicit).
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The request has been withdrawn and is no longer actionable.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * The request was entered in error and voided.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Codes specifying how two observations are related.
   *
   * @see <a href="http://hl7.org/fhir/observation-relationshiptypes">ObservationRelationshipType</a>
   */
  public enum ObservationRelationshipType {

    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     */
    @Json(name = "has-member")
    HAS_MEMBER,

    /**
     * The target resource (Observation or QuestionnaireResponse) is part of the information from which this observation value is derived. (e.g. calculated anion gap, Apgar score)  NOTE:  "derived-from" is the only logical choice when referencing QuestionnaireResponse.
     */
    @Json(name = "derived-from")
    DERIVED_FROM,

    /**
     * This observation follows the target observation (e.g. timed tests such as Glucose Tolerance Test).
     */
    @Json(name = "sequel-to")
    SEQUEL_TO,

    /**
     * This observation replaces a previous observation (i.e. a revised value). The target observation is now obsolete.
     */
    @Json(name = "replaces")
    REPLACES,

    /**
     * The value of the target observation qualifies (refines) the semantics of the source observation (e.g. a lipemia measure target from a plasma measure).
     */
    @Json(name = "qualified-by")
    QUALIFIED_BY,

    /**
     * The value of the target observation interferes (degrades quality, or prevents valid observation) with the semantics of the source observation (e.g. a hemolysis measure target from a plasma potassium measure, which has no value).
     */
    @Json(name = "interfered-by")
    INTERFERED_BY,
  }

  /**
   * Codes providing the status of an observation.
   *
   * @see <a href="http://hl7.org/fhir/observation-status">ObservationStatus</a>
   */
  public enum ObservationStatus {

    /**
     * The existence of the observation is registered, but there is no result yet available.
     */
    @Json(name = "registered")
    REGISTERED,

    /**
     * This is an initial or interim observation: data may be incomplete or unverified.
     */
    @Json(name = "preliminary")
    PRELIMINARY,

    /**
     * The observation is complete.
     */
    @Json(name = "final")
    FINAL,

    /**
     * Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.
     */
    @Json(name = "amended")
    AMENDED,

    /**
     * Subsequent to being Final, the observation has been modified to correct an error in the test result.
     */
    @Json(name = "corrected")
    CORRECTED,

    /**
     * The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this request. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring system does not know which.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Whether an operation is a normal operation or a query.
   *
   * @see <a href="http://hl7.org/fhir/operation-kind">OperationKind</a>
   */
  public enum OperationKind {

    /**
     * This operation is invoked as an operation.
     */
    @Json(name = "operation")
    OPERATION,

    /**
     * This operation is a named query, invoked using the search mechanism.
     */
    @Json(name = "query")
    QUERY,
  }

  /**
   * Operation Outcome codes used by FHIR test servers (see Implementation file translations.xml)
   *
   * @see <a href="http://hl7.org/fhir/operation-outcome">OperationOutcomeCodes</a>
   */
  public enum OperationOutcomeCodes {

    /**
     * MSG_AUTH_REQUIRED
     */
    @Json(name = "MSG_AUTH_REQUIRED")
    MSG_AUTH_REQUIRED,

    /**
     * MSG_BAD_FORMAT
     */
    @Json(name = "MSG_BAD_FORMAT")
    MSG_BAD_FORMAT,

    /**
     * MSG_BAD_SYNTAX
     */
    @Json(name = "MSG_BAD_SYNTAX")
    MSG_BAD_SYNTAX,

    /**
     * MSG_CANT_PARSE_CONTENT
     */
    @Json(name = "MSG_CANT_PARSE_CONTENT")
    MSG_CANT_PARSE_CONTENT,

    /**
     * MSG_CANT_PARSE_ROOT
     */
    @Json(name = "MSG_CANT_PARSE_ROOT")
    MSG_CANT_PARSE_ROOT,

    /**
     * MSG_CREATED
     */
    @Json(name = "MSG_CREATED")
    MSG_CREATED,

    /**
     * MSG_DATE_FORMAT
     */
    @Json(name = "MSG_DATE_FORMAT")
    MSG_DATE_FORMAT,

    /**
     * MSG_DELETED
     */
    @Json(name = "MSG_DELETED")
    MSG_DELETED,

    /**
     * MSG_DELETED_DONE
     */
    @Json(name = "MSG_DELETED_DONE")
    MSG_DELETED_DONE,

    /**
     * MSG_DELETED_ID
     */
    @Json(name = "MSG_DELETED_ID")
    MSG_DELETED_ID,

    /**
     * MSG_DUPLICATE_ID
     */
    @Json(name = "MSG_DUPLICATE_ID")
    MSG_DUPLICATE_ID,

    /**
     * MSG_ERROR_PARSING
     */
    @Json(name = "MSG_ERROR_PARSING")
    MSG_ERROR_PARSING,

    /**
     * MSG_ID_INVALID
     */
    @Json(name = "MSG_ID_INVALID")
    MSG_ID_INVALID,

    /**
     * MSG_ID_TOO_LONG
     */
    @Json(name = "MSG_ID_TOO_LONG")
    MSG_ID_TOO_LONG,

    /**
     * MSG_INVALID_ID
     */
    @Json(name = "MSG_INVALID_ID")
    MSG_INVALID_ID,

    /**
     * MSG_JSON_OBJECT
     */
    @Json(name = "MSG_JSON_OBJECT")
    MSG_JSON_OBJECT,

    /**
     * MSG_LOCAL_FAIL
     */
    @Json(name = "MSG_LOCAL_FAIL")
    MSG_LOCAL_FAIL,

    /**
     * MSG_NO_MATCH
     */
    @Json(name = "MSG_NO_MATCH")
    MSG_NO_MATCH,

    /**
     * MSG_NO_EXIST
     */
    @Json(name = "MSG_NO_EXIST")
    MSG_NO_EXIST,

    /**
     * MSG_NO_MODULE
     */
    @Json(name = "MSG_NO_MODULE")
    MSG_NO_MODULE,

    /**
     * MSG_NO_SUMMARY
     */
    @Json(name = "MSG_NO_SUMMARY")
    MSG_NO_SUMMARY,

    /**
     * MSG_OP_NOT_ALLOWED
     */
    @Json(name = "MSG_OP_NOT_ALLOWED")
    MSG_OP_NOT_ALLOWED,

    /**
     * MSG_PARAM_CHAINED
     */
    @Json(name = "MSG_PARAM_CHAINED")
    MSG_PARAM_CHAINED,

    /**
     * MSG_PARAM_NO_REPEAT
     */
    @Json(name = "MSG_PARAM_NO_REPEAT")
    MSG_PARAM_NO_REPEAT,

    /**
     * MSG_PARAM_UNKNOWN
     */
    @Json(name = "MSG_PARAM_UNKNOWN")
    MSG_PARAM_UNKNOWN,

    /**
     * MSG_PARAM_INVALID
     */
    @Json(name = "MSG_PARAM_INVALID")
    MSG_PARAM_INVALID,

    /**
     * MSG_PARAM_MODIFIER_INVALID
     */
    @Json(name = "MSG_PARAM_MODIFIER_INVALID")
    MSG_PARAM_MODIFIER_INVALID,

    /**
     * MSG_RESOURCE_EXAMPLE_PROTECTED
     */
    @Json(name = "MSG_RESOURCE_EXAMPLE_PROTECTED")
    MSG_RESOURCE_EXAMPLE_PROTECTED,

    /**
     * MSG_RESOURCE_ID_FAIL
     */
    @Json(name = "MSG_RESOURCE_ID_FAIL")
    MSG_RESOURCE_ID_FAIL,

    /**
     * MSG_RESOURCE_NOT_ALLOWED
     */
    @Json(name = "MSG_RESOURCE_NOT_ALLOWED")
    MSG_RESOURCE_NOT_ALLOWED,

    /**
     * MSG_RESOURCE_REQUIRED
     */
    @Json(name = "MSG_RESOURCE_REQUIRED")
    MSG_RESOURCE_REQUIRED,

    /**
     * MSG_RESOURCE_ID_MISMATCH
     */
    @Json(name = "MSG_RESOURCE_ID_MISMATCH")
    MSG_RESOURCE_ID_MISMATCH,

    /**
     * MSG_RESOURCE_ID_MISSING
     */
    @Json(name = "MSG_RESOURCE_ID_MISSING")
    MSG_RESOURCE_ID_MISSING,

    /**
     * MSG_RESOURCE_TYPE_MISMATCH
     */
    @Json(name = "MSG_RESOURCE_TYPE_MISMATCH")
    MSG_RESOURCE_TYPE_MISMATCH,

    /**
     * MSG_SORT_UNKNOWN
     */
    @Json(name = "MSG_SORT_UNKNOWN")
    MSG_SORT_UNKNOWN,

    /**
     * MSG_TRANSACTION_DUPLICATE_ID
     */
    @Json(name = "MSG_TRANSACTION_DUPLICATE_ID")
    MSG_TRANSACTION_DUPLICATE_ID,

    /**
     * MSG_TRANSACTION_MISSING_ID
     */
    @Json(name = "MSG_TRANSACTION_MISSING_ID")
    MSG_TRANSACTION_MISSING_ID,

    /**
     * MSG_UNHANDLED_NODE_TYPE
     */
    @Json(name = "MSG_UNHANDLED_NODE_TYPE")
    MSG_UNHANDLED_NODE_TYPE,

    /**
     * MSG_UNKNOWN_CONTENT
     */
    @Json(name = "MSG_UNKNOWN_CONTENT")
    MSG_UNKNOWN_CONTENT,

    /**
     * MSG_UNKNOWN_OPERATION
     */
    @Json(name = "MSG_UNKNOWN_OPERATION")
    MSG_UNKNOWN_OPERATION,

    /**
     * MSG_UNKNOWN_TYPE
     */
    @Json(name = "MSG_UNKNOWN_TYPE")
    MSG_UNKNOWN_TYPE,

    /**
     * MSG_UPDATED
     */
    @Json(name = "MSG_UPDATED")
    MSG_UPDATED,

    /**
     * MSG_VERSION_AWARE
     */
    @Json(name = "MSG_VERSION_AWARE")
    MSG_VERSION_AWARE,

    /**
     * MSG_VERSION_AWARE_CONFLICT
     */
    @Json(name = "MSG_VERSION_AWARE_CONFLICT")
    MSG_VERSION_AWARE_CONFLICT,

    /**
     * MSG_VERSION_AWARE_URL
     */
    @Json(name = "MSG_VERSION_AWARE_URL")
    MSG_VERSION_AWARE_URL,

    /**
     * MSG_WRONG_NS
     */
    @Json(name = "MSG_WRONG_NS")
    MSG_WRONG_NS,

    /**
     * SEARCH_MULTIPLE
     */
    @Json(name = "SEARCH_MULTIPLE")
    SEARCH_MULTIPLE,

    /**
     * UPDATE_MULTIPLE_MATCHES
     */
    @Json(name = "UPDATE_MULTIPLE_MATCHES")
    UPDATE_MULTIPLE_MATCHES,

    /**
     * DELETE_MULTIPLE_MATCHES
     */
    @Json(name = "DELETE_MULTIPLE_MATCHES")
    DELETE_MULTIPLE_MATCHES,

    /**
     * SEARCH_NONE
     */
    @Json(name = "SEARCH_NONE")
    SEARCH_NONE,
  }

  /**
   * Whether an operation parameter is an input or an output parameter.
   *
   * @see <a href="http://hl7.org/fhir/operation-parameter-use">OperationParameterUse</a>
   */
  public enum OperationParameterUse {

    /**
     * This is an input parameter.
     */
    @Json(name = "in")
    IN,

    /**
     * This is an output parameter.
     */
    @Json(name = "out")
    OUT,
  }

  /**
   * Is the Participant required to attend the appointment.
   *
   * @see <a href="http://hl7.org/fhir/participantrequired">ParticipantRequired</a>
   */
  public enum ParticipantRequired {

    /**
     * The participant is required to attend the appointment.
     */
    @Json(name = "required")
    REQUIRED,

    /**
     * The participant may optionally attend the appointment.
     */
    @Json(name = "optional")
    OPTIONAL,

    /**
     * The participant is excluded from the appointment, and may not be informed of the appointment taking place. (Appointment is about them, not for them - such as 2 doctors discussing results about a patient's test).
     */
    @Json(name = "information-only")
    INFORMATION_ONLY,
  }

  /**
   * The Participation status of an appointment.
   *
   * @see <a href="http://hl7.org/fhir/participationstatus">ParticipationStatus</a>
   */
  public enum ParticipationStatus {

    /**
     * The participant has accepted the appointment.
     */
    @Json(name = "accepted")
    ACCEPTED,

    /**
     * The participant has declined the appointment and will not participate in the appointment.
     */
    @Json(name = "declined")
    DECLINED,

    /**
     * The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.
     */
    @Json(name = "tentative")
    TENTATIVE,

    /**
     * The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.
     */
    @Json(name = "needs-action")
    NEEDS_ACTION,
  }

  /**
   * The type of PlanDefinition
   *
   * @see <a href="http://hl7.org/fhir/plan-definition-type">PlanDefinitionType</a>
   */
  public enum PlanDefinitionType {

    /**
     * A pre-defined and approved group of orders related to a particular clinical condition (e.g. hypertension treatment and monitoring) or stage of care (e.g. hospital admission to Coronary Care Unit). An order set is used as a checklist for the clinician when managing a patient with a specific condition. It is a structured collection of orders relevant to that condition and presented to the clinician in a computerized provider order entry (CPOE) system
     */
    @Json(name = "order-set")
    ORDER_SET,

    /**
     * A set of activities that can be performed that have relationships in terms of order, pre-conditions, etc.
     */
    @Json(name = "protocol")
    PROTOCOL,

    /**
     * A decision support rule of the form [on Event] if Condition then Action. It is intended to be a shareable, computable definition of actions that should be taken whenever some condition is met in response to a particular event or events
     */
    @Json(name = "eca-rule")
    ECA_RULE,
  }

  /**
   * How a property is represented when serialized.
   *
   * @see <a href="http://hl7.org/fhir/property-representation">PropertyRepresentation</a>
   */
  public enum PropertyRepresentation {

    /**
     * In XML, this property is represented as an attribute not an element.
     */
    @Json(name = "xmlAttr")
    XMLATTR,

    /**
     * This element is represented using the XML text attribute (primitives only)
     */
    @Json(name = "xmlText")
    XMLTEXT,

    /**
     * The type of this element is indicated using xsi:type
     */
    @Json(name = "typeAttr")
    TYPEATTR,

    /**
     * Use CDA narrative instead of XHTML
     */
    @Json(name = "cdaText")
    CDATEXT,

    /**
     * The property is represented using XHTML
     */
    @Json(name = "xhtml")
    XHTML,
  }

  /**
   * The type of a property value
   *
   * @see <a href="http://hl7.org/fhir/concept-property-type">PropertyType</a>
   */
  public enum PropertyType {

    /**
     * The property value is a code that identifies a concept defined in the code system
     */
    @Json(name = "code")
    CODE,

    /**
     * The property  value is a code defined in an external code system. This may be used for translations, but is not the intent
     */
    @Json(name = "Coding")
    CODING,

    /**
     * The property value is a string
     */
    @Json(name = "string")
    STRING,

    /**
     * The property value is a string (often used to assign ranking values to concepts for supporting score assessments)
     */
    @Json(name = "integer")
    INTEGER,

    /**
     * The property value is a boolean true | false
     */
    @Json(name = "boolean")
    BOOLEAN,

    /**
     * The property is a date or a date + time
     */
    @Json(name = "dateTime")
    DATETIME,
  }

  /**
   * How an entity was used in an activity.
   *
   * @see <a href="http://hl7.org/fhir/provenance-entity-role">ProvenanceEntityRole</a>
   */
  public enum ProvenanceEntityRole {

    /**
     * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a preexisting entity.
     */
    @Json(name = "derivation")
    DERIVATION,

    /**
     * A derivation for which the resulting entity is a revised version of some original.
     */
    @Json(name = "revision")
    REVISION,

    /**
     * The repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author.
     */
    @Json(name = "quotation")
    QUOTATION,

    /**
     * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
     */
    @Json(name = "source")
    SOURCE,

    /**
     * A derivation for which the entity is removed from accessibility usually through the use of the Delete operation.
     */
    @Json(name = "removal")
    REMOVAL,
  }

  /**
   * The lifecycle status of a Value Set or Concept Map.
   *
   * @see <a href="http://hl7.org/fhir/publication-status">PublicationStatus</a>
   */
  public enum PublicationStatus {

    /**
     * This resource is still under development and is not yet considered to be ready for normal use.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * This resource is ready for normal use.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * This resource has been withdrawn or superseded and should no longer be used.
     */
    @Json(name = "retired")
    RETIRED,

    /**
     * The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * A rating system that describes the quality of evidence such as the GRADE, DynaMed, or Oxford CEBM systems
   *
   * @see <a href="http://hl7.org/fhir/evidence-quality">QualityOfEvidenceRating</a>
   */
  public enum QualityOfEvidenceRating {

    /**
     * High quality evidence
     */
    @Json(name = "high")
    HIGH,

    /**
     * Moderate quality evidence
     */
    @Json(name = "moderate")
    MODERATE,

    /**
     * Low quality evidence
     */
    @Json(name = "low")
    LOW,

    /**
     * Very low quality evidence
     */
    @Json(name = "very-low")
    VERY_LOW,
  }

  /**
   * Type for quality report
   *
   * @see <a href="http://hl7.org/fhir/quality-type">QualityType</a>
   */
  public enum QualityType {

    /**
     * INDEL Comparison
     */
    @Json(name = "indel")
    INDEL,

    /**
     * SNP Comparison
     */
    @Json(name = "snp")
    SNP,

    /**
     * UNKNOWN Comparison
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * How the Quantity should be understood and represented.
   *
   * @see <a href="http://hl7.org/fhir/quantity-comparator">QuantityComparator</a>
   */
  public enum QuantityComparator {

    /**
     * The actual value is less than the given value.
     */
    @Json(name = "<")
    LESS_THAN,

    /**
     * The actual value is less than or equal to the given value.
     */
    @Json(name = "<=")
    LESS_OR_EQUAL,

    /**
     * The actual value is greater than or equal to the given value.
     */
    @Json(name = ">=")
    GREATER_OR_EQUAL,

    /**
     * The actual value is greater than the given value.
     */
    @Json(name = ">")
    GREATER_THAN,
  }

  /**
   * Distinguishes groups from questions and display text and indicates data type for questions
   *
   * @see <a href="http://hl7.org/fhir/item-type">QuestionnaireItemType</a>
   */
  public enum QuestionnaireItemType {

    /**
     * An item with no direct answer but should have at least one child item.
     */
    @Json(name = "group")
    GROUP,

    /**
     * Text for display that will not capture an answer or have child items.
     */
    @Json(name = "display")
    DISPLAY,

    /**
     * An item that defines a specific answer to be captured, and may have child items.
     * (the answer provided in the QuestionnaireResponse should be of the defined datatype)
     */
    @Json(name = "question")
    QUESTION,

    /**
     * Question with a yes/no answer (valueBoolean)
     */
    @Json(name = "boolean")
    BOOLEAN,

    /**
     * Question with is a real number answer (valueDecimal)
     */
    @Json(name = "decimal")
    DECIMAL,

    /**
     * Question with an integer answer (valueInteger)
     */
    @Json(name = "integer")
    INTEGER,

    /**
     * Question with a date answer (valueDate)
     */
    @Json(name = "date")
    DATE,

    /**
     * Question with a date and time answer (valueDateTime)
     */
    @Json(name = "dateTime")
    DATETIME,

    /**
     * Question with a time (hour:minute:second) answer independent of date. (valueTime)
     */
    @Json(name = "time")
    TIME,

    /**
     * Question with a short (few words to short sentence) free-text entry answer (valueString)
     */
    @Json(name = "string")
    STRING,

    /**
     * Question with a long (potentially multi-paragraph) free-text entry answer (valueString)
     */
    @Json(name = "text")
    TEXT,

    /**
     * Question with a URL (website, FTP site, etc.) answer (valueUri)
     */
    @Json(name = "url")
    URL,

    /**
     * Question with a Coding drawn from a list of options (specified in either the option property, or via the valueset referenced in the options property) as an answer (valueCoding)
     */
    @Json(name = "choice")
    CHOICE,

    /**
     * Answer is a Coding drawn from a list of options (as with the choice type) or a free-text entry in a string (valueCoding or valueString)
     */
    @Json(name = "open-choice")
    OPEN_CHOICE,

    /**
     * Question with binary content such as a image, PDF, etc. as an answer (valueAttachment)
     */
    @Json(name = "attachment")
    ATTACHMENT,

    /**
     * Question with a reference to another resource (practitioner, organization, etc.) as an answer (valueReference)
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * Question with a combination of a numeric value and unit, potentially with a comparator (<, >, etc.) as an answer. (valueQuantity)
     * There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to define what unit whould be captured (or the a unit that has a ucum conversion from the provided unit)
     */
    @Json(name = "quantity")
    QUANTITY,
  }

  /**
   * Identifies the modes of usage of a questionnaire that should enable a particular questionnaire item
   *
   * @see <a href="http://hl7.org/fhir/questionnaire-usage-mode">QuestionnaireItemUsageMode</a>
   */
  public enum QuestionnaireItemUsageMode {

    /**
     * Render the item regardless of usage mode
     */
    @Json(name = "capture-display")
    CAPTURE_DISPLAY,

    /**
     * Render the item only when capturing data
     */
    @Json(name = "capture")
    CAPTURE,

    /**
     * Render the item only when displaying a completed form
     */
    @Json(name = "display")
    DISPLAY,

    /**
     * Render the item only when displaying a completed form and the item has been answered (or has child items that have been answered)
     */
    @Json(name = "display-non-empty")
    DISPLAY_NON_EMPTY,

    /**
     * Render the item when capturing data or when displaying a completed form and the item has been answered (or has child items that have been answered)
     */
    @Json(name = "capture-display-non-empty")
    CAPTURE_DISPLAY_NON_EMPTY,
  }

  /**
   * Lifecycle status of the questionnaire response.
   *
   * @see <a href="http://hl7.org/fhir/questionnaire-answers-status">QuestionnaireResponseStatus</a>
   */
  public enum QuestionnaireResponseStatus {

    /**
     * This QuestionnaireResponse has been partially filled out with answers, but changes or additions are still expected to be made to it.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * This QuestionnaireResponse has been filled out with answers, and the current content is regarded as definitive.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
     */
    @Json(name = "amended")
    AMENDED,

    /**
     * This QuestionnaireResponse was entered in error and voided.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * This QuestionnaireResponse has been partially filled out with answers, but has been abandoned. It is unknown whether changes or additions are expected to be made to it.
     */
    @Json(name = "stopped")
    STOPPED,
  }

  /**
   * A set of flags that defines how references are supported.
   *
   * @see <a href="http://hl7.org/fhir/reference-handling-policy">ReferenceHandlingPolicy</a>
   */
  public enum ReferenceHandlingPolicy {

    /**
     * The server supports and populates Literal references where they are known (this code does not guarantee that all references are literal; see 'enforced')
     */
    @Json(name = "literal")
    LITERAL,

    /**
     * The server allows logical references
     */
    @Json(name = "logical")
    LOGICAL,

    /**
     * The server will attempt to resolve logical references to literal references (if resolution fails, the server may still accept resources; see logical)
     */
    @Json(name = "resolves")
    RESOLVES,

    /**
     * The server enforces that references have integrity - e.g. it ensures that references can always be resolved. This is typically the case for clinical record systems, but often not the case for middleware/proxy systems
     */
    @Json(name = "enforced")
    ENFORCED,

    /**
     * The server does not support references that point to other servers
     */
    @Json(name = "local")
    LOCAL,
  }

  /**
   * Whether a reference needs to be version specific or version independent, or whether either can be used
   *
   * @see <a href="http://hl7.org/fhir/reference-version-rules">ReferenceVersionRules</a>
   */
  public enum ReferenceVersionRules {

    /**
     * The reference may be either version independent or version specific
     */
    @Json(name = "either")
    EITHER,

    /**
     * The reference must be version independent
     */
    @Json(name = "independent")
    INDEPENDENT,

    /**
     * The reference must be version specific
     */
    @Json(name = "specific")
    SPECIFIC,
  }

  /**
   * The methods of referral can be used when referring to a specific HealthCareService resource.
   *
   * @see <a href="http://hl7.org/fhir/service-referral-method">ReferralMethod</a>
   */
  public enum ReferralMethod {

    /**
     * Referrals may be accepted by fax.
     */
    @Json(name = "fax")
    FAX,

    /**
     * Referrals may be accepted over the phone from a practitioner.
     */
    @Json(name = "phone")
    PHONE,

    /**
     * Referrals may be accepted via a secure messaging system. To determine the types of secure messaging systems supported, refer to the identifiers collection. Callers will need to understand the specific identifier system used to know that they are able to transmit messages.
     */
    @Json(name = "elec")
    ELEC,

    /**
     * Referrals may be accepted via a secure email. To send please encrypt with the services public key.
     */
    @Json(name = "semail")
    SEMAIL,

    /**
     * Referrals may be accepted via regular postage (or hand delivered).
     */
    @Json(name = "mail")
    MAIL,
  }

  /**
   * The type of relationship to the related artifact
   *
   * @see <a href="http://hl7.org/fhir/related-artifact-type">RelatedArtifactType</a>
   */
  public enum RelatedArtifactType {

    /**
     * Additional documentation for the knowledge resource. This would include additional instructions on usage as well as additional information on clinical context or appropriateness
     */
    @Json(name = "documentation")
    DOCUMENTATION,

    /**
     * A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or other clinically important information. This information is intended to provide a way to make the justification for the knowledge resource available to the consumer of interventions or results produced by the knowledge resource
     */
    @Json(name = "justification")
    JUSTIFICATION,

    /**
     * Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is intended to allow for citation of related material, but that was not necessarily specifically prepared in connection with this knowledge resource
     */
    @Json(name = "citation")
    CITATION,

    /**
     * The previous version of the knowledge resource
     */
    @Json(name = "predecessor")
    PREDECESSOR,

    /**
     * The next version of the knowledge resource
     */
    @Json(name = "successor")
    SUCCESSOR,

    /**
     * The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but is modified to capture either a different set of overall requirements, or a more specific set of requirements such as those involved in a particular institution or clinical setting
     */
    @Json(name = "derived-from")
    DERIVED_FROM,

    /**
     * The knowledge resource depends on the given related artifact
     */
    @Json(name = "depends-on")
    DEPENDS_ON,

    /**
     * The knowledge resource is composed of the given related artifact
     */
    @Json(name = "composed-of")
    COMPOSED_OF,
  }

  /**
   * Type for access of external URI
   *
   * @see <a href="http://hl7.org/fhir/repository-type">RepositoryType</a>
   */
  public enum RepositoryType {

    /**
     * When URL is clicked, the resource can be seen directly (by webpage or by download link format)
     */
    @Json(name = "directlink")
    DIRECTLINK,

    /**
     * When the API method (e.g. [base_url]/[parameter]) related with the URL of the website is executed, the resource can be seen directly (usually in JSON or XML format)
     */
    @Json(name = "openapi")
    OPENAPI,

    /**
     * When logged into the website, the resource can be seen.
     */
    @Json(name = "login")
    LOGIN,

    /**
     * When logged in and  follow the API in the website related with URL, the resource can be seen.
     */
    @Json(name = "oauth")
    OAUTH,

    /**
     * Some other complicated or particular way to get resource from URL.
     */
    @Json(name = "other")
    OTHER,
  }

  /**
   * Codes indicating the degree of authority/intentionality associated with a request
   *
   * @see <a href="http://hl7.org/fhir/request-intent">RequestIntent</a>
   */
  public enum RequestIntent {

    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act
     */
    @Json(name = "proposal")
    PROPOSAL,

    /**
     * The request represents an intension to ensure something occurs without providing an authorization for others to act
     */
    @Json(name = "plan")
    PLAN,

    /**
     * The request represents a request/demand and authorization for action
     */
    @Json(name = "order")
    ORDER,

    /**
     * The request represents an original authorization for action
     */
    @Json(name = "original-order")
    ORIGINAL_ORDER,

    /**
     * The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization
     */
    @Json(name = "reflex-order")
    REFLEX_ORDER,

    /**
     * The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order
     */
    @Json(name = "filler-order")
    FILLER_ORDER,

    /**
     * An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.
     */
    @Json(name = "instance-order")
    INSTANCE_ORDER,

    /**
     * The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.
     *
     * Refer to [[[RequestGroup]]] for additional information on how this status is used
     */
    @Json(name = "option")
    OPTION,
  }

  /**
   * Identifies the level of importance to be assigned to actioning the request
   *
   * @see <a href="http://hl7.org/fhir/request-priority">RequestPriority</a>
   */
  public enum RequestPriority {

    /**
     * The request has normal priority
     */
    @Json(name = "routine")
    ROUTINE,

    /**
     * The request should be actioned promptly - higher priority than routine
     */
    @Json(name = "urgent")
    URGENT,

    /**
     * The request should be actioned as soon as possible - higher priority than urgent
     */
    @Json(name = "asap")
    ASAP,

    /**
     * The request should be actioned immediately - highest possible priority.  E.g. an emergency
     */
    @Json(name = "stat")
    STAT,
  }

  /**
   * Codes identifying the stage lifecycle stage of a request
   *
   * @see <a href="http://hl7.org/fhir/request-status">RequestStatus</a>
   */
  public enum RequestStatus {

    /**
     * The request has been created but is not yet complete or ready for action
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The request is ready to be acted upon
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The authorization/request to act has been temporarily withdrawn but is expected to resume in the future
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The authorization/request to act has been terminated prior to the full completion of the intended actions.  No further activity should occur.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * Activity against the request has been sufficiently completed to the satisfaction of the requester
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" . One of the listed statuses is presumed to apply,  but the system creating the request doesn't know.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * Codes that convey the current status of the research study
   *
   * @see <a href="http://hl7.org/fhir/research-study-status">ResearchStudyStatus</a>
   */
  public enum ResearchStudyStatus {

    /**
     * The study is undergoing design but the process of selecting study subjects and capturing data has not yet begun.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The study is currently being executed
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Execution of the study has been temporarily paused
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The study was terminated prior to the final determination of results
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * The information sought by the study has been gathered and compiled and no further work is being performed
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This study never actually existed.  The record is retained for tracking purposes in the event decisions may have been made based on this erroneous information.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Indicates the progression of a study subject through a study
   *
   * @see <a href="http://hl7.org/fhir/research-subject-status">ResearchSubjectStatus</a>
   */
  public enum ResearchSubjectStatus {

    /**
     * The subject has been identified as a potential participant in the study but has not yet agreed to participate
     */
    @Json(name = "candidate")
    CANDIDATE,

    /**
     * The subject has agreed to participate in the study but has not yet begun performing any action within the study
     */
    @Json(name = "enrolled")
    ENROLLED,

    /**
     * The subject is currently being monitored and/or subject to treatment as part of the study
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The subject has temporarily discontinued monitoring/treatment as part of the study
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The subject has permanently ended participation in the study prior to completion of the intended monitoring/treatment
     */
    @Json(name = "withdrawn")
    WITHDRAWN,

    /**
     * All intended monitoring/treatment of the subject has been completed and their engagement with the study is now ended
     */
    @Json(name = "completed")
    COMPLETED,
  }

  /**
   * The type of payee Resource
   *
   * @see <a href="http://hl7.org/fhir/resource-type-link">ResourceTypeLink</a>
   */
  public enum ResourceTypeLink {

    /**
     * Organization resource
     */
    @Json(name = "organization")
    ORGANIZATION,

    /**
     * Patient resource
     */
    @Json(name = "patient")
    PATIENT,

    /**
     * Practitioner resource
     */
    @Json(name = "practitioner")
    PRACTITIONER,

    /**
     * RelatedPerson resource
     */
    @Json(name = "relatedperson")
    RELATEDPERSON,
  }

  /**
   * Codes indicating the type of validation to perform
   *
   * @see <a href="http://hl7.org/fhir/resource-validation-mode">ResourceValidationMode</a>
   */
  public enum ResourceValidationMode {

    /**
     * The server checks the content, and then checks that the content would be acceptable as a create (e.g. that the content would not violate any uniqueness constraints).
     */
    @Json(name = "create")
    CREATE,

    /**
     * The server checks the content, and then checks that it would accept it as an update against the nominated specific resource (e.g. that there are no changes to immutable fields the server does not allow to change, and checking version integrity if appropriate).
     */
    @Json(name = "update")
    UPDATE,

    /**
     * The server ignores the content, and checks that the nominated resource is allowed to be deleted (e.g. checking referential integrity rules).
     */
    @Json(name = "delete")
    DELETE,
  }

  /**
   * How the system supports versioning for a resource.
   *
   * @see <a href="http://hl7.org/fhir/versioning-policy">ResourceVersionPolicy</a>
   */
  public enum ResourceVersionPolicy {

    /**
     * VersionId meta-property is not supported (server) or used (client).
     */
    @Json(name = "no-version")
    NO_VERSION,

    /**
     * VersionId meta-property is supported (server) or used (client).
     */
    @Json(name = "versioned")
    VERSIONED,

    /**
     * VersionId must be correct for updates (server) or will be specified (If-match header) for updates (client).
     */
    @Json(name = "versioned-update")
    VERSIONED_UPDATE,
  }

  /**
   * The kind of response to a message
   *
   * @see <a href="http://hl7.org/fhir/response-code">ResponseType</a>
   */
  public enum ResponseType {

    /**
     * The message was accepted and processed without error.
     */
    @Json(name = "ok")
    OK,

    /**
     * Some internal unexpected error occurred - wait and try again. Note - this is usually used for things like database unavailable, which may be expected to resolve, though human intervention may be required.
     */
    @Json(name = "transient-error")
    TRANSIENT_ERROR,

    /**
     * The message was rejected because of a problem with the content. There is no point in re-sending without change. The response narrative SHALL describe the issue.
     */
    @Json(name = "fatal-error")
    FATAL_ERROR,
  }

  /**
   * The mode of a RESTful capability statement.
   *
   * @see <a href="http://hl7.org/fhir/restful-capability-mode">RestfulCapabilityMode</a>
   */
  public enum RestfulCapabilityMode {

    /**
     * The application acts as a client for this resource.
     */
    @Json(name = "client")
    CLIENT,

    /**
     * The application acts as a server for this resource.
     */
    @Json(name = "server")
    SERVER,
  }

  /**
   * Types of security services used with FHIR.
   *
   * @see <a href="http://hl7.org/fhir/restful-security-service">RestfulSecurityService</a>
   */
  public enum RestfulSecurityService {

    /**
     * Oauth (unspecified version see oauth.net).
     */
    @Json(name = "OAuth")
    OAUTH,

    /**
     * OAuth2 using SMART-on-FHIR profile (see http://docs.smarthealthit.org/).
     */
    @Json(name = "SMART-on-FHIR")
    SMART_ON_FHIR,

    /**
     * Microsoft NTLM Authentication.
     */
    @Json(name = "NTLM")
    NTLM,

    /**
     * Basic authentication defined in HTTP specification.
     */
    @Json(name = "Basic")
    BASIC,

    /**
     * see http://www.ietf.org/rfc/rfc4120.txt.
     */
    @Json(name = "Kerberos")
    KERBEROS,

    /**
     * SSL where client must have a certificate registered with the server.
     */
    @Json(name = "Certificates")
    CERTIFICATES,
  }

  /**
   * What Search Comparator Codes are supported in search
   *
   * @see <a href="http://hl7.org/fhir/search-comparator">SearchComparator</a>
   */
  public enum SearchComparator {

    /**
     * the value for the parameter in the resource is equal to the provided value
     */
    @Json(name = "eq")
    EQ,

    /**
     * the value for the parameter in the resource is not equal to the provided value
     */
    @Json(name = "ne")
    NE,

    /**
     * the value for the parameter in the resource is greater than the provided value
     */
    @Json(name = "gt")
    GT,

    /**
     * the value for the parameter in the resource is less than the provided value
     */
    @Json(name = "lt")
    LT,

    /**
     * the value for the parameter in the resource is greater or equal to the provided value
     */
    @Json(name = "ge")
    GE,

    /**
     * the value for the parameter in the resource is less or equal to the provided value
     */
    @Json(name = "le")
    LE,

    /**
     * the value for the parameter in the resource starts after the provided value
     */
    @Json(name = "sa")
    SA,

    /**
     * the value for the parameter in the resource ends before the provided value
     */
    @Json(name = "eb")
    EB,

    /**
     * the value for the parameter in the resource is approximately the same to the provided value.
     */
    @Json(name = "ap")
    AP,
  }

  /**
   * Why an entry is in the result set - whether it's included as a match or because of an _include requirement.
   *
   * @see <a href="http://hl7.org/fhir/search-entry-mode">SearchEntryMode</a>
   */
  public enum SearchEntryMode {

    /**
     * This resource matched the search specification.
     */
    @Json(name = "match")
    MATCH,

    /**
     * This resource is returned because it is referred to from another resource in the search set.
     */
    @Json(name = "include")
    INCLUDE,

    /**
     * An OperationOutcome that provides additional information about the processing of a search.
     */
    @Json(name = "outcome")
    OUTCOME,
  }

  /**
   * A supported modifier for a search parameter.
   *
   * @see <a href="http://hl7.org/fhir/search-modifier-code">SearchModifierCode</a>
   */
  public enum SearchModifierCode {

    /**
     * The search parameter returns resources that have a value or not.
     */
    @Json(name = "missing")
    MISSING,

    /**
     * The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).
     */
    @Json(name = "exact")
    EXACT,

    /**
     * The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.
     */
    @Json(name = "contains")
    CONTAINS,

    /**
     * The search parameter returns resources that do not contain a match.
     */
    @Json(name = "not")
    NOT,

    /**
     * The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text.
     */
    @Json(name = "text")
    TEXT,

    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.
     */
    @Json(name = "in")
    IN,

    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.
     */
    @Json(name = "not-in")
    NOT_IN,

    /**
     * The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).
     */
    @Json(name = "below")
    BELOW,

    /**
     * The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).
     */
    @Json(name = "above")
    ABOVE,

    /**
     * The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).
     */
    @Json(name = "type")
    TYPE,
  }

  /**
   * Data types allowed to be used for search parameters.
   *
   * @see <a href="http://hl7.org/fhir/search-param-type">SearchParamType</a>
   */
  public enum SearchParamType {

    /**
     * Search parameter SHALL be a number (a whole number, or a decimal).
     */
    @Json(name = "number")
    NUMBER,

    /**
     * Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.
     */
    @Json(name = "date")
    DATE,

    /**
     * Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.
     */
    @Json(name = "string")
    STRING,

    /**
     * Search parameter on a coded element or identifier. May be used to search through the text, displayname, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a "|", depending on the modifier used.
     */
    @Json(name = "token")
    TOKEN,

    /**
     * A reference to another resource.
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * A composite search parameter that combines a search on two values together.
     */
    @Json(name = "composite")
    COMPOSITE,

    /**
     * A search parameter that searches on a quantity.
     */
    @Json(name = "quantity")
    QUANTITY,

    /**
     * A search parameter that searches on a URI (RFC 3986).
     */
    @Json(name = "uri")
    URI,
  }

  /**
   * Codes providing the status of the variant test result
   *
   * @see <a href="http://hl7.org/fhir/variant-state">SequenceStatus</a>
   */
  public enum SequenceStatus {

    /**
     * the variant is detected
     */
    @Json(name = "positive")
    POSITIVE,

    /**
     * no variant is detected
     */
    @Json(name = "negative")
    NEGATIVE,

    /**
     * result of the variant is missing
     */
    @Json(name = "absent")
    ABSENT,
  }

  /**
   * Type if a sequence -- DNA, RNA, or amino acid sequence
   *
   * @see <a href="http://hl7.org/fhir/sequence-type">SequenceType</a>
   */
  public enum SequenceType {

    /**
     * Amino acid sequence
     */
    @Json(name = "aa")
    AA,

    /**
     * DNA Sequence
     */
    @Json(name = "dna")
    DNA,

    /**
     * RNA Sequence
     */
    @Json(name = "rna")
    RNA,
  }

  /**
   * The code(s) that detail the conditions under which the healthcare service is available/offered.
   *
   * @see <a href="http://hl7.org/fhir/service-provision-conditions">ServiceProvisionConditions</a>
   */
  public enum ServiceProvisionConditions {

    /**
     * This service is available for no patient cost.
     */
    @Json(name = "free")
    FREE,

    /**
     * There are discounts available on this service for qualifying patients.
     */
    @Json(name = "disc")
    DISC,

    /**
     * Fees apply for this service.
     */
    @Json(name = "cost")
    COST,
  }

  /**
   * How slices are interpreted when evaluating an instance.
   *
   * @see <a href="http://hl7.org/fhir/resource-slicing-rules">SlicingRules</a>
   */
  public enum SlicingRules {

    /**
     * No additional content is allowed other than that described by the slices in this profile.
     */
    @Json(name = "closed")
    CLOSED,

    /**
     * Additional content is allowed anywhere in the list.
     */
    @Json(name = "open")
    OPEN,

    /**
     * Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.
     */
    @Json(name = "openAtEnd")
    OPENATEND,
  }

  /**
   * The free/busy status of the slot.
   *
   * @see <a href="http://hl7.org/fhir/slotstatus">SlotStatus</a>
   */
  public enum SlotStatus {

    /**
     * Indicates that the time interval is busy because one  or more events have been scheduled for that interval.
     */
    @Json(name = "busy")
    BUSY,

    /**
     * Indicates that the time interval is free for scheduling.
     */
    @Json(name = "free")
    FREE,

    /**
     * Indicates that the time interval is busy and that the interval can not be scheduled.
     */
    @Json(name = "busy-unavailable")
    BUSY_UNAVAILABLE,

    /**
     * Indicates that the time interval is busy because one or more events have been tentatively scheduled for that interval.
     */
    @Json(name = "busy-tentative")
    BUSY_TENTATIVE,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * A set of generally useful codes defined so they can be included in value sets.
   *
   * @see <a href="http://hl7.org/fhir/special-values">SpecialValues</a>
   */
  public enum SpecialValues {

    /**
     * Boolean true.
     */
    @Json(name = "true")
    TRUE,

    /**
     * Boolean false.
     */
    @Json(name = "false")
    FALSE,

    /**
     * The content is greater than zero, but too small to be quantified.
     */
    @Json(name = "trace")
    TRACE,

    /**
     * The specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material.
     */
    @Json(name = "sufficient")
    SUFFICIENT,

    /**
     * The value is no longer available.
     */
    @Json(name = "withdrawn")
    WITHDRAWN,

    /**
     * The are no known applicable values in this context.
     */
    @Json(name = "nil-known")
    NIL_KNOWN,
  }

  /**
   * Codes providing the status/availability of a specimen.
   *
   * @see <a href="http://hl7.org/fhir/specimen-status">SpecimenStatus</a>
   */
  public enum SpecimenStatus {

    /**
     * The physical specimen is present and in good condition.
     */
    @Json(name = "available")
    AVAILABLE,

    /**
     * There is no physical specimen because it is either lost, destroyed or consumed.
     */
    @Json(name = "unavailable")
    UNAVAILABLE,

    /**
     * The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
     */
    @Json(name = "unsatisfactory")
    UNSATISFACTORY,

    /**
     * The specimen was entered in error and therefore nullified.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * A rating system that describes the strength of the recommendation, such as the GRADE, DynaMed, or HGPS systems
   *
   * @see <a href="http://hl7.org/fhir/recommendation-strength">StrengthOfRecommendationRating</a>
   */
  public enum StrengthOfRecommendationRating {

    /**
     * Strong recommendation
     */
    @Json(name = "strong")
    STRONG,

    /**
     * Weak recommendation
     */
    @Json(name = "weak")
    WEAK,
  }

  /**
   * Defines the type of structure that a definition is describing.
   *
   * @see <a href="http://hl7.org/fhir/structure-definition-kind">StructureDefinitionKind</a>
   */
  public enum StructureDefinitionKind {

    /**
     * A primitive type that has a value and an extension. These can be used throughout Resource and extension definitions. Only the base specification can define primitive types.
     */
    @Json(name = "primitive-type")
    PRIMITIVE_TYPE,

    /**
     * A  complex structure that defines a set of data elements. These can be used throughout Resource and extension definitions, and in logical models.
     */
    @Json(name = "complex-type")
    COMPLEX_TYPE,

    /**
     * A resource defined by the FHIR specification.
     */
    @Json(name = "resource")
    RESOURCE,

    /**
     * A conceptual package of data that will be mapped to resources for implementation.
     */
    @Json(name = "logical")
    LOGICAL,
  }

  /**
   * How to interpret the context
   *
   * @see <a href="http://hl7.org/fhir/map-context-type">StructureMapContextType</a>
   */
  public enum StructureMapContextType {

    /**
     * The context specifies a type
     */
    @Json(name = "type")
    TYPE,

    /**
     * The context specifies a variable
     */
    @Json(name = "variable")
    VARIABLE,
  }

  /**
   * If this is the default rule set to apply for the source type, or this combination of types
   *
   * @see <a href="http://hl7.org/fhir/map-group-type-mode">StructureMapGroupTypeMode</a>
   */
  public enum StructureMapGroupTypeMode {

    /**
     * This group is not a default group for the types
     */
    @Json(name = "none")
    NONE,

    /**
     * This group is a default mapping group for the specified types and for the primary source type
     */
    @Json(name = "types")
    TYPES,

    /**
     * This group is a default mapping group for the specified types
     */
    @Json(name = "type-and-types")
    TYPE_AND_TYPES,
  }

  /**
   * Mode for this instance of data
   *
   * @see <a href="http://hl7.org/fhir/map-input-mode">StructureMapInputMode</a>
   */
  public enum StructureMapInputMode {

    /**
     * Names an input instance used a source for mapping
     */
    @Json(name = "source")
    SOURCE,

    /**
     * Names an instance that is being populated
     */
    @Json(name = "target")
    TARGET,
  }

  /**
   * How the referenced structure is used in this mapping
   *
   * @see <a href="http://hl7.org/fhir/map-model-mode">StructureMapModelMode</a>
   */
  public enum StructureMapModelMode {

    /**
     * This structure describes an instance passed to the mapping engine that is used a source of data
     */
    @Json(name = "source")
    SOURCE,

    /**
     * This structure describes an instance that the mapping engine may ask for that is used a source of data
     */
    @Json(name = "queried")
    QUERIED,

    /**
     * This structure describes an instance passed to the mapping engine that is used a target of data
     */
    @Json(name = "target")
    TARGET,

    /**
     * This structure describes an instance that the mapping engine may ask to create that is used a target of data
     */
    @Json(name = "produced")
    PRODUCED,
  }

  /**
   * If field is a list, how to manage the source
   *
   * @see <a href="http://hl7.org/fhir/map-source-list-mode">StructureMapSourceListMode</a>
   */
  public enum StructureMapSourceListMode {

    /**
     * Only process this rule for the first in the list
     */
    @Json(name = "first")
    FIRST,

    /**
     * Process this rule for all but the first
     */
    @Json(name = "not_first")
    NOT_FIRST,

    /**
     * Only process this rule for the last in the list
     */
    @Json(name = "last")
    LAST,

    /**
     * Process this rule for all but the last
     */
    @Json(name = "not_last")
    NOT_LAST,

    /**
     * Only process this rule is there is only item
     */
    @Json(name = "only_one")
    ONLY_ONE,
  }

  /**
   * If field is a list, how to manage the production
   *
   * @see <a href="http://hl7.org/fhir/map-target-list-mode">StructureMapTargetListMode</a>
   */
  public enum StructureMapTargetListMode {

    /**
     * when the target list is being assembled, the items for this rule go first. If more that one rule defines a first item (for a given instance of mapping) then this is an error
     */
    @Json(name = "first")
    FIRST,

    /**
     * the target instance is shared with the target instances generated by another rule (up to the first common n items, then create new ones)
     */
    @Json(name = "share")
    SHARE,

    /**
     * when the target list is being assembled, the items for this rule go last. If more that one rule defines a last item (for a given instance of mapping) then this is an error
     */
    @Json(name = "last")
    LAST,

    /**
     * re-use the first item in the list, and keep adding content to it
     */
    @Json(name = "collate")
    COLLATE,
  }

  /**
   * How data is copied/created
   *
   * @see <a href="http://hl7.org/fhir/map-transform">StructureMapTransform</a>
   */
  public enum StructureMapTransform {

    /**
     * create(type : string) - type is passed through to the application on the standard API, and must be known by it
     */
    @Json(name = "create")
    CREATE,

    /**
     * copy(source)
     */
    @Json(name = "copy")
    COPY,

    /**
     * truncate(source, length) - source must be stringy type
     */
    @Json(name = "truncate")
    TRUNCATE,

    /**
     * escape(source, fmt1, fmt2) - change source from one kind of escaping to another (plain, java, xml, json). note that this is for when the string itself is escaped
     */
    @Json(name = "escape")
    ESCAPE,

    /**
     * cast(source, type?) - case source from one type to another. target type can be left as implicit if there is one and only one target type known
     */
    @Json(name = "cast")
    CAST,

    /**
     * append(source...) - source is element or string
     */
    @Json(name = "append")
    APPEND,

    /**
     * translate(source, uri_of_map) - use the translate operation
     */
    @Json(name = "translate")
    TRANSLATE,

    /**
     * reference(source : object) - return a string that references the provided tree properly
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * Perform a date operation. *Parameters to be documented*
     */
    @Json(name = "dateOp")
    DATEOP,

    /**
     * Generate a random UUID (in lowercase). No Parameters
     */
    @Json(name = "uuid")
    UUID,

    /**
     * Return the appropriate string to put in a reference that refers to the resource provided as a parameter
     */
    @Json(name = "pointer")
    POINTER,

    /**
     * Execute the supplied fluentpath expression and use the value returned by that
     */
    @Json(name = "evaluate")
    EVALUATE,

    /**
     * Create a CodeableConcept. Parameters = (text) or (system. Code[, display])
     */
    @Json(name = "cc")
    CC,

    /**
     * Create a Coding. Parameters = (system. Code[, display])
     */
    @Json(name = "c")
    C,

    /**
     * Create a quantity. Parameters = (text) or (value, unit, [system, code]) where text is the natural representation e.g. [comparator]value[space]unit
     */
    @Json(name = "qty")
    QTY,

    /**
     * Create an identifier. Parameters = (system, value[, type]) where type is a code from the identifier type value set
     */
    @Json(name = "id")
    ID,

    /**
     * Create a contact details. Parameters = (value) or (system, value). If no system is provided, the system should be inferred from the content of the value
     */
    @Json(name = "cp")
    CP,
  }

  /**
   * The type of method used to execute a subscription.
   *
   * @see <a href="http://hl7.org/fhir/subscription-channel-type">SubscriptionChannelType</a>
   */
  public enum SubscriptionChannelType {

    /**
     * The channel is executed by making a post to the URI. If a payload is included, the URL is interpreted as the service base, and an update (PUT) is made.
     */
    @Json(name = "rest-hook")
    REST_HOOK,

    /**
     * The channel is executed by sending a packet across a web socket connection maintained by the client. The URL identifies the websocket, and the client binds to this URL.
     */
    @Json(name = "websocket")
    WEBSOCKET,

    /**
     * The channel is executed by sending an email to the email addressed in the URI (which must be a mailto:).
     */
    @Json(name = "email")
    EMAIL,

    /**
     * The channel is executed by sending an SMS message to the phone number identified in the URL (tel:).
     */
    @Json(name = "sms")
    SMS,

    /**
     * The channel is executed by sending a message (e.g. a Bundle with a MessageHeader resource etc.) to the application identified in the URI.
     */
    @Json(name = "message")
    MESSAGE,
  }

  /**
   * The status of a subscription.
   *
   * @see <a href="http://hl7.org/fhir/subscription-status">SubscriptionStatus</a>
   */
  public enum SubscriptionStatus {

    /**
     * The client has requested the subscription, and the server has not yet set it up.
     */
    @Json(name = "requested")
    REQUESTED,

    /**
     * The subscription is active.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The server has an error executing the notification.
     */
    @Json(name = "error")
    ERROR,

    /**
     * Too many errors have occurred or the subscription has expired.
     */
    @Json(name = "off")
    OFF,
  }

  /**
   * Tags to put on a resource after subscriptions have been sent.
   *
   * @see <a href="http://hl7.org/fhir/subscription-tag">SubscriptionTag</a>
   */
  public enum SubscriptionTag {

    /**
     * The message has been queued for processing on a destination systems.
     */
    @Json(name = "queued")
    QUEUED,

    /**
     * The message has been delivered to its intended recipient.
     */
    @Json(name = "delivered")
    DELIVERED,
  }

  /**
   * Status of the supply delivery.
   *
   * @see <a href="http://hl7.org/fhir/supplydelivery-status">SupplyDeliveryStatus</a>
   */
  public enum SupplyDeliveryStatus {

    /**
     * Supply has been requested, but not delivered.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Supply has been delivered ("completed").
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * Delivery was not completed.
     */
    @Json(name = "abandoned")
    ABANDONED,

    /**
     * This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * Why the supply item was requested
   *
   * @see <a href="http://hl7.org/fhir/supplyrequest-reason">SupplyRequestReason</a>
   */
  public enum SupplyRequestReason {

    /**
     * The supply has been requested for use in direct patient care.
     */
    @Json(name = "patient-care")
    PATIENT_CARE,

    /**
     * The supply has been requested for for creating or replenishing ward stock.
     */
    @Json(name = "ward-stock")
    WARD_STOCK,
  }

  /**
   * Status of the supply request
   *
   * @see <a href="http://hl7.org/fhir/supplyrequest-status">SupplyRequestStatus</a>
   */
  public enum SupplyRequestStatus {

    /**
     * The request has been created but is not yet complete or ready for action
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The request is ready to be acted upon
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The authorization/request to act has been temporarily withdrawn but is expected to resume in the future
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The authorization/request to act has been terminated prior to the full completion of the intended actions.  No further activity should occur.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * Activity against the request has been sufficiently completed to the satisfaction of the requester
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * How to manage the intersection between a fixed version in a value set, and a fixed version of the system in the expansion profile
   *
   * @see <a href="http://hl7.org/fhir/system-version-processing-mode">SystemVersionProcessingMode</a>
   */
  public enum SystemVersionProcessingMode {

    /**
     * Use this version of the code system if a value set doesn't specify a version
     */
    @Json(name = "default")
    DEFAULT,

    /**
     * Use this version of the code system. If a value set specifies a different version, the expansion operation should fail
     */
    @Json(name = "check")
    CHECK,

    /**
     * Use this version of the code system irrespective of which version is specified by a value set. Note that this has obvious safety issues, in that it may result in a value set expansion giving a different list of codes that is both wrong and unsafe, and implementers should only use this capability reluctantly. It primarily exists to deal with situations where specifications have fallen into decay as time passes. If a  version is override, the version used SHALL explicitly be represented in the expansion parameters
     */
    @Json(name = "override")
    OVERRIDE,
  }

  /**
   * The type(s) of task performers allowed
   *
   * @see <a href="http://hl7.org/fhir/task-performer-type">TaskPerformerType</a>
   */
  public enum TaskPerformerType {

    /**
     * A workflow participant that requests services.
     */
    @Json(name = "requester")
    REQUESTER,

    /**
     * A workflow participant that dispatches services (assigns another task to a participant).
     */
    @Json(name = "dispatcher")
    DISPATCHER,

    /**
     * A workflow participant that schedules (dispatches and sets the time or date for performance of) services.
     */
    @Json(name = "scheduler")
    SCHEDULER,

    /**
     * A workflow participant that performs services.
     */
    @Json(name = "performer")
    PERFORMER,

    /**
     * A workflow participant that monitors task activity.
     */
    @Json(name = "monitor")
    MONITOR,

    /**
     * A workflow participant that manages task activity.
     */
    @Json(name = "manager")
    MANAGER,

    /**
     * A workflow participant that acquires resources (specimens, images, etc) necessary to perform the task.
     */
    @Json(name = "acquirer")
    ACQUIRER,

    /**
     * A workflow participant that reviews task inputs or outputs.
     */
    @Json(name = "reviewer")
    REVIEWER,
  }

  /**
   * The current status of the task.
   *
   * @see <a href="http://hl7.org/fhir/task-status">TaskStatus</a>
   */
  public enum TaskStatus {

    /**
     * The task is not yet ready to be acted upon.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The task is ready to be acted upon and action is sought.
     */
    @Json(name = "requested")
    REQUESTED,

    /**
     * A potential performer has claimed ownership of the task and is evaluating whether to perform it.
     */
    @Json(name = "received")
    RECEIVED,

    /**
     * The potential performer has agreed to execute the task but has not yet started work.
     */
    @Json(name = "accepted")
    ACCEPTED,

    /**
     * The potential performer who claimed ownership of the task has decided not to execute it prior to performing any action.
     */
    @Json(name = "rejected")
    REJECTED,

    /**
     * Task is ready to be performed, but no action has yet been taken.  Used in place of requested/received/accepted/rejected when request assignment and acceptance is a given.
     */
    @Json(name = "ready")
    READY,

    /**
     * The task was not completed.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * Task has been started but is not yet complete.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Task has been started but work has been paused.
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * The task was attempted but could not be completed due to some error.
     */
    @Json(name = "failed")
    FAILED,

    /**
     * The task has been completed.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The task should never have existed and is retained only because of the possibility it may have used.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * The results of executing an action.
   *
   * @see <a href="http://hl7.org/fhir/report-action-result-codes">TestReportActionResult</a>
   */
  public enum TestReportActionResult {

    /**
     * The action was successful.
     */
    @Json(name = "pass")
    PASS,

    /**
     * The action was skipped.
     */
    @Json(name = "skip")
    SKIP,

    /**
     * The action failed.
     */
    @Json(name = "fail")
    FAIL,

    /**
     * The action passed but with warnings.
     */
    @Json(name = "warning")
    WARNING,

    /**
     * The action encountered a fatal error and the engine was unable to process.
     */
    @Json(name = "error")
    ERROR,
  }

  /**
   * The type of participant.
   *
   * @see <a href="http://hl7.org/fhir/report-participant-type">TestReportParticipantType</a>
   */
  public enum TestReportParticipantType {

    /**
     * The test execution engine.
     */
    @Json(name = "test-engine")
    TEST_ENGINE,

    /**
     * A FHIR Client
     */
    @Json(name = "client")
    CLIENT,

    /**
     * A FHIR Server
     */
    @Json(name = "server")
    SERVER,
  }

  /**
   * The reported execution result.
   *
   * @see <a href="http://hl7.org/fhir/report-result-codes">TestReportResult</a>
   */
  public enum TestReportResult {

    /**
     * All test operations successfully passed all asserts
     */
    @Json(name = "pass")
    PASS,

    /**
     * One or more test operations failed one or more asserts
     */
    @Json(name = "fail")
    FAIL,

    /**
     * One or more test operations is pending execution completion
     */
    @Json(name = "pending")
    PENDING,
  }

  /**
   * The current status of the test report.
   *
   * @see <a href="http://hl7.org/fhir/report-status-codes">TestReportStatus</a>
   */
  public enum TestReportStatus {

    /**
     * All test operations have completed
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * A test operations is currently executing
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * A test operation is waiting for an external client request
     */
    @Json(name = "waiting")
    WAITING,

    /**
     * The test script execution was manually stopped
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * This test report was entered or created in error
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
  }

  /**
   * The allowable request method or HTTP operation codes.
   *
   * @see <a href="http://hl7.org/fhir/http-operations">TestScriptRequestMethodCode</a>
   */
  public enum TestScriptRequestMethodCode {

    /**
     * HTTP DELETE operation
     */
    @Json(name = "delete")
    DELETE,

    /**
     * HTTP GET operation
     */
    @Json(name = "get")
    GET,

    /**
     * HTTP OPTIONS operation
     */
    @Json(name = "options")
    OPTIONS,

    /**
     * HTTP PATCH operation
     */
    @Json(name = "patch")
    PATCH,

    /**
     * HTTP POST operation
     */
    @Json(name = "post")
    POST,

    /**
     * HTTP PUT operation
     */
    @Json(name = "put")
    PUT,
  }

  /**
   * A code that indicates how transactions are supported.
   *
   * @see <a href="http://hl7.org/fhir/transaction-mode">TransactionMode</a>
   */
  public enum TransactionMode {

    /**
     * Neither batch or transaction is supported.
     */
    @Json(name = "not-supported")
    NOT_SUPPORTED,

    /**
     * Batches are  supported.
     */
    @Json(name = "batch")
    BATCH,

    /**
     * Transactions are supported.
     */
    @Json(name = "transaction")
    TRANSACTION,

    /**
     * Both batches and transactions are supported.
     */
    @Json(name = "both")
    BOTH,
  }

  /**
   * The type of trigger
   *
   * @see <a href="http://hl7.org/fhir/trigger-type">TriggerType</a>
   */
  public enum TriggerType {

    /**
     * The trigger occurs in response to a specific named event
     */
    @Json(name = "named-event")
    NAMED_EVENT,

    /**
     * The trigger occurs at a specific time or periodically as described by a timing or schedule
     */
    @Json(name = "periodic")
    PERIODIC,

    /**
     * The trigger occurs whenever data of a particular type is added
     */
    @Json(name = "data-added")
    DATA_ADDED,

    /**
     * The trigger occurs whenever data of a particular type is modified
     */
    @Json(name = "data-modified")
    DATA_MODIFIED,

    /**
     * The trigger occurs whenever data of a particular type is removed
     */
    @Json(name = "data-removed")
    DATA_REMOVED,

    /**
     * The trigger occurs whenever data of a particular type is accessed
     */
    @Json(name = "data-accessed")
    DATA_ACCESSED,

    /**
     * The trigger occurs whenever access to data of a particular type is completed
     */
    @Json(name = "data-access-ended")
    DATA_ACCESS_ENDED,
  }

  /**
   * How a type relates to its baseDefinition.
   *
   * @see <a href="http://hl7.org/fhir/type-derivation-rule">TypeDerivationRule</a>
   */
  public enum TypeDerivationRule {

    /**
     * This definition defines a new type that adds additional elements to the base type
     */
    @Json(name = "specialization")
    SPECIALIZATION,

    /**
     * This definition adds additional rules to an existing concrete type
     */
    @Json(name = "constraint")
    CONSTRAINT,
  }

  /**
   * Codes to identify how UDI data was entered
   *
   * @see <a href="http://hl7.org/fhir/udi-entry-type">UDIEntryType</a>
   */
  public enum UDIEntryType {

    /**
     * A Barcode scanner captured the data from the device label
     */
    @Json(name = "barcode")
    BARCODE,

    /**
     * An RFID chip reader captured the data from the device label
     */
    @Json(name = "rfid")
    RFID,

    /**
     * The data was read from the label by a person and manually entered. (e.g.  via a keyboard)
     */
    @Json(name = "manual")
    MANUAL,

    /**
     * The data originated from a patient's implant card and read by an operator.
     */
    @Json(name = "card")
    CARD,

    /**
     * The data originated from a patient source and not directly scanned or read from a label or card.
     */
    @Json(name = "self-reported")
    SELF_REPORTED,

    /**
     * The method of data capture has not been determined
     */
    @Json(name = "unknown")
    UNKNOWN,
  }

  /**
   * A code that indicates whether an application accepts unknown elements or extensions when reading resources.
   *
   * @see <a href="http://hl7.org/fhir/unknown-content-code">UnknownContentCode</a>
   */
  public enum UnknownContentCode {

    /**
     * The application does not accept either unknown elements or extensions.
     */
    @Json(name = "no")
    NO,

    /**
     * The application accepts unknown extensions, but not unknown elements.
     */
    @Json(name = "extensions")
    EXTENSIONS,

    /**
     * The application accepts unknown elements, but not unknown extensions.
     */
    @Json(name = "elements")
    ELEMENTS,

    /**
     * The application accepts unknown elements and extensions.
     */
    @Json(name = "both")
    BOTH,
  }

  /**
   * A code that specifies a type of context being specified by a usage context
   *
   * @see <a href="http://hl7.org/fhir/usage-context-type">UsageContextType</a>
   */
  public enum UsageContextType {

    /**
     * The gender of the patient. For this context type, the value should be a code taken from the http://hl7.org/fhir/ValueSet/administrative-gender value set
     */
    @Json(name = "gender")
    GENDER,

    /**
     * The age of the patient. For this context type, the value should be a range the specifies the applicable ages or a code from the MeSH value set http://hl7.org/fhir/ValueSet/v3-AgeGroupObservationValue
     */
    @Json(name = "age")
    AGE,

    /**
     * The clinical concept(s) addressed by the artifact. For example, disease, diagnostic test interpretation, medication ordering as in http://hl7.org/fhir/ValueSet/condition-code.
     */
    @Json(name = "focus")
    FOCUS,

    /**
     * The clinical specialty of the context in which the patient is being treated - For example, PCP, Patient, Cardiologist, Behavioral Professional, Oral Health Professional, Prescriber, etc... taken from the NUCC Health Care provider taxonomy value set http://hl7.org/fhir/ValueSet/provider-taxonomy.
     */
    @Json(name = "user")
    USER,

    /**
     * The settings in which the artifact is intended for use. For example, admission, pre-op, etc. For example, the ActEncounterCode value set http://hl7.org/fhir/ValueSet/v3-ActEncounterCode
     */
    @Json(name = "workflow")
    WORKFLOW,

    /**
     * The context for the clinical task(s) represented by this artifact. Can be any task context represented by the HL7 ActTaskCode value set http://hl7.org/fhir/ValueSet/v3-ActTaskCode. General categories include: order entry, patient documentation and patient information review.
     */
    @Json(name = "task")
    TASK,

    /**
     * The venue in which an artifact could be used. For example, Outpatient, Inpatient, Home, Nursing home. The code value may originate from either the HL7 ActEncounterCode http://hl7.org/fhir/ValueSet/v3-ActEncounterCode or NUCC non-individual provider codes http://hl7.org/fhir/ValueSet/provider-taxonomy
     */
    @Json(name = "venue")
    VENUE,

    /**
     * The species to which an artifact applies. For example, SNOMED - 387961004 | Kingdom Animalia (organism).
     */
    @Json(name = "species")
    SPECIES,
  }

  /**
   * Complete, proposed, exploratory, other
   *
   * @see <a href="http://hl7.org/fhir/claim-use">Use</a>
   */
  public enum Use {

    /**
     * The treatment is complete and this represents a Claim for the services.
     */
    @Json(name = "complete")
    COMPLETE,

    /**
     * The treatment is proposed and this represents a Pre-authorization for the services.
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * The treatment is proposed and this represents a Pre-determination for the services.
     */
    @Json(name = "exploratory")
    EXPLORATORY,

    /**
     * A locally defined or otherwise resolved status.
     */
    @Json(name = "other")
    OTHER,
  }

  /**
   * A coded concept listing the base codes.
   *
   * @see <a href="http://hl7.org/fhir/vision-base-codes">VisionBase</a>
   */
  public enum VisionBase {

    /**
     * top
     */
    @Json(name = "up")
    UP,

    /**
     * bottom
     */
    @Json(name = "down")
    DOWN,

    /**
     * inner edge
     */
    @Json(name = "in")
    IN,

    /**
     * outer edge
     */
    @Json(name = "out")
    OUT,
  }

  /**
   * A coded concept listing the eye codes.
   *
   * @see <a href="http://hl7.org/fhir/vision-eye-codes">VisionEyes</a>
   */
  public enum VisionEyes {

    /**
     * Right Eye
     */
    @Json(name = "right")
    RIGHT,

    /**
     * Left Eye
     */
    @Json(name = "left")
    LEFT,
  }

  /**
   * How a search parameter relates to the set of elements returned by evaluating its xpath query.
   *
   * @see <a href="http://hl7.org/fhir/search-xpath-usage">XPathUsageType</a>
   */
  public enum XPathUsageType {

    /**
     * The search parameter is derived directly from the selected nodes based on the type definitions.
     */
    @Json(name = "normal")
    NORMAL,

    /**
     * The search parameter is derived by a phonetic transform from the selected nodes.
     */
    @Json(name = "phonetic")
    PHONETIC,

    /**
     * The search parameter is based on a spatial transform of the selected nodes.
     */
    @Json(name = "nearby")
    NEARBY,

    /**
     * The search parameter is based on a spatial transform of the selected nodes, using physical distance from the middle.
     */
    @Json(name = "distance")
    DISTANCE,

    /**
     * The interpretation of the xpath statement is unknown (and can't be automated).
     */
    @Json(name = "other")
    OTHER,
  }
}

