package pattern.structural.decorator;


public class ComponentDecorator extends Component{
    protected Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void doComponent() {
        component.doComponent();
    }
}
