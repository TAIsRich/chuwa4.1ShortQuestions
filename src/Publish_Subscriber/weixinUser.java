package Publish_Subscriber;

public class weixinUser implements Observer{
    private String name;

    public weixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);

    }
}
