##### Tianyi Zhang
##### Assignment 2

**1. What is Interface and what is abstract class? What are the differences between them?**
Interface: *The interface is a blueprint that can be used to implement a class. The interface does not contain any concrete methods (methods that have code). All the methods of an interface are abstract methods.*

Abstract Class: *A class which has the abstract keyword in its declaration is called abstract class. Abstract classes should have at least one abstract method. , i.e., methods without a body. It can have multiple concrete methods*

Difference:
- Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
- Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
- Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
- Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
- Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
- Multiple implementations: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
- Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

**2. What is the differences between overriding and overloading**
| Overriding | Overloading |
| ------ | ------ |
| Method overriding is a run-time polymorphism. | Method overloading is a compile-time polymorphism. |
| It is used to grant the specific implementation of the method which is already provided by its parent class or superclass. | It helps to increase the readability of the program.|
| It is performed in two classes with inheritance relationships. | It occurs within the class. |
| Method overriding always needs inheritance. | Method overloading may or may not require inheritance. |
| In method overriding, methods must have the same name and same signature. | In method overloading, methods must have the same name and different signatures |
| In method overriding, the return type must be the same or co-variant. | In method overloading, the return type can or can not be the same, but we just have to change the parameter. |

**3. What is final key word? (Filed, Method, Class)**

In Java, the `final` keyword can be used while declaring an entity. Using the final keyword means that the value can’t be modified in the future. This entity can be - but is not limited to - a variable, a class or a method.
- method: A method, declared with the final keyword, cannot​ be overridden or hidden by subclasses.
- class: A class​ declared as a final class, cannot be subclassed
- 

**4. What is Java garbage collection?**

Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

**5. What is the differences between super and this?**

Along with various other keywords Java also provides `this` and `super` as special keywords which primarily used to represent current instance of a class and it's super class respectively. With this similarity both these keywords have significant differences between them which are listed as below - 
| Key| this | super |
| ------ | ------ | ------ |
|Represent and Reference|	this keyword mainly represents the current instance of a class.|	On other hand super keyword represents the current instance of a parent class.|
|Interaction with class constructor|	this keyword used to call default constructor of the same class.|	super keyword used to call default constructor of the parent class.|
|Method accessibility|	this keyword used to access methods of the current class as it has reference of current class.|One can access the method of parent class with the help of super keyword.|
|Static context|	this keyword can be referred from static context i.e can be invoked from static instance. For instance we can write System.out.println(this.x) which will print value of x without any compilation or runtime error.	|On other hand super keyword can't be referred from static context i.e can't be invoked from static instance. For instance we cannot write System.out.println(super.x) this will leads to compile time error.|


**6. Can we use this keyword in constructor and why?**

Yes. Within an instance method or a constructor, this is a reference to the current object — the object whose method or constructor is being called. You can refer to any member of the current object from within an instance method or a constructor by using this .

**7. What is Runtime/unchecked exception? what is Compile/Checked Exception?**
- Runtime/unchecked exception: An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
- Compile/Checked Exception: A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions. These exceptions cannot simply be ignored at the time of compilation, the programmer should take care of (handle) these exceptions.

**8. what is the difference between throw and throws?**
| Key| throw | throws |
| ------ | ------ | ------ |
|Definition	|Throw is a keyword which is used to throw an exception explicitly in the program inside a function or inside a block of code.	|Throws is a keyword used in the method signature used to declare an exception which might get thrown by the function while executing the code.|
|	Internal implementation	|Internally throw is implemented as it is allowed to throw only single exception at a time i.e we cannot throw multiple exception with throw keyword.|	On other hand we can declare multiple exceptions with throws keyword that could get thrown by the function where throws keyword is used.|
|	Type of exception|With throw keyword we can propagate only unchecked exception i.e checked exception cannot be propagated using throw.	|On other hand with throws keyword both checked and unchecked exceptions can be declared and for the propagation checked exception must use throws keyword followed by specific exception class name.|
|	Syntax|	Syntax wise throw keyword is followed by the instance variable.|	On other hand syntax wise throws keyword is followed by exception class names.|
|	Declaration	|In order to use throw keyword we should know that throw keyword is used within the method.|	On other hand throws keyword is used with the method signature.|

	
**9. Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?.**
Since `Exception` is parent, if the `Null/Runtime exception` is after the `Exception` we won't be able to catch those `NullException`.

