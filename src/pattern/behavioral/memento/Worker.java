package pattern.behavioral.memento;

public class Worker {
    private Memento memento;
    public void saveState(Originator originator){
        memento = originator.createMemento();

    }
    public void restoreState(Originator originator){
        originator.setMemento(memento);

    }
}
