package pattern.creational.prototype;

/**
 * Created by devys on 25/05/16.
 */

public class ObjectA extends AbsObject {

    private String s;

    @Override
    public AbsObject clone() {
        ObjectA objectA = new ObjectA();
        objectA.setString(this.s);
        return objectA;
    }

    @Override
    public String gets() {
        return s;
    }

    public  void setString(String s){this.s = s;}
}
