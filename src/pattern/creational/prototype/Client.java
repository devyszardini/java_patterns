package pattern.creational.prototype;

/**
 * Created by devys on 25/05/16.
 */
public class Client {
    public static void main(String[] args) {

        ObjectA objectA = new ObjectA();
        objectA.setString("objectA");
        AbsObjectTool tool = new AbsObjectTool(objectA);
        AbsObject absObject = tool.createObject();
        System.out.println("instance = "+absObject.getClass());
        System.out.println("s = "+absObject.gets());

        objectA.setString("change objectA");

        absObject = tool.createObject();
        System.out.println("s = "+absObject.gets());

        ObjectB objectB = new ObjectB();
        objectB.setString("objectB");

        tool.setAbsObject(objectB);
        absObject = tool.createObject();
        System.out.println("instance "+absObject.getClass());


    }
}
