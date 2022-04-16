package Publish_Subscriber;

public class Test {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        subscriptionSubject.attach(new weixinUser("sunwukong"));
        subscriptionSubject.attach(new weixinUser("zhubajie"));
        subscriptionSubject.attach(new weixinUser("tangseng"));

        subscriptionSubject.notify("hahahahaha");
    }
}
