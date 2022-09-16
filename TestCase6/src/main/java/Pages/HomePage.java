package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    By ContactUs=By.cssSelector("a[href=\"/contact_us\"]");
    private WebDriver driver;

     public  HomePage(WebDriver driver){
         this.driver=driver;
     }
     public void clickContactUs(){
         driver.findElement(ContactUs).click();
     }



}
