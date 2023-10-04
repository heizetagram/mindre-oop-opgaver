package david.catlimb;

import java.util.ArrayList;

public class Program {
    UI ui;
    Menu menu;
    Flap flap;
    String stringAnswer;
    int intAnswer;
    boolean catRegister;
    boolean catExists;
    boolean catAlreadyRegistered;
    Cat cat1;
    Cat cat2;
    Cat cat3;
    Cat cat4;
    Cat cat5;
    Cat cat6;
    ArrayList<Cat> cats;
    ArrayList<Cat> registeredCats;

    // Initializes variables
    private void initVar() {
        ui = new UI();
        menu = new Menu();
        stringAnswer = "";
        intAnswer = 0;
        cats = new ArrayList<>();
        registeredCats = new ArrayList<>();
        flap = new Flap();
        cats.add(cat1 = new Cat("Lulu"));
        cats.add(cat2 = new Cat("Batman"));
        cats.add(cat3 = new Cat("Hugo"));
        cats.add(cat4 = new Cat("Stella"));
        cats.add(cat5 = new Cat("Muff"));
        cats.add(cat6 = new Cat("Vicky"));
    }

    public static void main(String[] args) {
        new Program().run();
    }

    // Run method
    private void run() {
        initVar();

        do {
            menu.menu();
            resetRegisteredCatsOption();
            stringAnswer = ui.promptString().toLowerCase();
            menuOptions(stringAnswer);
        } while (!stringAnswer.equals("quit"));
    }

    // General menu options
    private void menuOptions(String answer) {
        switch (answer) {
            case "1" -> registerCat();
            case "2" -> ui.println(cats.toString());
            case "3" -> ui.println(registeredCats.toString());
            case "4" -> flapMenuOptions();
            case "5" -> flapStatus();
            case "6" -> resetRegisteredCats();
        }
    }

    // Flap menu options
    private void flapMenuOptions() {
        menu.flapMenu();
        intAnswer = ui.promptInt();
        ui.promptString(); // Scanner bug

        switch (intAnswer) {
            case 1 -> {
                ui.println("Flap Mode: IN/OUT");
                flap.allowInAndOut();
            }
            case 2 -> {
                ui.println("Flap Mode: CLOSED");
                flap.closeFlap();
            }
            case 3 -> {
                ui.println("Flap Mode: ONLY IN");
                flap.allowOnlyIn();
            }
            case 4 -> {
                ui.println("Flap Mode: ONLY OUT");
                flap.allowOnlyOut();
            }
        }
    }

    // Flat status (Body too long (should be shortened))
    //      Shows flat status for each mode. Allows stray cats to exit, when flap is open.
    private void flapStatus() {
        ui.println(ConsoleColors.YELLOW + "\nIN/OUT" + ConsoleColors.RESET);
        for (Cat cat : cats) {
            if (cat.getRegistered())
                ui.printf("%-10s %s%n", cat.getName() + ": ", flap.getAllowInAndOut());
            else
                ui.printf("%-10s %s%n", cat.getName() + ": ", false);
        }

        ui.println(ConsoleColors.YELLOW + "\nCLOSED" + ConsoleColors.RESET);
        for (Cat cat : cats) {
            ui.printf("%-10s %s%n", cat.getName() + ": ", flap.getCloseFlap());
        }

        ui.println(ConsoleColors.YELLOW + "\nONLY IN:" + ConsoleColors.RESET);
        for (Cat cat : cats) {
            if (cat.getRegistered())
                ui.printf("%-10s %s%n", cat.getName() + ": ", flap.getAllowOnlyIn());
            else
                ui.printf("%-10s %s%n", cat.getName() + ": ", false);
        }

        ui.println(ConsoleColors.YELLOW + "\nONLY OUT:" + ConsoleColors.RESET);
        for (Cat cat : cats) {
            if (cat.getRegistered())
                ui.printf("%-10s %s%n", cat.getName() + ": ", flap.getAllowOnlyOut());
            else if (!cat.getRegistered() && !flap.getCloseFlap())
                ui.printf("%-10s %s%n", cat.getName() + ": ", true);
            else
                ui.printf("%-10s %s%n", cat.getName() + ": ", false);
        }
    }

    // Register cat
    private void registerCat() {
        catExists = false;
        ui.println("Enter ID of cat you want to register");
        intAnswer = ui.promptInt();

        if (registeredCats.size() < 5) {
            for (Cat cat : cats) {
                if (intAnswer == cat.getId()) {
                    addRegisteredCat(cat);
                }
            }
            ui.promptString(); // Scanner bug
        } else {
            ui.promptString(); // Scanner bug
            cannotRegisterCat();
        }
    }

    // Register cat (body), if cat isn't already registered
    private void addRegisteredCat(Cat cat) {
        catAlreadyRegistered = registeredCats.contains(cat);
        if (!catAlreadyRegistered) { // If cat isn't already registered, run the following code
            registeredCats.add(cat);
            ui.println(cat + " registered");
            cat.setRegistered(true);
        } else {
            ui.println(cat + " is already registered");
        }
        catExists = true;
    }

    // Cannot register cat
    private void cannotRegisterCat() {
        if (!catExists && registeredCats.size() < 5)
            ui.println("Invalid ID");
        if (registeredCats.size() >= 5)
            ui.println("Cannot register more than 5 cats");
    }

    // Show this option after the menu, if 'registeredCats' ArrayList isn't empty
    private void resetRegisteredCatsOption() {
        if (!registeredCats.isEmpty()) {
            ui.println("(6) Reset registered cats");
        }
    }

    // Reset registered cats
    private void resetRegisteredCats() {
        if (!registeredCats.isEmpty()) {
            registeredCats.removeAll(cats);
            ui.println("Registered cats have been reset");
        }
    }
}