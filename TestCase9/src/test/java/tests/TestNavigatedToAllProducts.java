package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestNavigatedToAllProducts extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    public void setDriver(){
        homePage= new HomePage(driver);
        productsPage=new ProductsPage(driver);
    }
    @Test
    public void isAllProductsPageNavigated(){
        homePage.clickOnProducts();
        Assert.assertEquals(productsPage.getAllProductsTitle(),"ALL PRODUCTS","User does not navigated to the 'ALL PRODUCTS' page successfully");
    }
}
