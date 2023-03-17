package lt.noju.pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    //    private static WebDriver driver;
    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static void setDriver() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-minimized");
        options.addArguments("--force-device-scale-factor=0.70");

//        ChromeDriver driver = new ChromeDriver(options);
        drivers.set(new ChromeDriver(options));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
//        return driver;
        return drivers.get();
    }

    public static void closeDriver() {
//        driver.quit();
        drivers.get().quit();
        drivers.remove();
    }

}
