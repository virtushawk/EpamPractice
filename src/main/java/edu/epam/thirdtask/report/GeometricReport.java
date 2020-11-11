package edu.epam.thirdtask.report;

import edu.epam.thirdtask.entity.Square;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GeometricReport {

    public static final Logger logger = Logger.getLogger(GeometricReport.class.getName());

    public void areaOfInscribedSquareReport(Square square){
        logger.log(Level.INFO,"Area of square is " + square.getArea());
    }

    public void compareTwoSquaresReport(double result){
        logger.log(Level.INFO,"the area of inscribed square less by " + result);
    }
}
