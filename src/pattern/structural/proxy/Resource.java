package pattern.structural.proxy;

public class Resource {

    protected String locator;

    public Resource(){}
    public Resource(String locator){
        this.locator=locator;
        System.out.println("locadinf resource");
    }
    public void useResource(){
        System.out.println("use resource from "+locator);
    }
}
