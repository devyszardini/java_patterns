package pattern.behavioral.template;

public class Action1 extends Template {
    @Override
    int hookA() {
        return 100;
    }

    @Override
    double hookB() {
        return 24;
    }

    @Override
    int hookC() {
        return 10000;
    }
}
