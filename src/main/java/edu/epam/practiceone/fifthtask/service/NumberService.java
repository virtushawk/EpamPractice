package edu.epam.practiceone.fifthtask.service;

public class NumberService {

    public boolean isNumberPerfect(int number){
        int sum = 0;
        boolean isPerfect = false;
        for (int i = 1;i < number;i++){
            if(number % i == 0){
                sum+= i;
            }
        }
        if(sum == number){
            isPerfect = true;
        }
        return isPerfect;
    }
}
