package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Params {
    WebDriver driver;

    @Parameters("browserName")
    @BeforeTest
    //Optional parameter to pass default value
    public void SetupBrowser(@Optional("opera") String browserName){
        switch (browserName.toLowerCase()){
            case "opera":
                System.setProperty("webdriver.opera.driver", "src/resources/operadriver.exe");
                driver = new OperaDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.err.println("Browsername is Invalid");
        }
    }

    @AfterTest
    public void TearDown(){
        if(driver != null) {
            driver.quit();
        }
    }

    @Parameters("url")
    @Test
    public void LaunchApp(String url) throws InterruptedException{
        driver.get(url);
        Thread.sleep(5000);
    }

    @Parameters({"username", "password"})
    @Test(priority = 1)
    public void EnterLoginDetails(String username, String password) throws InterruptedException{
        driver.findElement(By.xpath("//*[@name = 'username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@name = 'password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void MyInfo() throws InterruptedException{
        driver.findElement(By.xpath("//a[@href = '/web/index.php/pim/viewMyDetails']")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void VerifyInfo(){
        boolean actualValue = driver.findElement(By.xpath("(//*[text() = 'Personal Details'])[2]")).isDisplayed();
        assertTrue(actualValue);

    }

}
