public class Client {
    public static void main (String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WeiXinUser(name: "A"));
        subject.attach(new WeiXinUser(name: "B"));
        subject.attach(new WeiXinUser(name: "C"));

        subject.notify("Updated");
    }
}