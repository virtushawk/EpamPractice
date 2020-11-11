package edu.epam.sixthtask.report;

import edu.epam.sixthtask.entity.DayTime;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DayTimeReport {
    public static final Logger logger = Logger.getLogger(DayTimeReport.class.getName());
    public void getDayTimeFromSecondsReport(int seconds, DayTime dayTime){
        logger.log(Level.INFO,seconds + " : " + dayTime);
    }

}
