package pattern.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Application application = new Application();
        String itemsToAdd = "testing the flyweight pattern aa bb cc";
        int lenght= itemsToAdd.length();
        ItemFactory factory = new ItemFactory();
        for (int i=0;i<=lenght-1;i++){
            String value = itemsToAdd.substring(i,i+1);
            application.addItem(factory.createItem(value));
        }
        application.useItems();

    }
}
