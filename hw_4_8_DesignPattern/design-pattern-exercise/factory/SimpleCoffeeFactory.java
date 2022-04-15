public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {

        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new ArmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RunteimeException("Sorry")
        }

        return coffee;
    }
}