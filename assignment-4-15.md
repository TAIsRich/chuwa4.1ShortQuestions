What are the types of design patterns in Java?
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


What are the SOLID Principles?
Single Responsibility Principle, Open-Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle.
1.Single Responsibility Principle: Each class should be responsible for a single part or functionality of the system.
2.Open-Closed Principle: Software components should be open for extension, but not for modification.
3.Liskov substitution principle: The Liskov Substitution Principle (LSP) applies to inheritance hierarchies such that derived classes must be completely substitutable for their base classes.
4.Interface segregation principle: The Interface Segregation Principle (ISP) states that clients should not be forced to depend upon interface members they do not use. In other words, do not force any client to implement an interface that is irrelevant to them.
5.Dependency inversion principle: The Dependency Inversion Principle (DIP) states that we should depend on abstractions (interfaces and abstract classes) instead of concrete implementations (classes). The abstractions should not depend on details; instead, the details should depend on abstractions.


How can you achieve thread-safe singleton patterns in Java?
Check that the variable is initialized without obtaining the lock. If it is initialized, return it immediately.
Obtain the lock
Double-check whether the variable has already been initialized, if the another thread acquired the lock first, it may have already done the initialization. If so, return the initialized variable.
Otherwise, initialize and return the variable.


What do you understand by the Open-Closed Principle (OCP)?
Open-Closed Principle: Software components should be open for extension, but not for modification.