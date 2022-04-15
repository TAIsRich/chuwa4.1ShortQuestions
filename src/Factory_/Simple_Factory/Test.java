package Factory_.Simple_Factory;

public class Test {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("AmericaCoffee");
        System.out.println(coffee.getName());
    }
}
