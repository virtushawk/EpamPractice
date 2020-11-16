package edu.epam.practiceone.fifthtask.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberServiceTest {
    @Test
    public void isNumberPrimeTrueTest(){
        int number = 6;
        NumberService numberService = new NumberService();
        boolean actual = numberService.isNumberPerfect(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void isNumberPrimeFalseTest(){
        int number = 5;
        NumberService numberService = new NumberService();
        boolean actual = numberService.isNumberPerfect(number);
        Assert.assertFalse(actual);
    }
}
