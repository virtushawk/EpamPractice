package edu.epam.secondtask.service;

import edu.epam.secondtask.entity.CalendarDate;

public class CalendarDateService {

    public int daysInMonth(CalendarDate date){
        int days = -1;
        int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((date.getMonth() == 2) && isYearLeap(date.getYear())){
            days = daysInMonth[date.getMonth()-1] + 1;
        }
        else {
            days = daysInMonth[date.getMonth()-1];
        }
        return days;
    }

    public boolean isYearLeap(int year){
        boolean flag = false;
        if((year % 400 == 0) || (year % 4 == 0)){
            flag = true;
        }
        return flag;
    }
}
