package pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ObjectA {
    List<String>items = new ArrayList<>();
    private Director director;
    public void selectedItem(int itemNumber){
        String item = items.get(itemNumber);
        if (director!=null)director.selection(item);
    }

    public List<String> getItems() {
        return items;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
