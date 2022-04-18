package Publish_Subscriber;

public class weiXinUser implements Observer{

    private String name;

    public weiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
