1. What is Interface and what is abstract class? What are the differences between them?

   An interface in Java is a blueprint of a class. It has static constants and abstract methods.The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
   
   Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
   differences:
   1. When subclasses want to extend themselves, the abstract class
   uses the extends keyword, which we call Inheritance, and the
   interface uses the implements keyword,which we call
   implementation.
   2. An abstract class can implement an interface, an interface can
   only inherit an interface, The Interfaces cannot inherit classes.
   3. A class can only inherit one parent class, but it may implement
   multiple   interfaces,   therefore   if   we   have   the   choice   between
   abstract classes and interfaces, try to select interfaces so that
   subclasses have more flexibility.
   4. An interface is more direct than an abstract class because it has
   no member property, The only thing a subclass can do after
   implementing the interface is override the method.
   5. After inheriting the abstract class from the parent class, the
   subclass also inherits the parent class's member property.
   6. A member property can be defined in an abstract class, but not in
   an interface; only static properties can be defined in an interface.
   7. Interfaces   can   only   use   the   final   keyword   to   define   static
   constants, not static variables
   8. Interface has no constructor.

2. What is the differences between overriding and overloading?
    
   When two or more methods in the same class have the same name but different parameters, it’s called Overloading.
    
   When the method signature (name and parameters) are the same in the superclass and the child class, it’s called Overriding.
    
   difference:

   Overriding implements Runtime Polymorphism whereas Overloading implements Compile time polymorphism.
   
   The method Overriding occurs between superclass and subclass. Overloading occurs between the methods in the same class.
    
   Overriding methods have the same signature i.e. same name and method arguments. Overloaded method names are the same but the parameters are different.
   With Overloading, the method to call is determined at the compile-time. With overriding, the method call is determined at the runtime based on the object type.
   If overriding breaks, it can cause serious issues in our program because the effect will be visible at runtime. Whereas if overloading breaks, the compile-time error will come and it’s easy to fix.

3. What is final key word? (Filed, Method, Class)

   The final keyword in java is used to restrict the user.
   Final fields can be either constants or write-once fields.If you make any variable as final, you cannot change the value of final variable(It will be constant).If you make any method as final, you cannot override it.If you make any class as final, you cannot extend it.

4. What is Java garbage collection?

   Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

5. What is the differences between super and this?

   super() as well as this() both are used to make constructor calls. this keyword mainly represents the current instance of a class. On other hand super keyword represents the current instance of a parent class.

6. Can we use this keyword in constructor and why?

   this is a keyword in Java. It can be used inside the method or constructor of a class. It(this) works as a reference to the current object, whose method or constructor is being invoked. This keyword can refer to any member of the current object from within an instance method or a constructor.

7. What is Runtime/unchecked exception? what is Compile/Checked Exception?

   An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
   A checked exception is an exception that is checked (notified) by the compiler at compilation-time, these are also called as compile time exceptions. These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.

8. what is the difference between throw and throws?

   if a method does not handle a checked exception, the method must declare it using the throws keyword. The throws keyword appears at the end of a method's signature.
   You can throw an exception, either a newly instantiated one or an exception that you just caught, by using the throw keyword.
   Throws is used to postpone the handling of a checked exception and throw is used to invoke an exception explicitly.

9. Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?

   Because Null/Runtime exception extends Exception, we can't catch Null/Runtime exception if we put them after Exception.
