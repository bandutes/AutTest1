package lt.noju.pom.pages.seleniumeasy;

import lt.noju.pom.pages.Locators;
import lt.noju.pom.tests.seleniumeasy.Common;

public class BasicFirstFormpage {

    public static void open(){
        Common.setChromeDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void enterFullName(String message) {
       Common.sendKeysToElement(
               message,
//               By.xpath("//input[@id='user-message']")
               Locators.SeleniumEasy.BasicFirstForm.inputUserMessage
       );
    }

    public static void close() {
        Common.closeChromeDriver();
    }

    public static void clickButtonShowMessage() {
        Common.clickElement(Locators.SeleniumEasy.BasicFirstForm.buttonShowMessage);
    }

    public static String readDisplayText() {
        return Common.getTextFormatElement(Locators.SeleniumEasy.BasicFirstForm.spanDisplayText);
    }

    public static void enterAnyValue1(String number_a) {
        Common.sendKeysToElement(number_a,
                Locators.SeleniumEasy.BasicFirstForm.enterAnyValue1);
    }

    public static void enterAnyValue2(String number_b) {
        Common.sendKeysToElement(number_b,
                Locators.SeleniumEasy.BasicFirstForm.enterAnyValue2
        );
    }

    public static void clickButtonShowValue() {
        Common.clickElement(Locators.SeleniumEasy.BasicFirstForm.clickButtonShowValue);
    }

    public static String readDisplayValue() {
        return Common.getTextFormatElement(Locators.SeleniumEasy.BasicFirstForm.readDisplayValue);
    }
}








