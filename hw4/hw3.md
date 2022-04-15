# 1.
**Creational design patterns** are the Factory Method, Abstract Factory, Builder, Singleton, Object Pool, and Prototype. 
**Structural design patterns** are Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Private Class Data, and Proxy. 
**Behavioral patterns** are Chain of responsibility, Command, Interpreter, Iterator, Mediator, Memento, Null Object, Observer, State, Strategy, Template method, Visitor.

# 2.
SOLID is an acronym that stands for **five key design principles**: *single responsibility principle, open-closed principle, Liskov substitution principle, interface segregation principle, and dependency inversion principle.*

# 3.
- Create the private constructor to avoid any new object creation with new operator.
- Declare a private static instance of the same class.
- Provide a public static method that will return the singleton class instance variable. If   the   variable is not initialized then initialize it or else simply return the instance variable.

# 4
The Open-Closed Principle (OCP) states that software entities (classes, modules, methods, etc.) should be open for **extension**, but closed for **modification**.
It means that you should put new code in new classes/modules. Existing code should be modified only for bug fixing. New classes can reuse existing code via inheritance.

