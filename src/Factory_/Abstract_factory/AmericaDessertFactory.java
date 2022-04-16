package Factory_.Abstract_factory;

public class AmericaDessertFactory implements DessertFactory{
    @Override
    public Coffee creatCoffee() {
        return new AmericaCoffee();
    }

    @Override
    public Dessert creatDessert() {
        return new Mochamusi();
    }
}
