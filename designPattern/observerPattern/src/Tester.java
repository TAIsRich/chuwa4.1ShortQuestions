public class Tester {
    public static void main(String[] args){
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //订阅公众号（添加observer）
        subject.attach(new WeiXinUser("Zeng"));
        subject.attach(new WeiXinUser("Mary"));
        subject.attach(new WeiXinUser("Chen"));
        //公众号更新，放松消息给订阅者（observer）
        subject.notify("专栏已更新！");

    }
}
