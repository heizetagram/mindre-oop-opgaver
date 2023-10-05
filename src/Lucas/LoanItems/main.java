package Lucas.LoanItems;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("How many loaned items do you want to register?");
        int items = Keyboard.nextInt();
        Keyboard.nextLine();
        LoanItem[] loanItems = new LoanItem[items]; // Opretter et array af typen LoanItem

        for (int i = 0; i < items; i++) {
            System.out.println("ITEM no. " + (i+1));

            System.out.print("Type (B or V): ");
            String type = Keyboard.next();
            Keyboard.nextLine(); //Scanner bug!!!!
            System.out.print("Title: ");
            String title = Keyboard.nextLine();

            loanItems[i] = new LoanItem(type, title);
        }


    }










}
