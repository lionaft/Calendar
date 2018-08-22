package model;

import java.util.ArrayList;
import java.util.List;

public class Meeting extends Event {
    private List<String> attendees;

    public List<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }

    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    public void removeAttendee(String attendee) {
        attendees.remove(attendee);
    }

    public void sendInvites() {
        for (String at : attendees) {
            System.out.println("Inviting: " + at);
        }
    }

    public Meeting(Date date, Time time, String label, Reminder reminder) {
        super(date,time,label,reminder);
        this.attendees = new ArrayList<>();
    }
}
