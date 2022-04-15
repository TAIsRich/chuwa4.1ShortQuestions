package Factory_.Factory_Method;

public class LatteFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
