package david.catlimb;

import java.util.ArrayList;

public class Flap {
    private String status;
    private UI ui = new UI();
    private ArrayList<Cat> registeredCats;
    private boolean allowOnlyIn;
    private boolean allowOnlyOut;
    private boolean allowInAndOut;
    private boolean closeFlap;

    // Constructor
    public Flap() {
        closeFlap();
    }

    // Getters
    public String getStatus() {
        return status;
    }
    public boolean getAllowOnlyIn() {
        return allowOnlyIn;
    }
    public boolean getAllowOnlyOut() {
        return allowOnlyOut;
    }
    public boolean getAllowInAndOut() {
        return allowInAndOut;
    }
    public boolean getCloseFlap() {
        return closeFlap;
    }

    // FLAP MODE: ONLY IN
    public void allowOnlyIn() {
        allowOnlyOut = false;
        allowOnlyIn = true;
        allowInAndOut = false;
        closeFlap = false;
        status = "ONLY IN";
    }

    // FLAP MODE: ONLY OUT
    public void allowOnlyOut() {
        allowOnlyOut = true;
        allowOnlyIn = false;
        allowInAndOut = false;
        closeFlap = false;
        status = "ONLY OUT";
    }

    // FLAP MODE: IN/OUT
    public void allowInAndOut() {
        allowOnlyOut = false;
        allowOnlyIn = false;
        allowInAndOut = true;
        closeFlap = false;
        status = "IN/OUT";
    }

    // FLAP MODE: CLOSED
    public void closeFlap() {
        allowOnlyOut = false;
        allowOnlyIn = false;
        allowInAndOut = false;
        closeFlap = true;
        status = "CLOSED";
    }
}
