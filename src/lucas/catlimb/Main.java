package lucas.catlimb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("chip1");
        Cat c5 = new Cat("chip5");
        Cat c6 = new Cat("chip6");

        CatFlap catFlap = new CatFlap();

        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Set mode");
            System.out.println("2. Register cat");
            System.out.println("3. Clear registered cats");
            System.out.println("4. Check if cat can enter");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select mode:");
                    System.out.println("1. IN/OUT");
                    System.out.println("2. ONLY IN");
                    System.out.println("3. ONLY OUT");
                    System.out.println("4. CLOSED");
                    System.out.print("Enter mode choice: ");
                    int modeChoice = scanner.nextInt();
                    switch (modeChoice) {
                        case 1:
                            catFlap.setMode(CatFlap.Mode.IN_OUT);
                            break;
                        case 2:
                            catFlap.setMode(CatFlap.Mode.ONLY_IN);
                            break;
                        case 3:
                            catFlap.setMode(CatFlap.Mode.ONLY_OUT);
                            break;
                        case 4:
                            catFlap.setMode(CatFlap.Mode.CLOSED);
                            break;
                        default:
                            System.out.println("Invalid mode choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter chip ID of cat to register: ");
                    String chipId = scanner.next();
                    Cat cat = new Cat(chipId);
                    catFlap.registerCat(cat);
                    System.out.println("Cat registered successfully");
                    break;
                case 3:
                    catFlap.clearRegisteredCats();
                    System.out.println("Registered cats cleared");
                    break;
                case 4:
                    System.out.print("Enter chip ID of cat to check: ");
                    String checkChipId = scanner.next();
                    Cat checkCat = new Cat(checkChipId);
                    boolean canEnter = catFlap.canCatEnter(checkCat);
                    System.out.println("Cat can enter: " + canEnter);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}