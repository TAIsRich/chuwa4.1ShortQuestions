public class Tester {
    public static void main(String[] args){
        CoffeeStore store = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
        System.out.println();

        CoffeeFactory factory2 = new LatteCoffeeFactory();
        store.setFactory(factory2);
        Coffee coffee2 = store.orderCoffee();
        System.out.println(coffee2.getName());
    }
}
