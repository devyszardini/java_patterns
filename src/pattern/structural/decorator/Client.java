package pattern.structural.decorator;

public class Client {

    public static void main(String[] args) {
        Component component = new Component();
        SubComponentADecorator aDecorator = new SubComponentADecorator(component);
        SubComponentBDecorator bDecorator = new SubComponentBDecorator(aDecorator);
        bDecorator.doComponent();
    }


}
