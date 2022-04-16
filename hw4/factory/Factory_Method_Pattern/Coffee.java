package factory.Factory_Method_Pattern;

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
    private CoffeeFactory factory;
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}


interface CoffeeFactory {
    Coffee createCoffee();
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

class LatteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}


class AmericanoCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}

class client{
            public static void main(String[] args) {
              CoffeeStore store=new CoffeeStore();
              CoffeeFactory factory=new AmericanoCoffeeFactory();
              store.setFactory(factory);
              Coffee coffee=store.orderCoffee();
                System.out.print(coffee.getName());

            }
        }