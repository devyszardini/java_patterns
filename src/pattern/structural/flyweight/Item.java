package pattern.structural.flyweight;




public class Item {
    private String value;
    public Item(String value){
        this.value=value;
        System.out.println("New Item created with value = "+value );
    }
    public String getValue(){return value;}
}
