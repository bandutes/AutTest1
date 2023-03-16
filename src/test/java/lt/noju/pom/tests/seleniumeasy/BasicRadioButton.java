package lt.noju.pom.tests.seleniumeasy;

import lt.noju.pom.pages.seleniumeasy.BasicRadioButtonpage;
import lt.noju.pom.tests.BaseTest;
import org.testng.annotations.BeforeMethod;

public class BasicRadioButton extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
    BasicRadioButtonpage.open();
    }

//    @DataProvider (name = "dataProviderForRadioButtonGender", parralel = true)
//    public Object[][] provideDataSetForRadioButtonGender(){
//        return new Object[][]{
//                {"Male", "Male"},
//                {"Female","Female"}
//        };
//    }
//
//    @Test (dataProvider = "dataProviderForRadioButtonGender")
//    public  void  testRadioButtonMale(String attributeValue, String expectedResult) {
//
//    BasicRadioButtonpage.clickOnRadioButton(attributeValue);
//    BasicRadioButtonpage.clickOnGetValueButton();
//    String actualResult = BasicRadioButtonpage.displayedRadioButtonValue();
//
//    Assert.assertTrue(
//                actualResult.contains(expectedResult),
//                String.format("Actual: %s, Expected: %s", actualResult, expectedResult));
//    }

}
