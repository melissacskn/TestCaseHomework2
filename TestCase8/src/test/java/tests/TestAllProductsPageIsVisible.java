package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;


import static org.testng.Assert.assertEquals;

public class TestAllProductsPageIsVisible extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    public void setDriver(){
        homePage= new HomePage(driver);
        productsPage=new ProductsPage(driver);
    }
    @Test
    public void isAllProductsPageNavigated(){
        homePage.clickingProducts();
        Assert.assertEquals(homePage.getUrl(),"https://automationexercise.com/products","User does not navigated to the 'ALL PRODUCTS' page successfully");
    }
}
