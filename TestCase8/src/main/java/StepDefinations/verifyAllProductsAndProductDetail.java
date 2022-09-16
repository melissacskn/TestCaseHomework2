package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class verifyAllProductsAndProductDetail {
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

    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        Boolean productIsNotOnList=false;
        By productsListLocator= By.ByLinkText.cssSelector("img[alt=\"ecommerce website products\"]");
        List<WebElement> elements = driver.findElements(productsListLocator);
        for(int i=0;i<elements.size();i++){
            if((elements.get(i).isDisplayed())==false){
                productIsNotOnList=true;

            }

        }
        if(productIsNotOnList==true){
            System.out.println("The all products list is not visible,there are missing products");
        }

    }

    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        By firstProductLocator= By.cssSelector("a[href=\"/product_details/1\"]");
        driver.findElement(firstProductLocator).click();


    }

    @When("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        if(driver.getCurrentUrl()=="https://automationexercise.com/product_details/1"){
            System.out.println("User is landed to product detail page");
        }
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        By productNameLocator= By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > h2");
        By categoryLocator=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
        By priceLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > span > span");
        By availabilityLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(6)");
        By conditionLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(7)");
        By brandLocator=By.cssSelector("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(8)");
        if(driver.findElement(productNameLocator).isDisplayed()==true) {
        System.out.println("Name field is visible");
        }
        if(driver.findElement(categoryLocator).isDisplayed()==true) {
            System.out.println("category field is visible");
        }
        if(driver.findElement(priceLocator).isDisplayed()==true) {
            System.out.println("price field is visible");
        }
        if(driver.findElement(availabilityLocator).isDisplayed()==true) {
            System.out.println("availability field is visible");
        }
        if(driver.findElement(conditionLocator).isDisplayed()==true) {
            System.out.println("Condition field is visible");
        }
        if(driver.findElement(brandLocator).isDisplayed()==true) {
            System.out.println("Brand field is visible");
        }


    }


}
