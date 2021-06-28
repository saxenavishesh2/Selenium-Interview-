import net.bytebuddy.asm.Advice;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.SendKeysAction;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class test {

    public String baseurl = "https://demoqa.com/automation-practice-form";
    public WebDriver driver;
    @Test
        public void testdemo() throws InterruptedException, AWTException {
           driver.get(baseurl);
        }


    @Before
    public void init() {
        System.out.println("Opening Chrome browser");
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Beginnig Test");

    }

    @After
    public void teardown(){
       driver.quit();
    }

}
