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

import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nullable;

{%- for klass in classes %}

/**
 * {{ profile.targetname }}.java
 * {%- if klass.formal %}
 * {{ klass.formal }}
 * {%- else  %}{%- if klass.short %}
 * {{ klass.short }}
 * {% endif %}{%- endif %}
 * @see <a href="{{ profile.url }}">{{ profile.targetname }}</a>
 *
 * Generated from FHIR {{ info.version }} ({{ profile.url }}) on {{ info.date }}
 */
public {% if not loop.first %}static {% endif %}class {{ klass.name }}{% if klass.superclass.name %} extends {{ klass.superclass.name}} {% endif %}{% if klass.name == "Element" or klass.name == "Resource" %} extends FhirR4Base{% endif %} {

	public static final String resourceType = "{{ klass.name }}";

{%- for prop in klass.properties %}
  {% if prop.enum %}
	// {{ prop.formal }}
    {%- if prop.enum.restricted_to %}
	// Only use: {{ prop.enum.restricted_to }}
    {%- endif %}
  {%- else %}
	// {{ prop.short }}.
  {%- endif %}
    @Json(name = "{{prop.orig_name}}")
	{%- if prop.nonoptional %}
	{%- if prop.one_of_many %}
	@Nullable
    {%- endif %}
	{%- else %}
	@Nullable
    {%- endif %}
	public {% if prop.is_array %}List<{% endif %}{% if prop.enum %}CodeSystem{% endif %}{{ prop.enum.name or prop.class_name }}{% if prop.is_array %}>{% endif %} {{ prop.name }};
{%- endfor %}

    {% if klass.has_nonoptional %}
	/**
	 * Constructor for all required properties.
	 * {%- for nonop in klass.nonexpanded_nonoptionals %}
	 * {%- if nonop.one_of_many %} @param {{ nonop.one_of_many }} as one of{% for expanded in klass.expanded_nonoptionals[nonop.one_of_many] %}{%- if not loop.first %},{% endif %} {{ expanded.class_name }}{%- endfor -%}
	 * {%- else %} @param {{ nonop.name }} {% if nonop.is_array %}List of {% endif %}{% if nonop.enum %}CodeSystem{% endif %}{{ nonop.enum.name or nonop.class_name }}{%- endif %}
	 * {%- endfor %}
	 */
	public {{ klass.name }}(
		{%- for nonop in klass.nonexpanded_nonoptionals %}
		{%- if not loop.first %}, {% endif -%}
		{%- if nonop.one_of_many -%}
		Object {{ nonop.one_of_many }}
		{%- else -%}
		{% if nonop.is_array %}List<{% endif %}{% if nonop.enum %}CodeSystem{% endif %}{{ nonop.enum.name or nonop.class_name }}{% if nonop.is_array %}>{% endif %} {{ nonop.name }}
		{%- endif -%}
		{%- endfor -%}
	) {
		{%- for nonop in klass.nonexpanded_nonoptionals %}
		{%- if nonop.one_of_many %}{% for expanded in klass.expanded_nonoptionals[nonop.one_of_many] %}
		{% if not loop.first %}else {% endif -%}
		if ({{ nonop.one_of_many }} instanceof {{ expanded.class_name }}) {
			this.{{ expanded.name }} = ({{ expanded.class_name }}) {{ nonop.one_of_many }};
		}
		{%- endfor %}
		else {
			//FIXME Type: (of: {{ nonop.one_of_many }})) for property ({{ nonop.one_of_many }}) is invalid, ignoring")
		}
		{%- else %}
		this.{{ nonop.name }} = {{ nonop.name }};
		{%- endif %}
		{%- endfor %}
	}
	{%- else %}
	public {{ klass.name }}() {
	}
	{% endif -%}

	@Override
	public String getResourceType() {
		return {{ klass.name }}.resourceType;
	}

{% if not loop.first %}
}
{% endif %}
{% endfor %}
}
