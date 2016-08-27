package pattern.behavioral.visitor;

public abstract class MasterObjectPart {
    void acceptMOPVisitor(MasterObjectPartVisitor visitor){
        visitor.visit(this);
    }
}
