package edu.epam.eightask.service;

import edu.epam.eighttask.service.FunctionService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionServiceTest {

    @Test
    public void getValueOfFunctionLessTest(){
        double x = 2;
        double expected = 1/(x*x*x - 6);
        FunctionService functionService = new FunctionService();
        double actual = functionService.getValueOfFunction(x);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void getValueOfFunctionMoreTest(){
        double x = 3;
        double expected = -x*x + 3*x + 9;
        FunctionService functionService = new FunctionService();
        double actual = functionService.getValueOfFunction(x);
        Assert.assertEquals(actual,expected);
    }
}
