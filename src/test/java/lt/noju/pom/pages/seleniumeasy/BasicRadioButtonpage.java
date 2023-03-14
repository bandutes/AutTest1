package lt.noju.pom.pages.seleniumeasy;

import lt.noju.pom.pages.Locators;
import lt.noju.pom.tests.seleniumeasy.Common;

public class BasicRadioButtonpage {

    public static void open() {
        Common.setChromeDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");

    }

    public static void clickOnRadioButton(String attributeValue) {
        Common.clickElement(Locators.SeleniumEasy.BasicRadioButton.chooseInputByGender(attributeValue));
    }

    public static void clickOnGetValueButton() {
        Common.clickElement(Locators.SeleniumEasy.BasicRadioButton.checkValue);
    }

    public static String displayedRadioButtonValue() {
        return Common.getTextFormatElement(Locators.SeleniumEasy.BasicRadioButton.checkintTheValueDisplayed);
    }
}
