package david.catlimb;

import david.ui.ConsoleColors;

public class Cat {
    private String name;
    private static int nextId = 127;
    private int id;
    private boolean registered;

    // Constructor
    public Cat(String name) {
        this.name = name;
        id = nextId++;
        registered = false;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "[" + name + ", ID = " + ConsoleColors.BLUE_BRIGHT + id + ConsoleColors.RESET + "]";
    }
}
