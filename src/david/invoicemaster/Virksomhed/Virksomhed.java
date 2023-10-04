package david.invoicemaster.Virksomhed;

public abstract class Virksomhed {
    private String virksomhedsnavn;
    private String adresse;
    private int postnummer;
    private String by;
    private String land;
    private String email;
    private int cvr;
    private String momsnr;
    private String bank;
    private int regnr;
    private int kontonr;
    private String kontoindehaver;

    // Getters
    public String getVirksomhedsnavn() {
        return virksomhedsnavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public String getBy() {
        return by;
    }

    public String getLand() {
        return land;
    }

    public String getEmail() {
        return email;
    }

    public int getCvr() {
        return cvr;
    }

    public String getMomsnr() {
        return momsnr;
    }

    public String getBank() {
        return bank;
    }

    public int getRegnr() {
        return regnr;
    }

    public int getKontonr() {
        return kontonr;
    }

    public String getKontoindehaver() {
        return kontoindehaver;
    }


    // Setters
    void setVirksomhedsnavn(String virksomhedsnavn) {
        this.virksomhedsnavn = virksomhedsnavn;
    }

    void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    void setBy(String by) {
        this.by = by;
    }

    void setLand(String land) {
        this.land = land;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setCvr(int cvr) {
        this.cvr = cvr;
    }

    void setMomsnr(String momsnr) {
        this.momsnr = momsnr;
    }

    void setBank(String bank) {
        this.bank = bank;
    }

    void setRegnr(int regnr) {
        this.regnr = regnr;
    }

    void setKontonr(int kontonr) {
        this.kontonr = kontonr;
    }

    void setKontoindehaver(String kontoindehaver) {
        this.kontoindehaver = kontoindehaver;
    }
}
