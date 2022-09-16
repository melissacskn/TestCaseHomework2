package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactUs {

    WebDriver driver;

    @Given("launch browser")
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

    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {

        WebElement ContactUsButton=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"));
        ContactUsButton.click();
    }

    @Then("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        WebElement getInTouchText=driver.findElement(By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > h2"));
        if(getInTouchText.getText()=="GET IN TOUCH"){
            System.out.println("'GET IN TOUCH' text is visible");
        }
    }

    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {

        WebElement nameField=driver.findElement(By.name("name"));
        WebElement emailField=driver.findElement(By.name("email"));
        WebElement subjectField=driver.findElement(By.name("subject"));
        WebElement messageField=driver.findElement(By.id("message"));
        nameField.sendKeys("Ayse");
        emailField.sendKeys("ayse123@gmail.com");
        subjectField.sendKeys("intern");
        messageField.sendKeys("Hi i am a intern");

    }

    @Given("Upload file")
    public void upload_file() {
        WebElement uploadFileField=driver.findElement(By.name("upload_file"));
        uploadFileField.sendKeys("/Users/vngrs/Desktop/penguin.jpeg");

    }

    @Given("Click Submit button")
    public void click_submit_button() {
        WebElement submitField=driver.findElement(By.name("submit"));
        submitField.click();
    }

    @When("Click OK button")
    public void click_ok_button() {
        driver.switchTo().alert().accept();

    }

    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        WebElement submittedMessage=driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]"));
        if(submittedMessage.getText()=="Success! Your details have been submitted successfully."){
            System.out.println("'Success! Your details have been submitted successfully.' is visible");
        }
    }

    @When("Click Home button")
    public void click_home_button() {
        WebElement homeButton=driver.findElement(By.xpath("//*[@id=\"form-section\"]/a/span"));
        homeButton.click();

    }

    @Then("verify that landed to home page successfully")
    public void verify_that_landed_to_home_page_successfully() {
        if(driver.getTitle()=="Automation Exercise"){
            System.out.println("Home page is landed successfully");
        }

    }

}