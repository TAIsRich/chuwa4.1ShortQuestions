1. Interface contains abstract method, such as "bark", "fly", "swim". A class can implement many interface; Abstract class can have abstract and non-abstract method. A class can only extend one abstract class.

2. Overriding allow subclass to have a method that already had in the super class. Overloading allows different methods have same method name.

3. Final keyword make class, variable and methods unchangeable, and cannot inherit or override.

4. When java programs run on JVM, objects are created on the heap. When the objects are no longer needed, the garbage collector will find them and delete to free up memory.

5. Super points to a reference of super class, this points to a reference of current class.

6. super() and this() can be used only once inside constructor.

7. Checked exceptions are checked at compile time. Unchecked exceptions are happened in run time, such as "out of bounds".

8. throw is used to create a custom error. throws indicates what exception type may be thrown by a method.

9. put more specific exception to help know what exactly error is.