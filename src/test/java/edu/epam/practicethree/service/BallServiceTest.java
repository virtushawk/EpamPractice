package edu.epam.practicethree.service;

import edu.epam.practicethree.entity.Ball;
import edu.epam.practicethree.entity.Basket;
import edu.epam.practicethree.entity.Color;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;

public class BallServiceTest {
    public  Basket basket;

    @BeforeClass
    public void beforeClass(){
        basket = new Basket();
        Ball ballOne = new Ball(5, Color.RED);
        Ball ballTwo = new Ball(10,Color.BLUE);
        Ball ballThree = new Ball(5,Color.BLUE);
        Ball ballFour = new Ball(15,Color.GREEN);
        Ball ballFive = new Ball(25,Color.PURPLE);
        basket.add(ballOne);
        basket.add(ballTwo);
        basket.add(ballThree);
        basket.add(ballFour);
        basket.add(ballFive);
    }

    @AfterClass
    public void afterClass(){
        basket = null;
    }

    @Test
    public void ballWeightTest(){
        double expected = 60;
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

    @Test
    public void listByColorTest(){
        ArrayList<Ball> expected = new ArrayList<>();
        expected.add(new Ball(10,Color.BLUE));
        expected.add( new Ball(5,Color.BLUE));
        BasketService basketService = new BasketService();
        ArrayList<Ball> actual = (ArrayList<Ball>) basketService.listByColor(basket,Color.BLUE);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void listByWeightTest(){
        ArrayList<Ball> expected = new ArrayList<>();
        double weight = 5;
        expected.add(new Ball(5,Color.RED));
        expected.add( new Ball(5,Color.BLUE));
        BasketService basketService = new BasketService();
        ArrayList<Ball> actual = (ArrayList<Ball>) basketService.listByWeight(basket,weight);
        Assert.assertEquals(actual,expected);
    }
}
