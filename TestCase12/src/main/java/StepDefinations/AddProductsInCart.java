package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductsInCart {
    WebDriver driver;
    @Given("Launch browser")
    public void launch_browser() {
        System.setProperty("webdriver.chrome.driver","/Users/vngrs/Desktop/chromedriver");
        driver=new ChromeDriver();

    }

    @When("Navigate to url http:\\/\\/automationexercise.com")
    public void navigate_to_url_http_automationexercise_com() {
        driver.get("https://automationexercise.com/");
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        if(driver.getTitle()=="Automation Exercise"){
            System.out.println("Home Page is visible successfully");
        }
    }

    @Given("Click Products button")
    public void click_products_button() {
        By productsLocator= By.ByLinkText.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a");
        driver.findElement(productsLocator).click();
    }

    @Given("Hover over first product and click Add to cart")
    public void hover_over_first_product_and_click_add_to_cart() {
        By firstProductLocator = By.cssSelector("img[src=\"/get_product_picture/1\"]");
        By firstAddToCartLocator = By.cssSelector("a[data-product-id=\"1\"]");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(firstProductLocator)).perform();
        actions.click().build().perform();
        driver.findElement(firstAddToCartLocator).click();

    }

    @Given("Click Continue Shopping button")
    public void click_continue_shopping_button() {
        By continueShoppingButtonLocator = By.cssSelector("#cartModal > div > div > div.modal-footer > button");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.modal-content")));
        WebElement modalContainer = driver.findElement(
                By.className("modal-dialog"));
        WebElement modalContentBody = modalContainer.findElement(By.xpath(".//div[@class='modal-body']"));
        System.out.println(modalContentBody.getText());
        driver.findElement(continueShoppingButtonLocator).click();

    }

    @Given("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        By secondProductLocator = By.cssSelector("img[src=\"/get_product_picture/2\"]");
        By secondAddToCartLocator = By.cssSelector("a[data-product-id=\"2\"]");
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(driver.findElement(secondProductLocator)).perform();
        actions2.click().build().perform();
        driver.findElement(secondAddToCartLocator).click();

    }

    @Given("Click View Cart button")
    public void click_view_cart_button() {
        By viewCartButtonLocator = By.cssSelector("a[href=\"/view_cart\"] u");
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.modal-content")));
        WebElement modalContainer = driver.findElement(
                By.className("modal-dialog"));
        WebElement modalContentBody = modalContainer.findElement(By.xpath(".//div[@class='modal-body']"));
        System.out.println(modalContentBody.getText());
        driver.findElement(viewCartButtonLocator).click();

    }

    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        By firstProduct=By.cssSelector("tr[id=\"product-1\"]");
        By secondProduct=By.id("product-2");
        if(driver.findElement(firstProduct).isDisplayed() && driver.findElement(secondProduct).isDisplayed()){
            System.out.println("Both products are added to cart");
        }

    }

    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        By firstProductPriceLocator=By.cssSelector("#product-1 > td.cart_price > p");
        By firstProductQuantityLocator=By.xpath("//*[@id=\"product-1\"]/td[4]/button");
        By firstProductTotalPriceLocator=By.cssSelector("#product-1 > td.cart_total > p");


        By secondProductPriceLocator=By.cssSelector("#product-2 > td.cart_price > p");
        By secondProductQuantityLocator=By.cssSelector("#product-2 > td.cart_quantity > button");
        By secondProductTotalPriceLocator=By.cssSelector("#product-2 > td.cart_total > p");

        if(driver.findElement(firstProductPriceLocator).getText()=="Rs. 500" && driver.findElement(firstProductQuantityLocator).getText()=="1"
        && driver.findElement(firstProductTotalPriceLocator).getText()=="Rs. 500"){
            System.out.println("First products price, quantity and total price is verified.");
        }
        if(driver.findElement(secondProductPriceLocator).getText()=="Rs. 400" && driver.findElement(secondProductQuantityLocator).getText()=="1"
                && driver.findElement(secondProductTotalPriceLocator).getText()=="Rs. 400"){
            System.out.println("Second products price, quantity and total price is verified.");
        }
    }
}
