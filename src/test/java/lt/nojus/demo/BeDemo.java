package lt.nojus.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class BeDemo {

    @Test
    public void test01() {

        //1. Data
        int input01 = 10;
        int input02 = 3;
        int expectedResult = 7;
        int actualResult;

        //2. Actions
        actualResult = input01 - input02;

        //3. Test results
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test02() {

        //1. Data
        int input01 = 10;
        int input02 = 'c';
        int expectedResult = -89;
        int actualResult;

        //2. Actions
        actualResult = input01 - input02;

        //3. Test results
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void test() {

        String input01 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String expectedResult = "consectetur";
        boolean actualResult;

        actualResult = input01.contains(expectedResult);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void isFourEqualNumber() {

        int input01 = 4;
        int expectedResult = 0;
        int actualResult;

        actualResult = input01 % 2;

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void CheckingIfIts19() {


        int expectedResult = 19;
        int actualResult = LocalTime.now().getHour();

        actualResult = LocalTime.now().getHour();
        Assert.assertEquals(actualResult, expectedResult);
    }

}






















