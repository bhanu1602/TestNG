package TImeouts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout {

    WebDriver driver;
    @Test(timeOut = 4000)
    public void testmethod1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        driver.quit();
    }

    @Test(expectedExceptions = {NoSuchElementException.class})
    public void testmethod2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        driver.findElement(By.id("abcd")).click();
        driver.quit();
    }
}
