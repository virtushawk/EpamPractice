package edu.epam.seventhtask.report;

import edu.epam.seventhtask.entity.CoordPoint;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CoordPointReport {

    public static final Logger logger = Logger.getLogger(CoordPointReport.class.getName());

    public void compareByLengthReport(int flag, CoordPoint point1, CoordPoint point2){
        logger.log(Level.INFO,point1.toString() + " and" + point2.toString() + " :" + flag);
    }

}
