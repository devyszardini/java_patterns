package pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class MasterObject {
    List<MasterObjectPart>objectParts = new ArrayList<>();

    public List<MasterObjectPart> getObjectParts() {
        return objectParts;
    }

    public void setObjectParts(List<MasterObjectPart> objectParts) {
        this.objectParts = objectParts;
    }

    public void function1(){
        Function1MOPVisitor visitor = new Function1MOPVisitor();
        for (MasterObjectPart objectPart:objectParts){
            objectPart.acceptMOPVisitor(visitor);
        }
    }

    public void function2(){
        Function2MOPVisitor visitor = new Function2MOPVisitor();
        for (MasterObjectPart objectPart:objectParts){
            objectPart.acceptMOPVisitor(visitor);
        }
    }

    public void function3(){
        Function3MOPVisitor visitor = new Function3MOPVisitor();
        for (MasterObjectPart objectPart:objectParts){
            objectPart.acceptMOPVisitor(visitor);
        }
    }
}
