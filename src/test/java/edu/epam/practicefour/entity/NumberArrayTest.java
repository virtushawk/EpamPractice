package edu.epam.practicefour.entity;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumberArrayTest {

    public NumberArray array;
    public NumberArray arrayTwo;

    @BeforeTest
    public void beforeTest(){
        array = new NumberArray(31,32,33);
        arrayTwo = new NumberArray(31,32,33);
    }

    @AfterTest
    public void afterTest(){
        array = null;
        arrayTwo = null;
    }

    @Test
    public void equalsTrueTest(){
        boolean actual = array.equals(arrayTwo);
        Assert.assertTrue(actual);
    }

    @Test
    public void hashCodeEqualsTest(){
        int hashCodeArrayOne = array.hashCode();
        int hashCodeArrayTwo = arrayTwo.hashCode();
        boolean actual = hashCodeArrayOne == hashCodeArrayTwo;
        Assert.assertTrue(actual);
    }
}
