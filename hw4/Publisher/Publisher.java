public interface Observer{
    void update(String message);
}
public class weixinUser {
    public class weixinUser implements Observer{
        //微信用户名
        private String name;
        public weixinUser(String name){
            this.name = name;
        }

        @Override
        public void update(String message) {
            System.out.println(name+"_" + message);
        }
    }
}

//三种方法
public interface Subject{
    //增加订阅者
    public void attach(Observer observer);
    //删除订阅者
    public void detach(Observer observer);
    //通知订阅者
    public void notify(String message);
}

//储存订阅公众号
public class SubscriptionSubject implements Subject{
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist){
            observer.update(message);
        }
    }
}

//客户端程序
public class Client{
    public static void main(String[] args){
        SubscriptionSubject mSubscriptionSubject= new SubscriptionSubject();
        //创建微信用户
        weixinUser user1 = new weixinUser("孙悟空")；
        weixinUser user2 = new weixinUser("猪八戒")；
        weixinUser user3 = new weixinUser("沙悟净")；
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("传智黑马的专栏更新了");
    }
}

//警察抓小偷
public class Thief extends Observable{
    private String name;
    public Thief(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void steal(){
        System.out.println("小偷：我偷东西了，有没有人来抓我！")；
        super.setChanged();
        super.notifyObservers();
    }
}
//警察是观察者需要让其实现Observer接口
public class Policeman implements Observer{
    private String name;
    public Policeman(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public void update(Observer o,Object arg) {
        System.out,println("警察"+((Thief)o).getName()+",我已经盯你很久了")；
    }
}
//客户端代码
public class Client{
    public static void main(String[] args){
        //创建小偷对象

    }
}