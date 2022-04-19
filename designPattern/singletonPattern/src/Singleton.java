public class Singleton {
    private static volatile Singleton instance; //使用 volatile 关键字, 解决双重检查锁模式带来空指针异常的问题，可以保证可见性和有序性。

    private Singleton(){
        System.out.println("Singleton(): Initializing Instance");
    }
    public static Singleton getInstance(){
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null){
            synchronized (Singleton.class){
                //抢到锁之后再次判断是否为null
                if(instance == null){
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("doSomething(): Singleton does something!");
    }
}
