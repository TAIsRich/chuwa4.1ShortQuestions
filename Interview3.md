# Interview Questions:

**Coding:**

## Question on Tree

- a. Class of N Student
- b. Some are infected and some are not
- c. Need to find the culprit (root), who was first got infected
- d. The person who is infected does not know how they got infected, but the person who infected them knows he infected them.

```Java
class Node {
    public boolean isInfected;
    public List<Node> children;
    public Node() {
        isInfected = false;
        children = new ArrayList<Node>();
    }
    public Node(boolean _isInfected) {
        isInfected = _isInfected;
        children = new ArrayList<Node>();
    }
    public Node(int _isInfected, ArrayList<Node> _children) {
        isInfected = _isInfected;
        children = _children;
    }

    
}

public class Students{
    public void addNewStudent(Node s){

    }

    public void setStudentInfected(Node s){

    }

    public Node findCulprit(Node s){
        
    }


    public static void main(String[] args) {
        Node s1 = new Node();
    }
}

```

## questions on abstract class, interface, singleton pattern, Database, how do you improve the performance of relational DB.

**Abstraction** is one of the Object-Oriented programming key features. It allows us to hide the implementation complexities just by providing functionalities via simpler interfaces. In Java, we achieve abstraction by using either an interface or an abstract class.

Java 8 introduced functional interfaces, an interface with a restriction of no more than one declared abstract method.

### Abstract class

An abstract class is nothing but a class that is declared using the abstract keyword. Abstract classes have **no restrictions on field and method modifiers**, while in an interface, all are **public by default**. 

Consider using abstract classes and inheritance when our problem makes the evidence “A is a B”. For example, “Dog is an Animal”, “Lamborghini is a Car”, etc.

```Java
public abstract class Vehicle {
    
    protected abstract void start();
    protected abstract void stop();
    protected abstract void drive();
    protected abstract void changeGear();
    protected abstract void reverse();
    
    // standard getters and setters
}

public class Car extends Vehicle {

    @Override
    protected void start() {
        // code implementation details on starting a car.
    }

    @Override
    protected void stop() {
        // code implementation details on stopping a car.
    }

    @Override
    protected void drive() {
        // code implementation details on start driving a car.
    }

    @Override
    protected void changeGear() {
        // code implementation details on changing the car gear.
    }

    @Override
    protected void reverse() {
        // code implementation details on reverse driving a car.
    }
}

@Test
void givenVehicle_whenNeedToDrive_thenStart() {

    Vehicle car = new Car("BMW");

    car.start();
    car.drive();
    car.changeGear();
    car.stop();
}

```

### Interface

Consider using the interface when our problem makes the statement “A is capable of [doing this]”. For example, “Clonable is capable of cloning an object”, “Drawable is capable of drawing a shape”, etc.

```Java
public interface Sender {
    void send(File fileToBeSent);
}
public class ImageSender implements Sender {
    @Override
    public void send(File fileToBeSent) {
        // image sending implementation code.
    }
}
```

### improve the performance of relational DB

1. Optimize Queries
2. Create optimal indexes
3. Get a stronger CPU
4. Allocate more memory
5. Data defragmentation
6. Disk Types
7. Database version

https://www.eversql.com/5-easy-ways-to-improve-your-database-performance/

https://www.synametrics.com/SynametricsWebApp/WPTop10Tips.jsp