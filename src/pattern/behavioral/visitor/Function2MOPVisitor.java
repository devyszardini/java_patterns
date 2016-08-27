package pattern.behavioral.visitor;


public class Function2MOPVisitor implements MasterObjectPartVisitor{
    @Override
    public void visit(MasterObjectPart masterObjectPart) {
        System.out.println("Function 2 on "+masterObjectPart);
    }
}
