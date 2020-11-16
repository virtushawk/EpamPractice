package edu.epam.practiceone.sixthtask.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DayTimeTest {

    @Test
    public void setSecondsConstructorTest(){
        int seconds = 3681;
        DayTime dayTime = new DayTime(3681);
        Assert.assertEquals(dayTime.toString(),new DayTime(1,1,21).toString());
    }
}
