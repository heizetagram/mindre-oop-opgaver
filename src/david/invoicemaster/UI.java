package david.invoicemaster;

import java.util.Scanner;

public class UI {
    private Scanner scan;

    public UI() {
        scan = new Scanner(System.in);
    }

    // Print string
    public void print(String text) {
        System.out.print(text);
    }

    // Println string
    public void println(String text) {
        System.out.println(text);
    }

    // Print formatted
    public void printf(String text, Object... args) { // '...' accepts any number of arguments
        System.out.printf((text), args);
    }

    // Prompt string
    public String promptString() {
        return scan.nextLine();
    }

    // Prompt int
    public int promptInt() {
        return scan.nextInt();
    }
}
