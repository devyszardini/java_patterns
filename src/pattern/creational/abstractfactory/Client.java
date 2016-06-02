package pattern.creational.abstractfactory;

/**
 * Created by devys on 25/05/16.
 */
public class Client {

    public static void init(FamilyFactory factory) {
        initgui(factory.createFamilyObject1(),factory.createFamilyObject2());

    }

    public static void initgui(FamilyObject1 familyObject1,FamilyObject2 familyObject2) {
        System.out.println("init logic goes here with "+familyObject1.getClass().getName()+" and "+familyObject2.getClass().getName());
    }

    public static void main(String[] args) {

        FamilyFactory factory = new FamilyAFactory();
        init(factory);
        factory = new FamilyBFactory();
        init(factory);
    }
}
