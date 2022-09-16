package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import Tests.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSumbitSuccessfully extends Base {
    ContactUsPage contactUsPage;
    HomePage homePage;
    @BeforeTest
    public void setDriver(){
        contactUsPage=new ContactUsPage(driver);
        homePage= new HomePage(driver);
    }
    @Test
    public void sumbit(){
        homePage.clickContactUs();
        contactUsPage.setname("melissa");
        contactUsPage.setEmail("melissa123@gmaii.com");
        contactUsPage.setSubject("Internship");
        contactUsPage.setMessage("May I please learn when will be the next lecture? Thank you.");
        contactUsPage.uploadFile().sendKeys("/Users/vngrs/Desktop/penguin.jpeg");
        contactUsPage.clickOnSubmitButton();
        contactUsPage.acceptAlert();
        assertEquals(contactUsPage.getSuccessfullText(),"Success! Your details have been submitted successfully.","Sumbitted message is not visible");

    }


}
