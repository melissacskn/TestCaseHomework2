package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartsPage;
import pages.HomePage;
import pages.ProductsPage;
import tests.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestBothProductsAddedToCart extends BaseTest {
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
    public void isAllProductsAddedToCart() {


        assertTrue(cartsPage.getFirstProduct(), "First product is not added to cart");
        assertTrue(cartsPage.getSecondProduct(), "Second product is not added to cart");


    }


}

