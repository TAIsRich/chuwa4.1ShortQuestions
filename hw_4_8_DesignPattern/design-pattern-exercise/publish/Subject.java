public interface Subject {

    void attach(Observer observer);

    void update(String message);

}