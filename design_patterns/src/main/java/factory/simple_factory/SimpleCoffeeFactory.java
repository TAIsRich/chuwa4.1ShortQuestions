package factory.simple_factory;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("latte")) {
            coffee = new LatteCoffee();
        } else if (type.equals("Americano")) {
            coffee = new AmericanoCoffee();
        } else {
            throw new RuntimeException("Sorry, the coffee you ordered does not exist");
        }

        return coffee;
    }
}
