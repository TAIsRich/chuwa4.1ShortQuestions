HomeWork_2
=
1.What is Interface and what is abstract class? What are the differences between them?  
1)Interface:  when you declare an interface, every method inside is public and abstract  
2)Abstract class:when you declare an abstract class, you can override the method in the subclasses  
3)Difference:subclass can extend one abstract class,but can implement multi-interfaces. In the abstract class, you can have not-abstract class,but interface only have abstract class.

2.What is the differences between overriding and overloading?  
1)Overriding:the method signature (name and parameters) are the same but in the superclass and the child class  
2)Overloading:two or more methods in the same class have the same name but different parameters  

3.What is final key word? (Filed, Method, Class)  
Final field means its value is constant and can't be changed.  
Final method means it can't be overridden in the subclasses  
Final class means it can't be extended.
  
4.What is Java garbage collection?  
Java garbage collection is the process by which Java programs perform automatic memory management.It only delete unreferenced objects in the heap and it happens time by time.

5.What is the differences between super and this?   
This points to a reference of the current class, while the super points to a reference of the parent class. This usually be used when an instance variable is shadowed by a parameter of a method

6.Can we use this keyword in constructor and why?  
We can use this keyword in constructor. When we use this at the first command, it can call another overloaded constructor in the same class.

7.What is Runtime/unchecked exception? what is Compile/Checked Exception?  
Runtime/unchecked: an exception that occurs at the time of execution and is ignored at the time of compilation, it doesn't need to be handled  
Compile/checked:exceptions that are checked at compile time and must be handled either by re-throwing or with a try catch block  

8.what is the difference between throw and throws?  
The throws keyword is used to declare which exceptions can be thrown from a method. It shows multiple possibilities, but it won't throw anything if nothing happens.  
The throw keyword is used to explicitly throw an exception within a method or block of code.If this works,it must throw the exception.

9.Run the below three pieces codes, Noticed the printed exceptions.  why do we put the Null/Runtime exception before Exception?  
When there are multiple catch commands, JVM will check from top to bottom. Once it matches the catch command, it will skip the rest. We need to put subclasses in front of parent class. Otherwise the subclass will never be caught.