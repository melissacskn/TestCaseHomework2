package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import Tests.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestGetInTouchVisible extends Base {

    ContactUsPage contactUsPage;
    HomePage homePage;
    @BeforeTest
    public void setDriver(){
        contactUsPage=new ContactUsPage(driver);
        homePage= new HomePage(driver);
    }

    @Test
    public void getInTouchVisible(){

        homePage.clickContactUs();
        assertEquals(contactUsPage.getGetInTouchText(),"GET IN TOUCH", "'GET IN TOUCH IS',is not visible");

    }
}
