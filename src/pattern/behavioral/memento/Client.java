package pattern.behavioral.memento;

import pattern.behavioral.observer.*;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Worker worker = new Worker();
        originator.setA(1);
        originator.setB(2);
        worker.saveState(originator);
        originator.calculate();
        originator.setA(3);
        originator.setB(4);
        Originator originator1 = new Originator();
        worker.restoreState(originator1);
        originator.calculate();
        originator1.calculate();
        worker.restoreState(originator);
        originator.calculate();
    }
}
