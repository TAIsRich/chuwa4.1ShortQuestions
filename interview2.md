# Interview Part 2

## 1. Design Pattern : Singleton, Factory

### Singleton: 

Singleton pattern as the name suggests is used to create one and only instance of a class.
Formally the Singleton pattern is defined as **ensuring that only a single instance of a class exists and a global point of access to it exists**.

Eager Instantiation：

```Java
// Static initializer based Java implementation of
// singleton design pattern
class Singleton
{
	private static Singleton obj = new Singleton();
	private Singleton() {}
	public static Singleton getInstance()
	{
		return obj;
	}
}

```

lazy instantiation

```Java
// Thread Synchronized Java implementation of
// singleton design pattern
class Singleton
{
	private static Singleton obj;

	private Singleton() {}

	// Only one thread can execute this at a time
	public static synchronized Singleton getInstance()
	{
		if (obj==null)
			obj = new Singleton();
		return obj;
	}
}

```

(Best): Use "Double Checked Locking" 

```Java
// Double Checked Locking based Java implementation of
// singleton design pattern
class Singleton
{
	private static volatile Singleton obj = null;

	private Singleton() {}

	public static Singleton getInstance()
	{
		if (obj == null)
		{
			// To make thread safe
			synchronized (Singleton.class)
			{
				// check again as multiple threads
				// can reach above step
				if (obj==null)
					obj = new Singleton();
			}
		}
		return obj;
	}
}

```

### Factory

<https://www.tutorialspoint.com/design_pattern/factory_pattern.htm>

In this pattern, objects are created without specifying their exact class.
This is achieved by specifying in an interface and implementing by child classes, or, by implementing in a base class and overriding by child classes.

**Step 1**
Create an interface
```Java
public interface Shape{
    void draw();
}
```

**Step 2**
Create concrete classes implementing the same interface.
```Java
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
```

**Step 3**
Create a Factory to generate object of concrete class based on given information.

```Java
public class ShapeFactory {
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}
```

**Step 4**
Use the Factory to get object of concrete class by passing an information such as type.

```Java
public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      //get an object of Circle and call its draw method.
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of square
      shape3.draw();
   }
}
```

### Abstract Factory Pattern

<https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm>

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

**Step 1**
Create an interface
```Java
public interface Shape{
    void draw();
}
```

**Step 2**
Create concrete classes implementing the same interface.

```Java
public class RoundedRectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside RoundedRectangle::draw() method.");
   }
}
public class RoundedSquare implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside RoundedSquare::draw() method.");
   }
}
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
```

**Step 3**
Create an Abstract class to get factories for Normal and Rounded Shape Objects.

```Java
public abstract class AbstractFactory {
   abstract Shape getShape(String shapeType) ;
}
```

**Step 4**
Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.

```Java
public class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }	 
      return null;
   }
}
public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      }	 
      return null;
   }
}

```

**Step 5**
Create a Factory generator/producer class to get factories by passing an information such as Shape

```Java
public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundedShapeFactory();         
      }else{
         return new ShapeFactory();
      }
   }
}

```

**Step 6**
Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.

```Java
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      //get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape3.draw();
      //get an object of Shape Square 
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape4.draw();
      
   }
}
```

## 2. Spring Bean
<https://www.baeldung.com/spring-bean>
<https://www.javainuse.com/spring/SpringBootInterviewQuestions>

- They are the objects that form the backbone of the user’s application.
Beans are managed by the Spring IoC container.
- They are instantiated, configured, wired and managed by a Spring IoC container
- Beans are created with the configuration metadata that the users supply to the container. 

## 3. Questions related to previous experience 

## 4. Find a Unique Character in the string.

```Java
public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap<>();
    String str = "asdasewer";
    for (int i = 0; i < str.length(); i++){
        map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }
    List<Character> result = new LinkedList<>();
    for (Character c: map.keySet()){
        if (map.get(c) == 1){
            result.add(c);
        }
    }
}
```

## 5. Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

```Java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    
    boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left != null && right != null)
            return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
        return false;
    }
}
```