package david.invoicemaster;

import david.consolecolors.ConsoleColors;
import david.invoicemaster.Virksomhed.Fakturamodtager;
import david.invoicemaster.Virksomhed.Fakturaudsteder;

public class Program {
    UI ui;
    int answer;
    Faktura faktura;
    boolean keepRunning;

    private void initVar() {
        ui = new UI();
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
            ui.println("\n(1) Registrer produkt\n(2) Print faktura");
            answer = ui.promptInt();
            keepRunning = true;
            switch (answer) {
                case 1 -> registerProductOptions();
                case 2 -> printEntireInvoice();
            }
        } while (keepRunning);
    }

    // Register product options
    private void registerProductOptions() {
        ui.print("\nBeskrivelse: ");
        ui.promptString(); // Scanner bug
        String beskrivelse = ui.promptString();

        ui.print("Antal: ");
        int antal = ui.promptInt();

        ui.print("Enhed (e.g. stk): ");
        ui.promptString(); // Scanner bug
        String enhed = ui.promptString();

        ui.print("Pris: ");
        int pris = ui.promptInt();

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
        ui.println(ConsoleColors.YELLOW + "\n\n----------------------------------------------------------------------------" + ConsoleColors.RESET);
        ui.println("Modtager:");
        ui.println(faktura.getFakturamodtager().getVirksomhedsnavn());
        ui.println(faktura.getFakturamodtager().getPostnummer() + ", " + faktura.getFakturamodtager().getBy());
        ui.println(faktura.getFakturamodtager().getLand());
    }

    // Print 'Faktura'
    private void printFaktura() {
        ui.printf("%48s%n", "Faktura");
        ui.printf(ConsoleColors.YELLOW + "%80s%n", "-----------------------------------" + ConsoleColors.RESET);
        ui.printf("%51s%25d%n", "Fakturanr.", faktura.getFakturanr());
        ui.printf("%52s%24s%n", "Fakturadato", faktura.getFakturadato().toString());
        ui.printf("%53s%23s%n", "Forfaldsdato", faktura.getForfaldsdato().toString());
        ui.printf("%54s%s%22.2f%s%n", "At betale DKK", ConsoleColors.RED_BOLD, faktura.getFakturatotal(), ConsoleColors.RESET);
    }

    // Print 'Produkt'
    private void printFakturalinje() {
        ui.printf("%n%-29s%-12s%-14s%-11s%10s%n", "Beskrivelse", "Antal", "Enhed", "Pris", "Beløb");
        for (Fakturalinje fakturalinje : faktura.getFakturalinjer()) {
            ui.printf("%-29s%-12s%-14s%-11s%10s%n", fakturalinje.getBeskrivelse(), fakturalinje.getAntal(), fakturalinje.getEnhed(), fakturalinje.getPris(), fakturalinje.getBeloeb());
        }
    }

    // Print 'Totalpris'
    private void printTotal() {
        ui.printf("%n%n%n%59s%17.2f%n", "Subtotal uden moms", faktura.getSubtotalUdenMoms());
        ui.printf("%56s%20.2f%n", "Moms 25% udgør ", faktura.getMoms());
        ui.printf("%50s%s%26.2f%s%n%n", "Total DKK", ConsoleColors.RED_BOLD, faktura.getFakturatotal(), ConsoleColors.RESET);
    }

    // Print 'Udsteder'
    private void printUdsteder() {
        ui.println(ConsoleColors.YELLOW + "----------------------------------------------------------------------------" + ConsoleColors.RESET);
        ui.printf("Virksomhed: %14s%25s%25s\n", faktura.getFakturaudsteder().getVirksomhedsnavn(), "Bank:", faktura.getFakturaudsteder().getBank());
        ui.printf("Adresse: %16s, %s, %s %11s%23s\n", faktura.getFakturaudsteder().getAdresse(), faktura.getFakturaudsteder().getPostnummer(), faktura.getFakturaudsteder().getBy(), "Reg.nr:", faktura.getFakturaudsteder().getRegnr());
        ui.printf("E-mail:%28s %19s%21s\n", faktura.getFakturaudsteder().getEmail(), "Kontonr.:", faktura.getFakturaudsteder().getKontonr());
        ui.printf("CVR:%18s %38s%15s\n", faktura.getFakturaudsteder().getCvr(), "Kontoindehaver:", faktura.getFakturaudsteder().getKontoindehaver());
        ui.printf("Momsnr.:%16s\n", faktura.getFakturaudsteder().getMomsnr());
        ui.println(ConsoleColors.YELLOW + "----------------------------------------------------------------------------" + ConsoleColors.RESET);
    }
}
