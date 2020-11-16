package edu.epam.practiceone.thirdtask.service;

import edu.epam.practiceone.thirdtask.entity.Circle;
import edu.epam.practiceone.thirdtask.entity.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeometricServiceTest {

    @Test
    public void getInscribedCircleOfSquareTest()
    {
        double area = 16;
        double expected = 16*Math.PI/4;
        Square square = new Square(area);
        GeometricService geometricService = new GeometricService();
        Circle circle = geometricService.getInscribedCircleOfSquare(square);
        double actual = circle.getArea();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void getInscribedSquareOfCircleTest(){
        double area = 16;
        Circle circle = new Circle(area);
        double expected = circle.getRadius() * circle.getRadius() * 2;
        GeometricService geometricService = new GeometricService();
        Square square = geometricService.getInscribedSquareOfCircle(circle);
        double actual = square.getArea();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void compareTwoSquaresTest()
    {
        Square square1 = new Square(16);
        Square square2 = new Square(4);
        double expected = 4;
        GeometricService geometricService = new GeometricService();
        double actual = geometricService.compareTwoSquaresByArea(square1,square2);
        Assert.assertEquals(actual,expected);
    }
}
