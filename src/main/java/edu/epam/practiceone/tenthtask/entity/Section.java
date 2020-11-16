package edu.epam.practiceone.tenthtask.entity;

public class Section {
    private double a;
    private double b;
    private double h = 1;

    public Section(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Section(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Section{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
