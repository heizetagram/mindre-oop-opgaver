package david.moccamaster;

import david.moccamaster.cuptype.*;

public class CoffeeMaker {
    private Cup cup = new Cup();
    BlackCoffee blackCoffee = new BlackCoffee();
    Espresso espresso = new Espresso();
    LatteMacchiato latteMacchiato = new LatteMacchiato();
    ChocolateMilk chocolateMilk = new ChocolateMilk();
    HotCocoa hotCocoa = new HotCocoa();


    // Getters
    public String getType() {
        return cup.getType();
    }
    public String getEspresso() {
        return espresso.getType();
    }
    public String getChocolateMilk() {
        return chocolateMilk.getType();
    }
    public String getHotCocoa() {
        return hotCocoa.getType();
    }


    // Setters
    public void brewBlackCoffee() {
        cup.setType(blackCoffee.getType());
    }
    public void brewEspresso() {
        cup.setType(espresso.getType());
    }
    public void brewLatteMacchiato() {
        cup.setType(latteMacchiato.getType());
    }
    public void brewChocolateMilk() {
        cup.setType(chocolateMilk.getType());
    }
    public void brewHotCocoa() {
        cup.setType(hotCocoa.getType());
    }
    public void addWhippedCream() {
        cup.setWhippedCream(true);
    }
    public void setCupSize(CupSize cupSize) {
        cup.setSize(cupSize);
    }
    public void setEspressoShots(EspressoShots espressoShots) {
        cup.setEspressoShots(espressoShots);
    }

    public Cup serve() {
        return cup;
    }
}
