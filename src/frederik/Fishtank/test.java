package frederik.Fishtank;

import java.util.Random;
import java.util.Scanner;

public class test {
    fishes fish1 = new fishes("woggle", 5);
    fishes fish2 = new fishes("Big Cheese", 2);

    private stateOfTank tankState;
    private notes fishNotes;

    public static void main(String[] args) {
        new test().run();
    }

    private void run() {

        welcomeMessage();
        userInput();
    }

    private void welcomeMessage(){
        System.out.println("Welcome to your aquarium! The follow options are available: ");
        System.out.println(" What would you like to do? \n 1: check water tank \n 2: add notes \n 3: Check fish happiness" );
    }

    private int askUserForInput() {
        Scanner in = new Scanner(System.in);
        int reply = in.nextLine().toUpperCase().charAt(0);
        return reply;
    }

    private void userInput() {
        int userChoice = askUserForInput();

        if (userChoice == '1') {
            System.out.println(" " + tankState);
            getRandomTankState();
            System.out.println("\nWould you like to change water? Y/N");

            char changeWaterChoice = (char) askUserForInput();

            if (changeWaterChoice == 'Y' || changeWaterChoice == 'y') {
                fishNotes = new notes();
                System.out.println("You noted: " + fishNotes.getNote());
                System.out.println("the water is now nice and clean ");

            }
        } else if (userChoice == '2') {
            fishNotes = new notes();
            System.out.println("You noted: " + fishNotes.getNote());
        }
        else if (userChoice == '3'){
            System.out.println(fish1);
            System.out.println(fish2);
            System.out.println("Would you like to feed your fishes? Y/N");
            char feedFishChoice = (char) askUserForInput();
            if (feedFishChoice == 'Y'){
                     fish1.feedFish();
                     fish2.feedFish();
                System.out.println("They seem happier now! " + "Woggle is now " + fish1.getfedFish() + " out of 10, and BigCheese is now " + fish2.getfedFish() + " out of 10");
            }
        }
    }

        private void getRandomTankState() {
            stateOfTank[] tankStates = stateOfTank.values();
            Random random = new Random();
            int randomIndex = random.nextInt(tankStates.length);
            tankState = tankStates[randomIndex];
            System.out.println("New tank state: " + tankState);
        }
    }
