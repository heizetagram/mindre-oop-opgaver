package david.loanitems;

public class Entertainment {
    private String title;
    private String type;
    private int id;
    private static int nextId = 1;

    // Constructor
    public Entertainment(String title, String type) {
        this.id = nextId++;
        this.title = title;
        this.type = type;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public int getID() {
        return id;
    }
    public String getType() {
        return type;
    }
}
