package Singleton;

public class Client {
    public static void main(String[] args) {
        // 创建singleton类的对象
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        //判断同一个
        System.out.println(instance == instance1);
    }
}
