package lt.noju.pom.pages.seleniumeasy;

import lt.noju.pom.pages.Locators;
import lt.noju.pom.tests.seleniumeasy.Common;

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
                attributeValue, Locators.SeleniumEasy.BasicDropdownPage.selectDayFromDropdown
        );
    }

    public static String readMessageDayOfWeek() {
        return Common.getTextFormatElement(Locators.SeleniumEasy.BasicDropdownPage.readMessageDayOfWeek);
    }
}
