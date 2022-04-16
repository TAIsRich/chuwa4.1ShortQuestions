// Java Program to write double checked locking
// of Singleton class

class Singleton {
    private volatile static Singleton instance;

    private Singleton() {}

    // 1st version: creates multiple instances if two thread
    // access this method simultaneously
    public static Singleton getInstance1()
    {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    // 2nd version : this is thread-safe and only
    // creates one instance of Singleton on concurrent
    // environment but it is unnecessarily expensive due to
    // cost of synchronization at every call.
    public static synchronized Singleton getInstance2()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 3rd version : An implementation of double checked
    // locking of Singleton. Intention is to reduce cost
    // of synchronization and improve performance, by only
    // locking critical section of code, the code which
    // creates instance of Singleton class.
    public static Singleton getInstance3()
    {
        if (instance == null) {
            synchronized (Singleton.class)
            {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
