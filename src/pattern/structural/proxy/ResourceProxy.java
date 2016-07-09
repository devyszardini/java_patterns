package pattern.structural.proxy;

public class ResourceProxy extends Resource{

    private Resource resource;

    public ResourceProxy(String locator) {
        super();
        this.locator = locator;
    }

    @Override
    public void useResource() {
        if (resource==null){
            resource = new Resource(locator);
        }
        resource.useResource();
    }
}
