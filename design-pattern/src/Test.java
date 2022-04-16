public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);

        StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
