1. What are the types of design patterns in Java?

   There are about 26 Patterns currently discovered. These 26 can be classified into 3 types:

   1. Creational: These patterns are designed for class instantiation. They can be either class-creation patterns or object-creational patterns.

   2. Structural: These patterns are designed with regard to a class's structure and composition. The main goal of most of these patterns is to increase the functionality of the class(es) involved, without changing much of its composition.

   3. Behavioral: These patterns are designed depending on how one class communicates with others.

2. What are the SOLID Principles?

   1. Single Responsibility
   2. Open/Closed
   3. Liskov Substitution
   4. Interface Segregation
   5. Dependency Inversion

3. How can you achieve thread-safe singleton patterns in Java?
   1. Create the instance variable at the time of class loading.
   2. Synchronize the getInstance() method.
   3. Use synchronized block inside the if loop and volatile variable

4. What do you understand by the Open-Closed Principle (OCP)?
   
   It's now time for the O in SOLID, known as the open-closed principle. Simply put, classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.

