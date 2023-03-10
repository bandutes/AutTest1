package lt.nojus.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class TestClasswork {

    @Test
    public void WithoutResidue() {

        int input01 = 995;
        int expectedResult = 0;
        int actualResult;

        actualResult = input01 % 3;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void isTodayWednesday() {

        String expectedDay = "Wednesday";
        String actualDay;

        actualDay = String.valueOf(LocalDate.now().getDayOfWeek());

        Assert.assertEquals(actualDay, expectedDay);

    }

    @Test

    public void AllTheEvenNumbers() {
        int expectedEqualNumbers = 5;
        int actualEqualNumbers = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                actualEqualNumbers++;
            } else {
            }
        }
        Assert.assertEquals(actualEqualNumbers, expectedEqualNumbers);
    }

    @Test

    public void speelFor5Seconds() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}




















