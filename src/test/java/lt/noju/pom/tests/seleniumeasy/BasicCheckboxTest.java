package lt.noju.pom.tests.seleniumeasy;

import lt.noju.pom.pages.seleniumeasy.BasicCheckboxPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicCheckboxTest {
    @BeforeMethod
    public void setUp() {
        BasicCheckboxPage.open();
    }
    @Test
    public void testSingleCheckbox() {
        String expectedResult = "Success - Check box is checked";
        String actualResult;

        BasicCheckboxPage.clickCheckbox();
        actualResult = BasicCheckboxPage.showDisplayText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @AfterMethod
    public void tearDown() {
        BasicCheckboxPage.close();
    }


}
