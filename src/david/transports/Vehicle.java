package david.transports;


public abstract class Vehicle {
    private boolean engineIsStarted;

    public Vehicle(Boolean engineIsStarted) {
        this.engineIsStarted = engineIsStarted;
    }

    // Getter
    public boolean getEngineIsStarted() {
        return engineIsStarted;
    }

    // Start engine method
    public void startEngine() {
        engineIsStarted = !engineIsStarted; // Toggles between true/false
    }
}
