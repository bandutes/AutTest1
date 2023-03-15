package lt.noju.pom.pages.seleniumeasy;

import lt.noju.pom.pages.Locators;
import lt.noju.pom.pages.Common;

public class BasicCheckboxPage {
    public static void open() {
        Common.setChromeDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public static void close() {
        Common.closeChromeDriver();
    }

    public static void clickCheckbox() {
        Common.clickElement(Locators.SeleniumEasy.BasicCheckbox.checkboxSingle);
    }

    public static String showDisplayText() {
        return Common.getTextFormatElement(Locators.SeleniumEasy.BasicCheckbox.divDisplay);
    }
}
