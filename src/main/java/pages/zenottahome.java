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

public class zenottahome{
    

    WebDriver driver;
    public propertiesutils homepageutils = null;

    public zenottahome(){
        this.homepageutils=  new propertiesutils("locators/zenottahome.properties");
    }

    public void zenottahomepage()throws FileNotFoundException, IOException, ParseException {
      JSONParser jsonparser = new JSONParser();
      JSONObject jsonObject;
      Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/zenottahomepage.json"));
      jsonObject = (JSONObject) obj;
      JSONArray array = (JSONArray) jsonObject.get("zenotta_homepage");
      JSONObject object = (JSONObject) array.get(0);
  
      String expsignupalert = (String) (object.get("signupalert")); 
      String expphilosophy = (String) (object.get("philosophy"));
      String expeconomics = (String) (object.get("economics"));
      String expcomputerscience = (String) (object.get("computerscience"));
      String expwhitepaper = (String) (object.get("whitepaper"));
      String expresearchbutton = (String) (object.get("researchbutton"));
      String expzenottanetworkprotocol = (String) (object.get("zenottanetworkprotocol"));
      String expdocumentationbutton = (String) (object.get("documentationbutton"));
      String expusefullinksbutton = (String) (object.get("usefullinksbutton"));

      driverutils.clickelement(this.homepageutils.getproperty("signup_alert"));driverutils.backbrowser();
      String actsignupalert =  driverutils.gettext(this.homepageutils.getproperty("signup_alert"));
      Assert.assertEquals(expsignupalert, actsignupalert);

      driverutils.clickelement(this.homepageutils.getproperty("close_X_icon")); 
      WebElement actclosebuttoninhomepageisclickable = driverutils.getCssValue(this.homepageutils.getproperty("close_X_icon")); 
      Assert.assertEquals(false, actclosebuttoninhomepageisclickable.isSelected());

      driverutils.scrolltillelement(this.homepageutils.getproperty("philosophy"));driverutils.backbrowser();
      String actphilosophy = driverutils.gettext(this.homepageutils.getproperty("philosophy"));
      Assert.assertEquals(expphilosophy, actphilosophy);

      driverutils.scrolltillelement(this.homepageutils.getproperty("economics"));driverutils.backbrowser(); 
      String acteconomics = driverutils.gettext(this.homepageutils.getproperty("economics"));
      Assert.assertEquals(expeconomics, acteconomics);

      driverutils.scrolltillelement(this.homepageutils.getproperty("computerscience"));driverutils.backbrowser(); 
      String actcomputerscience = driverutils.gettext(this.homepageutils.getproperty("computerscience"));
      Assert.assertEquals(expcomputerscience, actcomputerscience);

      driverutils.scrolltillelement(this.homepageutils.getproperty("whitepaper"));driverutils.backbrowser(); 
      String actwhitepaper = driverutils.gettext(this.homepageutils.getproperty("whitepaper"));
      Assert.assertEquals(expwhitepaper, actwhitepaper);

      driverutils.scrolltillelement(this.homepageutils.getproperty("researchbutton"));driverutils.backbrowser();
      String actresearchbutton = driverutils.gettext(this.homepageutils.getproperty("researchbutton"));
      Assert.assertEquals(expresearchbutton, actresearchbutton);

      driverutils.scrolltillelement(this.homepageutils.getproperty("zenottanetworkprotocol"));driverutils.backbrowser();
      String actzenottanetworkprotocol = driverutils.gettext(this.homepageutils.getproperty("zenottanetworkprotocol"));
      Assert.assertEquals(expzenottanetworkprotocol, actzenottanetworkprotocol);

      driverutils.scrolltillelement(this.homepageutils.getproperty("documentationbutton"));driverutils.backbrowser();
      String actdocumentationbutton = driverutils.gettext(this.homepageutils.getproperty("documentationbutton"));
      Assert.assertEquals(expdocumentationbutton, actdocumentationbutton);

      driverutils.scrolltillelement(this.homepageutils.getproperty("usefullinksbutton"));driverutils.backbrowser();
      String actusefullinksbutton = driverutils.gettext(this.homepageutils.getproperty("usefullinksbutton"));
      Assert.assertEquals(expusefullinksbutton, actusefullinksbutton);
          
  }
}
