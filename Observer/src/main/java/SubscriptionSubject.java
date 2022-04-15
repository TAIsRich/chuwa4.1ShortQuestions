import java.util.*;

public class SubscriptionSubject implements Subject {
    private List<Observer> weXinUserList = new ArrayList<>();

    public  void attach(Observer observer) {
        weXinUserList.add(observer);
    }
    public void detach(Observer observer) {
        weXinUserList.remove(observer);
    }
    public void notify(String message) {
        for (Observer observer: weXinUserList) {
            observer.update(message);
        }
    }
}
