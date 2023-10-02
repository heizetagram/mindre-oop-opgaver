package david.transports;

public class Car extends Vehicle {

    public Car(boolean isEngineStarted) {
        super(isEngineStarted);
    }

    public void drive() {
        if (getEngineIsStarted()) {
            System.out.println("Driving...");
        } else {
            System.out.println("Engine must be on");
        }
    }
}
