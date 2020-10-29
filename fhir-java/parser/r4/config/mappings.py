# Mappings for the FHIR class generator

# Which class names to map to resources and elements. Classes not listed here
# will not be mapped, i.e. their (uppercased) FHIR name will be the class name
classmap = {
    'Any': 'Resource',
    'Practitioner.role': 'PractRole',   # to avoid Practinioner.role and PractitionerRole generating the same class

    'boolean': 'Boolean',
    'decimal': 'FhirDecimal',
    'integer': 'Integer',
    'positiveInt': 'Integer',
    'unsignedInt': 'Integer',

    'string': 'String',
    'code': 'String',       # we're not generating enums for all codes
    'markdown': 'String',
    'xhtml': 'String',

    'id': 'String',
    'oid': 'String',
    'uuid': 'String',
    'uri': 'String',
    'url': 'String',

    'base64Binary': 'String',

    'date': 'FhirDate',
    'time': 'FhirTime',
    'dateTime': 'FhirDateTime',
    'instant': 'FhirInstant'
}

# Classes of properties to be replaced with different ones at resource rendering time
replacemap = {}

# Which class names in use for properties are native to the language (or can
# be treated this way)
natives = ['Boolean', 'Integer', 'Double', 'Float', 'Date']

# Which JSON type (dict value) is expected for a given class (dict key)
jsonmap = {
}
jsonmap_default = 'FHIRJSON'

# Properties that need to be renamed because of language keyword conflicts
reservedmap = {
    'class': 'clazz',
    'abstract': 'abstrakt',
    'package': 'fhirPackage'
}

# For enum codes where a computer just cannot generate reasonable names
enum_map = {
    '=': 'EQUAL',
    '!=': 'NOT_EQUAL',
    '<': 'LESS_THAN',
    '<=': 'LESS_OR_EQUAL',
    '>': 'GREATER_THAN',
    '>=': 'GREATER_OR_EQUAL',
    '*': 'MAX'
}

# If you want to give specific names to enums based on their URI
enum_namemap = {
    'http://hl7.org/fhir/contracttermsubtypecodes': 'ContractTermSubtypeCodes',
    'http://hl7.org/fhir/coverage-exception': 'CoverageExceptionCodes',
    'http://hl7.org/fhir/resource-type-link': 'ResourceTypeLink',
}
