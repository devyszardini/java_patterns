package pattern.behavioral.strategy;



public class Client {
    public static void main(String[] args) {

        Application application = new Application();

        System.out.println("Next = "+ application.calculateNext());

        application.setAlgorithm(new AlgorithmC());

        System.out.println("Next = "+ application.calculateNext());


    }



}
