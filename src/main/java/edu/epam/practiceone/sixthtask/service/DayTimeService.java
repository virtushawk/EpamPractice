package edu.epam.practiceone.sixthtask.service;

import edu.epam.practiceone.sixthtask.entity.DayTime;

public class DayTimeService {
    public DayTime getDayTimeFromSeconds(int sec){
        int hours = sec/3600;
        int minutes = (sec - hours*3600) / 60;
        int seconds = sec - hours * 3600 - minutes * 60;
        return new DayTime(hours,minutes,seconds);
    }
}
