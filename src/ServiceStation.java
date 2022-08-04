public class ServiceStation  {

    public void checkTransport(Transport transports) {
        if (transports != null) {
                System.out.println("Work with " + transports.getModelName());
                for (int a = 0; a < transports.getWheelsCount(); a++) {
                    transports.updateTyre();
                }
            }
        }
    }
