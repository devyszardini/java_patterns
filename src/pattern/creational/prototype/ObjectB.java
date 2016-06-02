package pattern.creational.prototype;

/**
 * Created by devys on 25/05/16.
 */
public class ObjectB extends AbsObject {

    private String s;

    @Override
    public AbsObject clone() {
        ObjectB objectB = new ObjectB();
        objectB.setString(this.s);
        return objectB;
    }

    @Override
    public String gets() {
        return s;
    }

    public  void setString(String s){this.s = s;}
}
