package pattern.behavioral.template;

public abstract class Template {

    public int result(){
        return (int) (hookA()*hookB()+hookC());
    }

    abstract int hookA();
    abstract double hookB();
    abstract int hookC();
}
