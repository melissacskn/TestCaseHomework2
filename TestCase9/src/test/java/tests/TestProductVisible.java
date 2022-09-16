package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import tests.BaseTest;
import  pages.ProductsPage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestProductVisible extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    public void setDriver(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);

    }
    @Test
    public void isProductVisible(){
        homePage.clickOnProducts();
        productsPage.clickOnSearchButton();
        WebElement product = productsPage.SearchProducts();
        product.sendKeys("Full Sleeves Top Cherry - Pink");
        productsPage.clickOnSearch();
        WebElement cherryTop= productsPage.elementfinder(productsPage.productCherryTopLocator);



        List<WebElement> elements= productsPage.findProducts();

        for(WebElement e: elements){
            assertEquals(e,cherryTop,"The product 'Full Sleeves Top Cherry - Pink' is not in the List");
        }


        System.out.println(cherryTop.getText());
    }
}
