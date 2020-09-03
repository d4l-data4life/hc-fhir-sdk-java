# These are settings for the FHIR class generator.
# All paths are relative to the `fhir-parser` directory. You can use '/' to
# indicate directories: the parser will split them on '/' and use os.path to
# make them platform independent.

from Default.settings import *
from mappings import *

# Base URL for where to load specification data from
specification_url = 'https://hl7.org/fhir/STU3/'

# In which directory to find the templates. See below for settings that start with `tpl_`: these are the template names.
tpl_base = 'templates'

# Whether and where to put the generated class models
write_resources = True
tpl_resource_source = 'template-resource.java'  # the template to use as source when writing resource implementations for profiles
tpl_resource_target = 'models'  # target directory to write the generated class files to
tpl_resource_target_ptrn = '{}.java'  # where to write the generated class files to, with one "{}" placeholder for the class name
tpl_codesystems_source = 'template-codesystems.java'  # the template to use as source when writing enums for CodeSystems; can be `None`
tpl_codesystems_target_name = 'CodeSystems.java'  # the filename to use for the generated code systems and value sets (in `tpl_resource_target`)

# Whether and where to put the factory methods
write_factory = True
tpl_factory_source = 'template-elementfactory.java'          # the template to use for factory generation
tpl_factory_target = 'models/FhirElementFactory.java'                               # where to write the generated factory to

write_dependencies = False
# tpl_dependencies_source = 'template-dependencies.json'     # template used to render the JSON dependency graph
# tpl_dependencies_target = '../dependencies.json'           # write dependency JSON to project root

# Whether and where to write unit tests
write_unittests = True
tpl_unittest_source = 'template-unittest.java'  # the template to use for unit test generation
tpl_unittest_target = 'tests'  # target directory to write the generated unit test files to
tpl_unittest_target_ptrn = '{}Test.java'  # a pattern to determine the output files for unit tests; the one placeholder will be the class name
unittest_copyfiles = [                              # array of file names to copy to the test directory `tpl_unittest_target` (e.g. unit test base classes)
]
write_unittests_factory = True
tpl_unittest_factory_source = 'template-unittest-factory.java'  # the template to use for unit test generation
tpl_unittest_factory_target_ptrn = '{}.java'  # where to write the generated class files to, with one "{}" placeholder for the class name
tpl_unittest_factory_target = 'tests'  # target directory to write the generated unit test files to




unittest_format_path_prepare = '{}'      # used to format `path` before appending another path element - one placeholder for `path`
unittest_format_path_key = '{}.{}'        # used to create property paths by appending `key` to the existing `path` - two placeholders
unittest_format_path_index = '{}.get({})'    # used for array properties - two placeholders, `path` and the array index

# Settings for classes and resources
default_base = {}
resource_modules_lowercase = False          # whether all resource paths (i.e. modules) should be lowercase
camelcase_classes = True                    # whether class name generation should use CamelCase
camelcase_enums = True                      # whether names for enums should be camelCased
backbone_class_adds_parent = True           # if True, backbone class names prepend their parent's class name

# All these files should be copied to dirname(`tpl_resource_target_ptrn`): tuples of (path/to/file, module, array-of-class-names)
    # ('src/main/java/de/gesundheitscloud/fhir/stu3/model/base/FhirAbstractResource.java', None, ['FhirAbstractResource']),
manual_profiles = [
    ('templates/Placeholder.java', None, [
        'date', 'dateTime', 'instant', 'time',
    ]),
    ('templates/Base64Binary.java', None, [
        'base64Binary',
    ]),
    ('templates/FhirBoolean.java', None, [
        'boolean',
    ]),
    ('templates/FHIRDecimal.java', None, [
        'decimal',
    ]),
    ('templates/FHIRInteger.java', None, [
        'integer', 'positiveInt', 'unsignedInt',
    ]),
]
