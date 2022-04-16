> write yor assignment(questions and answers) here.
## 1. What is Interface and what is abstract class? What are the differences between them?

The interface is a blueprint that can be used to implement a class. The interface does not contain any concrete methods (methods that have code). All the methods of an interface are abstract methods.
An interface cannot be instantiated. However, classes that implement interfaces can be instantiated. Interfaces never contain instance variables but, they can contain public static final variables (i.e., constant class variables)
A class which has the abstract keyword in its declaration is called abstract class. Abstract classes should have at least one abstract method. , i.e., methods without a body. It can have multiple concrete methods.
Abstract classes allow you to create blueprints for concrete classes. But the inheriting class should implement the abstract method.
Abstract classes cannot be instantiated.
An abstract class permits you to make functionality that subclasses can implement or override whereas an interface only permits you to state functionality but not to implement it. A class can extend only one abstract class while a class can implement multiple interfaces.

## 2. What is the differences between overriding and overloading?
Method Overloading is a Compile time polymorphism. In method overloading, more than one method shares the same method name with a different signature in the class. In method overloading, the return type can or can not be the same, but we have to change the parameter because, in java, we can not achieve the method overloading by changing only the return type of the method.
Method Overriding is a Run time polymorphism. In method overriding, the derived class provides the specific implementation of the method that is already provided by the base class or parent class. In method overriding, the return type must be the same or co-variant (return type may vary in the same direction as the derived class). 

## 3. What is final key word? (Filed, Method, Class)
Java final keyword is a non-access specifier that is used to restrict a class, variable, and method. If we initialize a variable with the final keyword, then we cannot modify its value.

If we declare a method as final, then it cannot be overridden by any subclasses. And, if we declare a class as final, we restrict the other classes to inherit or extend it. In other words, the final classes can not be inherited by other classes.

## 4. What is Java garbage collection?
Java applications obtain objects in memory as needed. It is the task of garbage collection (GC) in the Java virtual machine (JVM) to automatically determine what memory is no longer being used by a Java application and to recycle this memory for other uses. Because memory is automatically reclaimed in the JVM, Java application developers are not burdened with having to explicitly free memory objects that are not being used.

The GC operation is based on the premise that most objects used in the Java code are short-lived and can be reclaimed shortly after their creation. Because unreferenced objects are automatically removed from the heap memory, GC makes Java memory-efficient.

Garbage collection frees the programmer from manually dealing with memory deallocation. 

## 5. What is the differences between super and this?
this keyword mainly represents the current instance of a class. On other hand super keyword represents the current instance of a parent class. A call to this() method from within a constructor calls another constructor defined in the current class. For this to work, the constructor must be overloaded as recursive constructor invocation is not permitted. On the other hand, super() calls a constructor defined in the parent class.

We cannot call this() and super() method outside the constructor body. Also, the invocation of either this() or super() must be the first line in the constructor body. This also means that we can’t invoke both methods at the same time within the same constructor.
 
## 6. Can we use this keyword in constructor and why?

Yes, because the this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

## 7. What is Runtime/unchecked exception? what is Compile/Checked Exception?

Checked Exceptions are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword. 

Unchecked Exceptions are the exceptions that are not checked at compile time. It is up to the programmers to be civilized, and specify or catch the exceptions. In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked. 


## 8. what is the difference between throw and throws?
Both throw and throws are concepts of exception handling in Java. The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

The throws keyword is used in a method signature and declares which exceptions can be thrown from a method. The throws keyword can be useful for propagating exceptions in the call stack and allows exceptions to not necessarily be handled within the method that declares these exceptions.

On the other hand, the throw keyword is used within a method body, or any block of code, and is used to explicitly throw a single exception. The throw keyword can be useful for throwing exceptions based on certain conditions within a code block and for throwing custom exceptions.

## 9. Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?

It is better to handle the Null/Runtime exception otherwise at the end your program will crash which stop the other functionality. 
