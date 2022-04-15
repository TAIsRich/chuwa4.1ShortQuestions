public interface Observer{
    void update(String message);
}
public class weixinUser {
    public class weixinUser implements Observer{

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


public interface Subject{

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notify(String message);
}


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


public class Client{
    public static void main(String[] args){
        SubscriptionSubject mSubscriptionSubject= new SubscriptionSubject();

        weixinUser user1 = new weixinUser("孙悟空")；
        weixinUser user2 = new weixinUser("猪八戒")；
        weixinUser user3 = new weixinUser("沙悟净")；

        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);

        mSubscriptionSubject.notify("传智黑马的专栏更新了");
    }
}


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

public class Client{
    public static void main(String[] args){
     

    }
}