package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

import static org.testng.Assert.assertTrue;

public class TestProductDetailIsVisible extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    public void setDriver(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickingProducts();
        productsPage.viewFirstProduct();
    }
    @Test
    public void isProductNameVisible(){

        assertTrue(productsPage.getProductName().isDisplayed(),"'Product Name' Detail is not visible");

    }
    @Test
    public void isCategoryVisible(){

        assertTrue(productsPage.getCategory().isDisplayed(),"'Category' Detail is not visible");
    }
    @Test
    public void isPriceVisible(){

        assertTrue(productsPage.getPrice().isDisplayed(),"'Price' Detail is not visible");
    }
    @Test
    public void isAvailabilityVisible(){

        assertTrue(productsPage.getAvailability().isDisplayed(),"'Availability' Detail is not visible");
    }
    @Test
    public void isBrandVisible(){

        assertTrue(productsPage.getBrand().isDisplayed(),"'Brand' Detail is not visible");
    }




}
