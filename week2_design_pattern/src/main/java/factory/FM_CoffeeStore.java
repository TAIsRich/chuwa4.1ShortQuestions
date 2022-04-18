package factory;

public class FM_CoffeeStore {

    private FM_CoffeeFactory factory;

    public void setFactory(FM_CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        return coffee;
    }
}
