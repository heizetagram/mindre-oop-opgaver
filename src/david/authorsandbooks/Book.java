package david.authorsandbooks;

public class Book {
    private String title;
    private Author author;
    private int numPages;

    // Constructor
    public Book(String title, Author author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getNumPages() {
        return numPages;
    }
}
