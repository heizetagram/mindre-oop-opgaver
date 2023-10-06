package lucas.moccamaster;


import java.util.Scanner;
import java.util.Scanner;
public class Main {


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
            boolean addChocolate;

            switch (choice) {
                case 1 -> {
                    drink = "Espresso";
                    size = getSize(scanner);
                    addCream = getBooleanInput(scanner, "Add cream? (true/false): ");
                    addSugar = getBooleanInput(scanner, "Add sugar? (true/false): ");
                    addChocolate = getBooleanInput(scanner, "Add chocolate? (true/false): ");
                }
                case 2 -> {
                    drink = "Latte Machiatto";
                    size = getSize(scanner);
                    addCream = getBooleanInput(scanner, "Add cream? (true/false): ");
                    addSugar = getBooleanInput(scanner, "Add sugar? (true/false): ");
                    addChocolate = false;
                }
                case 3 -> {
                    drink = "Cappuccino";
                    size = getSize(scanner);
                    addCream = false;
                    addSugar = getBooleanInput(scanner, "Add sugar? (true/false): ");
                    addChocolate = getBooleanInput(scanner, "Add chocolate? (true/false): ");
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    return;
                }
            }

            Cup cup = coffeeMachine.serve(drink, size, addCream, addSugar, addChocolate);
            System.out.println("Your cup: " + cup.getDrink());
        }

        private static String getSize(Scanner scanner) {
            System.out.print("Enter size (Small/Medium/Large): ");
            return scanner.next();
        }

        private static boolean getBooleanInput(Scanner scanner, String prompt) {
            System.out.print(prompt);
            return scanner.nextBoolean();
        }}}