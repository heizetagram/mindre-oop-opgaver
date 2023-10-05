package david.moccamaster;

import david.ui.UI;

public class Menu {
    // Drink type menu
    public void printTypeMenu() {
        UI.println("(1) Black Coffee");
        UI.println("(2) Espresso");
        UI.println("(3) Latte Macchiato");
        UI.println("(4) Chocolate Milk");
        UI.println("(5) Hot Cocoa");
    }

    // Drink size menu
    public void printSizeMenu() {
        UI.println("(1) Small");
        UI.println("(2) Medium");
        UI.println("(3) Large");
    }

    // Shots amount menu
    public void printShotsAmountMenu() {
        UI.println("(1) Single");
        UI.println("(2) Double");
        UI.println("(3) Triple");
    }

}
