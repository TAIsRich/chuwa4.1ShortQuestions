package factory;

public class AF_ItalyDessertFactory implements AF_DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new tiramisu();
    }
}
