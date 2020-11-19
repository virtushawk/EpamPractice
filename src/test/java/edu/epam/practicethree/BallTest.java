package edu.epam.practicethree;

import edu.epam.practicethree.entity.Ball;
import edu.epam.practicethree.entity.Basket;
import edu.epam.practicethree.entity.Color;
import edu.epam.practicethree.report.BallReport;
import edu.epam.practicethree.service.BasketService;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;

public class BallTest {

    public  Basket basket = new Basket();

    @BeforeTest
    public void beforeTest(){
        Ball ballOne = new Ball(5, Color.RED);
        Ball ballTwo = new Ball(10,Color.BLUE);
        Ball ballThree = new Ball(5,Color.BLUE);
        basket.addBall(ballOne);
        basket.addBall(ballTwo);
        basket.addBall(ballThree);
    }

    @AfterTest
    public void afterTest(){
        basket = null;
    }

    @Test
    public void ballWeightTest(){
        double expected = 20;
        BasketService basketService = new BasketService();
        double actual = basketService.weight(basket);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ballColorTest(){
        int expected = 2;
        BasketService basketService = new BasketService();
        int actual = basketService.numberByColor(basket,Color.BLUE);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ballsByWeightTest(){
        int expected = 2;
        double weight = 5;
        BasketService basketService = new BasketService();
        int actual = basketService.numberByWeight(basket,weight);
        Assert.assertEquals(actual,expected);
    }

}
