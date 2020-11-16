package edu.epam.practicetwo;

import edu.epam.practicetwo.entity.Ball;
import edu.epam.practicetwo.entity.Basket;
import edu.epam.practicetwo.entity.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BallTest {

    @Test
    public void BallWeightTest(){
        Ball ballOne = new Ball(5, Color.RED);
        Ball ballTwo = new Ball(10,Color.BLUE);
        Ball ballThree = new Ball(5,Color.BLUE);
        double expected = ballOne.getWeight() + ballTwo.getWeight() + ballThree.getWeight();
        Basket basket = new Basket(ballOne,ballTwo,ballThree);
        double actual = basket.getWeight();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void BallColorTest(){
        Ball ballOne = new Ball(5,Color.RED);
        Ball ballTwo = new Ball(10,Color.BLUE);
        Ball ballThree = new Ball(5,Color.BLUE);
        int expected = 2;
        Basket basket = new Basket(ballOne,ballTwo,ballThree);
        int actual = basket.getNumberByColor(Color.BLUE);
        Assert.assertEquals(actual,expected);
    }
}
