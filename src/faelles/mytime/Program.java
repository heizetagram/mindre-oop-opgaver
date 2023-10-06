package faelles.mytime;

public class Program {
    public static void main(String[] args) {
        new Program().run();
    }

    private void run() {

        // YEAR:MONTH:DAY:H:M
        Clock clock = new Clock(2023, 10, 9, 9, 3);

        clock.addMinutes(120);
        clock.subtractMinutes(120);
        System.out.println(clock.timeAsString());
        System.out.println(clock.dayOfWeek());
        System.out.println(clock.isWorkDay());
    }
}
