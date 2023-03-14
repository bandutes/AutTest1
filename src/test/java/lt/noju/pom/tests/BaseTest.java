package lt.noju.pom.tests;

import lt.noju.pom.tests.seleniumeasy.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public abstract void setUp();



    @AfterMethod
    public void tearDown() {
        Common.closeChromeDriver();
    }
}

