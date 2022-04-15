public class Singleton {

    private Singleton () {}

    private static volatile Singleton instance;

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.calss) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}