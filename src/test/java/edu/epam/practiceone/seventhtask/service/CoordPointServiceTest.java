package edu.epam.practiceone.seventhtask.service;

import edu.epam.practiceone.seventhtask.entity.CoordPoint;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CoordPointServiceTest {

    @Test
    public void compareByLengthDownZeroTest(){
        CoordPoint point1 = new CoordPoint(0,1);
        CoordPoint point2 = new CoordPoint(1,0);
        int expected = 0;
        CoordPointService coordPointService = new CoordPointService();
        int actual = coordPointService.compareByLengthDown(point1,point2);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void compareByLengthOneTest(){
        CoordPoint point1 = new CoordPoint(0,1);
        CoordPoint point2 = new CoordPoint(1,1);
        int expected = 1;
        CoordPointService coordPointService = new CoordPointService();
        int actual = coordPointService.compareByLengthDown(point1,point2);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void compareByLengthTwoTest(){
        CoordPoint point1 = new CoordPoint(1,1);
        CoordPoint point2 = new CoordPoint(0,1);
        int expected = 2;
        CoordPointService coordPointService = new CoordPointService();
        int actual = coordPointService.compareByLengthDown(point1,point2);
        Assert.assertEquals(actual,expected);
    }

}
