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
 * Codes to identify how UDI data was entered
 *
 * @see <a href="http://hl7.org/fhir/udi-entry-type">UDIEntryType</a>
 */
public enum CodeSystemUDIEntryType {

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
     * The data originated from a patient source and not directly scanned or read from a label or
     * card.
     */
    @Json(name = "self-reported")
    SELF_REPORTED,

    /**
     * The method of data capture has not been determined
     */
    @Json(name = "unknown")
    UNKNOWN,
}
