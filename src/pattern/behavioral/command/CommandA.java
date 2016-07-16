package pattern.behavioral.command;


public class CommandA extends AbstractCommand{

    private String undotext = "";

    public CommandA(Application application) {
        super(application);
    }

    @Override
    public void action() {
        undotext = getApplication().getText();
        getApplication().setText("");
    }

    @Override
    public void undo() {
        getApplication().setText(undotext);
    }
}
