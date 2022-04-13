package Singleton;

public final class LazySingleton {
    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private static LazySingleton instance;
}
