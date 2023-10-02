package david.fishtank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scan;
    Aquarium aquarium;
    Fish fish1;
    Fish fish2;
    int answer;
    ArrayList<Note> notes;
    Grade grade;
    Note note;

    private void initVar() {
        scan = new Scanner(System.in);
        aquarium = new Aquarium();
        fish1 = new Fish("Wogglie", Gender.FEMALE);
        fish2 = new Fish("Swimmie", Gender.FEMALE);


        aquarium.addFish(fish1); //Adds "Wogglie" to the Arraylist
        aquarium.addFish(fish2); //Adds "Swimmie" to the Arraylist

        notes = new ArrayList<Note>();
    }

    public static void main(String[] args) {
        new Program().run();
    }

    // Run method
    private void run() {
        initVar();

        do {
            promptOptions();
            answer = scan.nextInt();
            answerOptions(answer, scan);
        } while (answer != 0);
    }

    // Menu
    private void promptOptions() {
        System.out.println("\nWhat do you want to do?");
        System.out.printf("Check on fish %5s", "(1)");
        System.out.printf("%nCheck notes %7s", "(2)");
        System.out.printf("%nChange water %6s%n", "(3)");
    }

    // Water condition options
    private void waterConditionOptions() {
        System.out.println("\nHow is the water?");
        System.out.printf("PERFECT %5s", "(1)");
        System.out.printf("%nGOOD %8s", "(2)");
        System.out.printf("%nOKAY %8s", "(3)");
        System.out.printf("%nBAD %9s%n", "(4)");
    }

    // Answer options
    private void answerOptions(int answer, Scanner scan) {
        switch (answer) {
            case 1 -> checkFish();
            case 2 -> System.out.println(notes.toString());
            case 3 -> addChangedWaterNote(scan);
        }
    }

    // Check fish
    private void checkFish() {
        System.out.println("Fish in aquarium: " + aquarium.aquariumContents.toString());
        addFishConditionNote(scan);
    }

    // Fish condition options
    private void fishConditionOptions() {
        System.out.printf("HEALTHY %10s%n", "(1)");
        System.out.printf("INFECTED %9s%n", "(2)");
        System.out.printf("INJURED %10s%n", "(3)");
        System.out.printf("STRESSED %9s%n", "(4)");
        System.out.printf("MALNOURISHED %5s%n", "(5)");
        System.out.printf("AGGRESSIVE %7s%n", "(6)");
        System.out.printf("INACTIVE %9s%n", "(7)");
    }

    // Fish' conditions
    private void fishConditionGrade(int answer) {
        switch (answer) {
           case 1 -> grade = Grade.HEALTHY;
           case 2 -> grade = Grade.INFECTED;
           case 3 -> grade = Grade.INJURED;
           case 4 -> grade = Grade.STRESSED;
           case 5 -> grade = Grade.MALNOURISHED;
           case 6 -> grade = Grade.AGGRESSIVE;
           case 7 -> grade = Grade.INACTIVE;
        }
    }

    // Add Fish' condition note
    private void addFishConditionNote(Scanner scan) {
        for (int i = 0; i < aquarium.aquariumContents.size(); i++) {
            System.out.println("\nHow is " + aquarium.aquariumContents.get(i) + " looking?");
            fishConditionOptions();
            int answer = scan.nextInt();
            fishConditionGrade(answer);

            System.out.println("Add note (MAX 30 Chars):");
            scan.nextLine(); // Scanner bug
            String text = scan.nextLine();
            while (text.length() > 30) {
                System.out.println("Chars: " + text.length() + "\nNote must be less than 30 chars\nTry again");
                text = scan.nextLine();
            }
            note = new Note(text, LocalDateTime.now(), aquarium.aquariumContents.get(i), grade);
            notes.add(note);
        }
    }

    // Grade satisfaction
    private void currentWaterGrade(int answer) {
        switch (answer) {
            case 1 -> grade = Grade.PERFECT;
            case 2 -> grade = Grade.GOOD;
            case 3 -> grade = Grade.OKAY;
            case 4 -> grade = Grade.BAD;
        }
    }

    // Add changed water note
    private void addChangedWaterNote(Scanner scan) {
        waterConditionOptions();
        int answer = scan.nextInt();
        currentWaterGrade(answer);

        System.out.println("Add note (MAX 60 Chars):");
        scan.nextLine(); // Scanner bug
        String text = scan.nextLine();
        while (text.length() > 60) {
            System.out.println("Chars: " + text.length() + "\nNote must be less than 60 chars\nTry again");
            text = scan.nextLine();
        }
        note = new Note(text, LocalDateTime.now(), grade);
        notes.add(note);
    }
}
