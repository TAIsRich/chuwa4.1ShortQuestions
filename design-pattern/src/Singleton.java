//Eager initialization 1
public class Singleton {
    //1.first step: private constructor
    private Singleton() {}

    //2. create an object inside its class
    private static Singleton instance = new Singleton();

    //3. provide a method to use that object
    public static Singleton getInstance() {
        return instance;
    }
}
