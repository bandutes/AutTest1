package lt.noju.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class SeleniumEasy {
        public static class BasicFirstForm {
            public static By inputUserMessage = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//button[@onclick='showInput();']");
            public static By spanDisplayText = (By.xpath("//span[@id='display']"));
            public static By enterAnyValue1 =  (By.xpath("//input[@id='sum1']"));
            public static By enterAnyValue2 = By.xpath("//input[@id='sum2']");
            public static By clickButtonShowValue = By.xpath("//button[@onclick='return total()']");
            public static By readDisplayValue = By.xpath("//span[@id='displayvalue']");
        }

        public static class BasicCheckbox {

            public static By checkboxSingle = By.xpath("//input[@id='isAgeSelected']");
            public static By divDisplay = By.xpath("//div[@id='txtAge']");
        }

        public static class BasicDropdownPage {
            public static By selectDayFromDropdown =  By.xpath("//select[@id='select-demo']");
            public static By readMessageDayOfWeek = By.xpath("//p[contains(text(), 'Day selected']");
        }

        public static class BasicRadioButton {

            public static By checkValue = By.xpath("//button[@id='buttoncheck']");
            public static By checkintTheValueDisplayed = By.xpath("//p[@class='radiobutton']");

            public static By chooseInputByGender(String attributeValue) {
                return By.xpath(
                        String.format("//input[@value='%s' and @name='optradio']", attributeValue)
                );
            }
        }
    }
}
