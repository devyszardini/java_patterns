package pattern.behavioral.memento;

public class Memento {
    private int a;
    private int b;

    public Memento(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
