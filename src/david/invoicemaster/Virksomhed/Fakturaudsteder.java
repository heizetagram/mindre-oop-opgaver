package david.invoicemaster.Virksomhed;

public class Fakturaudsteder extends Virksomhed {

    public Fakturaudsteder(String virksomhedsnavn, String adresse, int postnummer, String by, String land, String email, int cvr, String momsnr, String bank, int regnr, int kontonr, String kontoindehaver) {
        super();
        setVirksomhedsnavn(virksomhedsnavn);
        setAdresse(adresse);
        setPostnummer(postnummer);
        setBy(by);
        setLand(land);
        setEmail(email);
        setCvr(cvr);
        setMomsnr(momsnr);
        setBank(bank);
        setRegnr(regnr);
        setKontonr(kontonr);
        setKontoindehaver(kontoindehaver);
    }
}
