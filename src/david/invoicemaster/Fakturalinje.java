package david.invoicemaster;

public class Fakturalinje {
    private String beskrivelse;
    private int antal;
    private String enhed;
    private int pris;
    private int beloeb;

    // Constructor
    public Fakturalinje(String beskrivelse, int antal, String enhed, int pris) {
        this.beskrivelse = beskrivelse;
        this.antal = antal;
        this.enhed = enhed;
        this.pris = pris;
        beloeb = antal * pris;
    }

    // Getters
    public String getBeskrivelse() {
        return beskrivelse;
    }
    public int getAntal() {
        return antal;
    }
    public String getEnhed() {
        return enhed;
    }
    public int getPris() {
        return pris;
    }
    public int getBeloeb() {
        return beloeb;
    }
}
