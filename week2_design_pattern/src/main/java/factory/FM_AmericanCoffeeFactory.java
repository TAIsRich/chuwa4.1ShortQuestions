package factory;

public class FM_AmericanCoffeeFactory implements FM_CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
