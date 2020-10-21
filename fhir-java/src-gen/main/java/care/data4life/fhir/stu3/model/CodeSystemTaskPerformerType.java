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
 * The type(s) of task performers allowed
 *
 * @see <a href="http://hl7.org/fhir/task-performer-type">TaskPerformerType</a>
 */
public enum CodeSystemTaskPerformerType {

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
