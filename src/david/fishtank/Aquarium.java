package david.fishtank;

import java.util.ArrayList;

public class Aquarium {
    ArrayList<Fish> aquariumContents;

    //Constructor
    public Aquarium() {
        aquariumContents = new ArrayList<>();
    }

    //Set fish in aquarium Arraylist
    public void addFish(Fish fish) {
        aquariumContents.add(fish);
    }
}
