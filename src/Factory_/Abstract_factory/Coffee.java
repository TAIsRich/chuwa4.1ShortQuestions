package Factory_.Abstract_factory;

public abstract class Coffee {
    public void addSugar(){
        System.out.println("add sugar");
    }

    public void addMilk(){
        System.out.println("add milk");
    }

    public abstract String getName();
}
