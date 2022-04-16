package Singleton;

//Eager1：静态成员变量
//public class Singleton {
//    // 私有构造
//    private  Singleton(){}
//
//    //在本类中创建本类对象
//
//    private static Singleton instance = new Singleton();
//
//    //提供公告访问方式
//
//    public static Singleton getInstance(){
//        return instance;
//    }
//
//}

//Eager2:静态代码块
//public class Singleton {
//    // 私有构造
//    private Singleton(){}
//
//
//    //申明类型变量
//    private static Singleton instance;
//
//
//    //赋值
//    static {
//        instance = new Singleton();
//    }
//
//    //提供公告访问方式
//    public static Singleton getInstance(){
//        return instance;
//    }

//Lazy1: thread-unsafe
//public class Singleton {
//    // 私有构造
//    private Singleton() {
//    }
//
//
//    //申明类型变量
//    private static Singleton instance; //null
//
//
//
//    //提供公告访问方式
//    public static Singleton getInstance() {
//        //判断是否已存在instance，若存在直接return
//        if(instance ==null){
//            //多线程会创造多个instance;
//            instance = new Singleton();
//
//        }
//            return instance;
//
//
//
//    }

//Lazy2: thread-safe
//    public class Singleton {
//        // 私有构造
//        private Singleton() {
//        }
//
//
//        //申明类型变量
//        private static Singleton instance; //null
//
//
//
//        //提供公告访问方式
//        public static synchronized Singleton getInstance() {
//            //判断是否已存在instance，若存在直接return
//            if(instance ==null){
//                //多线程会创造多个instance;
//                instance = new Singleton();
//
//            }
//            return instance;
//
//
//
//        }

////Lazy3 : double check
//    public class Singleton {
//        // 私有构造
//        private Singleton() {
//        }
//
//        //申明类型变量
//        private static Singleton instance; //null
//
//        //提供公告访问方式
//        public static volatile Singleton getInstance() {
//            //判断是否已存在instance，若存在不加syn直接return
//            if(instance ==null){
//                synchronized (Singleton.class){
//                    if(instance ==null){
//                        instance = new Singleton();
//                    }
//                }
//                instance = new Singleton();
//            }
//            return instance;
//
//
//
//        }


//Lazy4 : static 内部类
//public class Singleton {
//    // 私有构造
//    private Singleton() {
//    }
//
//    //申明类型变量
//    private static class SingletonHolder {
//        private static final Singleton instance = new Singleton();
//    }
//
//    //提供公告访问方式
//    public static Singleton getInstance() {
//
//
//        return SingletonHolder.instance;
//
//    }
//
//}

//Eager3: Enum thread-safe
public enum Singleton {

   INSTANCE;



    }
