package edu.epam.tenthtask.service;

import edu.epam.tenthtask.entity.NumberArray;
import edu.epam.tenthtask.entity.Section;
import edu.epam.tenthtask.report.NumberFunctionReport;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberFunctionServiceTest {

    @Test
    public void getResultByNumbersTest(){
        NumberArray xArray = new NumberArray(0, 30, 45);
        NumberFunctionService numberFunctionService = new NumberFunctionService();
        NumberArray actual = numberFunctionService.getResultByNumbers(xArray);
        NumberArray expected = new NumberArray(0,Math.tan(Math.toRadians(30)),Math.tan(Math.toRadians(45)));
        NumberFunctionReport numberFunctionReport = new NumberFunctionReport();
        numberFunctionReport.getResultByNumbersPrint(xArray,actual);
        Assert.assertEquals(actual.toString(),expected.toString());
    }

    @Test
    public void getResultBySectionTest(){
        Section section = new Section(0,60,30);
        NumberFunctionService numberFunctionService = new NumberFunctionService();
        NumberArray actual = numberFunctionService.getResultBySection(section);
        NumberArray expected = new NumberArray(0,Math.tan(Math.toRadians(30)),Math.tan(Math.toRadians(60)));
        NumberFunctionReport numberFunctionReport = new NumberFunctionReport();
        numberFunctionReport.getResultBySectionPrint(section,actual);
        Assert.assertEquals(actual.toString(),expected.toString());
    }

    @Test
    public void functionTest(){
        double x = 30;
        double expected = Math.sqrt(3)/3;
        NumberFunctionService numberFunctionService = new NumberFunctionService();
        double actual = numberFunctionService.function(x);
        Assert.assertEquals(actual,expected);
    }
}
