package factory.simplefactory;

//simple factory 1.0
public abstract class Coffee {
    public abstract String getName();
    public void addsugar(){
        System.out.println("add sugar"); }
    public void addMilk(){
        System.out.println("add milk");
    }
}

class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory=new SimpleCoffeeFactory();
        Coffee coffee=factory.createCoffee(type);

        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}

class SimpleCoffeeFactory {
/*there are some people who like to make the
method that create object as static,
you just add static on method declaration below*/

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
class LatteCoffee extends Coffee{
    public String getName(){
        return "latte coffee";
    }

}


class AmericanoCoffee extends Coffee{
public String getName(){
        return "American Coffee";
        }}


class client{
            public static void main(String[] args) {
                CoffeeStore store =new CoffeeStore();
                Coffee coffee = store.orderCoffee("latte");
                System.out.println(coffee.getName());
            }
        }