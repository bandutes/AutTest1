package lt.noju.pom.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    private void takeScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);

        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(DateTimeFormatter.ofPattern("_yyyy_MM_dd_hh_mm_ss_"));
        String uuid = String.valueOf(UUID.randomUUID());
        File screenshotFile = new File("./screenshots/new_screenshot" + formattedDateTime + uuid + ".png");

        try {
            FileUtils.copyFile(screenshot, screenshotFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
