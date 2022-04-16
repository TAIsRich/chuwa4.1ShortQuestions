package Factory_.Factory_Method;

public class AmericaFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee();
    }
}
