package edu.epam.practiceone.secondtask.entity;

public class CalendarDate {
    private int year;
    private int month;

    public CalendarDate(int year, int month) {
       setYear(year);
       setMonth(month);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0) {
            throw new IllegalArgumentException("year can't be negative");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 12 || month < 1){
            throw new IllegalArgumentException("month must be in range (1-12)");
        }
        this.month = month;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                '}';
    }
}
