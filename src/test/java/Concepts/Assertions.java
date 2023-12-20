package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class Assertions {

    WebDriver driver;

    @Test
    public void Test1(){
        System.setProperty("webdriver.opera.driver", "src/resources/operadriver.exe");
        driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
        String expectedTitle = "HYR Tutorials - Google Search";
        String actualTitle = driver.getTitle();

        //Hard Assert after failed test case it will not move further
        assertEquals(actualTitle, expectedTitle, "Title mismatched");
        driver.quit();
    }

    //Soft Asserts
    @Test
    public void Test2(){
        System.setProperty("webdriver.opera.driver", "src/resources/operadriver.exe");
        driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);

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
        String expectedErrorText = "Wrong creedentials";
        softAssert.assertEquals(actualErrorText, expectedErrorText, "Error Text Mismatched");

        driver.quit();
        softAssert.assertAll();
    }



}
