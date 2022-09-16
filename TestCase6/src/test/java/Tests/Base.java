package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
    WebDriver driver;
    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/vngrs/Desktop/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com/");
        System.out.println("setup");

    }

    @AfterSuite
    public void teardown(){
        //driver.quit();
        System.out.println("teardown");
    }
}
