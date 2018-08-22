package model;

public class Date {
    private int day;
    private int month;
    private int year;

    private String MonthName() {
        return Months.values()[month].name();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String ToShortDate() {
        return String.format("%02d",day) + "/" +
                String.format("%02d",month) + "/" +
                String.format("%4d",year);
    }

    public String ToLongDate() {
        return String.format("%d",day) + DayOfMonthSuffix() + " " + MonthName() + " " + String.format("%4d",year);
    }

    public boolean dateOlder(Date date) {
        return date.year > year || date.month > month || date.day > day;
    }


    private String DayOfMonthSuffix() {
        if (day >= 11 && day <= 13) {
            return "th";
        }
        switch (day % 10) {
            case 1:  return "st";
            case 2:  return "nd";
            case 3:  return "rd";
            default: return "th";
        }
    }
}
