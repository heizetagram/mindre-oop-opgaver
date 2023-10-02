package david.transports;

public class Ship extends Vehicle {

    public Ship(Boolean isEngineStarted) {
        super(isEngineStarted);
    }

    public void sail() {
        if (getEngineIsStarted()) {
            System.out.println("Sailing...");
        } else {
            System.out.println("Engine must be on");
        }
    }
}
