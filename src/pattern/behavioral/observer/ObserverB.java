package pattern.behavioral.observer;

public class ObserverB implements Observer{
    @Override
    public void update() {
        this.setStatus(1);

    }

    public void setStatus(int value){
        System.out.println("ObserverB STATUS change to "+value);
    }
}
