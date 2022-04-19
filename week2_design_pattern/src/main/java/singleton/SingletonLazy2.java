package singleton;

public class SingletonLazy2 {

    private SingletonLazy2() {}

    private static SingletonLazy2 instance:

    public static synchronized SingletonLazy2 getInstance() {

        if(instance == null) {
            instance = new SingletonLazy2();
        }
        return instance;
    }

}
