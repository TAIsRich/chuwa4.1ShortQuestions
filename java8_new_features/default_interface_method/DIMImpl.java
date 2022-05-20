package java8_new_features.default_interface_method;

public class DIMImpl implements DIMLearn, DIMNew {
    /* only override add
     substract is default method, not necessary to override
     but have to override add
     */

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    //method 1: create own default method
    default int substract(int a, int b) {
        return a*a - b;
    }

    //method 2: use super
    public int substract(int a, int b) {
        DIMLearn.super.substract(a, b);
    }
}