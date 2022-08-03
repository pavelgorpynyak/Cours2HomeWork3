public abstract class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName = modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount = wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() { System.out.println("Change the wheel"); }

    public void checkEngine() {
        System.out.println("Check engine");
    }

    public void checkTrailer() {
        System.out.println("Check trailer");
    }

    public void check(Transport transports) {
        serviceStation.checkTransport(transports);
    }

    ServiceStation serviceStation = new ServiceStation();
}