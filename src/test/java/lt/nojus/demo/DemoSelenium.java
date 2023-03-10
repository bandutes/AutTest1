package lt.nojus.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoSelenium {

    @Test
    public void demoSeleniumDriver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-minimized");
        options.addArguments("--force-device-scale-factor=0.85");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.vilniuscoding.lt/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void demoSeleniumDriver2() {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-minimized");
        options.addArguments("--force-device-scale-factor=0.85");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.vilniuscoding.lt/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        driver.navigate().to("http//google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        driver.navigate().back();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        driver.quit();


    }


    @Test
    public void demoSeleniumDriver02() {


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-minimized");
        options.addArguments("--force-device-scale-factor=0.70");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");

// 1. data.
        String txtFullName = " sala posalos";
        String expectedResult = " sala posalos";
        String actualResult;
//2
        WebElement inputFullName = driver.findElement(By.xpath("//input[@id='userName']"));
        inputFullName.sendKeys(txtFullName);

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();

        WebElement paragraphFullName = driver.findElement(By.xpath("//p[@id='name']"));
        actualResult = paragraphFullName.getText();
//3
        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );

        driver.quit();


    }

    @Test
        public void testInputEmail_mailEtadotcom() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-minimized");
        options.addArguments("--force-device-scale-factor=0.70");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");

        String txtMail = "mail@mail.com";
        String expectedResult = "mail@mail.com";
        String actualResult;

        WebElement inputEmail = driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
        inputEmail.sendKeys(txtMail);

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();

        WebElement paragraphMail = driver.findElement(By.xpath("//p[@id='email']"));
        actualResult = paragraphMail.getText();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );


    }

































}