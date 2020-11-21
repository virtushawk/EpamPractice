package edu.epam.practicethree.report;

import edu.epam.practicethree.entity.Ball;
import edu.epam.practicethree.entity.Basket;
import edu.epam.practicethree.entity.Color;

import java.util.List;

public class BallReport {
    public void basketWeight(Basket basket,double weight){
        System.out.printf("%s weight is : %f%n", basket,weight);
    }

    public void numberByColor(Basket basket,int count,Color color){
        System.out.printf("%s has %d with color %s%n",basket,count,color);
    }

    public void numberByWeight(Basket basket,int count, double weight){
        System.out.printf("%s has %d with weight %f%n",basket,count,weight);
    }

    public void listByColor(Basket basket, List<Ball> balls, Color color){
        System.out.printf("%s has %s with color %s%n",basket,balls,color);
    }

    public void listByWeight(Basket basket, List<Ball> balls, double weight){
        System.out.printf("%s has %s with weight %f%n",basket,balls,weight);
    }
}
