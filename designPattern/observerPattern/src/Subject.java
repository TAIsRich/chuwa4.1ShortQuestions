public interface Subject {
    void  attach(Observer observer);    //添加观察者对象

    void detach(Observer observer);

    void notify(String message);
}
