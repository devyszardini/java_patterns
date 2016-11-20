package pattern.behavioral.state;

public class AppStateB implements AppState{

    private App app;

    public AppStateB(App app) {
        this.app = app;
    }

    @Override
    public void stateA() {
        System.out.println("Set State A");
        app.setState(new AppStateA(app));
    }

    @Override
    public void stateB() {
        System.out.println("Already in State B");
    }

    @Override
    public void stateC() throws Exception {
        throw new Exception("invalid state");
    }
}
