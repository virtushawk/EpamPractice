package edu.epam.practiceone.fifthtask.report;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberReport {
    public static final Logger logger = Logger.getLogger(NumberReport.class.getName());
    public void isNumberPerfectReport(int number,boolean flag){
        logger.log(Level.INFO,number + "perfect : " + flag);
    }
}
