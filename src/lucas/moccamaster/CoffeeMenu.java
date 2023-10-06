import lucas.moccamaster.CoffeeMachine;
import lucas.moccamaster.Cup;

import java.util.Scanner;

public class CoffeeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        System.out.println("Welcome to the Coffee Menu!");
        System.out.println("Please select an option:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte Machiatto");
        System.out.println("3. Cappuccino");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        String drink;
        String size;
        boolean addCream;
        boolean addSugar;
        boolean addCinnamon;

        switch (choice) {
            case 1 -> {
                drink = "Espresso";
                size = espressoSize(scanner);
                addCream = getBooleanInput(scanner, "Add cream? (y/n): ");
                addSugar = getBooleanInput(scanner, "Add sugar? (y/n): ");
                addCinnamon = getBooleanInput(scanner, "Add cinnamon? (y/n): ");
            }
            case 2 -> {
                drink = "Latte Machiatto";
                size = getSize(scanner);
                addCream = getBooleanInput(scanner, "Add cream? (y/n): ");
                addSugar = getBooleanInput(scanner, "Add sugar? (y/n): ");
                addCinnamon = getBooleanInput(scanner, "Add cinnamon? (y/n): ");
            }
            case 3 -> {
                drink = "Cappuccino";
                size = getSize(scanner);
                addCream = false;
                addSugar = getBooleanInput(scanner, "Add sugar? (y/n): ");
                addCinnamon = getBooleanInput(scanner, "Add cinnamon? (y/n): ");
            }
            default -> {
                System.out.println("Invalid choice. Please try again.");
                return;
            }
        }

        Cup cup = coffeeMachine.serve(drink, size, addCream, addSugar, addCinnamon);
        System.out.println("Your ☕️: " + cup.getDrink());
    }

    private static String getSize(Scanner scanner) {
        System.out.print("Enter size (Small/Medium/Large): ");
        return scanner.next();
    }

    private static String espressoSize(Scanner scanner) {
        System.out.print("Enter size (Single/Double/Triple): ");
        return scanner.next();
    }

    private static boolean getBooleanInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String input = scanner.next().toLowerCase();
        return input.equals("y");
    }
}
