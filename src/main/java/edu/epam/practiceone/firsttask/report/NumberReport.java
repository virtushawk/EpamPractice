package edu.epam.practiceone.firsttask.report;

import edu.epam.practiceone.firsttask.entity.DigitsArray;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberReport {
    public static final Logger logger = Logger.getLogger(NumberReport.class.getName());

    public void printLastDigitOfSquareNumber(int digit,int number){
        logger.log(Level.INFO,"The last digit of square " + number + " is " + digit);
    }

    public void printLastDigitOfSquareArray(DigitsArray numbers, DigitsArray digits){
        logger.log(Level.INFO,numbers + " : " + digits);
    }
}
