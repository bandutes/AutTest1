package lt.noju.pom.tests.seleniumeasy;

import lt.noju.pom.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Common {
    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void setChromeDriver() {
        Driver.setDriver();
    }

    public static void closeChromeDriver() {
        Driver.closeDriver();
    }

    public static void sendKeysToElement(String message, By locator) {
        WebElement element = getElement(locator);
        element.sendKeys(message);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        WebElement element = getElement(locator);
        element.click();
    }

    public static String getTextFormatElement(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByalue(String attributeValue, By locator) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.deselectByValue(attributeValue);
    }
}
