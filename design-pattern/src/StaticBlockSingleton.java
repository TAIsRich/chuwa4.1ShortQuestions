//Eager initialization 2
public class StaticBlockSingleton {

    private StaticBlockSingleton() {}

    private static StaticBlockSingleton instance;

    //why use static block : can add exception handling
    static {
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception when creating singleton instance");
        }
    }


    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
