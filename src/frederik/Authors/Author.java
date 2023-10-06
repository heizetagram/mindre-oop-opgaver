package frederik.Authors;

public class Author {
    private String name;
    private char gender;
    private String email;


    public Author(String name, char gender, String email) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
       return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void Writing(){
        System.out.println("writebooklolz");
    }
}
