package david.fishtank;

public class Fish {
    private String name;
    private Gender gender;

    // Constructor
    public Fish(String name, Gender gender) {
        setName(name);
        setGender(gender);
    }

    // Setters
    private void setName(String name) { //Setter
        this.name = name;
    }
    private void setGender(Gender gender) { //Setter
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " [" + gender + "]";
    }
}
