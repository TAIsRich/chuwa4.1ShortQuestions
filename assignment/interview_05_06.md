## Java 8 feactures  https://www.javatpoint.com/java-8-features
1. Lambda expressions https://www.javatpoint.com/java-lambda-expressions
  Functional style. 1) Provides a clear and concise way to implement SAM interfaces (Single Abstract Method) by using an expression. Useful in collection library to iterate, filter and extract data. 2) Less coding  
  (argument-list)->{body}

    - Java lambda expression is consisted of three components 
      - Argument-list: empty or non-empty 
      - Arrow-token: used to link arguments-list and body of expression 
      - Body: contains expressions and statements for lambda expression 
      - No parameter Syntax ()->{ Body of no parameter lambda}
      - One parameter Syntax (p1)->{Body}
      - Two parameter syntat (p1, p2)->{ Body}
      - Foreach Loop: list.forEach((n)->System.out.println(n)); 
      - Creating Thread: 
        public class LambdaExpressionExample9{
            public static void main(String[] args){
                Runnable r1 = new Runnable(){
                    public void run(){
                        System.out.println("Trhead 1 is running...);
                    }
                };
                Thread t1 = new Thread(r1);
                t1.start();
                Runnable r2=()->{
                    System.out.println("Thread 2 is running...");
                };

                Thread t2 = new Thread(r2);
                t2.start():
            }
        }
       - Comparator: Collections.sort(list, (p1, p2)->{
                return p1.name.compareTo(p2.name); });
        - Filter collection data: Stream<Product> filter_data = list.stream().filter(p->p.price>20000);
        - Event Listener:  b.addActionListener(e->{tf.setText("hello swing"); })
        
2. Method references: used to refer method of functional interface. Compact and easy form of lambda expression. Replace lambda expression with method reference. 
   Type of Method Reference:
    - Reference to a static method
        - Example 1: defined a functional interface and referring a static method to it's functional method say().
        -     interface Sayable{  
            void say();  
        }  
        public class MethodReference {  
        public static void saySomething(){  
            System.out.println("Hello, this is static method.");  
        }  
        public static void main(String[] args) {  
            // Referring static method  
            Sayable sayable = MethodReference::saySomething;  
            // Calling interface method  
            sayable.say();  
        }  
        }  
       - Example 2 predefined functional interface Runnable to refer static method
       -     public class MethodReference2 {  
        public static void ThreadStatus(){  
            System.out.println("Thread is running...");  
        }  
        public static void main(String[] args) {  
            Thread t2=new Thread(MethodReference2::ThreadStatus);  
            t2.start();       
        }  
        }  
       - Exampel 3 predefined functional interface to refer methods. In the following example, we are using BiFunction interface and using it's apply() method.
       -     import java.util.function.BiFunction;  
        class Arithmetic{  
        public static int add(int a, int b){  
        return a+b;  
        }  
        }  
        public class MethodReference3 {  
        public static void main(String[] args) {  
        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
        int result = adder.apply(10, 20);  
        System.out.println(result);  
        }  
        }
    - Reference to an instance method: Syntax - containingObject::instanceMethodName  
    - Example 1: referring non-static methods. You can refer methods by class object and anonymous object.
    - interface Sayable{  void say();   }  
        public class InstanceMethodReference {  
            public void saySomething(){  
                System.out.println("Hello, this is non-static method.");  
        }  public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
        }
    - Example 2
    - referring instance (non-static) method. Runnable interface contains only one abstract method. So, we can use it as functional interface.
    -       public class InstanceMethodReference2 {  
        public void printnMsg(){  
            System.out.println("Hello, this is instance method");  
        }  
        public static void main(String[] args) {  
        Thread t2=new Thread(new InstanceMethodReference2()::printnMsg);  
            t2.start();       
        }  
         }  
    - Reference to a constructor: ClassName::new 
    -     interface Messageable{  
        Message getMessage(String msg);  
    }  
    class Message{  
        Message(String msg){  
            System.out.print(msg);  
        }  
    }  
    public class ConstructorReference {  
        public static void main(String[] args) {  
            Messageable hello = Message::new;  
            hello.getMessage("Hello");  
        }  
    }  
    -    
3. Functional interfaces 
   An interface contains only one abstract method - functional interface. Can have any # of default and static methods. Also declare methods of object class. 
4. Stream API
   java.util.stream package consists of classes, interfaces and an enum to allow functional-style operations on the elements. Performs lazy computations. Executes only when it requires 
5. Stream Filter 
   Provides a method filter() to filter stream elements on the basis of given predicate. Take predicate as an argument, returns a stream of result elements. 
6. Defatult methods
   Provides a faacilty to create default methods inside the interface. Methods which are defined inside the interface and tagged with default keyword are known as default methods. Non-abstract methods, have method body. 
7. Base64 Encode Decode 
    Provides a class Base64 to deal with encryption and decryption. Import java.util.Base64 class 
    Provides three different encoders and decoders to encrypt info at each level. 
8. Static methods in interface 
9.  Optional class 
   Introduced a new class Optional in Java 8. Public final class: deal with NullPointerException in Java application. Import java.util package. 
    Provides methods to check the presence of value or particular variable. 
11. Collection class 
    Final class extends Object class. Provides reduction operations, like accumulating elements into collections, summarizing elements accoridng to various criteria etc. 
12. ForEach() method
    Provides a new method forEach() to iterate the elements. Defined in iteraable and Stream interfaces. 
    Default method defined in the Iterable interface. Collection classes which extends iterable interface can use forEach() to iterate elements. 
    Take a single argument, functional interface. Can pass lambda expression as an argument 
13. Nashorn JavaScript Engine
    Nashorn is a JavaScript engine. Used to execute JavaScript code dynamically at JVM (Java Virtual Machine). Provides a command-line tool jjs, used to execute JavaScript code.
    execute: using jjs command line tools and embedding into Java source code 
14. Parallel Array Sorting 
    Provides a new additional feature in Arrays class which is used to sort array elements parallelly. The parallelSOrt() method has added to java.util.Arrays class that uses the JSR 166 Fork/Join parallelism common pool to provide soring to arrays. It is an overloaed method. 
15. Type and Repating Annotations 
16. IO Enhancements 
17. Concurrency Enhancements 
18. JDBC Enhancements 
19. StringJoiner
    Added a new final class StringJoiner in java.util package. Used to construct a sequence of characters separated by a delimter. Create string by passing delimters like comma(,), hyphen(-)
20. Security Enhancements 
    
## Rest design, url, methods 

## Right view of tree 
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Max_level {
    int max_level;
}

class BinaryTree {
    Node root;
    Max_level max = new Max_level();

    void rightViewUtil(Node node, int level, Max_level max_level) {
        if (node == null) return;

        if(max_level.max_level < level) {
            System.out.println(node.data + " ");
            max_level.max_level = level;
        }
    }

    rightViewUtil(node.right, level+1, max_level);
    rightViewUtil(node.left, level+1, max_level);
}

void rightView() {
    rightView(root);
}

void rightView(Node node) {
    rightViewUtil(node, 1, max);
}

public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
         
        tree.rightView();
 
}
}



