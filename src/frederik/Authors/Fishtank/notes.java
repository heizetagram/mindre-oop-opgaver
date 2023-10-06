package frederik.Authors.Fishtank;
import java.time.LocalDateTime;
import java.util.Scanner;

public class notes {

    private String note;
    private LocalDateTime time = LocalDateTime.now();

    public notes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("add a note: ");
        this.note = scanner.nextLine();
    }

    public String getNote() {
        System.out.println("at this time: " + time);
        return note;
    }
}
