package pattern.structural.bridge;

public class FeatureImplementationA extends FeatureImplementation {


    @Override
    public void doFeature(int x, int y, String str) {
        System.out.println("Feature Implementation A with x = "+x+" y = "+y+" and type "+str);
    }
}
