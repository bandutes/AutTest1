package lt.noju.pom.pages.seleniumeasy;

import lt.noju.pom.pages.Common;
import lt.noju.pom.pages.Locators;

import java.util.List;

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

    public static void clickOnButtonCheckAll() {
        Common.clickElement(Locators.SeleniumEasy.BasicCheckbox.buttonCheckAll);
    }

    public static boolean checkSelectedStatusOfAllCheckboxes(boolean expectedStatus) {
        List<Boolean> statusList = Common.getSelectedStatusesOfCheckboxes(
                Locators.SeleniumEasy.BasicCheckbox.inputMultipleCheckbox
        );
        for (boolean status : statusList) {
            if (status != expectedStatus) return false;
        }
        return true;
    }

    public static String getButtonAttributeValue(String attributeName) {
        return Common.getElementAttributeValue(
                attributeName,
                Locators.SeleniumEasy.BasicCheckbox.buttonCheckAll
        );
    }
}
