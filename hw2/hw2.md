1. What is Interface and what is abstract class? What are the differences between them?

For Interface the differences are:
• all method in interface are public and abstract by default
• all variable (ex. Int) are Final and Static by default
• you can add default in front of interface's method to add definition
• you can also make method final static, then you can have definition too. (again static, you don’t have to instantiate object in main, u just • use it like Test.meth1();
• subclass can implement multiple diff interfaces
• sub-class can uses implements keyword in to inherit declaration from super-interface.
• but you can use extends keyword in sub-interface to inherit declaration from super-interface
• interface can't have constructors
• you must implement definition all all declaration in interface

for abstract class the differences are:
• the min requirement is, it only require one abstract method to be an abstract class. so it may have many non-abstract members.
• it uses extends keyword in sub to inherit declaration from abstract superclass.
• the method declaration in abstract need to add abstract in front
• subclass can only extend from one superclass (abstract in this case)
• it can have constructor

2. What is the differences between overriding and overloading?

overriding: means you declare a method in superclass,
and then you wanna refine(override) the method definition.
but the condition is the method signature need to be exactly the same.
adding @override is recommended. incase you mistype one of the signature.

overloading: means you got multiple constructor or method
with the same return type, access identifier, name, but with **different parameter**

3)What is final key word? (Filed, Method, Class)

it lock the variable, method, class.
so you cant change the value or content of it.

4)What is Java garbage collection?
say for example.
you created String a= new String();
String a1= new String(); //this object will be garbage collected
a1=a;

it remove any object without a reference in the heap.
to reduce strain on memory.

5)What is the differences between super and this?
super can access super class fields
this can access super and sub class's fields

for ex:
public class square {
private double length;
private double width;
int x = 10;}

class cube extends square {
private double height;
int b = 20;

**super** can only access fields: length, width, x

**this** can access fields: length,width,x , height, b

6)Can we use this keyword in constructor and why?

yes you can, the reason is **this** is referring to the class variable
if you name the constructor variable with the same name as class variable.
the constructor variable will shadowed the scope. you use this.  
to assign constructor variable to this.class variable

7）What is Runtime/unchecked exception? what is Compile/Checked Exception?

unchecked exception it includes: ArithmeticException, IndexOutOfBoundException, NullpointerException

checked exception is includes: ClassNotFoundException, IOException, InterruptedException, NumberFormatException,RuntimeException

checked exceptions you must handle them with try catch block. java will force you to do it, else you get compile error.

uncheck exception you dont, it is optional to handle with try block.

8）what is the difference between throw and **throws?**

throws:
if you use throw in a method, then you must declare throws in the method signature.

throw:
it is use to send back an exception and string message back to its method call.
and

throw rules: 1) you can use throw in runtime/uncheck exception (ex. ArithmeticException) without declaring throws Exception in the method 2) you must declare throws Exception in the method, when you use throw in compile/checked exceptions
or you can try and catch while using throw

9.  because ArithmeticException,IndexOutOfBoundException,NullpointerException
    are children of runtime exceptions. a superclass would shadow a child class.
    since it included all the children exceptions.
