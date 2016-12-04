Prototype pattern allows to dynamically change object creation type.
Similar to the factory pattern it differ in the use of clone method to deliver the instance.
It is composed by an abstract object, representing each object, and each object will extend that abstraction.
Also a cloning tool which will set an abstraction with a concreate object, and get a clone of that object, allowing to change the object at run time.
The client will create the first object, and create an abstraction of it with teh cloning tool, and returning a clone, which can be used at run time to be changed using the same tool.
