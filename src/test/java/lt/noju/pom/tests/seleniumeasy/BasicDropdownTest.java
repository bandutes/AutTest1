package lt.noju.pom.tests.seleniumeasy;

import lt.noju.pom.pages.seleniumeasy.BasicDropdownPage;
import lt.noju.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicDropdownTest extends BaseTest {

    @Test
    public void testSelectedDay() {
        String attributeValue = "Monday";
        String expectedDay = "Monday";
        String actualDay;

        BasicDropdownPage.selectDayFromDropdown(attributeValue);
        actualDay = BasicDropdownPage.readMessageDayOfWeek();

        Assert.assertTrue(
                actualDay.contains(expectedDay),
                String.format("actual: %s, Expected: %s", actualDay, expectedDay)
        );
    }

    @BeforeMethod
    @Override
    public void setUp() {
    }
}