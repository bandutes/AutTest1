package lt.noju.pom.pages.seleniumeasy;
import lt.noju.pom.tests.seleniumeasy.Common;
import org.openqa.selenium.By;

public class BasicFirstFormpage {

    public static void open(){
        Common.setChromeDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void enterFullName(String message) {
       Common.sendKeysToElement(
               message,
               By.xpath("//input[@id='user-message']")
       );
    }

    public static void close() {
        Common.closeChromeDriver();
    }

    public static void clickButtonShowMessage() {
        Common.clickElement(By.xpath("//button[@class='btn btn-default']"));
    }

    public static String readDisplayText() {
        return Common.getTextFormatElement(By.xpath("//span[@id='display']"));
    }

    public static void enterAnyValue1(String number_a) {
        Common.sendKeysToElement(
                number_a,
                By.xpath("//input[@id='sum1']")
        );
    }

    public static void enterAnyValue2(String number_b) {
        Common.sendKeysToElement(
                number_b,
                By.xpath("//input[@id='sum2']")
        );
    }

    public static void clickButtonShowValue() {
        Common.clickElement(By.xpath("//button[@onclick='return total()']"));
    }

    public static String readDisplayValue() {
        return Common.getTextFormatElement(By.xpath("//span[@id='displayvalue']"));
    }
}








