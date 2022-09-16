package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchProduct {
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

    @When("Click on Products button")
    public void click_on_products_button() {
        By productsLocator= By.ByLinkText.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a");
        driver.findElement(productsLocator).click();

    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        if(driver.getTitle()=="ALL PRODUCTS"){
            System.out.println("Navigated to ALL PRODUCTS page successfully");
        }

    }

    @When("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        By searchBoxLocator =By.id("search_product");
        By searchButtonLocator=By.id("submit_search");
        driver.findElement(searchBoxLocator).click();
        WebElement product = driver.findElement(searchBoxLocator);
        product.sendKeys("Full Sleeves Top Cherry - Pink");
        driver.findElement(searchButtonLocator).click();

    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {

        By searchedProductsLocator=By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2");
        if(driver.findElement(searchedProductsLocator).isDisplayed()){
            System.out.println("SEARCHED PRODUCTS is visible");
        }


    }

    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        By productsListLocator= By.ByLinkText.cssSelector("img[alt=\"ecommerce website products\"]");
        By productCherryTopLocator= By.cssSelector("img[src=\"/get_product_picture/14\"]");
        WebElement cherryTop=driver.findElement(productCherryTopLocator);

        List<WebElement> elements = driver.findElements(productsListLocator);
        for(WebElement element: elements) {
            if (cherryTop==element) {
                System.out.println("SEARCHED PRODUCTS is visible");
            }
        }

    }
}
