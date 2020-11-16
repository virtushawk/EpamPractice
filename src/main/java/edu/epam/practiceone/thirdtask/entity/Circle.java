package edu.epam.practiceone.thirdtask.entity;

public class Circle {
    private double area;
    private double radius;

    public Circle(double area) {
        setArea(area);
        setRadius(Math.sqrt(area/Math.PI));
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area <= 0){
            throw new IllegalArgumentException("area can't be less than 0");
        }
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new IllegalArgumentException("radius can't be less than 0");
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area +
                ", radius=" + radius +
                '}';
    }
}
