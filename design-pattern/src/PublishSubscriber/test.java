package PublishSubscriber;

public class test {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        subscriptionSubject.attach(new User("xue"));
        subscriptionSubject.attach(new User("bin"));
        subscriptionSubject.attach(new User("dong"));

        subscriptionSubject.notify("hello");
    }
}
