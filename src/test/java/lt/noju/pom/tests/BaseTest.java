package lt.noju.pom.tests;

import lt.noju.pom.pages.seleniumeasy.BasicFirstFormpage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public abstract void setUp();



    @AfterMethod
    public void tearDown() {
        BasicFirstFormpage.close();
    }
}

