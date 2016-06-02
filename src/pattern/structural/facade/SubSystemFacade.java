package pattern.structural.facade;

/**
 * Created by devys on 29/05/16.
 */
class SubSystemFacade {

    private SubSystemB b;
    private SubSystemC c;

    void setB(SubSystemB b) {
        this.b = b;
    }

    void setC(SubSystemC c) {
        this.c = c;
    }

    void createSubSystemCData(int data){

        SubSystemA a = b.createSubSYstemA(data);
        c.createCwithA(a);
    }
}
