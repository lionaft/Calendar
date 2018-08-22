package model;

public abstract class Entry {
    private Date date;
    private Time time;
    private String label;
    private Integer intervalOfRepetition;

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    public int getIntervalOfRepetition() {
        return intervalOfRepetition;
    }

    public boolean isRepeating() {
        return (intervalOfRepetition != null);
    }

    public void setIntervalOfRepetition(int intOfRepetition) {
        this.intervalOfRepetition = intOfRepetition;
    }

    public Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
    }
}
