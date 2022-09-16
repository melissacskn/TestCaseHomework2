package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class TestProductListIsVisible extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    public void setDriver(){
        homePage= new HomePage(driver);
        productsPage = new ProductsPage(driver);
    }
    @Test
    public void productListIsVisible(){
        homePage.clickingProducts();
        List<WebElement>elements=productsPage.findProducts();
        for(int i=0;i<elements.size();i++){
            assertTrue(elements.get(i).isDisplayed(),"Product is not on the list.That's why the all product list is not visble");

        }
    }

}
