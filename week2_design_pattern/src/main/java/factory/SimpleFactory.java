package factory;

public class SimpleFactory {

    public Coffee createcoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        }else if("latte".equals(type)) {
            coffee = new latteCoffee();
        }
        return coffee;
    }
}
