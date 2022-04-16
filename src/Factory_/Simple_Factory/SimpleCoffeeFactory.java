package Factory_.Simple_Factory;

public class SimpleCoffeeFactory {
    public Coffee creatCoffee(String type){
        Coffee coffee = null;
        if("AmericaCoffee".equals(type)){
            coffee = new AmericaCoffee();
        }else if("LatteCoffee".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("Wrong input");
        }
        return coffee;
    }
}
