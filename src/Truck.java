public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    @Override
    public void check(Transport transports) {
        super.check(transports);
        super.checkEngine();
        super.checkTrailer();
    }
}
