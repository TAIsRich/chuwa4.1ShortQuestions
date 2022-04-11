> write yor assignment(questions and answers) here.
What is Interface and what is abstract class? What are the differences between them?
    It allows us to hide the implementation complexities just by providing functionalities via simpler interfaces. In Java, we achieve abstraction by using either an interface or an abstract class.

    An abstract class is nothing but a class that is declared using the abstract keyword. It also allows us to declare method signatures using the abstract keyword (abstract method) and forces its subclasses to implement all the declared methods. Suppose if a class has a method that is abstract, then the class itself must be abstract.

    Abstract classes have no restrictions on field and method modifiers, while in an interface, all are public by default. We can have instance and static initialization blocks in an abstract class, whereas we can never have them in the interface. Abstract classes may also have constructors which will get executed during the child object's instantiation.


What is the differences between overriding and overloading?
  When two or more methods in the same class have the same name but different parameters, it’s called Overloading.
  When the method signature (name and parameters) are the same in the superclass and the child class, it’s called Overriding.
What is final key word? (Filed, Method, Class)
  For class:
  final - The class cannot be inherited by other classes

  For attributes, methods:
  Attributes and methods cannot be overridden/modified

What is Java garbage collection?
  Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program.

What is the differences between super and this?
  The this keyword points to a reference of the current class, while the super keyword points to a reference of the parent class. this can be used to access variables and methods of the current class, and super can be used to access variables and methods of the parent class from the subclass.

  Since this and super keywords are related to an instance of an object, we cannot use them inside a static block or a static method. Failing to do so will result in compilation error non-static content this cannot be referenced from a static context.

Can we use this keyword in constructor and why?

  You can have different constructors with different parameters, i.e. overload constructors. At the beginning of a constructor, you can call a different constructor by using this(parameter_1, ... parameter_n);

What is Runtime/unchecked exception? what is Compile/Checked Exception?

## **Three Exceptions**

- **Checked exceptions** - A checked exception is an exception that is checked by the compiler at compilation-time, these are also called as **Compile Time Exceptions**. These exceptions cannot simply be ignored, the programmer should handle these exceptions.

    For example, if you use **FileReader** class in your program to read data from a file, if the file specified in its constructor doesn't exist, then a *FileNotFoundException* occurs, and the compiler prompts the programmer to handle the exception.

    ```java
    import java.io.File;
    import java.io.FileReader;

    public class FilenotFound_Demo {
       public static void main(String args[]) {		
          File file = new File("E://file.txt");
          FileReader fr = new FileReader(file);
       }
    }
    ```


![Screen Shot 2022-04-08 at 17.02.04.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3f6ab1ca-6507-4bd6-951b-f3ec9e49d871/Screen_Shot_2022-04-08_at_17.02.04.png)

- **Unchecked exceptions** − An unchecked exception is an exception that occurs at the time of execution. These are also called as **Runtime Exceptions**. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

    For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then an *ArrayIndexOutOfBoundsExceptionexception* occurs.

    ```java
    public class Unchecked_Demo {

       public static void main(String args[]) {
          int num[] = {1, 2, 3, 4};
          System.out.println(num[5]);
       }
    }
    ```

    ![Screen Shot 2022-04-08 at 17.07.03.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6f9bf5d-72b3-4ca2-8997-4aae8ac384c3/Screen_Shot_2022-04-08_at_17.07.03.png)

- **Errors** − These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error. For example, if a stack overflow occurs, an error will arise. They are also ignored at the time of compilation.

what is the difference between throw and throws?
1. Throws clause is used to declare an exception, which means it works similar to the try-catch block. On the other hand throw keyword is used to throw an exception explicitly.

2. If we see syntax wise than throw is followed by an instance of Exception class and throws is followed by exception class names.

Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?
This is one of the many child classes of Exception class. RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine. A method is not required to declare in its throws clause any subclasses of RuntimeException that might be thrown during the execution of the method but not caught.
