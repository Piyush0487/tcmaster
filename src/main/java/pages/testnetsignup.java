package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

public class testnetsignup{  
  WebDriver driver;
  propertiesutils testnetsignuputils = null;

   public testnetsignup(){
    this.testnetsignuputils =  new propertiesutils("locators/testnetsignup.properties");
    }

   public void signup()throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/testnetsignup.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("testnet_sign_up_topnav");
    JSONObject object = (JSONObject) array.get(0);

    String exptestnetsignuptopnav = (String) (object.get("testnetsignuptopnav"));

    driverutils.clickelement(this.testnetsignuputils.getproperty("testnetsignup"));
    String acttestnetsignuptopnav = driverutils.gettext(this.testnetsignuputils.getproperty("testnetsignup"));
    Assert.assertEquals(exptestnetsignuptopnav, acttestnetsignuptopnav);

    // driverutils.sendkeys(this.testnetsignuputils.getproperty("name"), "Test");
    String actnametext = driverutils.sendkeys(this.testnetsignuputils.getproperty("name"),"Test"); 
    Assert.assertEquals("Test", actnametext);

    // driverutils.sendkeys(this.testnetsignuputils.getproperty("email"), "test01@gmail.com");
    String actemail = driverutils.sendkeys(this.testnetsignuputils.getproperty("email"),"test01@gmail.com"); 
    Assert.assertEquals("test01@gmail.com", actemail);

    // driverutils.sendkeys(this.testnet_signup_utils.getproperty("phoneNumber"), "9087321321");
    String actphonenumber = driverutils.sendkeys(this.testnetsignuputils.getproperty("phonenumber"),"9087321321"); 
    Assert.assertEquals("9087321321", actphonenumber);

    // driverutils.sendkeys(this.testnet_signup_utils.getproperty("comment"),"Hello there I am here for testing");
    String actcomment = driverutils.sendkeys(this.testnetsignuputils.getproperty("comment"),"Hello there I am here for testing"); 
    Assert.assertEquals("Hello there I am here for testing", actcomment);
    
    driverutils.clickelement(this.testnetsignuputils.getproperty("termstextbox"));
    WebElement acttermstextboxisclickable = driverutils.getCssValue(this.testnetsignuputils.getproperty("termstextbox")); 
    Assert.assertEquals(true, acttermstextboxisclickable.isSelected());

    driverutils.clickelement(this.testnetsignuputils.getproperty("testnetterms"));
    WebElement acttesttermsisclickable = driverutils.getCssValue(this.testnetsignuputils.getproperty("testnetterms")); 
    Assert.assertEquals(true, acttesttermsisclickable.isSelected());
    }
}
