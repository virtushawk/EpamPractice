package edu.epam.practiceone.thirdtask.service;

import edu.epam.practiceone.thirdtask.entity.Circle;
import edu.epam.practiceone.thirdtask.entity.Square;

public class GeometricService {

    public Circle getInscribedCircleOfSquare(Square square){
        double area = square.getArea();
        return new Circle(area*Math.PI/4);
    }

    public Square getInscribedSquareOfCircle(Circle circle){
        double radius = circle.getRadius();
        return new Square(2*radius*radius);
    }

    public double compareTwoSquaresByArea(Square square1, Square square2){
        return square1.getArea()/square2.getArea();
    }
}