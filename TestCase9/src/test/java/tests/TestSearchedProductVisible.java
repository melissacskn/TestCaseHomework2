package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestSearchedProductVisible extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    public void setUp(){
        homePage= new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProducts();
        productsPage.clickOnSearchButton();
        WebElement product = productsPage.SearchProducts();
        product.sendKeys("Full Sleeves Top Cherry - Pink");
        productsPage.clickOnSearch();
    }
    @Test
    public void isSearchedProductVisible(){
        Assert.assertEquals(productsPage.getSearchedProduct(),"SEARCHED PRODUCTS","'SEARCHED PRODUCTS' title is not visible");
    }
}
