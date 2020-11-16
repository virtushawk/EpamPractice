package edu.epam.practiceone.secondtask.service;

import edu.epam.practiceone.secondtask.entity.CalendarDate;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalendarDateServiceTest {

    @DataProvider(name = "daysInMonthTests")
    public Object[][] daysInMonthTests() {
        return new Object[][] {
                {new CalendarDate(1996,2), 29},
                {new CalendarDate(1997,2), 28},
                {new CalendarDate(1995,5), 31},
        };
    }

    @Test(dataProvider = "daysInMonthTests")
    public void daysInMonthTest(CalendarDate date , int expected){
        CalendarDateService calendarDateService = new CalendarDateService();
         int actual = calendarDateService.daysInMonth(date);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void isYearLeapTrueTest(){
        int year = 1996;
        CalendarDateService calendarDateService = new CalendarDateService();
        boolean actual = calendarDateService.isYearLeap(year);
        Assert.assertTrue(actual);
    }

    @Test
    public void isYearLeapFalseTest(){
        int year = 1997;
        CalendarDateService calendarDateService = new CalendarDateService();
        boolean actual = calendarDateService.isYearLeap(year);
        Assert.assertFalse(actual);
    }
}
