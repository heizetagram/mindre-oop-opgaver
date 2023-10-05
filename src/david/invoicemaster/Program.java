package david.invoicemaster;

import david.ui.ConsoleColors;
import david.invoicemaster.Virksomhed.Fakturamodtager;
import david.invoicemaster.Virksomhed.Fakturaudsteder;
import david.ui.UI;

public class Program {
    int answer;
    Faktura faktura;
    boolean keepRunning;

    private void initVar() {
        Fakturamodtager fakturamodtager = new Fakturamodtager("Lulus Butik", "Butikvej 12", 5270, "Odense N", "Danmark", "lulu@gmail.com", 12123434, "DK43432121", "Lunar", 5932, 1192837593, "Lulu");
        Fakturaudsteder fakturaudsteder = new Fakturaudsteder("Lee Business", "Firmavej 12", 5000, "Odense C", "Danmark", "leebusiness@gmail.com", 12345678, "DK87654321", "Arbejdernes Landsbank", 5029, 1058274958, "Lee");
        faktura = new Faktura(fakturamodtager, fakturaudsteder, 14);
    }

    public static void main(String[] args) {
        new Program().run();
    }

    // Run method
    private void run() {
        initVar();

        do {
            UI.println("\n(1) Registrer produkt\n(2) Print faktura");
            answer = UI.promptInt();
            keepRunning = true;
            switch (answer) {
                case 1 -> registerProductOptions();
                case 2 -> printEntireInvoice();
            }
        } while (keepRunning);
    }

    // Register product options
    private void registerProductOptions() {
        UI.print("\nBeskrivelse: ");
        UI.promptString(); // Scanner bug
        String beskrivelse = UI.promptString();

        UI.print("Antal: ");
        int antal = UI.promptInt();

        UI.print("Enhed (e.g. stk): ");
        UI.promptString(); // Scanner bug
        String enhed = UI.promptString();

        UI.print("Pris: ");
        int pris = UI.promptInt();

        registerProduct(beskrivelse, antal, enhed, pris);
    }

    // Register product
    private void registerProduct(String beskrivelse, int antal, String enhed, int pris) {
        Fakturalinje fakturalinje = new Fakturalinje(beskrivelse, antal, enhed, pris);
        faktura.addFakturalinje(fakturalinje);
    }

    // Print entire invoice
    private void printEntireInvoice() {
        printModtager(); // Modtager
        printFaktura(); // Faktura
        printFakturalinje(); // Produkter
        printTotal(); // Subtotal uden moms, moms og total
        printUdsteder(); // Udsteder
        keepRunning = false;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    // Print 'Modtager'
    private void printModtager() {
        UI.println(ConsoleColors.YELLOW + "\n\n----------------------------------------------------------------------------" + ConsoleColors.RESET);
        UI.println("Modtager:");
        UI.println(faktura.getFakturamodtager().getVirksomhedsnavn());
        UI.println(faktura.getFakturamodtager().getPostnummer() + ", " + faktura.getFakturamodtager().getBy());
        UI.println(faktura.getFakturamodtager().getLand());
    }

    // Print 'Faktura'
    private void printFaktura() {
        UI.printf("%48s%n", "Faktura");
        UI.printf(ConsoleColors.YELLOW + "%80s%n", "-----------------------------------" + ConsoleColors.RESET);
        UI.printf("%51s%25d%n", "Fakturanr.", faktura.getFakturanr());
        UI.printf("%52s%24s%n", "Fakturadato", faktura.getFakturadato().toString());
        UI.printf("%53s%23s%n", "Forfaldsdato", faktura.getForfaldsdato().toString());
        UI.printf("%54s%s%22.2f%s%n", "At betale DKK", ConsoleColors.RED_BOLD, faktura.getFakturatotal(), ConsoleColors.RESET);
    }

    // Print 'Produkt'
    private void printFakturalinje() {
        UI.printf("%n%-29s%-12s%-14s%-11s%10s%n", "Beskrivelse", "Antal", "Enhed", "Pris", "Beløb");
        for (Fakturalinje fakturalinje : faktura.getFakturalinjer()) {
            UI.printf("%-29s%-12s%-14s%-11s%10s%n", fakturalinje.getBeskrivelse(), fakturalinje.getAntal(), fakturalinje.getEnhed(), fakturalinje.getPris(), fakturalinje.getBeloeb());
        }
    }

    // Print 'Totalpris'
    private void printTotal() {
        UI.printf("%n%n%n%59s%17.2f%n", "Subtotal uden moms", faktura.getSubtotalUdenMoms());
        UI.printf("%56s%20.2f%n", "Moms 25% udgør ", faktura.getMoms());
        UI.printf("%50s%s%26.2f%s%n%n", "Total DKK", ConsoleColors.RED_BOLD, faktura.getFakturatotal(), ConsoleColors.RESET);
    }

    // Print 'Udsteder'
    private void printUdsteder() {
        UI.println(ConsoleColors.YELLOW + "----------------------------------------------------------------------------" + ConsoleColors.RESET);
        UI.printf("Virksomhed: %14s%25s%25s\n", faktura.getFakturaudsteder().getVirksomhedsnavn(), "Bank:", faktura.getFakturaudsteder().getBank());
        UI.printf("Adresse: %16s, %s, %s %11s%23s\n", faktura.getFakturaudsteder().getAdresse(), faktura.getFakturaudsteder().getPostnummer(), faktura.getFakturaudsteder().getBy(), "Reg.nr:", faktura.getFakturaudsteder().getRegnr());
        UI.printf("E-mail:%28s %19s%21s\n", faktura.getFakturaudsteder().getEmail(), "Kontonr.:", faktura.getFakturaudsteder().getKontonr());
        UI.printf("CVR:%18s %38s%15s\n", faktura.getFakturaudsteder().getCvr(), "Kontoindehaver:", faktura.getFakturaudsteder().getKontoindehaver());
        UI.printf("Momsnr.:%16s\n", faktura.getFakturaudsteder().getMomsnr());
        UI.println(ConsoleColors.YELLOW + "----------------------------------------------------------------------------" + ConsoleColors.RESET);
    }
}
