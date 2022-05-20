package java8_newFeature.features.default_interface_method;

/**
 * @author Lifang Yan
 * @date 5/13/22
 */

public class Client {
    DIMImpl dim = new DIMImpl();
    System.out.println("Override method: " + dim.add(1, 2));
    System.out.println("default method: " + dim.sustract(1, 2));
    System.out.println("static method: " + DIMLearn.blogName());
}