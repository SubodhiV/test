import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {

    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;

    //Declare a test URL variable
    public String testURL = "http://swtestacademy.com/";

    //-----------------------------------TestOne Setup-----------------------------------
    @BeforeMethod
    public void setupTest (){
        String exePath = "C:\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        //Create a new ChromeDriver
        driver = new ChromeDriver();

        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }

    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest () {
        //Get page title
        String title = driver.getTitle();

        //Print page's title
        System.out.println("Page Title: " + title);

        //Assertion
        Assert.assertEquals(title, "Software Test Academy", "Title assertion is failed!");
    }

    //-----------------------------------TestOne TearDown-----------------------------------
    @AfterMethod
    public void teardownTest (){
        //Close browser and end the session
        driver.quit();
    }
}