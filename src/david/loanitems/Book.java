package david.loanitems;

public class Book extends Entertainment {
    public Book(String title) {
        super(title, "Book"); // Invokes 'Entertainment''s constructor
    }
}
