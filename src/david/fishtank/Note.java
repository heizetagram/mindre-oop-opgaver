package david.fishtank;

import java.time.LocalDateTime;

public class Note {
    private String note;
    private LocalDateTime todaysDate;
    private Grade grade;
    private Fish fish;

    // Constructor for water note
    public Note(String note, LocalDateTime todaysDate, Grade grade) {
        setNote(note);
        this.todaysDate = todaysDate;
        this.grade = grade;
    }

    // Constructor for fish note
    public Note(String note, LocalDateTime todaysDate, Fish fish, Grade grade) {
        setNote(note);
        this.todaysDate = todaysDate;
        this.grade = grade;
        this.fish = fish;
    }

    // Setter
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        String test = "";
        if (fish != null)
            test = "\n" + "(" + ConsoleColors.BLUE_BRIGHT + todaysDate + ConsoleColors.RESET + ") [" + grade + "] " + fish + " " + ConsoleColors.YELLOW + note + ConsoleColors.RESET;
        else
            test = "\n" + "(" + ConsoleColors.BLUE_BRIGHT + todaysDate + ConsoleColors.RESET + ") [" + grade + "] " + ConsoleColors.YELLOW + note + ConsoleColors.RESET;
        return test;
    }
}
