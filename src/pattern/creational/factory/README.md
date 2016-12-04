The factory pattern helps in the creation of object which nature is known only at runtime, or it needs to be delegated to the subclasses.
It is composed by an abstract class representing different objects, and one extension of it for each object to be created.
Also another abstract class representing a common factory. And an extension of teh factory for each object to be created.
The client will create an abstrac factory and abstract object to be used with the creataion of many object, differing in nature, at runtime 
