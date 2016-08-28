package pattern.behavioral.memento;

public class Originator {
    private int a;
    private int b;
    public void calculate(){
        System.out.println("Originator, point a = "+a+" : point b = "+b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Memento createMemento(){
        return new Memento(a,b);
    }

    public void setMemento(Memento memento){
        a = memento.getA();
        b = memento.getB();
    }
}
