package pattern.behavioral.observer;

public interface Worker {
    void attachObserver(Observer observer);
    void detachObserver(Observer observer);
    void change();
}
