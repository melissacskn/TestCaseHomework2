package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage {
    private WebDriver driver;
    public ProductsPage(WebDriver driver){
        this.driver=driver;
    }
    By allProductsTitleLocator= By.cssSelector("h2[class=\"title text-center\"]");
    By searchBoxLocator =By.id("search_product");
    By searchButtonLocator=By.id("submit_search");
    By productsListLocator= By.ByLinkText.cssSelector("img[alt=\"ecommerce website products\"]");
    public By productCherryTopLocator= By.cssSelector("img[src=\"/get_product_picture/14\"]");
    By searchedProductTitleLocator=By.cssSelector("h2[class=\"title text-center\"]");
    public WebElement elementfinder(By locator){
        return driver.findElement(locator);
    }
    public String getAllProductsTitle(){
        return elementfinder(allProductsTitleLocator).getText();
    }
    public List findProducts() {
        List<WebElement> elements = driver.findElements(productsListLocator);
        return elements;
    }
    public void clickOnSearchButton(){
        elementfinder(searchBoxLocator).click();
    }

    public WebElement SearchProducts(){

        return elementfinder(searchBoxLocator);
    }
    public void clickOnSearch(){
        elementfinder(searchButtonLocator).click();
    }
    public String getSearchedProduct(){
        return elementfinder(searchedProductTitleLocator).getText();
    }


}
