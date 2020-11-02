# Migration guide

This file will contain information to help you migrate from one version
to another.

## Migrate from Version 0.7.0 to 1.0.0

In version 0.7.0 the `CodeSystems` was a big `enum` that contains the
individual `CodeSystems` for the different classes. With the new version
1.0.0 the `CodeSystems` are now stand alone classes.

In detail the change for the CodeSystems looks like the following:

```
// v0.7.0 
public class CodeSystems {

    public enum AbstractType {}
    public enum AccountStatus {}
    ...
    public enum AddressType {}
    ...
}
```

In version 1.0.0 each CodeSystem will be it's own standalone enum class
with the naming pattern `CodeSystem...` e.g.

```
// v1.0.0 
public enum CodeSystemAbstracType { }    
public enum CodeSystemAccountStatus { }
public enum CodeSystemAddressType { }
```

In case you made use of the `CodeSystems` you need to update the imports
to th specific CodeSystem class.
```
CodeSystems.AbstractType.ANY -> CodeSystemAbstractType.ANY
CodeSystems.AccountStatus.INACTIVE -> CodeSystemAccountStatus.INACTIVE
...
CodeSystems.AddressType.POSTAL -> CodeSystemAddressType.POSTAL
...
```
