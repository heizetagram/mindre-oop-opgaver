package david.loanitems;

import java.util.ArrayList;
import java.util.Scanner;

public class LoanItem {
    Scanner scan;
    ArrayList<Entertainment> items;
    int answerCounts;
    Book newBook;
    Video newVideo;

    // Initialize variables
    private void initVar() {
        scan = new Scanner(System.in);
        items = new ArrayList<>();
        answerCounts = 1;
    }

    public static void main(String[] args) {
        new LoanItem().run();
    }

    // Run method
    private void run() {
        initVar();

        System.out.println("How many loan items do you want to register?");
        int userAnswer = scan.nextInt();
        scan.nextLine(); // Scanner bug

        // Keep asking for ITEM no. until answerCounts is equal to user's int input
        while (answerCounts <= userAnswer) {
            System.out.println("ITEM no. " + answerCounts);
            System.out.print("What type? (B/V): ");
            String answer = scan.nextLine().toLowerCase();
            askType(answer);
            answerCounts++;
        }
        printListOfLoanItems();
    }

    // Creates a new Book/Video object and adds it to 'items' ArrayList
    private void askType(String type) {
        if (type.equals("b")) {
            String bookTitle = setBookTitle(scan);
            newBook = new Book(bookTitle);
            items.add(newBook);
        } else if (type.equals("v")) {
            String videoTitle = setVideoTitle(scan);
            newVideo = new Video(videoTitle);
            items.add(newVideo);
        }
    }

    // Set book title
    private String setBookTitle(Scanner scan) {
        System.out.print("Title: ");
        return scan.nextLine();
    }

    // Set video title
    private String setVideoTitle(Scanner scan) {
        System.out.print("Title: ");
        return scan.nextLine();
    }

    // Prints receipt
    private void printListOfLoanItems() {
        System.out.print("\n------------------");
        System.out.println("\nLIST OF LOAN ITEMS");
        System.out.println("------------------");
        System.out.printf("%-4s %3s %8s%n", "ID", "TYPE", "TITLE");
        for (int i = 0; i < items.size(); i++) { // For every element of 'items', print out ID, TYPE, and TITLE
            System.out.printf("%-4d %-7s %s%n", items.get(i).getID(), items.get(i).getType(), items.get(i).getTitle());
        }
        System.out.println("------------------");
    }
}

