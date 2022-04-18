package singleton;

public class SingletonLazy4 {

    private  SingletonLazy4() {}

    private  static class SingletonHolder{
        private static final SingletonLazy4 INSTANCE = new SingletonLazy4();
    }

    public static SingletonLazy4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
