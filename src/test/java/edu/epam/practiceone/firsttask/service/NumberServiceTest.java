package edu.epam.practiceone.firsttask.service;

import edu.epam.practiceone.firsttask.entity.DigitsArray;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberServiceTest {

    @DataProvider(name = "LastDigitTests")
    public Object[][] lastDigitTests() {
        return new Object[][] {
                {250, 0},
                {11, 1},
                {252, 4},
                {555, 5},
                {456, 6},
                {33, 9}
        };
    }

    @Test(dataProvider = "LastDigitTests")
    public void lastDigitOfSquareNumberTests(int number, int expected){
        NumberService numberService = new NumberService();
        int actual  = numberService.lastDigitOfSquareNumber(number);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lastDigitOfSquareArrayTest(){
        DigitsArray numbers = new DigitsArray(11,253,16);
        NumberService numberService = new NumberService();
        DigitsArray actual = numberService.lastDigitsOfSquareArray(numbers);
        DigitsArray expected = new DigitsArray(1,9,6);
        Assert.assertEquals(actual.toString(),expected.toString());
    }

}
