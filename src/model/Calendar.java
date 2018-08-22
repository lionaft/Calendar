package model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private Date currentDate;
    private String owner;
    private List<Entry> entryList;

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getOwner() {
        return owner;
    }

    public void addEntry(Entry e) {
        entryList.add(e);
    }

    public void removeEntry(Entry e) {
        entryList.remove(e);
    }

    public List<Entry> getEntryList() {
        return entryList;
    }

    public Calendar(Date date, String owner) {
        this.currentDate = date;
        this.owner = owner;
        this.entryList = new ArrayList<>();
    }

    public Entry soonestEntry() {
        Entry e = entryList.get(0);
        for (Entry entry : entryList) {
            if (e.getDate().dateOlder(entry.getDate()) || (e.getDate().equals(entry.getDate()) && e.getTime().timeOlder(entry.getTime())))
                e = entry;
        }
        return e;
    }

    public List<String> entryByName() {
        List<String> r = new ArrayList<>();
        for (Entry e : entryList)
            r.add(e.getLabel());
        return r;
    }

    public List<Meeting> getMeetings() {
        List<Meeting> r = new ArrayList<>();
        for (Entry e :entryList)
            if (e.getClass() == Meeting.class)
                r.add((Meeting)e);
        return r;
    }
}
