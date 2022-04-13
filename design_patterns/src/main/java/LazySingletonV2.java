public final class LazySingletonV2 {
    private LazySingletonV2() {}

    public static LazySingletonV2 getInstance() {
        if (instance == null) {
            synchronized (LazySingletonV2.class) {
                if (instance == null) {
                    instance = new LazySingletonV2();
                }
            }
        }
        return instance;
    }

    private static volatile LazySingletonV2 instance;
}
