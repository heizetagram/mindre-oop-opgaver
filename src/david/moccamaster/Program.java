package david.moccamaster;

import david.ui.UI;

public class Program {
    CoffeeMaker coffeeMaker;
    Menu menu;
    String answer;
    boolean keepRunning;

    // Initialize variables
    private void initVar() {
        coffeeMaker = new CoffeeMaker();
        keepRunning = true;
        menu = new Menu();
    }

    public static void main(String[] args) {
        new Program().run();
    }

    // Run method
    private void run() {
        initVar();

        UI.println("What do you want to order?");
        menu.printTypeMenu();
        chooseType(UI.promptInt());

        // Check if drink is/isn't an espresso
        if (!coffeeMaker.getType().equals(coffeeMaker.getEspresso())) {
            UI.println("What size?");
            menu.printSizeMenu();
            chooseSize(UI.promptInt());
            askWhippedCream();
        } else { // Ask for shots instead of size for espresso
            UI.println("How many shots?");
            menu.printShotsAmountMenu();
            chooseEspressoShots(UI.promptInt());
        }

        // Prints served drink
        UI.println("Served a " + coffeeMaker.serve() + " ☕️");
    }

    // Choose drink type
    private void chooseType(int type) {
        switch (type) {
            case 1 -> coffeeMaker.brewBlackCoffee();
            case 2 -> coffeeMaker.brewEspresso();
            case 3 -> coffeeMaker.brewLatteMachiatto();
            case 4 -> coffeeMaker.brewChocolateMilk();
            case 5 -> coffeeMaker.brewHotCocoa();
        }
    }

    // Choose drink size
    private void chooseSize(int size) {
        switch (size) {
            case 1 -> coffeeMaker.setCupSize(CupSize.SMALL);
            case 2 -> coffeeMaker.setCupSize(CupSize.MEDIUM);
            case 3 -> coffeeMaker.setCupSize(CupSize.LARGE);
        }
    }

    // Choose espresso shots
    private void chooseEspressoShots(int espressoShots) {
        switch (espressoShots) {
            case 1 -> coffeeMaker.setEspressoShots(EspressoShots.SINGLE);
            case 2 -> coffeeMaker.setEspressoShots(EspressoShots.DOUBLE);
            case 3 -> coffeeMaker.setEspressoShots(EspressoShots.TRIPLE);
        }
    }

    // Ask for whipped cream on chocolate drinks
    private void askWhippedCream() {
        if (coffeeMaker.getType().equals(coffeeMaker.getChocolateMilk()) || coffeeMaker.getType().equals(coffeeMaker.getHotCocoa())) {
            UI.println("Do you want whipped cream? (y/n)");
            UI.promptString(); // Scanner bug

            answer = UI.promptString().toLowerCase();
            while (keepRunning) {
                if (answer.equals("y")) {
                    coffeeMaker.addWhippedCream();
                    keepRunning = false;
                } else if (answer.equals("n")) {
                    keepRunning = false;
                } else {
                    UI.println("Invalid answer");
                    answer = UI.promptString().toLowerCase();
                }
            }
        }
    }
}
