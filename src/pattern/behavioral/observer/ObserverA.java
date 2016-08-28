package pattern.behavioral.observer;

public class ObserverA implements Observer{
    @Override
    public void update() {
        this.setStatus("STATUS changed");

    }

    public void setStatus(String text){
        System.out.println("ObserverA "+text);
    }
}
