

# Assignment

```
1. What is Interface and whatis abstract class? What are the differences between them?
```

 Interface

* Object interaction is through methods they expose
* behaviours are objects interface - group of related methods
* Program to interface
* Allows class to become more formal , its called promise/contract to outside world or fellow dev's
* compiler enforces the contract

Abstract class

* class that is declared abstract.
* it may or may not include abstract methods
* Abstract classes cannot be instantiated, but they can be subclassed
* Used to share code with several closely related classes
* Share common fields. Methods
* Have non-static and non-final fields.
* Design choice
* Graphics
* Rectangle, square,
* User in ecommerce system., Biz user and individual user.
* Buyer vs seller

**

---

##

```
2.What is the differences  between overriding and overloading?
```

Overloading:

When two or more methods in the same class have the same name but different parameters

Overriding:

When the method signature (name and parameters) are the same in the superclass and the child class

```
3. What is final key word?
(Filed, Method, Class)
```

When a method is declared with final keyword,
A final method cannot be overridden.

```
4.  What is Java garbage collection?
```

Java garbage collection is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

```
5. What is the differences between super and this?
```

super() is used to call Base class's constructor(Parent's class) while this() is used to call current class's constructor.

```
6. Can we use this keyword in constructor and why?
```

**this** is a reference to the current object-whose method or constructor is being called.
we can refer to any member of the current object from within an instance method or a constructor by using **this**

```
7. What is
Runtime/unchecked exception? what is Compile/Checked Exception?
```

**Runtime Exception**

Runtime exception Not a compile exception

* Not a compile time exception - not detected by compiler and only found at runtime.
* Program is unrecoverable and cannot process anymore



A checked exception is caught at compile time whereas a runtime or unchecked exception is, as it states, at runtime.

**Checked Exception**

* Checked Exception
* Compiled time exception.
* Compiler expects to handled at compile time , otherwise code will not compile.

Checked exceptions are also known as **compile-time exceptions** as these exceptions are checked by the compiler during the compilation process to confirm whether the exception is handled by the programmer or not. If not, then the system displays a compilation error.

```
8. what is the difference between throw and throws?
```

The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code

```
9.Run the below three
   pieces codes, Noticed the printed exceptions.  why do we put the
   Null/Runtime exception before Exception?
```

Because all other exception inherit from Exception ,they are not allowed to throw before Exception(最大的异常放到最后)




