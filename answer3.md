Q1:What are the types of design patterns in Java?
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

Q2:What are the SOLID Principles?

         SOLID stands for:
S - Single-responsiblity Principle
O - Open-closed Principle
L - Liskov Substitution Principle
I - Interface Segregation Principle
D - Dependency Inversion Principle

Q3:How can you achieve thread-safe singleton patterns in Java?
The problem with single threaded version is that it will not work predictably when multiple threads tries to access singleton. A lock must be obtained in case two or more threads call getHelper() simultaneously, otherwise there may be problems:
	Both threads may try to create the object at the same time, leading to two objects.
	One thread may end up getting a reference to an incompletely initialized object.
In this version of singleton, we obtain a lock by expensive method level synchronization technique.
This approach is thread-safe and behavior of the Singleton is predictable in multi-threaded environment, but there are performance issues with this approach:
	synchronizing a method could in some extreme cases decrease the performance by a factor of 100 or higher.
	once the singleton object is initialized completely, acquiring and releasing the locks would appear unnecessary.
Optimization Algorithm:
	Check that the variable is initialized without obtaining the lock. If it is initialized, return it immediately.
	Obtain the lock
	Double-check whether the variable has already been initialized, if the another thread acquired the lock first, it may have already done the initialization. If so, return the initialized variable.
	Otherwise, initialize and return the variable.
Q4:What do you understand by the Open-Closed Principle (OCP)?
In software development, the use of object-oriented design is crucial. It helps to write flexible, scalable, and reusable code. It is recommended that the developers follow SOLID principles when writing a code. One of the five SOLID principles is the open/closed principle. The principle states that software entities like class, modules, functions, etc.; should be able to extend a class behavior without modifying it. This principle separates the existing code from modified mode to provide better stability, maintainability and minimizes the changes in the code. In a nutshell, the developer must need to change only a specific part of the code (a class or a function) every time a requirement changes.
Using a statically typed language like Java, C#, etc. the open/closed principle is generally achieved by using inheritance and polymorphism. Let’s understand it with a few examples.
Implementation: 
Program to calculate the volume in which let us consider the task of building an application that calculates the volumes of all the geometric objects.
The Cuboid class stores dimensions of the cuboid
Later on, the Application class calculates the total volume of the geometric objects–which are only cuboids currently.
Run class helps to run the whole program.
