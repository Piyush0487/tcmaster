package Pages;

import org.openqa.selenium.WebDriver;
import utils.*;

public class testnet_sign_up{  
  WebDriver driver;
  propertiesutils testnet_signup_utils = null;

   public testnet_sign_up(){
    this.testnet_signup_utils =  new propertiesutils("locators/testnet_sign_up.properties");
    }

   public void signup(){
    driverutils.clickElement(this.testnet_signup_utils.getProperty("testNetSignUp"));
    driverutils.sendkeys(this.testnet_signup_utils.getProperty("name"), "Test");
    driverutils.sendkeys(this.testnet_signup_utils.getProperty("email"), "test01@gmail.com");
    driverutils.sendkeys(this.testnet_signup_utils.getProperty("phoneNumber"), "9087321321");
    driverutils.sendkeys(this.testnet_signup_utils.getProperty("comment"),"Hello there I am here for testing");
    driverutils.clickElement(this.testnet_signup_utils.getProperty("termsTextBox"));
    driverutils.clickElement(this.testnet_signup_utils.getProperty("testNetTerms"));
    }
}
