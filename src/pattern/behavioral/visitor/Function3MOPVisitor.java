package pattern.behavioral.visitor;

public class Function3MOPVisitor implements MasterObjectPartVisitor{
    @Override
    public void visit(MasterObjectPart masterObjectPart) {
        System.out.println("Function 3 on "+masterObjectPart);
    }
}
