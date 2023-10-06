package frederik.Authors.Faktura;

public class Faktura {
    private int fakturaNummer;
    private String fakturaDato;
    private String forfaldsDato;
    private int prisUdenMoms;
    int momsBeløb;
    private int fakturaTotal;
    int subTotal;

    public Faktura(int faktuaNummer, String fakturaDato, String forfaldsDato, int prisUdenMoms, int momsBeløb, int fakturaTotal) {
        this.fakturaNummer = faktuaNummer;
        this.fakturaDato = fakturaDato;
        this.forfaldsDato = forfaldsDato;
        this.prisUdenMoms = prisUdenMoms;
        this.momsBeløb = momsBeløb;
        this.fakturaTotal = fakturaTotal;

    }



    public void printNumbers(){
        System.out.println(fakturaNummer + " " + fakturaDato + " " + forfaldsDato + " " + prisUdenMoms + " " + momsBeløb + " " + fakturaTotal);
    }

    public void calculateSubTotal(){
        subTotal = (int) (fakturaTotal * 1.25);
    }
    public int getSubTotal(){
        return subTotal;
    }

    public void calculateMomsBeløb(){
        momsBeløb = (int) (fakturaTotal * 0.25);
    }

    public int getMomsBeløb(){
        return momsBeløb;
    }

    public void setFakturaTotal(){

        this.fakturaTotal = fakturaTotal;
    }


}
