package edu.epam.practiceone.tenthtask.service;

import edu.epam.practiceone.tenthtask.entity.NumberArray;
import edu.epam.practiceone.tenthtask.entity.Section;

public class NumberFunctionService {
    public NumberArray getResultByNumbers(NumberArray numbers) {
        NumberArray result = new NumberArray();
        for (int i = 0; i < numbers.getLength();i++){
            result.addNumber(function(numbers.getNumber(i)));
        }
        return result;
    }

    public NumberArray getResultBySection(Section section){
        NumberArray result = new NumberArray();
        for (double i = section.getA(); i <= section.getB(); i+= section.getH()){
            result.addNumber(function(i));
        }
        return result;
    }

    public double function (double x){
        double a = Math.toRadians(x);
        return Math.tan(a);
    }
}
