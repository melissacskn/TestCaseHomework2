package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductsPage {
    WebDriver driver;

    By firstProductLocator = By.cssSelector("img[src=\"/get_product_picture/1\"]");
    By secondProductLocator = By.cssSelector("img[src=\"/get_product_picture/2\"]");
    By firstAddToCartLocator = By.cssSelector("a[data-product-id=\"1\"]");
    By secondAddToCartLocator = By.cssSelector("a[data-product-id=\"2\"]");
    By continueShoppingButtonLocator = By.cssSelector("#cartModal > div > div > div.modal-footer > button");
    By viewCartButtonLocator = By.cssSelector("a[href=\"/view_cart\"] u");


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverFirstProduct() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(firstProductLocator)).perform();
        actions.click().build().perform();
        driver.findElement(firstAddToCartLocator).click();




        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.modal-content")));
        WebElement modalContainer = driver.findElement(
                By.className("modal-dialog"));
        WebElement modalContentBody = modalContainer.findElement(By.xpath(".//div[@class='modal-body']"));
        System.out.println(modalContentBody.getText());
        driver.findElement(continueShoppingButtonLocator).click();



    }



    public void hoverOverSecondProduct() {
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(secondProductLocator)).perform();
        actions2.click().build().perform();
        driver.findElement(secondAddToCartLocator).click();


        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.modal-content")));
        WebElement modalContainer = driver.findElement(
                By.className("modal-dialog"));
        WebElement modalContentBody = modalContainer.findElement(By.xpath(".//div[@class='modal-body']"));
        System.out.println(modalContentBody.getText());
        driver.findElement(viewCartButtonLocator).click();

    }
}