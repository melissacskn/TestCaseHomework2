package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartsPage;
import pages.HomePage;
import pages.ProductsPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;

public class TestPriceQuantityTotalPriceVisible extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    CartsPage cartsPage;

    @BeforeTest

    public void set() {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        cartsPage = new CartsPage(driver);
        homePage.clickOnProductsButton();
        productsPage.hoverOverFirstProduct();
        productsPage.hoverOverSecondProduct();

    }
    @Test
    public void pricesVerified(){
        Assert.assertEquals(cartsPage.getFirstProductPrice(),"Rs. 500","Price of the first product is not verified");
        Assert.assertEquals(cartsPage.getSecondProductPrice(),"Rs. 400","Price of the second product is not verified");
    }

    @Test
    public void quantitiesVerified(){
        Assert.assertEquals(cartsPage.getFirstProductQuantity(),"1","Quantity of the first product is not verified");
        Assert.assertEquals(cartsPage.getSecondProductQuantity(),"1","Quantity of the second product is not verified");
    }
    @Test
    public void totalPriceVerified(){
        Assert.assertEquals(cartsPage.getFirstProductTotalPrice(),"Rs. 500","Total Price of the first product is not verified");
        Assert.assertEquals(cartsPage.getSecondProductTotalPrice(),"Rs. 400","Total Price of the second product is not verified");
    }




}
