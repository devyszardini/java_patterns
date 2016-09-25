package pattern.behavioral.chainofresponsability;

public class Client {
    public static void main(String[] args) {
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        handler1.setNext(handler2);
        handler1.handleChain();
    }
}
