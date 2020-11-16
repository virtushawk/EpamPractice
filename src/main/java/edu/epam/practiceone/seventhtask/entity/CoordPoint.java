package edu.epam.practiceone.seventhtask.entity;

public class CoordPoint {
    private double x;
    private double y;
    private double length;

    public CoordPoint(double x, double y) {
        this.x = x;
        this.y = y;
        setLength(x,y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private void setLength(double x, double y){
        this.length = Math.sqrt(x*x+y*y);
    }

    public double getLength(){
        return length;
    }

    @Override
    public String toString() {
        return "CoordPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
