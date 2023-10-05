package david.moccamaster.cuptype;

import david.moccamaster.CupSize;
import david.moccamaster.EspressoShots;

public class Cup {
    private String type;
    private CupSize size;
    private EspressoShots espressoShots;
    private boolean whippedCream;
    private String cup;

    public Cup() {
        whippedCream = false;
        cup = "";
    }

    // Getter
    public String getType() {
        return type;
    }
    public CupSize getSize() {
        return size;
    }

    // Setter
    public void setType(String type) {
        this.type = type;
    }
    public void setSize(CupSize size) {
        this.size = size;
    }
    public void setEspressoShots(EspressoShots espressoShots) {
        this.espressoShots = espressoShots;
    }
    public void setWhippedCream(Boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public String toString() {
        if (whippedCream)
            cup = size + " sized " + type + " with whipped cream";
        else if (espressoShots != null)
            cup = espressoShots + " shot " + type;
        else
            cup = size + " sized " + type;
        return cup;
    }
}
