package Singleton;

public class Client {
    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton instance1 = EagerSingleton.getInstance();
        System.out.println(instance == instance1);

        EagerSingletonV2 instance_v2 = EagerSingletonV2.getInstance();
        EagerSingletonV2 instance_v2_1 = EagerSingletonV2.getInstance();
        System.out.println(instance_v2 == instance_v2_1);

        LazySingleton lazy_instance = LazySingleton.getInstance();
        LazySingleton lazy_instance1 = LazySingleton.getInstance();
        System.out.println(lazy_instance == lazy_instance1);

        LazySingletonV2 lazy_instance_v2 = LazySingletonV2.getInstance();
        LazySingletonV2 lazy_instance_v2_1 = LazySingletonV2.getInstance();
        System.out.println(lazy_instance_v2 == lazy_instance_v2_1);

        LazySingletonV3 lazy_instance_v3 = LazySingletonV3.getInstance();
        LazySingletonV3 lazy_instance_v3_1 = LazySingletonV3.getInstance();
        System.out.println(lazy_instance_v3 == lazy_instance_v3_1);
    }
}

