package pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<Resource>resources = new ArrayList<>();

    public Application(List<Resource> resources) {
        this.resources = resources;
    }

    public void useResources(){
        for (Resource resource:resources) {
            resource.useResource();
        } 
    }
}
