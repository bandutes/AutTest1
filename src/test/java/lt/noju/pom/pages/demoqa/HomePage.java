package lt.noju.pom.pages.demoqa;

import lt.noju.pom.pages.Common;
import lt.noju.pom.pages.Locators;

public class HomePage {
    public static void open() {
        Common.setChromeDriver();
        Common.openUrl("https://demoqa.com/");
    }

    public static void clickOnElementsFromMenu() {
        Common.clickElementByActions(
                Locators.DemoQa.Home.menuElements
        );
    }
}
