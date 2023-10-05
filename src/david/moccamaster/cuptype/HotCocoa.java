package david.moccamaster.cuptype;

public class HotCocoa extends Cup{
    private boolean whippedCream;

    public HotCocoa() {
        super();
        setType("Hot Cocoa");
        whippedCream = false;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }
}
