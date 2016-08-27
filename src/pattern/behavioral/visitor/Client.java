package pattern.behavioral.visitor;


public class Client {


    public static void main(String[] args) {
        MasterObject masterObject = new MasterObject();
        masterObject.getObjectParts().add(new PartA());
        masterObject.getObjectParts().add(new PartA());
        masterObject.getObjectParts().add(new PartA());
        masterObject.getObjectParts().add(new PartA());
        masterObject.getObjectParts().add(new PartB());
        masterObject.getObjectParts().add(new PartB());
        masterObject.getObjectParts().add(new PartC());
        masterObject.function1();
        masterObject.function2();
        masterObject.function3();
    }
}
