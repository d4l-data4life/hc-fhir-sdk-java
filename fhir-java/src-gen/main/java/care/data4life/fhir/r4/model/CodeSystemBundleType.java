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
 * Indicates the purpose of a bundle - how it is intended to be used.
 *
 * @see <a href="http://hl7.org/fhir/bundle-type">BundleType</a>
 */
public enum CodeSystemBundleType {

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
	* The bundle is a set of actions - intended to be processed by a server as a group of independent actions.
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
	* The bundle is a set of resources collected into a single package for ease of distribution that imposes no processing obligations or behavioral rules beyond persistence.
	*/
	@Json(name = "collection")
	COLLECTION,
}
