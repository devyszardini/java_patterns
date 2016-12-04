Abstract factory is used to create families of dependant or relate objects, independently from the application and the family selection is known at run time only.
It is composed by a family factory interface, which contains stubs for each object creation, and a concrete implementation for each family.
Also an interface for each object, which will be implemented in each family.
The client will use teh family factory to excute the creation of each object in each family, assigning a new factory implementation allow the creation of different families.
