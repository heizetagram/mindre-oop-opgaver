package david.invoicemaster;

import david.invoicemaster.Virksomhed.Fakturamodtager;
import david.invoicemaster.Virksomhed.Fakturaudsteder;

import java.util.ArrayList;

public class Faktura {
    private int fakturanr;
    private static int nextFakturanr = 1;
    private Date fakturadato;
    private Date forfaldsdato;
    private Fakturamodtager fakturamodtager;
    private Fakturaudsteder fakturaudsteder;
    private Fakturalinje fakturalinje;
    private ArrayList<Fakturalinje> fakturalinjer;
    private double subtotalUdenMoms;
    private double moms;
    private double fakturatotal;

    // Constructor
    public Faktura(Fakturamodtager fakturamodtager, Fakturaudsteder fakturaudsteder, int forfaldsdato) {
        this.fakturamodtager = fakturamodtager;
        this.fakturaudsteder = fakturaudsteder;

        fakturanr = nextFakturanr++; // Adds +1 for every 'faktura'
        fakturadato = new Date();
        this.forfaldsdato = new Date(forfaldsdato); // User-chosen 'forfaldsdato'

        fakturalinjer = new ArrayList<>();
    }

    // Adds 'faktura' to 'fakturalinjer' ArrayList and calculates total price
    public void addFakturalinje(Fakturalinje fakturalinje) {
        fakturalinjer.add(fakturalinje);
        calculateSubtotalUdenMoms();
        calculateMoms(subtotalUdenMoms);
        calculateFakturatotal(subtotalUdenMoms, moms);
    }

    // Calculate subtotal excl. VAT
    public void calculateSubtotalUdenMoms() {
        subtotalUdenMoms = 0;
        for (Fakturalinje fakturalinje : fakturalinjer) {
            subtotalUdenMoms += fakturalinje.getBeloeb();
        }
    }

    // Calculate VAT of subtotal
    private void calculateMoms(double subtotalUdenMoms) {
        moms = (subtotalUdenMoms * 0.25);
    }

    // Calculate Fakturatotal
    private void calculateFakturatotal(double subtotalUdenMoms, double moms) {
        fakturatotal = subtotalUdenMoms + moms;
    }


    // GETTERS
    public int getFakturanr() {
        return fakturanr;
    }
    public Date getFakturadato() {
        return fakturadato;
    }
    public Date getForfaldsdato() {
        return forfaldsdato;
    }
    public Fakturamodtager getFakturamodtager() {
        return fakturamodtager;
    }
    public Fakturaudsteder getFakturaudsteder() {
        return fakturaudsteder;
    }
    public ArrayList<Fakturalinje> getFakturalinjer() {
        return fakturalinjer;
    }
    public double getSubtotalUdenMoms() {
        return subtotalUdenMoms;
    }
    public double getMoms() {
        return moms;
    }
    public double getFakturatotal() {
        return fakturatotal;
    }
}
