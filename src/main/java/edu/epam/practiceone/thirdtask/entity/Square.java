package edu.epam.practiceone.thirdtask.entity;

public class Square {
    private double area;

    public Square(double area) {
        setArea(area);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area <= 0)
        {
            throw new IllegalArgumentException("area can't be less than 0 ");
        }
        this.area = area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                '}';
    }
}
