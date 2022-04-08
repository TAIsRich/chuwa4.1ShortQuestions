
### 1. What is Interface and what is abstract class? What are the differences between them?
   ___
- The interface is a blueprint that can be used to implement a class. The interface does not contain any concrete methods (methods that have code). All the methods of an interface are abstract methods. An interface cannot be instantiated. However, classes that implement interfaces can be instantiated. Interfaces never contain instance variables but, they can contain public static final variables. 
- A class which has the abstract keyword in its declaration is called abstract class. Abstract classes should have at least one abstract method. , i.e., methods without a body. It can have multiple concrete methods.

- The abstract allows you to create blueprints for concrete classes. But the inheriting class should implement the abstract method. Also, abstract classes cannot be instantiated.
   
- The difference between them is abstract class permits you to make functionality that subclasses can implement or override whereas an interface only permits you to state functionality but not to implement it. A class can extend only one abstract class while a class can implement multiple interfaces.

### 2. What is the differences between overriding and overloading?
   ___
- When two or more methods in the same class have the same name but different parameters, it’s called Overloading.

- When the method signature (name and parameters) are the same in the superclass and the child class, it’s called Overriding.

### 3. What is final key word? (Filed, Method, Class)
  ___
- In Java, the final keyword can be used while declaring an entity. Using the final keyword means that the value can’t be modified in the future. This entity can be - but is not limited to - a variable, a class or a method.

### 4. What is Java garbage collection?
  ___
- Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

### 5. What is the differences between super and this?
   ___
- **Super** is reserved keyword used to call the base class method or variable. We cannot use the super keyword as an identifier. The super keyword is not only used to refer to the base class instance but also static members too.

- **This** is a reserved keyword in Java that is used to refer to the current class object. It is a reference variable through which the method is called. Other uses of this keyword are: a.to refer current class instance variable. b. to invoke the current class method (implicitly). c. as an argument in the method and constructor calls. d. use it for returning the current class instance from the method.

### 6. Can we use this keyword in constructor and why?
   ___
- Yes, **This** can be used inside the method or constructor of a class. **This** works as a reference to the current object, whose method or constructor is being invoked. This keyword can refer to any member of the current object from within an instance method or a constructor.

### 7. What is Runtime/unchecked exception? what is Compile/Checked Exception?
  ___
- Runtime/unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

- Compile/checked exception is an exception that occurs at the time of compilation, these are also called as compile time exceptions. These exceptions cannot simply be ignored at the time of compilation; the programmer should take care of (handle) these exceptions.

### 8. What is the difference between throw and throws?
   ___
- The **throw** keyword is used within a method body, or any block of code, and is used to explicitly throw a single exception. The throw keyword can be useful for throwing exceptions based on certain conditions within a code block and for throwing custom exceptions.

- The **throws** keyword is used in a method signature and declares which exceptions can be thrown from a method. The **throws** keyword can be useful for propagating exceptions in the call stack and allows exceptions to not necessarily be handled within the method that declares these exceptions.

### 9. Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?
   ___
- Because if you put Exception first, you cannot tell if there was NullPointerException or RuntimeException.