## What is Spring Boot? 
Platform for Java developers, stand-alone and production-grade spring application. Minimum configrations without the need for an entire SPring configuration setup. 

Advantages
1. Easy to understand and develop spring applications
2. Increases productivity 
3. Reduces the development time 

Goals 
1. Avoid complex XML configuration in Spring 
2. Develop a production ready Spring applications in an easier way 
3. Reduce the development time and run the application independently 
4. Offer an easiest way of getting started with application 

Why Spring Boot?
    It provides a flexible way to configure Java Beans, XML configurations, and Database Transactions.
    It provides a powerful batch processing and manages REST endpoints.
    In Spring Boot, everything is auto configured; no manual configurations are needed.
    It offers annotation-based spring application
    Eases dependency management
    It includes Embedded Servlet Container


    
## Bean scope in spring (#9) https://www.tutorialspoint.com/spring/spring_bean_scopes.htm
1. Singleton: this scopes the bean defintion to a single instance per Spring IoC container (default)
2. Prototype: this scopes a single bean defintion to have any number of object instances
3. Request: this scopes a bean defintion to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext
4. Session: this scopes a bean defintion to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
5. Global-session: this scopes a bean defintion to a global HTTP session. Only valid in  the context of a web-aware Spring ApplicationContext. 


## What is the singleton pattern? How to implement it? And when to use it? 
Singleton design pattern restricts the instantiation of a class to a single instance. In order to provide coorindated access to a certain resource, throughout an entire software system. Through this design pattern, the singleton class ensures that is is only instantiated once, and can provide easy access to the single instance. 

### Use case 
Common use-cases for the singleton design pattern include factories, builders and objects that hold program state. 

Singletons are sometimes considered to be an alternative to global variables or static classes. 

Compared to global varaibles, singletons have benefits:
1. Singleton instance fields don't take up space in the global namespace
2. Singletons may be lazily initialized 

Compared to static class, singleton holds an instantiated object, static classes do not: 
1. Singletons can implement interfaces 
2. Singletons can be passed as parameters
3. Singletons can have their instances swapped out (such as for testing purposes)
4. Singletons can be handled polymorphically, so there may exist multiple implementations 

Implementation: 
1. Typically implemented with a private constructor method, and a public static method to return the instance of the singleton - stored in a private static final variable. 
2. Two types of singleton implementations, diff in initialize the singleton instance, must consider thread-safety:
   1. eager: Singleton instance is created when the singleton variable is initialized, not when it is first used. May consum system resources unnecessarily. Thread-safe 
    public final class Singleton {
        private static final Singleton INSTANCE = new Singleton();
        private Singleton() {}

        public static Singleton getInstance() {
            return INSTANCE;
        }
    }
   2. lazy initialization: created when the static getInstance method is first called. Ensures singleton instance only consumes system resources when it is absolutely necessary. Not thread safe. Singleton instance may be created multiple times, in a program with multiple threads, all using the Singleton class simultaneously. Might threads receiving a partially-created singleton object. 

   public final class Singleton {
       private static Singleton instance = null;
       private Singleton() {}

       public static Singleton getInstance() {
           if (instance == null) {
               instance = new Singleton();
           }
           return instance;
       }
   }
   3. Thread-safe lazy initialization: thread-safe use of synchronization. Instance variable is now also declared as volatile, which ensures that all threads have an updated view of the singleton instance. 
   public final class Singleton {
       private static volatile Singleton instance = null;
       private Singleton() {}

       public static Singleton getInstance() {
           if (instance == null){
               synchronized(Singleton.class) {
                   if (instance == null) {
                       instace = new Singleton();
                   }
               }
           }
           return instance;
       }

   }

## What is the result in the console? 
Int data;
^
  symbol:   class Int
  location: class Operation
1 error

after correct Int to int: before and after both are 0 



## Get the string, find the maximum number in this string and return it
Example: ajnfjn100jnvjnf400jnjnjn

int max_num = Integer.MIN_VALUE;

for(int i = lne-1; i >= 0; i--)
{
    if(s[i] >= 0 && s[i] <= 9)
    {
        int temp = s[i];
        i--;
        while((i >= 0) && (s[i] >= 0) && (s[i] <= 9))
        {
            temp += temp*10 + s[i];
            i--;
        }

        if(temp > max_num) {
            max_num = temp;
        }
    }

}

return max_num;