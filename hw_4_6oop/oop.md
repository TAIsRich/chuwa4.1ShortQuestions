### 1. What is Interface and what is abstract class? What are the differences between them?

An interface in java is a blueprint of a class. It has static constants and abstract methods.
A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.
When subclasses want to extend themselves, the abstract class uses the extends keyword, which we call Inheritance, and the interface uses the implements keyword, which we call implementation.

1)	An abstract class can implement an interface, an interface can only inherit an interface, The Interfaces cannot inherit classes.

2)	A class can only inherit one parent class, but it may implement multiple interfaces, therefore if we have the choice between abstract classes and interfaces, try to select interfaces so that subclasses have more flexibility.

3)	An interface is more direct than an abstract class because it has no member property, The only thing a subclass can do after implementing the interface is override the method.

4)	After inheriting the abstract class from the parent class, the subclass also inherits the parent class's member property.

5)	A member property can be defined in an abstract class, but not in an interface; only static properties can be defined in an interface.

6)	Interfaces can only use the final keyword to define static constants, not static variables

7)	Interface has no constructor.

### 2. What is the differences between overriding and overloading?

Overriding :
- Method overriding is a run-time polymorphism.
- It is used to grant the specific implementation of the method which is already provided by its parent class or superclass
- Method overriding always needs inheritance.
- In method overriding, methods must have the same name and same signature.
- In method overriding, the return type must be the same or co-variant

Overloading:
- Method overloading is a compile-time polymorphism.
- It helps to increase the readability of the program.
- It occurs within the class.
- Method overloading may or may not require inheritance.
- In method overloading, methods must have the same name and different signatures
- In method overloading, the return type can or can not be the same, but we just have to change the parameter

### 3.	What is final key word? (Filed, Method, Class)
- final filed are nothing but constants. We cannot change the value of a final filed once it is initialized.
- A final method cannot be overridden. Which means even though a sub class can call the final method of parent class without any issues but it cannot override it
- We cannot extend a final class
1) A constructor cannot be declared as final.
2) Local final variable must be initializing during declaration.
3) All variables declared in an interface are by default final.
4) We cannot change the value of a final variable.
5) A final method cannot be overridden.
6) A final class not be inherited.
7) If method parameters are declared final then the value of these parameters cannot be changed.
8) It is a good practice to name final variable in all CAPS.
9) final, finally and finalize are three different terms. finally is used in exception handling and finalize is a method that is called by JVM during garbage collection.

### 4.	What is Java garbage collection?
- Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program

### 5.	What is the differences between super and this?
- The this keyword points to a reference of the current class, while the super keyword points to a reference of the parent class. this can be used to access variables and methods of the current class, and super can be used to access variables and methods of the parent class from the subclass.

### 6.	Can we use this keyword in constructor and why?
- The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.

### 7.	What is Runtime/unchecked exception? what is Compile/Checked Exception?
- Java checked exceptions are those exceptions, as the name suggests, which a method must handle in its body or throw to the caller method so the caller method can handle it.
- Unchecked exceptions are not checked by the compiler. These are called runtime exceptions
- If a program throws an unchecked exception, it reflects some error inside the program logic. For example, if we divide a number by 0, Java will throw ArithmeticException:

### 8.	what is the difference between throw and throws?
- The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code

### 9.	Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?
- exception is parent class of null /runtime exception,It handles all other exception except null/runtime exception. 
