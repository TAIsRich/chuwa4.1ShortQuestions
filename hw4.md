# quiz

```
1. What are the types of design patterns in Java?
```

* Creational pattern:
  Way in which objects arecreated,eg:Immutable,Singleton,Factory
* Structural pattern:
  How to assemle and structure large objects
* Behavioral pattern:
  Strategy,Observer

```
2. What are the SOLID Principles?
```

* single responsibility principle,
* open-closed principle,
* Liskov substitution principle,
* interface segregation principle,
* dependency inversion principle.

```
3. How can you achieve thread-safe singleton patterns in Java?
```

1. **Use synchronized block inside the if loop and volatile variable**
   `

```
public class Dog {

*     private static volatile Dog dog;
*
*     private Dog(){
*
*     }
*
*     //懒汉式
*
*     public static Dog getInstance(){
*         if(dog==null){
*           syschronized(Dog.class){
*               if(dog==null){
*                   dog = new Dog();
*               }
*           }
*           
*         }
*         return dog;
*     }
*
````

```
1. What do you understand by the Open-Closed Principle (OCP)?
```

It uses interfaces to allow different implementations which you can easily substitute without changing the code that uses them. The interfaces are closed for modifications, and you can provide new implementations to extend the functionality of your software.






