package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DProvider {

    WebDriver driver;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void TearDown(){
            driver.quit();
    }

    @Test(dataProvider = "loginTestData")
    public void Test(String username, String password) throws InterruptedException{
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);
    }

    @DataProvider(name = "loginTestData", parallel = true) //Thread count and Parallel Execution
    public Object[][] loginData(){
        Object[][] data = new Object[6][2];
        data[0][0]= "Admin";
        data[0][1]= "admin123";

        data[1][0]= "Admin";
        data[1][1]= "test123";

        data[2][0]= "User";
        data[2][1]= "admin123";

        data[3][0]= "Data";
        data[3][1]= "test123";

        data[4][0]= "Dev";
        data[4][1]= "admin123";

        data[5][0]= "Hyo";
        data[5][1]= "test123";

        return data;

    }
}
