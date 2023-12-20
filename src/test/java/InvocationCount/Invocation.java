package InvocationCount;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class Invocation {

    WebDriver driver;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(invocationCount = 2)
    public void Test1() throws InterruptedException{
        driver.get("https://randomuser.me/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@data-label='name']")).click();
        System.out.println("Username : " + driver.findElement(By.id("user_value")).getText());

        driver.findElement(By.xpath("//li[@data-label='email']")).click();
        System.out.println("Email : " + driver.findElement(By.id("user_value")).getText());
        driver.quit();
    }

    @Test(invocationCount = 2)
    public void Test2() throws InterruptedException{
        driver.get("https://randomuser.me/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@data-label='name']")).click();
        System.out.println("Username : " + driver.findElement(By.id("user_value")).getText());

        driver.findElement(By.xpath("//li[@data-label='email']")).click();
        System.out.println("Email : " + driver.findElement(By.id("user_value")).getText());
        driver.quit();
    }

    @Test(invocationCount = 4, threadPoolSize = 2)
    public void Test3() throws InterruptedException{
        driver.get("https://randomuser.me/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@data-label='name']")).click();
        System.out.println("Username : " + driver.findElement(By.id("user_value")).getText());

        driver.findElement(By.xpath("//li[@data-label='email']")).click();
        System.out.println("Email : " + driver.findElement(By.id("user_value")).getText());
        driver.quit();
    }
}
