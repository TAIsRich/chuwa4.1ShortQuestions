
1. What are the types of design patterns in java?
    
    There are 23 design patterns that can be classified into three categories: Creational, Structural and Behavioral patterns.
    
    **Creational Patterns**
        
    These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.
        
        Factory Pattern
        Abstract Factory Pattern
        Singleton Pattern
        Prototype Pattern
        Builder Pattern.
        
        
    **Structural Patterns**
        
    These design patterns concern class and object composition. Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.
        
        Adapter Pattern
        Bridge Pattern
        Composite Pattern
        Decorator Pattern
        Facade Pattern
        Flyweight Pattern
        Proxy Pattern

        
    **Behavioral Patterns**
        
    These design patterns are specifically concerned with communication between objects.
        
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
        
       
2. What are the SOLID Principles?
    
    *SOLID* is an acronym for the first five object-oriented design (OOD) principles by Robert C. Martin (also known as [Uncle Bob](http://en.wikipedia.org/wiki/Robert_Cecil_Martin)).
    
    These principles establish practices that lend to developing software with considerations for maintaining and extending as the project grows. Adopting these practices can also contribute to avoiding code smells, refactoring code, and Agile or Adaptive software development.
    
    SOLID stands for:
    
    - [**S** - Single-responsiblity Principle](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#single-responsibility-principle)
        
        A class should have one and only one reason to change, meaning that a class should have only one job.
        
    - [**O** - Open-closed Principle](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#open-closed-principle)
        
        Objects or entities should be open for extension but closed for modification.
        
    - [**L** - Liskov Substitution Principle](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#liskov-substitution-principle)
        
        Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
        
    - [**I** - Interface Segregation Principle](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#interface-segregation-principle)
        
        A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
        
    - [**D** - Dependency Inversion Principle](https://www.digitalocean.com/community/conceptual_articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design#dependency-inversion-principle)
        
        Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
        
3. How can you achieve thread-safe singleton patterns in java?
    
    A lock must be obtained in case two or more threads call getHelper() simultaneously, otherwise, there may be problems: Both threads may try to create the object at the same time, leading to two objects. One thread may end up getting a reference to an incompletely initialized object.
    
4. What do you understand by the Open-Closed Principle(OCP)?
    
    The Open-Closed principle states that software entities should be *open for extension but closed for modification. This means that entities such as classes and modules should NOT be modified if they are already well defined, but they should allow other entities to inherit its properties or compose that entity within themselves. It is also about designing components where you wouldn’t need to modify them when you extend their functionality.