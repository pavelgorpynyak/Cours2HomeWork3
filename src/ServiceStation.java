public class ServiceStation  {

    TransportServise transportServise = new TransportServise();

    public void check(Car[] cars) {
        checkTransport(cars);
        transportServise.checkEngine();
    }
    public void check(Truck[] trucks) {
        checkTransport(trucks);
        transportServise.checkEngine();
        transportServise.checkTrailer();
    }
    public void check(Bicycle[] bicycles) {
        checkTransport(bicycles);
    }
    public void checkTransport(Transport[] transports) {
        if (transports != null) {
            for (int i = 0; i < transports.length; i++) {
                Transport transport = transports[i];
                System.out.println("Work with " + transport.getModelName());
                for (int a = 0; a < transport.getWheelsCount(); a++) {
                    transportServise.updateTyre();
                }
            }
        }
    }
}
