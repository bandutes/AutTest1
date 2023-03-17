package lt.noju.pom.tests.demoqa;

import lt.noju.pom.pages.demoqa.ButtonsPage;
import lt.noju.pom.pages.demoqa.ElementsPage;
import lt.noju.pom.pages.demoqa.HomePage;
import lt.noju.pom.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnElementsFromMenu();
        ElementsPage.clickOnButtonsFromLeftMenu();
    }

    @Test
    private void testDoubleClickButton() {
        String expectedResult = "You have done a double click";
        String actualResult;

        ButtonsPage.doubleClickOnButton();
        actualResult = ButtonsPage.readMessageOfDoubleClick();
    }

    @Test
    private void testRightClickMeButton() {
        String expectedResult = "You have done a right click";
        String actualResult;

        ButtonsPage.rightClickOnButton();
        actualResult = ButtonsPage.readMessageOfRightClick();

        Assert.assertEquals(actualResult, expectedResult);
    }
}






