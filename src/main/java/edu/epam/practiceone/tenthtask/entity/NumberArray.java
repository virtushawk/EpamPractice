package edu.epam.practiceone.tenthtask.entity;

import java.util.Arrays;

public class NumberArray {
    private double [] numbers;

    public NumberArray(double... numbers) {
        this.numbers = numbers;
    }

    public NumberArray() {
        this.numbers = new double[0];
    }

    public double getNumber(int index) {
        if (index < 0 || index > numbers.length-1){
            throw new IllegalArgumentException("wrong index");
        }
        return numbers[index];
    }

    public void setNumbers(double... numbers) {
        this.numbers = numbers;
    }

    public void addNumber(double number){
        double [] newArray = new double[numbers.length + 1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        newArray[numbers.length] = number;
        this.numbers = newArray;
    }

    public int getLength(){
        return numbers.length;
    }

    @Override
    public String toString() {
        return "NumberArray{" +
                "array=" + Arrays.toString(numbers) +
                '}';
    }
}
