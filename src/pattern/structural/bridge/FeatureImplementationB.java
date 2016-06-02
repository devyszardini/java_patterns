package pattern.structural.bridge;

public class FeatureImplementationB extends FeatureImplementation {


    @Override
    public void doFeature(int x, int y, String str) {
        System.out.println("Feature Implementation B with x = "+x+" y = "+y+" and type "+str);
    }
}
