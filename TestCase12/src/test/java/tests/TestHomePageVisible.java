package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestHomePageVisible extends BaseTest {
    HomePage homePage;
    @BeforeTest
    public void set(){
        homePage= new HomePage(driver);
    }
    @Test
    public void isHomePageVisible(){
        Assert.assertEquals(homePage.getHomePageTitle(),"Automation Exercise","Home Page is not visible");
    }
}
