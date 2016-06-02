package pattern.structural.bridge;


public class Client {
    public static void main(String[] args) {
        Type1Feature type1Feature = new Type1Feature();
        type1Feature.setFeatureImplementation(new FeatureImplementationA());
        type1Feature.doType1();
        type1Feature.setFeatureImplementation(new FeatureImplementationB());
        type1Feature.doType1();
    }
}
