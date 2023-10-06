package frederik.Authors;

public class Books extends Author {

    private String title;
    private String yearPublished;


    public Books(String name, String email, char gender, String title, String yearPublished) {

      super(name, gender, email);
      this.title = title;
      this.yearPublished = yearPublished;
    }


    public String getTitle()
   {
        return title;
   }
   public String getYearPublished()
   {
        return yearPublished;
   }

}
