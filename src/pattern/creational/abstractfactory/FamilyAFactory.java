package pattern.creational.abstractfactory;

/**
 * Created by devys on 25/05/16.
 */
public class FamilyAFactory implements FamilyFactory{

    @Override
    public FamilyObject1 createFamilyObject1() {
        return new FamilyAObject1();
    }

    @Override
    public FamilyObject2 createFamilyObject2() {
        return new FamilyAObject2();
    }
}
