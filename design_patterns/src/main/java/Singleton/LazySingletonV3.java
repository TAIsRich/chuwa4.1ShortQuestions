package Singleton;

public final class LazySingletonV3 {

    private LazySingletonV3() {}

    private static class LazySingletonV3Holder {
        private static final LazySingletonV3 INSTANCE= new LazySingletonV3();
    }

    public static LazySingletonV3 getInstance() {
        return LazySingletonV3Holder.INSTANCE;
    }
}
