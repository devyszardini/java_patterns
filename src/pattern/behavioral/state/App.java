package pattern.behavioral.state;

public class App {
    private AppState state = new AppStateB(this);
    public void stateA(){
        state.stateA();
    }
    public void stateB(){
        state.stateB();
    }
    public void stateC()throws Exception{
        state.stateC();
    }

    public void setState(AppState state) {
        this.state = state;
    }
}
