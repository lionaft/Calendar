package model;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public String GetTime() {
        return String.format("%02d",hour) + ":" + String.format("%02d",minute);
    }

    public String Get12Time() {
        String app;
        String hour12;
        if (hour > 12) {
            app = " PM";
            hour12 = String.format("%02d",hour);
        }
        else {
            app = " AM";
            hour12 = String.format("%02d",(hour-12));
        }
        return hour12 + ":" + String.format("%02d",minute) + app;
    }

    public boolean timeOlder(Time time) {
        return time.hour > hour || time.minute > minute;
    }
}
