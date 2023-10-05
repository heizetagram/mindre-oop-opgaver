package david.moccamaster.cuptype;

public class ChocolateMilk extends Cup{
    private boolean whippedCream;

    public ChocolateMilk() {
        super();
        setType("Chocolate Milk");
        whippedCream = false;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }
}
