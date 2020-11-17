package edu.epam.practicethree.service;

import edu.epam.practicethree.entity.Ball;
import edu.epam.practicethree.entity.Basket;
import edu.epam.practicethree.entity.Color;

public class BasketService {

    public int getNumberByColor(Basket basket, Color color){
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }

    public double getWeight(Basket basket) {
        double result = 0;
        for (Ball ball : basket.getBalls()) {
            result += ball.getWeight();
        }
        return result;
    }

}
