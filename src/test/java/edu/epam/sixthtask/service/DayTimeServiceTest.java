package edu.epam.sixthtask.service;

import edu.epam.sixthtask.entity.DayTime;
import edu.epam.sixthtask.service.DayTimeService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DayTimeServiceTest {
    @Test
    public void getDayTimeFromSecondsTest(){
        int seconds = 3678;
        DayTimeService dayTimeService = new DayTimeService();
        DayTime dayTime = dayTimeService.getDayTimeFromSeconds(seconds);
        Assert.assertEquals(dayTime.toString(),new DayTime(1,1,18).toString());
    }

}
