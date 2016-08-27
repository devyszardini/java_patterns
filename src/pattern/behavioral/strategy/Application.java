package pattern.behavioral.strategy;

public class Application {
    private Algorithm algorithm = new AlgorithmA();
    public int calculateNext(){
        return algorithm.calculateNext();
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
}
