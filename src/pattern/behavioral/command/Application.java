package pattern.behavioral.command;



import java.util.LinkedList;
import java.util.Queue;

public class Application {
    private String text;
    private Queue queue = new LinkedList();
    private void exeAction(Command command){
        command.action();
        queue.add(command);
    }
    private void undo(){
        Command command =(Command) queue.poll();
        if (command!=null)command.undo();
    }

    public String getText() {
        return text;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.setText("12345");
        CommandA commandA = new CommandA(application);
        application.exeAction(commandA);
        System.out.println("the tsxt is "+application.getText());
        application.undo();
        System.out.println("the tsxt is "+application.getText());
        CommandB commandB = new CommandB(application,"add this");
        application.exeAction(commandB);
        System.out.println("the tsxt is "+application.getText());
    }
}
