package factory.abstractfactory;

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
        return "latte coffee\n";
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
                ItalyDessertFactory factory=new ItalyDessertFactory();
              Coffee coffee=factory.createCoffee();
              Dessert dessert=factory.createDessert();

                System.out.print(coffee.getName());
            dessert.show();
            }
        }

        abstract class Dessert{
        public abstract void show();
        }

        class Tiramisu extends Dessert{
    public void show(){
        System.out.println("trimisu");
    }
        }

        class MatchaMousse extends Dessert{
    public void show(){
        System.out.println("MatchaMousse");
    }
        }

        interface DessertFactory{
    Coffee createCoffee();
    Dessert createDessert();
        }

class AmericanDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}

class ItalyDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
    public Dessert createDessert() {
        return new Tiramisu();
    }
}