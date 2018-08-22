package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(new Date(22,8,2018),"panteleev-iv@sberbank.ru");
        Reminder r1 = new Reminder(new Date(23, 8, 2018), new Time(15,0),"Travel","Travel to");
        Reminder r2 = new Reminder(new Date(23, 8, 2018), new Time(14,30),"Travel","Travel to");
        Entry event1 = new Event(new Date(23,8,2018),new Time(15,0),"Travel", r1);
        Meeting meet1 = new Meeting(new Date(23,8,2018),new Time(15,0), "Meet", r2);
        meet1.addAttendee("troitskiy-ks@sberbank.ru");
        meet1.addAttendee("solovtsov-di@sberbank.ru");
        calendar.addEntry(event1);
        calendar.addEntry(meet1);
        for (Meeting m : calendar.getMeetings())
            m.sendInvites();

    }
}
