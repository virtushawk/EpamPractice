package edu.epam.practiceone.firsttask.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitsArrayTest {

    @Test
    public void addDigitTest(){
        DigitsArray actual = new DigitsArray(1,2,3);
        actual.addDigit(4);
        DigitsArray expected  = new DigitsArray(1,2,3,4);
        Assert.assertEquals(actual.toString(),expected.toString());
    }
}
