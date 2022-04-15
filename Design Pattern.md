<font size = 5>
What are the types of design patterns in Java?
=
1.Creational Design Pattern  
Factory Pattern; Abstract Factory Pattern; Singleton Pattern; Prototype Pattern; Builder Pattern.
  
2.Structural Design Pattern  
Adapter Pattern; Bridge Pattern; Composite Pattern; Decorator Pattern; Facade Pattern ;Flyweight Pattern; Proxy Pattern.
  
3.Behavioral Design Pattern
Chain Of Responsibility Pattern; Command Pattern; Interpreter Pattern; Iterator Pattern; Mediator Pattern; Memento Pattern; Observer Pattern; State Pattern; Strategy Pattern; Template Pattern; Visitor Pattern  

What are the SOLID Principles?
=
SOLID is an acronym that stands for five key design principles: single responsibility principle, open-closed principle, Liskov substitution principle, interface segregation principle, and dependency inversion principle.

How can you achieve thread-safe singleton patterns in Java?
=
For eager initialization, it's thread-safe naturally;  
For lazy initialization, getInstance() method is made synchronized but it will make code unefficient. So we can use double check locking, getInstance is not synchronized but the block which creates instance is synchronized .
 
What do you understand by the Open-Closed Principle (OCP)?
=
If someone needs to modify your code, Your pattern only let them add more code to meet their requirements, not let them edit the original code. Like the parent classes, subclass only can extend from them and override the function. 
