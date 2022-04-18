package Publish_Subscriber;

public class Client {
    public static void main(String[] args) {

        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new weiXinUser("sun"));
        subject.attach(new weiXinUser("zhu"));
        subject.attach(new weiXinUser("sha"));

        subject.notify("gengxin");
    }

}
