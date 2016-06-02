package pattern.structural.decorator;

public class SubComponentBDecorator extends ComponentDecorator{

    public SubComponentBDecorator(Component component) {
        super(component);
    }

    @Override
    public void doComponent() {
        System.out.println("Add SubComponentB");
        component.doComponent();
    }
}
