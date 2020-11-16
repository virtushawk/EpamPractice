package edu.epam.practiceone.ninthtask.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {

    @Test
    public void setAreaByRadiusConstructorTest(){
        double radius = 3;
        Circle circle = new Circle(radius);
        double actual = circle.getArea();
        double expected = Math.PI * radius *radius;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void setLengthByRadiusConstructorTest(){
        double radius = 3;
        Circle circle = new Circle(radius);
        double actual = circle.getLength();
        double expected = 2 * Math.PI * radius;
        Assert.assertEquals(actual,expected);
    }
}
