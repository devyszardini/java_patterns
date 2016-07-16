package pattern.behavioral.command;


public class CommandB extends AbstractCommand{

    private String undotext;
    private String textToBeAdded;


    public CommandB(Application application,String textToBeAdded) {
        super(application);
        this.textToBeAdded = textToBeAdded;
    }

    @Override
    public void action() {
        undotext = getApplication().getText();
        getApplication().setText(getApplication().getText()+textToBeAdded);

    }

    @Override
    public void undo() {
        getApplication().setText(undotext);
    }
}
