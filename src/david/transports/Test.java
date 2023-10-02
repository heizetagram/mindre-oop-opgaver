package david.transports;

import java.util.Scanner;

public class Test {
    Scanner scan;
    String answer;
    int answerMenu;
    Ship s1;
    Plane p1;
    Car c1;

    // Initalizes variables
    public void initVar() {
        scan = new Scanner(System.in);
        s1 = new Ship(false);
        p1 = new Plane(false);
        c1 = new Car(false);
    }

    public static void main(String[] args) {
        new Test().run();
    }

    // Run method
    private void run() {
        initVar();

        do {
            printMenuOptions();
            answer = scan.next();
            chooseMenuOptions(answer);
        } while (!answer.equals("quit"));
    }

    // Menu
    private void chooseMenuOptions(String answer) {
        switch (answer) {
            case "1" -> shipOptions();
            case "2" -> planeOptions();
            case "3" -> carOptions();
        }
    }

    // Ship options + menu options
    private void shipOptions() {
        printWhatToDo();
        printVehicleMenuOptions();
        System.out.printf("Sail %20s%n", "(3)");
        answerMenu = scan.nextInt();
        shipMenuOptions(answerMenu);
    }
    private void shipMenuOptions(int answer) {
        switch (answer) {
            case 1 -> System.out.println("Is engine started: " + s1.getEngineIsStarted());
            case 2 -> s1.startEngine();
            case 3 -> s1.sail();
        }
    }

    // Plane options + menu options
    private void planeOptions() {
        printWhatToDo();
        printVehicleMenuOptions();
        System.out.printf("Fly %21s%n", "(3)");
        answerMenu = scan.nextInt();
        planeMenuOptions(answerMenu);
    }
    private void planeMenuOptions(int answer) {
        switch (answer) {
            case 1 -> System.out.println("Is engine started: " + p1.getEngineIsStarted());
            case 2 -> p1.startEngine();
            case 3 -> p1.fly();
        }
    }

    // Car options + menu options
    private void carOptions() {
        printWhatToDo();
        printVehicleMenuOptions();
        System.out.printf("Drive %19s%n", "(3)");
        answerMenu = scan.nextInt();
        carMenuOptions(answerMenu);
    }
    private void carMenuOptions(int answer) {
        switch (answer) {
            case 1 -> System.out.println("Is engine started " + c1.getEngineIsStarted());
            case 2 -> c1.startEngine();
            case 3 -> c1.drive();
        }
    }

    // Print methods
    private void printMenuOptions() {
        System.out.println("\nChoose vehicle:");
        System.out.printf("Ship %5s%n", "(1)");
        System.out.printf("Plane %4s%n", "(2)");
        System.out.printf("Car %6s%n", "(3)");
    }
    private void printWhatToDo() {
        System.out.println("What do you want to do?");
    }
    private void printVehicleMenuOptions() {
        System.out.printf("Check engine status %5s%n", "(1)");
        System.out.printf("Toggle engine %11s%n", "(2)");
    }
}
