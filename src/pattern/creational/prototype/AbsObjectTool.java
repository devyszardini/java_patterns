package pattern.creational.prototype;

/**
 * Created by devys on 25/05/16.
 */
public class AbsObjectTool {

    private AbsObject absObject;

    public AbsObjectTool(AbsObject absObject){
        this.absObject=absObject;
    }

    protected AbsObject createObject(){
        return absObject.clone();
    }

    public void setAbsObject(AbsObject absObject) {
        this.absObject = absObject;
    }
}
