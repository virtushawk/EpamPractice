package edu.epam.eighttask.service;

public class FunctionService {
    public double getValueOfFunction(double x){
        double result;
        if(x >= 3){
            result = functionOne(x);
        }
        else {
            result = functionTwo(x);
        }
        return result;
    }

    private double functionOne(double x){
        return -x * x + 3 * x + 9;
    }

    private double functionTwo(double x){
        return 1/(x * x * x - 6);
    }
}
