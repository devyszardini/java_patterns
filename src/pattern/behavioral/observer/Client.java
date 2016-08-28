package pattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Observee observee = new Observee();
        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();

        observee.attachObserver(a);
        observee.attachObserver(b);

        observee.changed();
    }
}
