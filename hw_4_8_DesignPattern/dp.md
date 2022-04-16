### 1) What are the types of design patterns in Java?
___
Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development. These solutions were obtained by trial and error by numerous software developers over quite a substantial period of time.

### 2) What are the SOLID Principles?
___
SOLID principles are object-oriented design concepts relevant to software development. SOLID is an acronym for five other class-design principles: Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle.

**Single Responsibility Principle** : Each class should be responsible for a single part or functionality of the system.

**Open-Closed Principle** : Software components should be open for extension, but not for modification.

**Liskov Substitution Principle** : Objects of a superclass should be replaceable with objects of its subclasses without breaking the system

**Interface Segregation Principle** : No client should be forced to depend on methods that it does not use.

**Dependency Inversion Principle** : High-level modules should not depend on low-level modules, both should depend on abstractions.

### 3) How can you achieve thread-safe singleton patterns in Java?
___
There are three ways through which we can achieve thread safety.

a) Create the instance variable at the time of class loading.

b) Synchronize the getInstance() method.

c) Use synchronized block inside the if loop and volatile variable

### 4) What do you understand by the Open-Closed Principle (OCP)?
___
The Open-Closed Principle (OCP) states that software entities (classes, modules, methods, etc.) should be open for extension, but closed for modification.

In practice, this means creating software entities whose behavior can be changed without the need to edit and recompile the code itself. The simplest way to demonstrate this principle is to consider a method that does one thing. Let's say it writes to a particular file, the name of which is hard-coded into the method. If the requirements change, and the filename now needs to be different in certain situations, we must open up the method to change the filename. If, on the other hand, the filename had been passed in as a parameter, we would be able to modify the behavior of this method without changing its source, keeping it closed to modification.

The Open-Closed Principle can also be achieved in many other ways, including through the use of inheritance or through compositional design patterns like the Strategy pattern.