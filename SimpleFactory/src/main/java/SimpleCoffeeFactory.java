public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("latte")) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("No such coffee");
        }

        return coffee;
    }
}
