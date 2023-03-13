package lt.noju.pom.tests.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import lt.noju.pom.pages.seleniumeasy.BasicFirstFormpage;
import lt.noju.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicFirstFormTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicFirstFormpage.open();
    }

    @Test
    public void SingleInputField() {
        WebDriverManager.chromedriver().setup();

        String message = "labas vakaras";
        String expectedResult = "labas vakaras";
        String actualResult;

        BasicFirstFormpage.enterFullName(message);
        BasicFirstFormpage.clickButtonShowMessage();
        actualResult = BasicFirstFormpage.readDisplayText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

    @Test
    public void TwoInputFields() {

        String number_a = "1";
        String number_b = "22";
        String expectedResult = "23";
        String actualResult;

        BasicFirstFormpage.enterAnyValue1(number_a);
        BasicFirstFormpage.enterAnyValue2(number_b);
        BasicFirstFormpage.clickButtonShowValue();
        actualResult = BasicFirstFormpage.readDisplayValue();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }
}
