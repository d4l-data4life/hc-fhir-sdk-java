ASCIIDOCTOR := $(shell command -v asciidoctor 2> /dev/null)

gen-java:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	bundle exec fastlane generate_fhir_java_models

gen-doc:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	bundle exec fastlane generate_fhir_model_doc

render-doc:
	./gradlew clean asciidoctor

docu:
	rm -rf fhir-spec-parser
	git submodule update --init --recursive
	bundle exec fastlane generate_fhir_model_doc
	./gradlew clean asciidoctor


### Setup

setup: _setup_asciidoctor

# Asciidoctor setup
_setup_asciidoctor:
	@echo "Checking asciidoctor"
ifndef ASCIIDOCTOR
	bundle install
endif

