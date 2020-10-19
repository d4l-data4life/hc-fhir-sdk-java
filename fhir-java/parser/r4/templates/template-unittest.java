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


import javax.annotation.Nullable;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.Date;

import care.data4life.fhir.r4.FhirR4Parser;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.*;

/**
 * {{ class.name }}Test.java
 *
 * {{ class.short }}.
 * {%- if class.formal %}
 * {{ class.formal }}
 * {%- endif %}
 *
 * "Generated from FHIR {{ info.version }} on {{ info.date }}
 */
public class {{ class.name }}Test {

	FhirR4Parser parser = new FhirR4Parser();

	{%- for tcase in tests %}

    @Test
	public void test{{ class.name }}{{ loop.index }}() throws Exception {
		String sourceJson = FileHelper.loadString("{{ tcase.filename }}");
		{{ class.name }} data = parser.toFhir({{ class.name }}.class , sourceJson);
		{% for onetest in tcase.tests -%}
		{%- if onetest.enum %}
		assertEquals(data.{{ onetest.path }}, CodeSystem{{ onetest.enum }}.
		{%- if onetest.value == "=" -%}
		EQUAL
		{%- else -%}
		{%- if onetest.value == "!=" -%}
		NOT_EQUAL
		{%- else -%}
		{%- if onetest.value == "<" -%}
		LESS_THAN
		{%- else -%}
		{%- if onetest.value == "<=" -%}
		LESS_OR_EQUAL
		{%- else -%}
		{%- if onetest.value == ">" -%}
		GREATER_THAN
		{%- else -%}
		{%- if onetest.value == ">=" -%}
		GREATER_OR_EQUAL
		{%- else -%}
		{%- if onetest.value == "*" -%}
		MAX
		{%- else -%}
		{{ onetest.value.upper()|replace('-', '_') }}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %});
		{%- else %}{% if "String" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}, "{{ onetest.value|replace('"', '\\"') }}");
		{%- else %}{% if "FhirDecimal" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}.toString(), "{{ onetest.value }}");
		{%- else %}{% if "Double" == onetest.klass.name %}
        assertTrue(data.{{ onetest.path }} == {{ onetest.value }}d);
		{%- else %}{% if "Integer" == onetest.klass.name %}
        assertTrue(data.{{ onetest.path }} == {{ onetest.value }});
		{%- else %}{% if "Boolean" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}, {% if onetest.value %}true{% else %}false{% endif %});
		{%- else %}{% if "FhirDate" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}{% if not onetest.array_item %}{% endif %}.toString(), "{{ onetest.value }}");
		{%- else %}{% if "FhirDateTime" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}{% if not onetest.array_item %}{% endif %}.toString(), "{{ onetest.value }}");
		{%- else %}{% if "FhirInstant" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}{% if not onetest.array_item %}{% endif %}.toString(), "{{ onetest.value }}");
		{%- else %}{% if "FhirTime" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}{% if not onetest.array_item %}{% endif %}.toString(), "{{ onetest.value }}");
		{%- else %}{% if "URL" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}.toString(), "{{ onetest.value }}");
		{%- else %}{% if "Base64Binary" == onetest.klass.name %}
		assertEquals(data.{{ onetest.path }}, Base64Binary(value: "{{ onetest.value }}"));
		{%- else %}
		// Don't know how to create unit test for "{{ onetest.path }}", which is a {{ onetest.klass.name }}
		{%- endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}
		{%- endfor %}

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}
	{%- endfor %}
}
