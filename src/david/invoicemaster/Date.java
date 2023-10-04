package david.invoicemaster;

import java.util.Calendar;

public class Date {
    private Calendar calendar;
    private int day;
    private int month;
    private int year;

    // Today's date constructor
    public Date() {
        calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH) + 1; // Months start at 0, so 1 is added
        year = calendar.get(Calendar.YEAR);
    }

    // Today's date + added days constructor
    public Date (int forfaldsdage) {
        calendar = Calendar.getInstance();
        day = calendar.get(Calendar.DAY_OF_MONTH) + forfaldsdage;
        month = calendar.get(Calendar.MONTH) + 1; // Months start at 0, so 1 is added
        year = calendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return day + "/" + month + "-" + year;
    }
}
