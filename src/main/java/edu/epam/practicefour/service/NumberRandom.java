package edu.epam.practicefour.service;

import edu.epam.practicefour.entity.NumberArray;

import java.util.Random;

public class NumberRandom {

    private static final Random rand = new Random();
    private static final int DEFAULT_MAX = 1000;

    public NumberArray randomArray(int size, int range){
        NumberArray numberArray = new NumberArray();
        for (int i = 0; i < size; i++){
            int number = rand.nextInt(range);
            numberArray.add(number);
        }
        return numberArray;
    }

    public NumberArray randomArray(int size){
      return randomArray(size,DEFAULT_MAX);
    }
}
