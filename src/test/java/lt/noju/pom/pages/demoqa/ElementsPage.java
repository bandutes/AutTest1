package lt.noju.pom.pages.demoqa;

import lt.noju.pom.pages.Common;
import lt.noju.pom.pages.Locators;

public class ElementsPage {

    public static void clickOnButtonsFromLeftMenu() {
        Common.clickElementByActions(
                Locators.DemoQa.Elements.leftMenuButtons
        );
    }

}
