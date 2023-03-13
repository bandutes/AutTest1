package lt.noju.pom.pages.seleniumeasy;

import lt.noju.pom.tests.seleniumeasy.Common;
import org.openqa.selenium.By;

public class BasicDropdownPage {
    public static void open() {
        Common.setChromeDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    public static void close() {
        Common.closeChromeDriver();
    }

    public static void selectDayFromDropdown(String attributeValue) {
        Common.selectOptionByalue(
                attributeValue,
                By.xpath("//select[@id='select-demo']")
        );
    }

    public static String readMessageDayOfWeek() {
        return Common.getTextFormatElement(By.xpath("//p[contains(text(), 'Day selected']"));
    }
}
