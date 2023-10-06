package lucas.loanItems;

public class LoanItem {
    private int id;
    private String type;
    private String title;
    private static int nextId = 1;


    public LoanItem(String type, String title) {
        id = nextId++;
        this.type = type;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}