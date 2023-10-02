package Authors;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        new Library().run();
    }

    private void run() {

        Books HarryPotter = new Books("J.K Rowling", "Jkrowling@gmail.com", 'F', "Harry Potter 1", "1999");
        Books FredesBog = new Books("Freddy Spaghetti", "freddyspaghetti@gmail.com", 'M', "bigBook", "2010");

        ArrayList<Books> authors = new ArrayList<>();

        authors.add(FredesBog);
        authors.add(HarryPotter);

        for (int i = 0; i < authors.size(); i++) {
            System.out.println(authors.get(i).getName() + ": "
                    + authors.get(i).getEmail() + ": "
                    + authors.get(i).getGender() + " : "
                    + authors.get(i).getTitle() + ": "
                    + authors.get(i).getYearPublished() + ": ");

        }
    }
}

