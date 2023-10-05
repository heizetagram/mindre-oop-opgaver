package Lucas.LoanItems;

public class LoanItem {
    private int id;
    private String type;
    private String title;

    public LoanItem(int id, String type, String title) {
        this.id = id;
        this.type = type;
        this.title = title;
    }

    public LoanItem(String type, String title) {
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

