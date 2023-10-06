package frederik.Faktura;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        new Test().run();
    }

    private void run() {

        Faktura faktura1 = new Faktura(1, "2/2-1992", "3/3-2002", 100, 25, 1000);
        fakturaModtager modtager1 = new fakturaModtager("yep@gmail.com", 13, 12, 1312);
        fakturaUdsteder udsteder1 = new fakturaUdsteder("lol@gmail.com", 100, 100, 1000);
        faktura1.printNumbers();
        modtager1.printModtager();
        udsteder1.printUdsteder();
        faktura1.calculateMomsBeløb();
        System.out.println("momsbeløb: " + faktura1.getMomsBeløb());
        faktura1.calculateSubTotal();
        System.out.println("subtotal: " + faktura1.getSubTotal());


        fakturaLinjer linje1 = new fakturaLinjer("Random produkt", 15, "kasse", 100);
        ArrayList<fakturaLinjer> linjer = new ArrayList<>();
        linjer.add(linje1);
        for (int i = 0; i < linjer.size(); i++) {
           System.out.println(linjer.get(i).getBeskrivelse() + " "
                   + linjer.get(i).getAntal() + " "
                   + linjer.get(i).getEnhed() + " "
                    + linjer.get(i).getPris() + " I ALT:"
                      + linjer.get(i).getBeløb() + " ");

        }

    }

}

