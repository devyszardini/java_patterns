package pattern.behavioral.command;


public abstract class AbstractCommand implements Command{
    private Application application;

    public AbstractCommand(Application application) {
        this.application = application;
    }

    public Application getApplication() {
        return application;
    }
}
