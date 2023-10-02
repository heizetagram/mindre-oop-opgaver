package davidauthorsandbooks;

import java.util.ArrayList;

public class Program {
    ArrayList<Author> authors;
    Author author1;
    Author author2;
    Author author3;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;

    // Initalizes the variables
    private void initVars() {
        authors = new ArrayList<>();
        author1 = new Author("H.C. Andersen", "Male", "hcandersen@gmail.com");
        author2 = new Author("J.K. Rowling", "Female", "jkrowling@gmail.com");
        author3 = new Author("Astrid Lindgren", "Female", "al@hotmail.com");
        book1 = new Book("Den Grimme Ælling", author1, 70);
        book2 = new Book("Fyrtøjet", author1, 50);
        book3 = new Book("Den Lille Havfrue", author1, 100);
        book4 = new Book("Harry Potter I", author2, 500);
        book5 = new Book("Harry Potter II", author2, 600);
        book6 = new Book("Pippi Langstrømpe", author3, 160);
        book7 = new Book("Harry Potter III", author2, 800);
    }

    public static void main(String[] args) {
        new Program().run();
    }

    // Run method
    private void run() {
        initVars();

        // Adds 'author1' and 'author2' to the 'authors' ArrayList
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        // Uses addBook method in class 'Author' to add books to each author's 'book' ArrayList
        author1.addBook(book1);
        author1.addBook(book2);
        author1.addBook(book3);
        author2.addBook(book4);
        author2.addBook(book5);
        author2.addBook(book7);
        author3.addBook(book6);

        author1.setEmail("hcanders12@gmail.com"); // Sets new e-mail

        System.out.println("AUTHORS AND BOOKS:");
        // Traverses through ArrayList 'authors' and for each element in the list, print and start a new for-loop
        for (int i = 0; i < authors.size(); i++) {
            Author author = authors.get(i);
            System.out.printf("%-20s %-11s %20s%n", author.getName(), author.getGender(), author.getEmail());
            // Traverses through each author's bibliography and gets the title and page number for each book
            for (int b = 0; b < author.getBooks().size(); b++) {
                Book book = author.getBooks().get(b);
                System.out.printf("%3s %-44s %4s%n", "",book.getTitle(), book.getNumPages());
            }
        }
    }
}

