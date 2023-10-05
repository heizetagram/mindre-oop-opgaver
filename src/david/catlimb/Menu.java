package david.catlimb;

import david.ui.UI;

public class Menu {
    public void menu() {
        UI.println("\n(1) Register cat");
        UI.println("(2) Show ALL cats");
        UI.println("(3) Show registered cats");
        UI.println("(4) Flap setting");
        UI.println("(5) Flap status");
    }

    public void flapMenu() {
        UI.println("\n(1) IN/OUT");
        UI.println("(2) CLOSED");
        UI.println("(3) ONLY IN");
        UI.println("(4) ONLY OUT");
    }
}
