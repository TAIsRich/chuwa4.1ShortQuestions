package pattern.factorymethod;


public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();

        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
