package Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class TestClass extends BaseTests{


    @Test(testName = "testGoogle")
    public void testGoogle(){
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
        String expectedTitle = "Bangalore - Google Search";
        String actualTitle = driver.getTitle();

        //Hard Assert after failed test case it will not move further
        assertEquals(actualTitle, expectedTitle, "Title mismatched");
    }


    @Test(testName = "testFacebook")
    public void testFacebook(){
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("Tutorial", Keys.ENTER);

        SoftAssert softAssert = new SoftAssert(); //to declare soft Asserts //for hard asserts we need to declare normally

        //Title Assertion
        String actualTitle = driver.getTitle();
        String expectedTitle = "Log in to Facebook";
        softAssert.assertEquals(actualTitle, expectedTitle, "Title Mismatched");

        //URL Assertion
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com//";
        softAssert.assertNotEquals(actualURL, expectedURL, "URL Mismatched");


        //Text Assertion
        String actualText = driver.findElement(By.name("email")).getAttribute("value");
        String expectedText = "";
        softAssert.assertEquals(actualText, expectedText, "Text Mismatched");

        //Error Message Assertion
        String actualErrorText = driver.findElement(By.xpath("//div[@id = 'error_box']/div[1]")).getText();
        String expectedErrorText = "Wrong credentials";
        softAssert.assertEquals(actualErrorText, expectedErrorText, "Error Text Mismatched");
        softAssert.assertAll();
    }

    @Test(testName = "testOrangeHRM")
    public void testOrangeHRM() throws InterruptedException{
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[text() = 'Time at Work']")).isDisplayed());

    }
}
