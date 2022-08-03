public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Transport transports) {
        super.check(transports);
        super.checkEngine();
    }
}
