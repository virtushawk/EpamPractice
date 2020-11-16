package edu.epam.practiceone.ninthtask.entity;

public class Circle {
    private double radius;
    private double area;
    private double length;

    public Circle(double radius) {
       setRadius(radius);
       setArea(radius);
       setLength(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new IllegalArgumentException("radius Can't be less than 0");
        }
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    private void setArea(double radius) {
        double area = Math.PI * radius*radius;
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    private void setLength(double radius) {
        double length = 2 * Math.PI * radius;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", length=" + length +
                '}';
    }
}
