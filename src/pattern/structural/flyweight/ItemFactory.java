package pattern.structural.flyweight;


import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
    private Map<String,Item>itemMap = new HashMap<String, Item>();
    public Item createItem(String key){
        Item item = itemMap.get(key);
        if (item==null){
            item = new Item(key);
            itemMap.put(key,item);
        }
        return itemMap.get(key);
    }
}
