package pattern.structural.flyweight;


import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<Item>items= new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    public void useItems(){
        for (Item item:items) {
            System.out.println(item.getValue());
        }
    }
}
