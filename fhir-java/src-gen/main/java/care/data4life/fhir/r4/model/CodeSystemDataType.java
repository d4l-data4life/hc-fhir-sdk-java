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
 * A version specific list of the data types defined by the FHIR specification for use as an element
 * type (any of the FHIR defined data types).
 *
 * @see <a href="http://hl7.org/fhir/data-types">DataType</a>
 */
public enum CodeSystemDataType {

    /**
     * An address expressed using postal conventions (as opposed to GPS or other location definition
     * formats).  This data type may be used to convey addresses for use in delivering mail as well
     * as for visiting locations which might not be valid for mail delivery.  There are a variety of
     * postal address formats defined around the world.
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
     * Base definition for all elements that are defined inside a resource - but not those in a data
     * type.
     */
    @Json(name = "BackboneElement")
    BACKBONEELEMENT,

    /**
     * A concept that may be defined by a formal reference to a terminology or ontology or may be
     * provided by text.
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
     * Details for all kinds of technology mediated contact points for a person or organization,
     * including telephone, email, etc.
     */
    @Json(name = "ContactPoint")
    CONTACTPOINT,

    /**
     * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and
     * endorsers.
     */
    @Json(name = "Contributor")
    CONTRIBUTOR,

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts
     * include amounts that are not precisely quantified, including amounts involving arbitrary
     * units and floating currencies.
     */
    @Json(name = "Count")
    COUNT,

    /**
     * Describes a required data item for evaluation in terms of the type of data, and optional code
     * or date-based filters of the data.
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
     * A expression that is evaluated in a specified context and returns a value. The context of use
     * of the expression must specify the context in which the expression is evaluated, and how the
     * result of the expression is used.
     */
    @Json(name = "Expression")
    EXPRESSION,

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
     * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for
     * business identifiers.
     */
    @Json(name = "Identifier")
    IDENTIFIER,

    /**
     * The marketing status describes the date when a medicinal product is actually put on the
     * market or the date as of which it is no longer available.
     */
    @Json(name = "MarketingStatus")
    MARKETINGSTATUS,

    /**
     * The metadata about a resource. This is content in the resource that is maintained by the
     * infrastructure. Changes to the content might not always be associated with version changes to
     * the resource.
     */
    @Json(name = "Meta")
    META,

    /**
     * An amount of economic utility in some recognized currency.
     */
    @Json(name = "Money")
    MONEY,

    /**
     * moneyQuantity
     */
    @Json(name = "MoneyQuantity")
    MONEYQUANTITY,

    /**
     * A human-readable summary of the resource conveying the essential clinical and business
     * information for the resource.
     */
    @Json(name = "Narrative")
    NARRATIVE,

    /**
     * The parameters to the module. This collection specifies both the input and output parameters.
     * Input parameters are provided by the caller as part of the $evaluate operation. Output
     * parameters are included in the GuidanceResponse.
     */
    @Json(name = "ParameterDefinition")
    PARAMETERDEFINITION,

    /**
     * A time period defined by a start and end date and optionally time.
     */
    @Json(name = "Period")
    PERIOD,

    /**
     * A populatioof people with some set of grouping criteria.
     */
    @Json(name = "Population")
    POPULATION,

    /**
     * The marketing status describes the date when a medicinal product is actually put on the
     * market or the date as of which it is no longer available.
     */
    @Json(name = "ProdCharacteristic")
    PRODCHARACTERISTIC,

    /**
     * The shelf-life and storage information for a medicinal product item or container can be
     * described using this class.
     */
    @Json(name = "ProductShelfLife")
    PRODUCTSHELFLIFE,

    /**
     * A measured amount (or an amount that can potentially be measured). Note that measured amounts
     * include amounts that are not precisely quantified, including amounts involving arbitrary
     * units and floating currencies.
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
     * Related artifacts such as additional documentation, justification, or bibliographic
     * references.
     */
    @Json(name = "RelatedArtifact")
    RELATEDARTIFACT,

    /**
     * A series of measurements taken by a device, with upper and lower limits. There may be more
     * than one dimension in the data.
     */
    @Json(name = "SampledData")
    SAMPLEDDATA,

    /**
     * A signature along with supporting context. The signature may be a digital signature that is
     * cryptographic in nature, or some other signature acceptable to the domain. This other
     * signature may be as simple as a graphical image representing a hand-written signature, or a
     * signature ceremony Different signature approaches have different utilities.
     */
    @Json(name = "Signature")
    SIGNATURE,

    /**
     * simpleQuantity
     */
    @Json(name = "SimpleQuantity")
    SIMPLEQUANTITY,

    /**
     * Chemical substances are a single substance type whose primary defining element is the
     * molecular structure. Chemical substances shall be defined on the basis of their complete
     * covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water,
     * alcohols) is also captured. Purity, grade, physical form or particle size are not taken into
     * account in the definition of a chemical substance or in the assignment of a Substance ID.
     */
    @Json(name = "SubstanceAmount")
    SUBSTANCEAMOUNT,

    /**
     * Specifies an event that may occur multiple times. Timing schedules are used to record when
     * things are planned, expected or requested to occur. The most common usage is in dosage
     * instructions for medications. They are also used when planning care of various kinds, and may
     * be used for reporting the schedule to which past regular activities were carried out.
     */
    @Json(name = "Timing")
    TIMING,

    /**
     * A description of a triggering event. Triggering events can be named events, data events, or
     * periodic, as determined by the type element.
     */
    @Json(name = "TriggerDefinition")
    TRIGGERDEFINITION,

    /**
     * Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or
     * categorize an artifact. This metadata can either be specific to the applicable population
     * (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting,
     * provider of care).
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
     * A URI that is a reference to a canonical URL on a FHIR resource
     */
    @Json(name = "canonical")
    CANONICAL,

    /**
     * A string which has at least one character and no leading or trailing whitespace and where
     * there is no whitespace other than single spaces in the contents
     */
    @Json(name = "code")
    CODE,

    /**
     * A date or partial date (e.g. just year or year + month). There is no time zone. The format is
     * a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
     */
    @Json(name = "date")
    DATE,

    /**
     * A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are
     * specified, a time zone SHALL be populated. The format is a union of the schema types gYear,
     * gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but
     * may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
     */
    @Json(name = "dateTime")
    DATETIME,

    /**
     * A rational number with implicit precision
     */
    @Json(name = "decimal")
    DECIMAL,

    /**
     * Any combination of letters, numerals, "-" and ".", with a length limit of 64 characters.
     * (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets
     * these constraints.)  Ids are case-insensitive.
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
     * A string that may contain Github Flavored Markdown syntax for optional processing by a mark
     * down presentation engine
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
     * A URI that is a literal reference
     */
    @Json(name = "url")
    URL,

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
