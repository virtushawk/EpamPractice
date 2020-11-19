package edu.epam.practicethree.service;

import edu.epam.practicethree.entity.Ball;
import edu.epam.practicethree.entity.Basket;
import edu.epam.practicethree.entity.Color;

import java.util.ArrayList;
import java.util.List;

public class BasketService {
    public int numberByColor(Basket basket, Color color){
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }

    public int numberByWeight(Basket basket, double weight){
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getWeight() == weight){
                count++;
            }
        }
        return count;
    }

    public double weight(Basket basket) {
        double result = 0;
        for (Ball ball : basket.getBalls()) {
            result += ball.getWeight();
        }
        return result;
    }

    public List<Ball> listByColor(Basket basket, Color color){
        ArrayList<Ball> balls = new ArrayList<>();
        for (Ball ball : basket.getBalls()) {
            if(ball.getColor() == color){
                balls.add(ball);
            }
        }
        return balls;
    }

    public List<Ball> listByWeight(Basket basket, double weight){
        ArrayList<Ball> balls = new ArrayList<>();
        for (Ball ball : basket.getBalls()) {
            if(ball.getWeight() == weight){
                balls.add(ball);
            }
        }
        return balls;
    }
}
