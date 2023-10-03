package david.catlimb;

public class Menu {
    UI ui = new UI();

    public void menu() {
        ui.println("\n(1) Register cat");
        ui.println("(2) Show ALL cats");
        ui.println("(3) Show registered cats");
        ui.println("(4) Flap setting");
        ui.println("(5) Flap status");
    }

    public void flapMenu() {
        ui.println("\n(1) IN/OUT");
        ui.println("(2) CLOSED");
        ui.println("(3) ONLY IN");
        ui.println("(4) ONLY OUT");
    }
}
