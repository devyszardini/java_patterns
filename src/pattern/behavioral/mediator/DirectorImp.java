package pattern.behavioral.mediator;

public class DirectorImp implements Director{

    private ObjectB b;


    @Override
    public void selection(String item) {
        b.setValue(item);
    }

    public void setB(ObjectB b) {
        this.b = b;
    }
}
