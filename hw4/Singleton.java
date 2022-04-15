package Demo1;
/** *
 hungry
 style * static variables to create an object of the class */
public class Singleton {
    //constructor
    private Singleton() {}
    //Create an object of this class at the member position
    private static Singleton instance = new Singleton();
    //Provide a static method externally to get the object
    public static Singleton
    getInstance() { return instance;
    }
}
/** evil-style *
        create an object of this class in a static code block */
public class Singleton {
    //Private constructor
    private Singleton() {
    }

    //Create an object of this class at the member position
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    //Provide a static method externally to get the object
    public static Singleton
    getInstance() {
        return instance;
    }
}

/** * lazy *
 thread unsafe */
public class Singleton {
    //Private  constructor
    private Singleton() {
    }

    //Create an object of this class at the member position
    private static Singleton instance;

    //Provide a static method externally to get the object
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/** * lazy *
 thread safe */
public class Singleton {
    //Private constructor
    private Singleton() {
    }

    //Create an object of this class at the member position
    private static Singleton instance;

    //Provide a static method externally to get the object
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/** *
 Double check
 method */
public class Singleton {
    //Private constructor
    private Singleton() {
    }

    private static Singleton instance;

    //Provide a static method externally to get the object
    public static Singleton getInstance() {
//The first judgment, if the instance is not null,
// do not enter the lock grab stage, and return the instance directly
        if (instance == null) {
            synchronized (Singleton.class) {
                //After grabbing the lock, judge whether it is null again
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/** *
 Double check
 method */
public class Singleton {
//Private constructor
    private Singleton() {}
    private static volatile Singleton instance;
    //Provide a static method externally to get the object
    public static Singleton getInstance() {
   //The first judgment, if the instance is not null, do not enter
        // the lock grab stage, and directly return the actual
        if(instance == null) {
        }
    synchronized (Singleton.class) {
            //After grabbing the lock, judge whether it is empty again
        if(instance == null) { instance = new Singleton();
            }
        }
    } return instance;
}

/** builder */


//Bike class
public class Bike {
    private String frame;
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}

// abstract builder class
    public abstract class Builder {
    protected Bike mBike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
// mobike builder class
public class MobikeBuilder extends Builder {

    public void buildFrame() {
        mBike.setFrame("Aluminum alloy frame");
    }
    @Override
    public void buildSeat() {
        mBike.setSeat("Leather Seat");
    }
    @Override
    public Bike createBike() {
        return mBike;
    }
}
//ofo bike Builder class
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("Carbon Fiber Frame");
    }
    @Override
    public void buildSeat() {
        mBike.setSeat("rubber seat");
    }
    @Override
    public Bike createBike() {
        return mBike;
    }
}
//Director
class public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
//Test
class public class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct()
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
//abstract builder class
public abstract class Builder {
    protected Bike mBike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}

/** Publisher/ subscriber*/


public interface Observer {
    void update(String message);
}
public class WeixinUser implements Observer {
    // WeChat username
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name +
                "-" + message);
    }
}

public interface Subject {
    //Add subscribers
    public void attach(Observer observer);

    //delete the subscriber
    public void detach(Observer observer);

    //Notify subscribers to update the message
    public void notify(String message);
}



public class SubscriptionSubject implements Subject {
    //Store WeChat users who subscribe to the official account
    private List<Observer>;
    weixinUserlist = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
        @Override
        public void detach(Observer observer){
            weixinUserlist.remove(observer);
            }
            @Override
            public void notify(String message) {
                for (Observer observer : weixinUserlist) {
                    observer.update(message);
            }

        }
}
}



