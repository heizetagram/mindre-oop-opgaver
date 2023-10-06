package frederik.Authors.Faktura;

public class fakturaUdsteder {
    private String email;
    private int cvr;
    private int momsnr;
    private int euMomsNr;

    public fakturaUdsteder(String email, int cvr, int momsnr, int euMomsNr){
        this.email = email;
        this.cvr = cvr;
        this.momsnr = momsnr;
        this.euMomsNr = euMomsNr;
    }
    public void printUdsteder(){
        System.out.println("UDSTEDER: " + email + " " + cvr + " " + momsnr + " " + euMomsNr);
    }
}