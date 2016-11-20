package pattern.additional.dto;

public class Service {
    public ItemDTO getDto(){
        ItemDTO dto = new ItemDTO();
        Item item = getItem();
        dto.setString1("Property 1");
        dto.setString2("Property 2");
        return dto;
    }
    private Item getItem(){
        return new Item();
    }
}
