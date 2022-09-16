package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductsPage {
    WebDriver driver;
    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }
    By productsListLocator= By.ByLinkText.cssSelector("img[alt=\"ecommerce website products\"]");
    By firstProductLocator= By.cssSelector("a[href=\"/product_details/1\"]");

    By productNameLocator= By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > h2");
    By categoryLocator=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
    By priceLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > span");
    By availabilityLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(6)");
    By conditionLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(7)");
    By brandLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(8)");

    public String getTitleOfTheProductsPage(){
        return driver.getTitle();
    }
    public List findProducts() {
        List<WebElement> elements = driver.findElements(productsListLocator);
        return elements;
    }

    public void viewFirstProduct(){
        driver.findElement(firstProductLocator).click();
    }

    public WebElement getProductName(){

        return driver.findElement(productNameLocator);
    }
    public WebElement getCategory(){

        return driver.findElement(categoryLocator);
    }
    public WebElement getPrice(){

        return driver.findElement(priceLocator);
    }
    public WebElement getAvailability(){

        return driver.findElement(availabilityLocator);
    }
    public WebElement getCondition(){

        return driver.findElement(conditionLocator);
    }
    public WebElement getBrand(){

        return driver.findElement(brandLocator);
    }





}
