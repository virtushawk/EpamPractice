package edu.epam.tenthtask.report;

import edu.epam.tenthtask.entity.NumberArray;
import edu.epam.tenthtask.entity.Section;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberFunctionReport {
    public static final Logger logger = Logger.getLogger(NumberFunctionReport.class.getName());

    public void getResultByNumbersReport(NumberArray numbers,NumberArray result){
        logger.log(Level.INFO,numbers + " " + result);
    }

    public void getResultBySectionReport(Section section,NumberArray result){
        logger.log(Level.INFO,section + " " + result);
    }

    public void getResultByNumbersPrint(NumberArray numbers,NumberArray result){
        System.out.println("x : F(x)");
        for (int i = 0; i < numbers.getLength(); i++){
            System.out.println(numbers.getNumber(i) + " : " + result.getNumber(i));
        }
    }

    public void getResultBySectionPrint(Section section,NumberArray result){
        System.out.println("x : F(x)");
        int j = 0;
        for (double i = section.getA(); i <= section.getB() ; i+= section.getH()){
            System.out.println(i + " : " + result.getNumber(j++));
        }
    }
}
