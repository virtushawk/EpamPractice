package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.DigitsArray;

public class NumberService {
    public int lastDigitOfSquareNumber(int number){
        int digit = number % 10;
        return digit*digit % 10;
    }

    public DigitsArray lastDigitsOfSquareArray(DigitsArray digits){
        DigitsArray result = new DigitsArray();
        for (int i = 0; i < digits.getLength();i++)
        {
            result.addDigit(lastDigitOfSquareNumber(digits.getDigit(i)));
        }
        return result;
    }
}
