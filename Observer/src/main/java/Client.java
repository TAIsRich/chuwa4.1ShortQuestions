public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeixinUser("monkey"));
        subject.attach(new WeixinUser("pig"));
        subject.attach(new WeixinUser("person"));

        subject.notify("we have updates");
    }
}
