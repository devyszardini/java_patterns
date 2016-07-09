package pattern.structural.proxy;


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        ResourceProxy resource1 =  new ResourceProxy("resource 1 locator");
        ResourceProxy resource2 =  new ResourceProxy("resource 2 locator");
        List<Resource>resources = new ArrayList<Resource>();
        resources.add(resource1);
        resources.add(resource2);
        Application application = new Application(resources);
        System.out.println("App set up");
        application.useResources();

    }



}
