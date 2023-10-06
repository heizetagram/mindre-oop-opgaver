package lucas.moccamaster;

public class CoffeeMachine {
        public Cup serve(String drink, String size, boolean addCream, boolean addSugar, boolean addChocolate) {
            String servedDrink = size + " " + drink;
            if (addCream) {
                servedDrink += " with cream";
            }
            if (addSugar) {
                servedDrink += " with sugar";
            }
            if (addChocolate) {
                servedDrink += " with chocolate";
            }
            return new Cup(servedDrink);
        }
    }