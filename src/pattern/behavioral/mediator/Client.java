package pattern.behavioral.mediator;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ObjectA a = new ObjectA();
        ObjectB b = new ObjectB();
        DirectorImp imp = new DirectorImp();
        imp.setB(b);
        a.setDirector(imp);
        a.getItems().add("one");
        a.getItems().add("two");
        a.getItems().add("three");
        a.selectedItem(2);
        System.out.println("Selected value = "+b.getValue());
    }
}
