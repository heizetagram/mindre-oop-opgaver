package frederik.Authors.Faktura;

public class fakturaLinjer {
    private String beskrivelse;
    private int antal;
    private String enhed;
    private int pris;
    private int beløb;



    public fakturaLinjer(String beskrivelse, int antal, String enhed, int pris){
        this.beskrivelse = beskrivelse;
        this.antal = antal;
        this.enhed = enhed;
        this.pris = pris;
        this.beløb = antal * pris;

    }


    public String getBeskrivelse(){
        return beskrivelse;
    }
    public int getAntal(){
        return antal;
    }
    public String getEnhed(){
        return enhed;
    }
    public int getPris(){
        return pris;
    }
    public int getBeløb(){
        return beløb;
    }



}
