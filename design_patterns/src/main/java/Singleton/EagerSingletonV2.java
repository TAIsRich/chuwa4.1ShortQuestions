package Singleton;

public final class EagerSingletonV2 {
    // Constructor
    private EagerSingletonV2() {}

    // Static Instance
    private static EagerSingletonV2 instance;

    static {
        instance = new EagerSingletonV2();
    }

    public static EagerSingletonV2 getInstance() {
        return instance;
    }
}
