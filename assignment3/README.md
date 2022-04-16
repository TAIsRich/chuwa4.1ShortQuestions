# What are the types of design patterns in Java?

In core java, there are mainly three types of design patterns, which are further divided into their sub-parts:

1.Creational Design Pattern

Factory Pattern
Abstract Factory Pattern
Singleton Pattern
Prototype Pattern
Builder Pattern.
2. Structural Design Pattern

Adapter Pattern
Bridge Pattern
Composite Pattern
Decorator Pattern
Facade Pattern
Flyweight Pattern
Proxy Pattern

3. Behavioral Design Pattern

Chain Of Responsibility Pattern
Command Pattern
Interpreter Pattern
Iterator Pattern
Mediator Pattern
Memento Pattern
Observer Pattern
State Pattern
Strategy Pattern
Template Pattern
Visitor Pattern



# What are the SOLID Principles?

In software engineering, SOLID is a mnemonic acronym for five design principles intended to make software designs more understandable, flexible, and maintainable. The principles are a subset of many principles promoted by American software engineer and instructor Robert C. Martin,[1][2][3] first introduced in his 2000 paper Design Principles and Design Patterns.[2][4]

The SOLID ideas are

The single-responsibility principle: "There should never be more than one reason for a class to change."[5] In other words, every class should have only one responsibility.[6]

The open–closed principle: "Software entities ... should be open for extension, but closed for modification."[7]

The Liskov substitution principle: "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it."[8] See also design by contract.[8]

The interface segregation principle: "Many client-specific interfaces are better than one general-purpose interface."[9][4]

The dependency inversion principle: "Depend upon abstractions, [not] concretions."[10][4]


https://en.wikipedia.org/wiki/SOLID




# How can you achieve thread-safe singleton patterns in Java?
1. Create the instance variable at the time of class loading.



2. Synchronize the getInstance() method.

3. Use synchronized block inside the if loop and volatile variable
https://www.journaldev.com/171/thread-safety-in-java-singleton-classes



# What do you understand by the Open-Closed Principle (OCP)?

One of the five principles of SOLID. It says that software entities (class, modules, functions etc) should be open for extension but closed for modification.

In practice, this means creating software entities whose behavior can be changed without the need to edit and recompile the code itself. The simplest way to demonstrate this principle is to consider a method that does one thing. Let's say it writes to a particular file, the name of which is hard-coded into the method. If the requirements change, and the filename now needs to be different in certain situations, we must open up the method to change the filename. If, on the other hand, the filename had been passed in as a parameter, we would be able to modify the behavior of this method without changing its source, keeping it closed to modification.

The Open-Closed Principle can also be achieved in many other ways, including through the use of inheritance or through compositional design patterns like the Strategy pattern.

https://deviq.com/principles/open-closed-principle



https://stackify.com/solid-design-open-closed-principle/amp/


