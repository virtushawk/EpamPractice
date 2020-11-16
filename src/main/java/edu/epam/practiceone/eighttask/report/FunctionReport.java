package edu.epam.practiceone.eighttask.report;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FunctionReport {
    public static final Logger logger = Logger.getLogger(FunctionReport.class.getName());

    public void getValueOfFunctionReport(double x, double result){
        logger.log(Level.INFO,x + " : " + result);
    }
}
