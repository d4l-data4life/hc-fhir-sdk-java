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
 * Operation Outcome codes used by FHIR test servers (see Implementation file translations.xml)
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/operation-outcome">OperationOutcomeCodes</a>
 */
public enum CodeSystemOperationOutcomeCodes {

	/**
	* DELETE_MULTIPLE_MATCHES
	*/
	@Json(name = "DELETE_MULTIPLE_MATCHES")
	DELETE_MULTIPLE_MATCHES,

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
	* MSG_NO_EXIST
	*/
	@Json(name = "MSG_NO_EXIST")
	MSG_NO_EXIST,

	/**
	* MSG_NO_MATCH
	*/
	@Json(name = "MSG_NO_MATCH")
	MSG_NO_MATCH,

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
	* SEARCH_NONE
	*/
	@Json(name = "SEARCH_NONE")
	SEARCH_NONE,

	/**
	* UPDATE_MULTIPLE_MATCHES
	*/
	@Json(name = "UPDATE_MULTIPLE_MATCHES")
	UPDATE_MULTIPLE_MATCHES,
}
