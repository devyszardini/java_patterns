package pattern.behavioral.visitor;

public class Function1MOPVisitor implements MasterObjectPartVisitor{
    @Override
    public void visit(MasterObjectPart masterObjectPart) {
        System.out.println("Function 1 on "+masterObjectPart.getClass().getSimpleName());
    }
}
