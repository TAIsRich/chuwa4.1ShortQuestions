# Day2 Answers:

## 1. What is Interface and what is abstract class? What are the differences between them?

An **interface** is a completely "abstract class" that is used to group related methods with empty bodies.

An **abstract class** is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

- Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
- Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
- Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
- Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
- Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
- Multiple implementations: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
- Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

## 2. What is the differences between overriding and overloading?

- Method **Overloading** is a _Compile time polymorphism_. In method overloading, more than one method shares the same method name with a different signature in the class. In method overloading, the return type can or can not be the same, but we have to change the parameter because, in java, we can not achieve the method overloading by changing only the return type of the method.

- Method **Overriding** is a _Run time polymorphism_. In method overriding, the derived class provides the specific implementation of the method that is already provided by the base class or parent class. In method overriding, the return type must be the same or co-variant (return type may vary in the same direction as the derived class).

## 3. What is final key word? (Filed, Method, Class)

final is a non-access modifier applicable only to a variable, a method or a class.

### Final Variables

When a variable is declared with final keyword, its value can’t be modified, essentially, a constant. This also means that you must initialize a final variable. If the final variable is a reference, this means that the variable cannot be re-bound to reference another object, but the internal state of the object pointed by that reference variable can be changed i.e. you can add or remove elements from the final array or final collection. It is good practice to represent final variables in all uppercase, using underscore to separate words.

### Final classes

When a class is declared with final keyword, it is called a final class. A final class cannot be extended(inherited).

### Final Methods

When a method is declared with final keyword, it is called a final method. A final method cannot be overridden. The Object class does this—a number of its methods are final. We must declare methods with the final keyword for which we are required to follow the same implementation throughout all the derived classes.

## 4. What is Java garbage collection?

Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program.

## 5. What is the differences between super and this?

super() as well as this() both are used to make constructor calls. super() is used to call Base class’s constructor(i.e, Parent’s class) while this() is used to call current class’s constructor.

## 6. Can we use this keyword in constructor and why?

Yes.
From within a constructor, you can also use the this keyword to call another constructor in the same class. Doing so is called an explicit constructor invocation. Here's another Rectangle class, with a different implementation from the one in the Objects section.

```
{
public class Rectangle {
private int x, y;
private int width, height;

        public Rectangle() {
            this(0, 0, 1, 1);
        }
        public Rectangle(int width, int height) {
            this(0, 0, width, height);
        }
        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        ...

    }

}
```

This class contains a set of constructors. Each constructor initializes some or all of the rectangle's member variables. The constructors provide a default value for any member variable whose initial value is not provided by an argument. For example, the no-argument constructor creates a 1x1 Rectangle at coordinates 0,0. The two-argument constructor calls the four-argument constructor, passing in the width and height but always using the 0,0 coordinates. As before, the compiler determines which constructor to call, based on the number and the type of arguments.

If present, the invocation of another constructor must be the first line in the constructor.

## 7. What is Runtime/unchecked exception? what is Compile/Checked Exception?

- An **unchecked exception** is an exception that occurs at the time of execution. These are also called as **Runtime Exceptions**. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

- A **checked exception** is an exception that occurs at the compile time, these are also called as **compile time exceptions**. These exceptions cannot simply be ignored at the time of compilation, the programmer should take care of (handle) these exceptions.

For example, if you use FileReader class in your program to read data from a file, if the file specified in its constructor doesn't exist, then a FileNotFoundException occurs, and the compiler prompts the programmer to handle the exception.

## 8. what is the difference between throw and throws?

Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

## 9. Run the below three pieces codes, Noticed the printed exceptions. why do we put the Null/Runtime exception before Exception?

Null/Runtime exception is a child class of excaption. If we put excaption in front of Null/Runtime exception, the later will never been catch.
