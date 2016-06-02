package pattern.creational.factory;

/**
 * Created by devys on 22/05/16.
 */
public class CarFactory extends TransportFactory {

    @Override
    Transport create() {
        return new Car();
    }
}
