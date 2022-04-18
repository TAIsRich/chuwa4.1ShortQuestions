package singleton;

public class SingletonLazy3 {

    private SingletonLazy3() {}

    private SingletonLazy3 instance;

    public SingletonLazy3 getInstance() {
        if(instance == null) {
            synchronized (SingletonLazy3.class) {
                if(instance == null) {
                    instance = new SingletonLazy3();
                }
            }
        }
        return instance;
    }
}
