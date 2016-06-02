package pattern.structural.bridge;


public class Feature {

    private FeatureImplementation implementation;

    public void doFeature(int x,int y,String str){
        implementation.doFeature(x,y,str);
    }

    public void setFeatureImplementation(FeatureImplementation implementation){
        this.implementation = implementation;
    }
}
