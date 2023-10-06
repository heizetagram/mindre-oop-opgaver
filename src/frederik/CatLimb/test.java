package frederik.CatLimb;

import java.util.ArrayList;

public class test {
    Cat cat1;
    Cat cat2;
    Cat cat3;
    Cat cat4;
    Cat cat5;
    Cat cat6;
    private Flap stateOfFlap;
    ArrayList<Cat> cats = new ArrayList<Cat>();
    ArrayList<Cat> registeredcats = new ArrayList<Cat>();


    private void initVariables() {
        cats = new ArrayList<>();
        registeredcats = new ArrayList<>();
        cats.add(cat1 = new Cat("Montaigne"));
        cats.add(cat2 = new Cat("Chopin"));
        cats.add(cat3 = new Cat("BigChop"));
        cats.add(cat4 = new Cat("Choppah"));
        cats.add(cat5 = new Cat("BigCheese"));
        cats.add(cat6 = new Cat("BigSpaghett"));

        stateOfFlap = Flap.IN;

    }

    public static void main(String[] args) {

        new test().run();
    }

    private void run() {

        initVariables();
        printWelcomeMessage();
        printFlapState();
    }

    private void printWelcomeMessage() {
        System.out.println("Welcome to catlimb");
    }
    private void printFlapState(){
        System.out.println(" " + stateOfFlap);
        getFlapState();

    }
    private void getFlapState(){
       Flap[] flapstates = Flap.values();
       for (Flap flap : flapstates)
        System.out.println("State of Flappyflap: " + stateOfFlap);
    }
}
