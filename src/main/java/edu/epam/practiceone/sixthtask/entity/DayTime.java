package edu.epam.practiceone.sixthtask.entity;

public class DayTime {
    private int hours;
    private int minutes;
    private int seconds;

    public DayTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    //vtoroe reshenie
    public DayTime(int sec) {
        int hours = sec/3600;
        int minutes = (sec - hours*3600) / 60;
        int seconds = sec - hours * 3600 - minutes * 60;
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours >= 24){
            throw new IllegalArgumentException("hours must be in range (0-23)");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes < 0 || minutes > 60){
            throw new IllegalArgumentException("minutes must be in range (0-60)");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds < 0 || seconds > 60){
            throw new IllegalArgumentException("seconds must be in range (0-60)");
        }
        this.seconds = seconds;
    }
    @Override
    public String toString() {
        return "DayTime{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }


}
