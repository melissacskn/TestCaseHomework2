package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    By productsButtonLocator=By.cssSelector("a[href=\"/products\"]");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public String getTitleOfHomePage(){
        return driver.getTitle();
    }
    public void clickingProducts(){
        driver.findElement(productsButtonLocator).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
