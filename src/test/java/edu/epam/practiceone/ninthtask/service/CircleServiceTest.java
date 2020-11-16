package edu.epam.practiceone.ninthtask.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleServiceTest {
    @Test
    public void getAreaByRadiusTest(){
        double radius = 3;
        CircleService circleService = new CircleService();
        double actual = circleService.getAreaByRadius(radius);
        double expected = Math.PI * radius *radius;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void getLengthByRadiusTest(){
        double radius = 3;
        CircleService circleService = new CircleService();
        double actual = circleService.getLengthByRadius(radius);
        double expected = 2 * Math.PI * radius;
        Assert.assertEquals(actual,expected);
    }
}
