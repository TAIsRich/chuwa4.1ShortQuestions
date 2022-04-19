package factory;

public class FM_LatteCoffeeFactory implements FM_CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
