package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestHomePageIsVisible extends BaseTest {
    HomePage homePage;
    @BeforeTest
    public  void setDriver(){
        homePage= new HomePage(driver);
    }
    @Test
    public void isHomePageVisible(){
        Assert.assertEquals(homePage.getHomePageName(),"Automation Exercise","Home Page is not visible");
    }
}
