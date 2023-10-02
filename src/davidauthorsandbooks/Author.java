package davidauthorsandbooks;

import java.util.ArrayList;

public class Author {
    private String name;
    private String gender;
    private String email;
    private ArrayList<Book> books;

    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;

        books = new ArrayList<Book>();

    }
    // Getters
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    // Set email
    public void setEmail(String email) {
        this.email = email;
    }

    // Adds book
    public void addBook(Book book) {
        books.add(book);
    }
}
