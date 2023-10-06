package frederik.Fishtank;


public class fishes {
   private int happyOrNot = 10;
    private String name;
    private int hungerLevel;
    private int fishFood = 2;
    private int fedFish;

    public fishes(String name, int hungerLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
    }





    public String toString() {
        int happinessLevel = calculateHappiness();
        return name +  "'s happiness level is " + happinessLevel + " out of 10";
    }

    private int calculateHappiness() {
        return (happyOrNot - hungerLevel);
    }

    public int feedFish() {
        int newHappiness = calculateHappiness() + fishFood;
        fedFish += newHappiness;
        hungerLevel -= newHappiness;
        return fedFish;
    }

    public int getfedFish(){
        return fedFish;
    }


    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getFishFood() {
        return fishFood;
    }


}











