package pattern.behavioral.state;

public class AppStateA implements AppState{

    private App app;

    public AppStateA(App app) {
        this.app = app;
    }

    @Override
    public void stateA() {
        System.out.println("Reset State A");
    }

    @Override
    public void stateB() {
        System.out.println("Set State B");
        app.setState(new AppStateB(app));
    }

    @Override
    public void stateC() throws Exception {
        System.out.println("State A valid");
    }
}
