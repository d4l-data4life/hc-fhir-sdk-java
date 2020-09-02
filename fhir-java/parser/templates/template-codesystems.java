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
 * Generated from FHIR {{ info.version }} on {{ info.date }}
 */
public class CodeSystems {
	{% for system in systems %}{% if system.generate_enum %}
	/**
	 * {{ system.definition.description }}
	 *
	 * @see <a href="{{ system.url }}">{{ system.name }}</a>
	 */
	public enum {{ system.name }} {
		{%- for code in system.codes %}

		/**
		 * {{ code.definition }}
		 */
		@Json(name = "{{code.code}}")
		{%- if code.code == "=" %}
		EQUAL,
		{%- else %}
		{%- if code.code == "<" %}
		LESS_THAN,
		{%- else %}
		{%- if code.code == "<=" %}
		LESS_OR_EQUAL,
		{%- else %}
		{%- if code.code == ">" %}
		GREATER_THAN,
		{%- else %}
		{%- if code.code == ">=" %}
		GREATER_OR_EQUAL,
		{%- else %}
		{%- if code.code == "*" %}
		MAX,
		{%- else %}
		{{ code.code.upper()|replace('-', '_') }},
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}

		{%- endfor %}
	}
	{% endif %}{% endfor %}
}


