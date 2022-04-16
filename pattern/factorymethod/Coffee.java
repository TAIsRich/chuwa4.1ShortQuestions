package pattern.factorymethod;


public abstract class Coffee {

    public abstract String getName();

    public void addsugar() {
        System.out.println("Add sugar");
    }

    public void addMilk() {
        System.out.println("Add milk");
    }
}
