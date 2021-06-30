import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    public String baseurl = "https://demoqa.com/automation-practice-form";
    public WebDriver driver;

    @Test

    public void testdemo() throws InterruptedException, AWTException {
        driver.get(baseurl);

        /*your code goes here*/
    }


    @Before
    public void init() {
        System.out.println("Opening Chrome browser");
        //System.setProperty("webdriver.chrome.driver", "chromedriver"); // Use if Chromedriver is not setup in Environment Variable settings
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Beginning Test");

    }

    @After
    public void teardown() {
        driver.quit();
    }

}
