package edu.epam.practiceone.secondtask.report;

import edu.epam.practiceone.secondtask.entity.CalendarDate;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalendarDateReport {
  public static final  Logger logger = Logger.getLogger(CalendarDateReport.class.getName());

    public void printDaysInMonthReport(CalendarDate date,int days){
        logger.log(Level.INFO,days + " days in " + date);
    }

    public void isYearLeapReport(int year,boolean flag){
        logger.log(Level.INFO,"is " + year + " leap : " + flag);
    }
}
