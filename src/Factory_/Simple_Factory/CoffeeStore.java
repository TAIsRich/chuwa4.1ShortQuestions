package Factory_.Simple_Factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.creatCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
