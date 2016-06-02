package pattern.structural.facade;


public class Client {

    public static void main(String[] args) {
        SubSystemB b = new SubSystemB();
        SubSystemC c = new SubSystemC();

        SubSystemFacade subSystemFacade = new SubSystemFacade();
        subSystemFacade.setB(b);
        subSystemFacade.setC(c);
        subSystemFacade.createSubSystemCData(1100);
    }



}
