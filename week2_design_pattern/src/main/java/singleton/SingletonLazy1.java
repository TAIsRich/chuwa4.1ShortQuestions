package singleton;

public class SingletonLazy1 {

    private SingletonLazy1() {}

    private SingletonLazy1 instance;

    public SingletonLazy1 getInstance() {
        if(instance == null) {
            instance = new SingletonLazy1();
        }
        return instance;
    }

}
