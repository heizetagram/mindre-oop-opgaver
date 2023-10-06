package faelles.mytime;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Clock {
    String pattern = "HH:mm:ss.SSSZ";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date;

    private int hour;
    private int minute;
    private int year;
    private int month;
    private int day;
    boolean leap = false;
    String dayType;

    // Constructor
    public Clock(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;

        illegalTime();
        illegalDate();
        isLeapYear();
        isWorkDay();
    }

    // Time as string method
    public String timeAsString() {
        return String.format("%02d:%02d", hour, minute);
    }

    // Finds day of the week
    public DayOfWeek dayOfWeek() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek();
    }

    // Illegal time
    private void illegalTime() {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Wrong time");
        }
    }

    // Illegal date
    private void illegalDate() {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31)
            throw new IllegalArgumentException("Wrong date");
    }

    // Leap year calculator
    private void isLeapYear() {
        if (year % 4 == 00)
            leap = true;
        else
            leap = false;
        if (leap)
            System.out.println("it's a leap year!");
        else
            System.out.println("its not a leap year");
    }

    // Checks if it's a work day
    public String isWorkDay() {
        if (dayOfWeek() != DayOfWeek.SATURDAY && dayOfWeek() != DayOfWeek.SUNDAY)
            dayType = "It's a work day";
        else dayType = "It's weekend!";
        return dayType;
    }

    // Add minutes
    public void addMinutes(int minutes) {
        if (minutes >= 60) {
            hour += minutes / 60;
            minute += (minutes % 60);
        } else
            minute += minutes;
    }

    // Subtract minutes
    public void subtractMinutes(int minutes) {
        if (minutes >= 0) {
            hour -= minutes / 60;
            minute -= (minutes % 60);
        } else
            minute -= minutes;
    }
}
