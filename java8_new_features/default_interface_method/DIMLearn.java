package java8_new_features.default_interface_method;

public interface DIMLearn {
    static final String BLOG = "is Chuwa a";
    int add(int a, int b);

    default int substract(int a, int b) {
        return a - b;
    }

    //static default method
    static String blogName() {
        return BLOG;
    }
}