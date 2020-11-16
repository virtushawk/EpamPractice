package edu.epam.practicetwo.report;

import edu.epam.practicetwo.entity.Basket;
import java.util.Arrays;

public class BallReport {
    public void basketWeight(Basket basket,double weight){
        System.out.printf("%s weight is : %f%n", basket.toString(),weight);
    }

    public void numberOfBallsByColor(Basket basket,int count){
        System.out.printf("%s has %d colors%n",basket.toString(),count);
    }
}
