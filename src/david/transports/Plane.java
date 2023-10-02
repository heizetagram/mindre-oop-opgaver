package david.transports;

public class Plane extends Vehicle {

    public Plane(Boolean isEngineStarted) {
        super(isEngineStarted);
    }

    public void fly() {
        if (getEngineIsStarted()) {
            System.out.println("Flying...");
        } else {
            System.out.println("Engine must be on");
        }
    }
}
