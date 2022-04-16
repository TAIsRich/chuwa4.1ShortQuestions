package Factory_.Abstract_factory;

public class ItailyDessertFactory implements DessertFactory{
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert creatDessert() {
        return new Tilamisu();
    }
}
