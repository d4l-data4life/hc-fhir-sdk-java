require "fileutils"

module Fastlane
  module Actions
    class FhirJavaR4Action < Action
      def self.run(params)
        cleanup
        generate_fhir_models
        integrate_fhir_models
        cleanup
      end

      def self.generate_fhir_models
          fhir_parser = './fhir-spec-parser'
          resources_path = './fhir-java/parser'

          # Configure our mappings
          FileUtils.copy("#{resources_path}/r4/config/mappings.py", "#{fhir_parser}/mappings.py")
          FileUtils.copy("#{resources_path}/r4/config/settings.py", "#{fhir_parser}/settings.py")
          FileUtils.copy_entry("#{resources_path}/r4/templates", "#{fhir_parser}/templates")

          # Create a cache for the FHIR r4 JSON models
          cache_r4_src = File.join('.', 'fhir-spec', 'hl7.org','fhir','r4')
          cache_r4_dst = File.join(fhir_parser, "downloads")
          FileUtils.mkdir(cache_r4_dst)
          FileUtils.copy(File.join(cache_r4_src, "version.info"), cache_r4_dst)
          Zip::File.open(File.join(cache_r4_src, "examples-json.zip")) do |zipfile|
            zipfile.each do |f|
              zipfile.extract(f, File.join(cache_r4_dst, f.name))
            end
          end

          # Generate files
          Dir.chdir("#{fhir_parser}") do
            sh "test -d venv || python3 -m venv venv"
            sh "venv/bin/pip install -Ur requirements.txt"
            sh "venv/bin/python generate.py --cache-only"
          end

          UI.success "Done generating FHIR R4 models ✅"
      end

      def self.cleanup
          fhir_parser = './fhir-spec-parser'

          # Remove tmp files
          sh "rm -rf #{fhir_parser}/templates"
          sh "rm -rf #{fhir_parser}/models"
          sh "rm -rf #{fhir_parser}/tests"
          sh "rm -rf #{fhir_parser}/dependencies.json"
          sh "rm -rf #{fhir_parser}/mappings.py"
          sh "rm -rf #{fhir_parser}/settings.py"
          sh "rm -rf #{fhir_parser}/downloads"

          UI.success "Done cleanup ✅"
      end

	  # Hotfix for https://gesundheitscloud.atlassian.net/browse/SDK-576
	  # TODO Remove once the Spec is fixed
      def self.includeStatics
          modelSource = "./fhir-java/parser/r4/statics"
          modelTarget = "./fhir-java/src-gen/main/java/care/data4life/fhir/r4/model"

          sh "cp #{modelSource}/CodeSystemMedicationStatementStatusCodes.java #{modelTarget}"
          sh "cp #{modelSource}/MedicationStatement.java #{modelTarget}"
      end


      def self.integrate_fhir_models
          fhir_parser = './fhir-spec-parser'
          file_type = ".java"

          modelSource = "#{fhir_parser}/models/*"
          testSource = "#{fhir_parser}/tests/*"

          modelTarget = "./fhir-java/src-gen/main/java/care/data4life/fhir/r4/model"
          testTarget = "./fhir-java/src-gen/test/java/care/data4life/fhir/r4/model"
          testJsonTarget = "./fhir-java/src-gen/test/resources/r4"


          # Define filenames to include
          base = ["FhirElementFactory"]
          complex = ["Ratio", "Period", "Range", "Attachment", "Identifier", "HumanName", "Annotation", "Address", "ContactPoint", "SampledData", "Money", "Count", "Duration", "Quantity", "Distance", "Age", "CodeableConcept", "Signature", "Coding", "Timing", "Element"]
          special = ["Reference", "Narrative", "Extension", "Resource", "Meta"]
          enum = Dir[ modelSource ].select{ |f| f[/CodeSystem+/] }.map{ |f| File.basename(f, '.*') }
          model = [
              "BackboneElement",
              "DocumentReference",
              "DomainResource",
              "Observation",
              "DiagnosticReport",
              "Organization",
              "Practitioner",
              "PractitionerRole",
              "ProcedureRequest",
              "Specimen",
              "FamilyMemberHistory",
              "Provenance",
              "Substance",
              "Condition",
              "CarePlan",
              "Patient",
              "Medication",
              "MedicationRequest",
              "MedicationStatement",
              "Dosage",
              "CareTeam",
              "Goal",
              "Questionnaire",
              "QuestionnaireResponse",
              "ContactDetail",
              "UsageContext",
              "ReferralRequest",
              "ValueSet",
              "Procedure",
              "Encounter", "Contributor", "DataRequirement", "Expression", "ParameterDefinition", "RelatedArtifact", "TriggerDefinition", "Location", "ServiceRequest"
          ]

          # FIXME
          # model = IO.readlines('./config/fhir_whitelist.txt')


          # Create test groups
          complexTest = genTestList(complex)
          specialTest = genTestList(special)
          enumTest = genTestList(enum)
          modelTest = genTestList(model)


          # Remove old models
          sh "rm -rf #{modelTarget}"
          sh "rm -rf #{testTarget}"


          # Change model package and imports
          # TODO nice to have

          # Move models
          movefiles(modelSource, "#{modelTarget}", base, file_type)
          movefiles(modelSource, "#{modelTarget}", complex, file_type)
          movefiles(modelSource, "#{modelTarget}", special, file_type)
          movefiles(modelSource, "#{modelTarget}", enum, file_type)
          movefiles(modelSource, "#{modelTarget}", model, file_type)


          # Move tests
          movefiles(testSource, "#{testTarget}", complexTest, file_type)
          movefiles(testSource, "#{testTarget}", specialTest, file_type)
          movefiles(testSource, "#{testTarget}", enumTest, file_type)
          movefiles(testSource, "#{testTarget}", modelTest, file_type)


          # Move test example jsons
          FileUtils.mkdir_p(testJsonTarget)
          sh "find #{fhir_parser}/downloads -name '*example*' -exec cp {} #{testJsonTarget} \\;"

          # Static fixes
          includeStatics()

          UI.success "Done integrating generated models ✅"
      end

      def self.genTestList(list)
          tests = []
          for item in list
              tests.push("#{item}Test")
          end
          return tests
      end

      def self.change_package(file, target)
        sh "find . -name Schedule.java -print | xargs perl -i -pe 's/care\.data4life\.fhir\.r4\.model/care\.data4life\.fhir\.r4\.model\.#{target}/g'"
      end

      def self.change_imports()
      end

      def self.movefiles(source, target, whitelist, file_type)
          #Ui.message("Moving files into " + target + " folder")
          FileUtils.mkdir_p(target)

          Dir.glob(source) do |item|
            if item.include? file_type
              classname = File.basename(item, file_type)
              UI.message "#{classname}"
              if whitelist.include? classname
                FileUtils.mv(item, target, force: true)
              end
            end
          end
      end

      def self.fetch_group(main_group, group)
          return main_group.find_subpath(group, true) || main_group.new_group(group)
      end

      #####################################################
      # @!group Documentation
      ####################################################

      def self.description
          "Generates and integrates custom FHIR models for Swift from the JSON examples"
      end

      def self.output
          []
      end

      def self.is_supported?(platform)
          true
      end

    end
  end
end
