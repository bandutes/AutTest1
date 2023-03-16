package lt.noju.pom.pages;

import lt.noju.pom.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

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

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
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

    public static List<Boolean> getSelectedStatusesOfCheckboxes(By Locator) {
        List<WebElement> elements = getElements(Locator);
        List<Boolean> statusList = new ArrayList<>();

        elements.forEach(
                element -> statusList.add(element.isSelected())
        );

        return statusList;

    }

    public static String getElementAttributeValue(String attributeName, By locator) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void clickElementByActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = getElement(locator);

        actions.moveToElement(element);
        actions.click();
        actions.perform();
    }

    public static void doubleClickElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = getElement(locator);

        actions.moveToElement(element);
        actions.doubleClick();
        actions.perform();
    }

    public static void rightClickElement(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = getElement(locator);

        actions.moveToElement(element);
        actions.contextClick();
        actions.perform();
    }
}





