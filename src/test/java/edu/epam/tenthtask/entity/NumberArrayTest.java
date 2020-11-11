package edu.epam.tenthtask.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberArrayTest {

    @Test
    public void addNumberTest(){
        NumberArray actual = new NumberArray(1,2,3);
        actual.addNumber(4);
        NumberArray expected  = new NumberArray(1,2,3,4);
        Assert.assertEquals(actual.toString(),expected.toString());
    }
}
