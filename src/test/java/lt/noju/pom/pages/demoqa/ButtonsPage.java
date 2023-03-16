package lt.noju.pom.pages.demoqa;

import lt.noju.pom.pages.Common;
import lt.noju.pom.pages.Locators;

public class ButtonsPage {
    public static void doubleClickOnButton() {
        Common.doubleClickElementByAction(
                Locators.DemoQa.Buttons.buttonDoubleClick
        );
    }

    public static String readMessageOfDoubleClick() {
        return Common.getTextFormatElement(
                Locators.DemoQa.Buttons.paragraphDoubleClickMessage
        );
    }

    public static void rightClickOnButton() {
        Common.rightClickElement (
                Locators.DemoQa.Buttons.rightClickButton
        );
    }

    public static String readMessageOfRightClick() {
        return Common.getTextFormatElement(
                Locators.DemoQa.Buttons.buttonRightClick
        );
    }
}
