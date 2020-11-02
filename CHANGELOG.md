# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [Unreleased](https://github.com/d4l-data4life/hc-fhir-sdk-java/compare/0.7.0...main)
### Added
- Add FHIR R4 generated models
- Add parser config for FHIR R4 model generation
- Add Encounter to supported models
### Changed
- Breaking: CodeSystems are now splitted into single classes
- Breaking: Moved STU3 models into `fhir.stu3.model` package
### Removed
### Fixed
### Updated
- Updated timezone implementation to reflect the time correctly during daylight saving time
- Update fhir-parser to use support FHIR R4 model generation
### Bumped
- Gradle 5.2.1 -> 6.7
- Gradle Dependency Updated Plugin 0.20.0 -> 0.34.0
- AndroidStudio 3.3.1 -> 4.1


### Migration
