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

public class contactus{
      
    WebDriver driver;
    public propertiesutils contactusutils = null;

 
    public contactus(){
        this.contactusutils=  new propertiesutils("locators/contactus.properties");
    }

    public void contact_page()throws FileNotFoundException, IOException, ParseException {
      JSONParser jsonparser = new JSONParser();
      JSONObject jsonObject;
      Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/contactus.json"));
      jsonObject = (JSONObject) obj;
      JSONArray array = (JSONArray) jsonObject.get("contact_us_page");
      JSONObject object = (JSONObject) array.get(0);
  
      String expcontactus = (String) (object.get("contactuspage"));
      String expthispagelink = (String) (object.get("thispagelink"));
      String expdevelopementcheck = (String) (object.get("development"));
      String expresearch = (String) (object.get("research"));
      String expother = (String) (object.get("other"));
      String expzenotta = (String) (object.get("zenotta"));
      
      driverutils.scrolltillelement(this.contactusutils.getproperty("contact_us"));
      String actcontactus = driverutils.gettext(this.contactusutils.getproperty("contact_us"));
      Assert.assertEquals(expcontactus, actcontactus);
      System.out.println(actcontactus);

      driverutils.clickelement(this.contactusutils.getproperty("thispage"));driverutils.backbrowser();
      String actthispagelink =  driverutils.gettext(this.contactusutils.getproperty("thispage"));
      Assert.assertEquals(expthispagelink, actthispagelink);    

      String actnametext = driverutils.sendkeys(this.contactusutils.getproperty("name"),"Test"); 
      Assert.assertEquals("Test", actnametext);
     
      String actemail = driverutils.sendkeys(this.contactusutils.getproperty("email"),"test01@gmail.com"); 
      Assert.assertEquals("test01@gmail.com", actemail);

      String actphonenumber = driverutils.sendkeys(this.contactusutils.getproperty("phonenumber"),"9087321321"); 
      Assert.assertEquals("9087321321", actphonenumber);

      String actcomment = driverutils.sendkeys(this.contactusutils.getproperty("comment"),"Testing..!!!"); 
      Assert.assertEquals("Testing..!!!", actcomment);

      driverutils.clickelement(this.contactusutils.getproperty("developement"));
      String actdevelopementcheck = driverutils.gettext(this.contactusutils.getproperty("developement"));
      Assert.assertEquals(expdevelopementcheck, actdevelopementcheck);

      driverutils.clickelement(this.contactusutils.getproperty("research"));
      String actresearch = driverutils.gettext(this.contactusutils.getproperty("research"));
      Assert.assertEquals(expresearch, actresearch);

      driverutils.clickelement(this.contactusutils.getproperty("other"));
      String actother = driverutils.gettext(this.contactusutils.getproperty("other"));
      Assert.assertEquals(expother, actother);

      driverutils.clickelement(this.contactusutils.getproperty("privacy_policy_checkbox"));
      WebElement actprivacycheckboxisclickable = driverutils.getCssValue(this.contactusutils.getproperty("privacy_policy_checkbox")); 
      Assert.assertEquals(true, actprivacycheckboxisclickable.isSelected());

      driverutils.clickelement(this.contactusutils.getproperty("zenotta"));driverutils.focusmainbrowser(); 
      String actzenotta = driverutils.gettext(this.contactusutils.getproperty("zenotta"));
      Assert.assertEquals(expzenotta, actzenotta);     
    }

    public void contactdev_page()throws FileNotFoundException, IOException, ParseException {
      JSONParser jsonparser = new JSONParser();
      JSONObject jsonObject;
      Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/contactdev.json"));
      jsonObject = (JSONObject) obj;
      JSONArray array = (JSONArray) jsonObject.get("contactdev_page");
      JSONObject object = (JSONObject) array.get(0);

      String expcontactdevpage = (String) (object.get("contactdevelopmentteam"));
      String expthispagelinkincontactdev = (String) (object.get("thispagelinkincontactdev"));
      String expdevelopementcheckindev = (String) (object.get("development"));
      String expresearchindev = (String) (object.get("research"));
      String expotherindev = (String) (object.get("other"));
      String expprivacypolicylinkindev = (String) (object.get("privacypolicylink"));
      String expzenottaindev = (String) (object.get("zenotta"));
        
      driverutils.clickelement(this.contactusutils.getproperty("developer_documentation_top"));
      driverutils.clickelement(this.contactusutils.getproperty("getting_started_home"));

      driverutils.clickelement(this.contactusutils.getproperty("contact_development_team"));
      String actcontactdevelopmentteam = driverutils.gettext(this.contactusutils.getproperty("contact_us"));
      Assert.assertEquals(expcontactdevpage, actcontactdevelopmentteam);

      driverutils.clickelement(this.contactusutils.getproperty("thispage"));driverutils.backtothepage();        
      String actthispagelinkincontactdev = driverutils.gettext(this.contactusutils.getproperty("thispage"));
      Assert.assertEquals(expthispagelinkincontactdev, actthispagelinkincontactdev);
     
      String actnametextindev = driverutils.sendkeys(this.contactusutils.getproperty("name"),"Test"); 
      Assert.assertEquals("Test", actnametextindev);

      String actemailindev = driverutils.sendkeys(this.contactusutils.getproperty("email"),"test01@gmail.com"); 
      Assert.assertEquals("test01@gmail.com", actemailindev);

      String actphonenumberindev = driverutils.sendkeys(this.contactusutils.getproperty("phonenumber"),"9087321321"); 
      Assert.assertEquals("9087321321", actphonenumberindev);

      String actcommentindev = driverutils.sendkeys(this.contactusutils.getproperty("comment"),"Testing..!!!"); 
      Assert.assertEquals("Testing..!!!", actcommentindev);

      driverutils.clickelement(this.contactusutils.getproperty("developement"));
      String actdevelopementcheckindev = driverutils.gettext(this.contactusutils.getproperty("developement"));
      Assert.assertEquals(expdevelopementcheckindev, actdevelopementcheckindev);

      driverutils.clickelement(this.contactusutils.getproperty("research"));
      String actresearchindev = driverutils.gettext(this.contactusutils.getproperty("research"));
      Assert.assertEquals(expresearchindev, actresearchindev);

      driverutils.clickelement(this.contactusutils.getproperty("other"));
      String actotherindev = driverutils.gettext(this.contactusutils.getproperty("other"));
      Assert.assertEquals(expotherindev, actotherindev);

      driverutils.clickelement(this.contactusutils.getproperty("privacy_policy_checkbox"));
      WebElement actprivacycheckboxcontactdevisclickable = driverutils.getCssValue(this.contactusutils.getproperty("privacy_policy_checkbox")); 
      Assert.assertEquals(true, actprivacycheckboxcontactdevisclickable.isSelected());

      driverutils.clickelement(this.contactusutils.getproperty("privacy_policy"));driverutils.focusmainbrowser(); 
      String actprivacypolicylinkindev = driverutils.gettext(this.contactusutils.getproperty("privacy_policy"));
      Assert.assertEquals(expprivacypolicylinkindev, actprivacypolicylinkindev);

      driverutils.clickelement(this.contactusutils.getproperty("zenotta"));   
      String actzenottaindev = driverutils.gettext(this.contactusutils.getproperty("zenotta"));driverutils.focusmainbrowser(); 
      Assert.assertEquals(expzenottaindev, actzenottaindev);       
    }
}
