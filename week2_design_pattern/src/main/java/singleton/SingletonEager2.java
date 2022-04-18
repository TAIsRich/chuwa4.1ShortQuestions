package singleton;

public class SingletonEager2 {

    private SingletonEager2() {}

    private static SingletonEager2 instance;

    static{
        instance = new SingletonEager2();
    }

    public SingletonEager2 getInstance() {
        return instance;
    }
}
