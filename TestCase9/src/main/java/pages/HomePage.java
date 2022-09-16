package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    By productsLocator= By.cssSelector("a[href=\"/products\"]");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String getHomePageName(){
        return driver.getTitle();
    }
    public void clickOnProducts(){
        driver.findElement(productsLocator).click();
    }
}
