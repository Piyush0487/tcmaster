package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class genericaction{
    WebDriver driver;
    objectMap objectMap;

    public genericaction(WebDriver driver){

        this.driver = driver;
    }

    // public void waitForElementToBeDisplayed(WebElement element){
    //     try{
    //         WebDriverWait wait = new WebDriverWait(driver, 10);
    //         wait.until(ExpectedConditions.visibilityOf(element));
    //         wait.until(ExpectedConditions.elementToBeClickable(element));
    //     }catch (TimeoutException e){
    //         System.out.println("Timeout Exception:" + e);
    //     }
    //  }

    public void clickElement(String elementname) {
        WebElement click = driver.findElement(objectMap.getlocator(elementname));
        // waitForElementToBeDisplayed(click);
        click.click();
    }

    public void sendKeys(String elementname, String Keys) {
        WebElement send = driver.findElement(objectMap.getlocator(elementname));
        send.sendKeys(Keys);
    }
}
