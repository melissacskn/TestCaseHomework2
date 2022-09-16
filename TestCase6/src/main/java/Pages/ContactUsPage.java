package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
    private WebDriver driver;
    public ContactUsPage(WebDriver driver){
        this.driver=driver;
    }
    By getInTouchText= By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
    By nameTextLocator=By.name("name");
    By emailTextLocator=By.name("email");
    By subjectTextLocator=By.name("subject");
    By messageTextLocator=By.name("message");
    By submitButtonLocator =By.name("submit");
    By uploadFileButtonLocator=By.name("upload_file");
    By successfullTextLocator= By.cssSelector("div[class=\"status alert alert-success\"]");
    By homeButtonLocator=By.cssSelector("#form-section > a > span");


    public String getGetInTouchText() {
        return  driver.findElement(getInTouchText).getText();
    }
    public WebElement elementFinder(By locator){
        return driver.findElement(locator);
    }
    public void clickElement(By locator){
       elementFinder(locator).click();
    }
    public void setname(String text){
        clickElement(nameTextLocator);
        elementFinder(nameTextLocator).sendKeys(text);
    }

    public void setEmail(String text){
        clickElement(emailTextLocator);
        elementFinder(emailTextLocator).sendKeys(text);
    }

    public void setSubject(String text){
        clickElement(subjectTextLocator);
        elementFinder(subjectTextLocator).sendKeys(text);
    }
    public void setMessage(String text){
        clickElement(messageTextLocator);
        elementFinder(messageTextLocator).sendKeys(text);
    }
    public WebElement  uploadFile(){
        WebElement file= driver.findElement(uploadFileButtonLocator);
        return file;
    }

    public void clickOnSubmitButton(){
        elementFinder(submitButtonLocator).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getSuccessfullText(){
       return elementFinder(successfullTextLocator).getText();
    }
    public void clickOnHome(){
        elementFinder(homeButtonLocator).click();
    }






}
