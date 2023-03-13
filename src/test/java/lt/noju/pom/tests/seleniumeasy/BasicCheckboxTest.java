package lt.noju.pom.tests.seleniumeasy;

import lt.noju.pom.pages.seleniumeasy.BasicCheckboxPage;
import lt.noju.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicCheckboxTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
    }
    @Test
    public void testSingleCheckbox() {
        String expectedResult = "Success - Check box is checked";
        String actualResult;

        BasicCheckboxPage.clickCheckbox();
        actualResult = BasicCheckboxPage.showDisplayText();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
