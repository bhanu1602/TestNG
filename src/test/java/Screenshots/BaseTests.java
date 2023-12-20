package Screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseTests {

   public static WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }

    public void screenshotCapture(String filename){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourcefile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destfile = new File("src/resources" + filename);
        try {
            // Copy the screenshot file to the destination
            Files.copy(sourcefile.toPath(), destfile.toPath());
            System.out.println("Screenshot captured and saved to: " + destfile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error while saving screenshot: " + e.getMessage());
        }

    }

}
