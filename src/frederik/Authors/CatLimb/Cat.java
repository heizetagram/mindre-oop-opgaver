package frederik.Authors.CatLimb;

public class Cat {
    private String name;
    private int Id;
    private boolean registered;
    private static int nextId = 0;

    public Cat(String name){
        this.name = name;
        Id = nextId++;
        registered = false;
    }

   public String getName(){
        return name;
   }

   public int getId(){
        return Id;
   }
    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }


}
