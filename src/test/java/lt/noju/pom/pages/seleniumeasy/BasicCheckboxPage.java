package lt.noju.pom.pages.seleniumeasy;

import lt.noju.pom.tests.seleniumeasy.Common;
import org.openqa.selenium.By;

public class BasicCheckboxPage {
    public static void open() {
        Common.setChromeDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public static void close() {
        Common.closeChromeDriver();
    }

    public static void clickCheckbox() {
        Common.clickElement(By.xpath("//input[@id='isAgeSelected']"));
    }

    public static String showDisplayText() {
        return Common.getTextFormatElement(By.xpath("//div[@id='txtAge']"));
    }
}
