package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By productsButtonLocator=By.cssSelector("a[href=\"/products\"]");
    public  HomePage(WebDriver driver){
        this.driver=driver;
    }
   public String getHomePageTitle(){
        return driver.getTitle();
   }
   public void clickOnProductsButton(){
        driver.findElement(productsButtonLocator).click();

   }
}
