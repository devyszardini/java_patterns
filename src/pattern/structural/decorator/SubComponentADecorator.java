package pattern.structural.decorator;

public class SubComponentADecorator extends ComponentDecorator{

    public SubComponentADecorator(Component component) {
        super(component);
    }

    @Override
    public void doComponent() {
        System.out.println("Add SubComponentA");
        component.doComponent();
    }
}
