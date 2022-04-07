Write the answers using markdown, and push your markdown files to your github repo, then share your repo link to me by Direct messages.
You will be fired if you don’t do the assignments. we don’t care the quality, we only care you do it or not.

1. What is Interface and what is abstract class? What are the differences between them?  
    **Interface:** An interface is a promise that the class will implement certain methods with certain signatures.  
   **Abstract Class:** An abstract class is a class that has one or more abstract method(s).  
   **Differences between Interface and Abstract Class:**
   - Interfaces don’t have instance variables. (If we define a variable inside an interface, it is automatically declared as a public static final variable. A subclass that implements the interface or a sub interface that extends it will inherit this constant.)
   - Interfaces contain method definitions only (no implementation)
   - Interface can never be instantiated
   - All methods in an interface are automatically **_public abstract_**
   - A class can implement as many interfaces as it likes
   - An abstract class can have instance variables, constructors, and concrete methods. The constructors of an abstract class will be used by its subclasses to initialize inherited instance variables.
   * An abstract class cannot be instantiated, however, can define a type.

```java
  public interface Movable extends Icon
  {
    void translate(int x, int y);
    int ABORT = 128; // a public static final constant
  }
  abstract class Point
  {
    int x;
    int y;
    Point (int pX, int pY){
    x = pX;
    y = pY;
   }
    void move(int dx, int dy){
    x += dx;
    y += dy;
    }
    abstract void alert();
  }
```

2.  What are the differences between **overriding** and **overloading**?

    - **Overriding** is the adjustment of the subclass method to the parent class method in the inheritance relationship.
      **Overloading** means that in a class, the method name is the same, but the parameters are different and the return-types can be the same or different.

3.  What is **final** key word? (Filed, Method, Class)

    - When a **field is final**, the field cannot be modified.  
      When a **method is final**, the method cannot be overridden and cannot be abstract.  
      When a **class is final**, the class cannot be inherited and cannot have abstract methods.

4.  What is Java garbage collection?

    - Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

5.  What are the differences between super and this?

    - This refers to the current object.  
      While super refers to the parent object.

6.  Can we use this keyword in constructor and why?
    - Yes.
      ```java
      public class Greeting implements Runnable{
        private String str;
        public Greeting(String str){
          this.str=str; //this.str refers to “private String str”
        }
      ……
      }
      ```
7.  What is Runtime/Unchecked Exception? What is Compile/Checked Exception?

    - **Compile/Checked Exception** is an exception which can be checked out by the compiler, such as FileNotFound Exception and Arithmetic Exception. Programmers can handle it using **try-catch-finally** or **throws**.
      **Runtime/Unchecked Exception** is an exception which cannot be checked out by the compiler. The exception will happen in the run time, such as NullPointer Exception and IndexOutOfBounds Exception.

8.  What is the difference between throw and throws?

    - Throws clause is used to declare an exception, which means it works similar to the try-catch block. On the other hand throw keyword is used to throw an exception explicitly.
    - If we see syntax wise than throw is followed by an instance of Exception class and throws is followed by exception class names.
    - Throw keyword is used in the method body to throw an exception, while throws is used in method signature to declare the exceptions that can occur in the statements present in the method.
    - You can throw one exception at a time but you can handle multiple exceptions by declaring them using throws keyword.

9.  Run the below three pieces codes, Noticed the printed exceptions. Why do we put the Null/Runtime exception before Exception?

```java
    public class Main {
      public static void main(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
          System.out.println(b / a);
          System.out.println(s.equals("aa"));
          throw new RuntimeException();
        } catch (ArithmeticException e) {
          e.printStackTrace();
        } catch (NullPointerException e) {
          e.printStackTrace();
        } catch (RuntimeException e) {
          e.printStackTrace();
        } catch (Exception e) {
          e.getMessage();
        }
        System.out.println("End ...");
      }
    }
```

```java
    public class Main {
      public static void main(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
          //System.out.println(b / a);
          System.out.println(s.equals("aa"));
          throw new RuntimeException();
        } catch (ArithmeticException e) {
          e.printStackTrace();
        } catch (NullPointerException e) {
          e.printStackTrace();
        } catch (RuntimeException e) {
          e.printStackTrace();
        } catch (Exception e) {
          e.getMessage();
        }
        System.out.println("End ...");
      }
    }
```

```java
public class Main {
      public static void main(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
          //System.out.println(b / a);
          //System.out.println(s.equals("aa"));
          throw new RuntimeException();
        } catch (ArithmeticException e) {
          e.printStackTrace();
        } catch (NullPointerException e) {
          e.printStackTrace();
        } catch (RuntimeException e) {
          e.printStackTrace();
        } catch (Exception e) {
          e.getMessage();
        }
        System.out.println("End ...");
      }
    }
```

- Why do we put the Null/Runtime exception before Exception?  
  **ArithmeticException, NullPointerException, and RuntimeException are all
  subclasses of Exception**, so all these three types of exceptions can trigger Exception.
  If we put Exception before the Null/Runtime exception, the program will only throw
  Exception.
