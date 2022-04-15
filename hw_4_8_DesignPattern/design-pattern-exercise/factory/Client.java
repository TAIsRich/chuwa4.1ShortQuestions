public class Client {
    public static void main(String[] args) {

        /** CoffeeStore store = new CoffeeStore();

        Coffee coffee = store.orderCoffee(type: "latte");

        System.out.println(coffee.getName());
         **/


        CoffeeStore store = new CoffeeStore();
        Coffee coffe = store.orderCoffee(type: "lattel");

        System.out.println(coffee.getName());
    }
}