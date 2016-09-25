package pattern.behavioral.chainofresponsability;

public class Handler1 extends Handler{
    @Override
    public void handleChain() {
        System.out.println("handling 1");
        if (next!=null)next.handleChain();
    }
}
