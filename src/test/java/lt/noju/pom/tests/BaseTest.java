package lt.noju.pom.tests;

import lt.noju.pom.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//@Listeners(TestListener.class)
public abstract class BaseTest {

    @BeforeMethod
    public abstract void setUp();



    @AfterMethod
    public void tearDown() {
        Common.closeChromeDriver();
    }
}

