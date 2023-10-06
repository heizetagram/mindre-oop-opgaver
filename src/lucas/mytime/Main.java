package lucas.mytime;

public class Main {
        private int hours;
        private int minutes;

        public Main(int hours, int minutes) {
            this.hours = hours;
            this.minutes = minutes;
        }

        public String timeAsString() {
            return String.format("%02d:%02d", hours, minutes);
        }

        public static void main(String[] args) {
            // Opret et nyt tidspunkt
            Main time = new Main(14, 57);

            // Udskriv tidspunktet
            System.out.println(time.timeAsString());  // Output: 14:57
        }
    }





