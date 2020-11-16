package edu.epam.practiceone.ninthtask.report;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CircleServiceReport {
    public static final Logger logger = Logger.getLogger(CircleServiceReport.class.getName());

    public void getAreaByRadiusReport(double radius, double area){
        logger.log(Level.INFO,"radius " + radius + " : length " + area);
    }

    public void getLengthByRadiusReport(double radius, double length){
        logger.log(Level.INFO,"radius " + radius + " : length " + length);
    }
}
