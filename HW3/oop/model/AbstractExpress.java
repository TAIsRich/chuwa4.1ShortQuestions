package oop.expense.model;

/**
 * abstract class
 *@ClassName AbstractExpress
 *@Description TODO
 */
public abstract class AbstractExpress {

    private String name;// express name

    public AbstractExpress(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
