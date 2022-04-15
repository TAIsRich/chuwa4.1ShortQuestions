import java.io.IOException;
import java.io.Serializable;

//eager mode
public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
//static eager mode
class Singleton{
    private Singleton(){}
    private staic Singleton instance;
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
        }

//lazy mode
public class Singleton2 {
    //私有构造方法
    private Singleton2(){}
    //在成员位置创建该类的对象
    private static Singleton2 instance;
    // 对外提供静态方法获取该对象
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

}

// lazy mode thread safe
public class Singleton3 {

    private Singleton3 (){}

    private static Singleton instance;
    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}

//double check lock
public class Singleton53 {
    private Singleton53() {
    }

    private static Singleton53 instance;

    public static Singleton53 getInstance() {
        if (instance == null) {
            synchronized (Singleton53.class) {
                if (instance == null) {
                    instance = new Singleton53();

                }
            }

        }
        return instance;
    }
}

public class Singletonvol {
    private Singletonvol(){}
    private static volatile Singletonvol instance;
    public static Singletonvol getInstance(){
        if(instance == null){
            synchronized (Singletonvol.class){
                if(instance == null){
                    instance = new Singletonvol();
                }
            }
        }
        return instance;
    }
}

//枚举方式
 public enum Singleton{
    INSTANCE;
}

//hack singleton serialization
public class Singleton4 implements Serializable {
    private Singleton4() {
    }

    private static class SingletonHolder {
        private static class SingletonHolder() {
            private static final Singleton INSTANCE = new Singleton();
        }

        //对外提供静态方法获取该对象
        public static Singleton4 getInstance() {
            return SingletonHolder.INSTANCE;
        }
    }
}

//hack singleton refeflection
public class Singleton5 {
    private Singleton5(){}
    private static volatile Singleton instance;
    public static Singleton5 getInstance(){
        if(instance != null){
            return instance;
            }
        instance = new Singleton5();
        return instance;
        }
    }

}

//anti serializable
public class Singleton6 implements Serializable{
    private Singleton6(){}
    private static class SingletonHolder{
        private static final Singleton6 INSTANCE = new Singleton();

    }
    public static Singleton6 getInstance(){
        return SingletonHolder.INSTANCE;
    }
    //下面是为了解决序列化反序列化破解单例模式
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}

//anti reflection
public class Singleton7{
    private Singleton7(){}
    if(instance != null){
        throw new RuntimeException();

    }

}
private static volatiles Singleton7 instance;

public static Singleton7 getInstance(){
    if(instance != null){
        return instance;
        }
    sychronized (Singleton.class){
        if(instance != null){
            return instance;
        }
        instance = new Singleton7();
        return instance;
        }
        }
        }


 //使用runtime类的方法
public class RuntimeDemo{
    public static void main(String[] args) throws IOExcption{
        //获取Runtime 类对象
        Runtime runtime = Runtime.getRuntime();
        //返回Java虚拟机中的内存总量
        System.out.println(runtime.totalMemory());
        System.out.println(runtime,maxMemory());
        Process process = runtime.exec("ipconfig");
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024*1024*100];
        int b = inputStream.read(arr);
        System.out.println(new String(arr,0,b,"gbk"));
    }
 }




