package pattern.behavioral.chainofresponsability;

public abstract class Handler {
    protected Handler next;
    public abstract void handleChain();

    public void setNext(Handler next) {
        this.next = next;
    }
}