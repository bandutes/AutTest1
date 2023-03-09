package lt.nojus.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoSelenium {

    @Test
    public void demoSeleniumDriver(){

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
}
