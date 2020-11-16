package edu.epam.practiceone.ninthtask.service;

public class CircleService {

    public double getAreaByRadius(double radius){
        return Math.PI * radius*radius;
    }

    public double getLengthByRadius(double radius){
        return 2 * Math.PI * radius;
    }

}
