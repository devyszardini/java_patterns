package pattern.behavioral.state;


public class Client {
    public static void main(String[] args)throws Exception {
        App app = new App();
        app.stateA();
        app.stateC();
        app.stateB();
//        app.stateC();
    }
}
