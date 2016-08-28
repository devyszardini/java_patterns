package pattern.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

public class Observee implements Worker{

    List<Observer>observers= new ArrayList<>();

    public void changed(){
        change();
    }

    @Override
    public void attachObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void detachObserver(Observer observer) {
        this.observers.remove(observer);

    }

    @Override
    public void change() {
        for (Observer observer : observers){
            observer.update();
        }

    }
}
