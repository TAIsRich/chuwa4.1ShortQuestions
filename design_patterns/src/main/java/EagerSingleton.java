/*
 * @className: Singleton
 * @Description: eager singleton
 * */

public final class Singleton {

    // Constructor
    private Singleton() {}

    // Static Instance
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
