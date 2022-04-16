package Publish_Subscriber;

public interface Subject {
    void attach(Observer observer );
    void deattch(Observer observer);
    void notify(String message);
}
