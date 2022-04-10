1. Interface has a collection of unimplemented methods (only method header without method body). It represents a contract, and any class that implements the interface must implement every method of the interface. The class header must contain an “implements” keyword to use the interface. The purpose of the interface is to make sure that the class will implement all the methods from the interface, for example, if a class implements Comparable interface, then that class must implement compareTo method. 
Abstract class represents generic concepts. It can have both implemented methods and abstract (unimplemented) methods. You can make the method abstract if you want your child classes to have different behavior for that method. The class header must contain an “extends” keyword to use the abstract class. The child classes that extend the abstract class will inherit all the implemented methods from the abstract class.

2.  Override modifies the behavior of a method (different implementation from the original method). The difference between overriding and overloading is that when you override a method, the method will have the same signature, meaning the same method name and same parameters. In overloading, you can have multiple methods that have the same name but different parameters.

3. “final” keyword in java means you cannot modify the variable or method. So, if a method has a final keyword that means you cannot override that method. If a variable is declared and initialized with final, then you cannot modify its value.

4. Java garbage collection is Java's way of managing memory behind the scenes. It removes unused objects, variables or functions in the memory to reclaim the memory space for the upcoming objects or functions.

5. super keyword is used to access the parent’s methods or variables. this keyword is used to access the current object’s methods or variables.

6. Yes, we can use the “this” keyword in the constructor. “this” keyword refers to the current object, and it’s used to prevent the confusion between the current object’s attributes and the parameters passed in the constructor.

7. Runtime/Unchecked exceptions are checked during runtime, so the program will crash and stop executing next steps if an error occurs. Compile/Checked exceptions are checked during compile time, so it will handle the error, and the program will not crash, and it will continue executing next steps.

8. “throw” is used inside the method and throw the exception . “throws” is used in function header meaning the function can lead to exception.

9. The exceptions are checked orderly (top to bottom), so for example, in the code, if null exception occurs, it will check the code starting from the top, ArithmeticException, and since it’s null exception, it will be caught in the NullPointerException catch block, and the remaining exceptions catch block will be checked. Therefore, we need to put the null/runtime exception before the Exception block, and even if we put them after the Exception block, the compiler will throw an error saying it’s already handled by the exception block. 