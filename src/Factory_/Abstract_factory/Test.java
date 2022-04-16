package Factory_.Abstract_factory;

public class Test {
    public static void main(String[] args) {
        ItailyDessertFactory factory = new ItailyDessertFactory();
        Coffee coffee = factory.creatCoffee();
        Dessert dessert = factory.creatDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
