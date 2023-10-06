package frederik.Authors.Faktura;

public class fakturaModtager {
    private String email;
    private int cvr;
    private int momsnr;
    private int euMomsNr;

    public fakturaModtager(String email, int cvr, int momsnr, int euMomsNr){
        this.email = email;
        this.cvr = cvr;
        this.momsnr = momsnr;
        this.euMomsNr = euMomsNr;
    }
    public void printModtager(){
        System.out.println("MODTAGER: " + email + " " + cvr + " " + momsnr + " " + euMomsNr);
    }
}
