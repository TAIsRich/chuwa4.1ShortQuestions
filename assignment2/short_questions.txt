## What is Interface and what is abstract class? What are the differences between them?
**Interface**: An interface in java is a blueprint of a class. It has static constants and abstract methods. The interface uses the implements keyword, which we call implementation.
**Abstract Class**: A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated. When subclasses want to extend themselves, the abstract class uses the extends keyword, which we call Inheritance.

**Interface vs. Abstract Class**
1. An abstract class can implement an interface, an interface can only inherit an interface, The Interfaces cannot inherit classes.
2. A class can only inherit one parent class, but it may implement multiple interfaces, therefore if we have the choice between abstract classes and interfaces, try to select interfaces so that subclasses have more flexibility.
3. An interface is more direct than an abstract class because it has no member property, The only thing a subclass can do after implementing the interface is override the method.
4. After inheriting the abstract class from the parent class, the subclass also inherits the parent class's member property.
5. A member property can be defined in an abstract class, but not in an interface; only static properties can be defined in an interface.
6. Interfaces can only use the final keyword to define static constants, but cannot define static variables.
7. Interface has no constructor, but abstract class does.

## What is the differences between overriding and overloading?
**Overriding**: When two or more methods in the same class have the same name but different parameters, it is called overriding.
**Overloading**: When the method signature (name and parameters) is the same in the superclass and the child class, it is called overloading.
**Overriding vs. Overloading**
1. Overriding implements Runtime Polymorphism whereas Overloading implements Compile time polymorphism. In other words, With Overloading, the method to call is determined at the compile-time. With overriding, the method call is determined at the runtime based on the object type. It is saying error from overriding method is runtime error, while error from overloading method is compile error;
2. Overriding occurs between superclass and subclass. Overloading occurs between the methods in the same class;
3. Overriding methods in the superclass and child class have the same signature i.e. same name and method arguments. Overloading method names are the same but the parameters are different;

## What is final key word? (Field, Method, Class)
**Local/Class Variable**: Final Local/Class variable’s value cannot get changed.
**Local/Class Reference**: A reference variable declared final can never be reassigned to refer to a different object.
```js
public void test_final_on_reference() {
    final List<Integer> final_list;
    final_list = new ArrayList<>();
    final_list.add(1);
    System.out.println(final_list);
}
```
**Parameter**: Final Parameter stops the function from changing its value inside.
**Method**: If you make any method as final, you cannot override it.
**Class**: Final Class cannot get extended.

## What is Java garbage collection? 
Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

## What is the differences between super and this?
The this keyword points to a reference of the current class, while the super keyword points to a reference of the parent class. this can be used to access variables and methods of the current class, and super can be used to access variables and methods of the parent class from the subclass.

## Can we use this keyword in constructor and why?
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.

## What is Runtime/unchecked exception? what is Compile/Checked Exception?
**Runtime/Unchecked Exception**: Unchecked exceptions are not checked by the compiler, but checked in runtime. These are called runtime exceptions
**Compile/Checked Exception**: checked exceptions in java are also known as compile-time exceptions because these exceptions are checked by the compiler at compile time.

## what is the difference between throw and throws?
The throws keyword is used to declare which exceptions can be thrown from a method;
The throw keyword is used to explicitly throw an exception within a method or block of code.

## Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?
exception is parent class of null/runtime exception, and it is more general than null/runtime exception. It handles all other exception except null/runtime exception.
