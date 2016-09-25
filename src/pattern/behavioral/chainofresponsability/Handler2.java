package pattern.behavioral.chainofresponsability;

public class Handler2 extends Handler{
    @Override
    public void handleChain() {
        System.out.println("handling 2");
        if (next!=null)next.handleChain();
    }
}
