package edu.epam.firsttask.entity;

import java.util.Arrays;

public class DigitsArray {
    private int [] digits;

    public DigitsArray(int... digits) {
        this.digits = digits;
    }

    public DigitsArray(){
        digits = new int[0];
    }

    public int getDigit(int index) {
        if (index < 0 || index > digits.length-1){
            throw new IllegalArgumentException("wrong index");
        }
        return digits[index];
    }

    public void setDigits(int... digits) {
        this.digits = digits;
    }

    public void addDigit(int digit){
        int [] newArray = new int[digits.length + 1];
        System.arraycopy(digits, 0, newArray, 0, digits.length);
        newArray[digits.length] = digit;
        this.digits = newArray;
    }

    public int getLength(){
        return digits.length;
    }

    @Override
    public String toString() {
        return "DigitsArray{" +
                "digits=" + Arrays.toString(digits) +
                '}';
    }
}
