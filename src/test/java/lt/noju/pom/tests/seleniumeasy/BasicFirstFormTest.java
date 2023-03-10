package lt.noju.pom.tests.seleniumeasy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicFirstFormTest {

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-minimized");
        options.addArguments("--force-device-scale-factor=0.70");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

    }
        @Test
    public void SingleInputField() {
        WebDriverManager.chromedriver().setup();

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("start-minimized");
//        options.addArguments("--force-device-scale-factor=0.70");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String Message = "labas vakaras";
        String expectedResult = "labas vakaras";
        String actualResult;

        WebElement inputText = driver.findElement(By.xpath("//input[@id='user-message']"));
        inputText.sendKeys(Message);

        WebElement buttonShowMessage = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        buttonShowMessage.click();

        WebElement yourMessage = driver.findElement((By.xpath("//span[@id='display']")));
        actualResult = yourMessage.getText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

    @Test
    public void TwoInputFields() {
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("start-minimized");
//        options.addArguments("--force-device-scale-factor=0.70");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String number_a = "1";
        String number_b = "22";
        String expectedResult = "23";
        String actualResult;

        WebElement inputNumberA = driver.findElement(By.xpath("//input[@id='sum1']"));
        inputNumberA.sendKeys(number_a);

        WebElement inputNumberB = driver.findElement(By.xpath("//input[@id='sum2']"));
        inputNumberB.sendKeys(number_b);

        WebElement buttonGetTotal = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        buttonGetTotal.click();

        WebElement displayedTotalIs = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        actualResult = displayedTotalIs.getText();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );


    }

    WebDriver driver;


    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-minimized");
        options.addArguments("--force-device-scale-factor=0.70");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
