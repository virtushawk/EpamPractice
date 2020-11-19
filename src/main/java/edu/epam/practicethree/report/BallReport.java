package edu.epam.practicethree.report;

import edu.epam.practicethree.entity.Ball;
import edu.epam.practicethree.entity.Basket;
import edu.epam.practicethree.entity.Color;

import java.util.List;

public class BallReport {
    public void basketWeight(Basket basket,double weight){
        System.out.printf("%s weight is : %f%n", basket.toString(),weight);
    }

    public void numberByColor(Basket basket,int count,Color color){
        System.out.printf("%s has %d with color %s%n",basket.toString(),count,color.toString());
    }

    public void numberByWeight(Basket basket,int count, double weight){
        System.out.printf("%s has %d with weight %f%n",basket.toString(),count,weight);
    }

    public void listByColor(Basket basket, List<Ball> balls, Color color){
        System.out.printf("%s has %s with color %s%n",basket.toString(),balls.toString(),color.toString());
    }

    public void listByWeight(Basket basket, List<Ball> balls, double weight){
        System.out.printf("%s has %s with weight %f%n",basket.toString(),balls.toString(),weight);
    }
}
