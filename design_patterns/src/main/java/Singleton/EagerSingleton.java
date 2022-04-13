package Singleton;/*
 * @className: Singleton
 * @Description: eager singleton
 * */

public final class EagerSingleton {

    // Constructor
    private EagerSingleton() {}

    // Static Instance
    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
