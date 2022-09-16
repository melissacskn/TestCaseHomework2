package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartsPage {
    WebDriver driver;
    public CartsPage(WebDriver driver){
        this.driver=driver;
    }
    By firstProduct=By.cssSelector("tr[id=\"product-1\"]");
    By secondProduct=By.id("product-2");
    By firstProductPriceLocator=By.cssSelector("#product-1 > td.cart_price > p");
    By firstProductQuantityLocator=By.xpath("//*[@id=\"product-1\"]/td[4]/button");
    By firstProductTotalPriceLocator=By.cssSelector("#product-1 > td.cart_total > p");


    By secondProductPriceLocator=By.cssSelector("#product-2 > td.cart_price > p");
    By secondProductQuantityLocator=By.cssSelector("#product-2 > td.cart_quantity > button");
    By secondProductTotalPriceLocator=By.cssSelector("#product-2 > td.cart_total > p");

    public WebElement elementFinder(By locator){
        return driver.findElement(locator);

    }
    public Boolean getFirstProduct(){
        return  elementFinder(firstProduct).isDisplayed();
    }
    public Boolean getSecondProduct(){
        return  elementFinder(secondProduct).isDisplayed();
    }
    public String getFirstProductPrice(){
        return elementFinder(firstProductPriceLocator).getText();
    }
    public String getSecondProductPrice(){
        return elementFinder(secondProductPriceLocator).getText();
    }

    public String getFirstProductQuantity(){
        return elementFinder(firstProductQuantityLocator).getText();
    }
    public String getSecondProductQuantity(){
        return elementFinder(secondProductQuantityLocator).getText();
    }
    public String getFirstProductTotalPrice(){
        return elementFinder(firstProductTotalPriceLocator).getText();

    }
    public String getSecondProductTotalPrice(){
        return elementFinder(secondProductTotalPriceLocator).getText();
    }


}
