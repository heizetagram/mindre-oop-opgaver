package lucas.catlimb;

import java.util.ArrayList;
import java.util.List;

public class CatDoor {
    enum Mode {
        IN_OUT, ONLY_IN, ONLY_OUT, CLOSED
    }

    private Mode mode;
    private List<Cat> registeredCats;

    public CatDoor() {
        mode = Mode.CLOSED;
        registeredCats = new ArrayList<>();
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void registerCat(Cat cat) {
        registeredCats.add(cat);
    }

    public void clearRegisteredCats() {
        registeredCats.clear();
    }

    public boolean canCatEnter(Cat cat) {
        if (mode == Mode.IN_OUT || mode == Mode.ONLY_IN) {
            return registeredCats.contains(cat);
        }
        return false;
    }

    public boolean canCatExit() {
        return mode == Mode.IN_OUT || mode == Mode.ONLY_OUT;
    }
}
