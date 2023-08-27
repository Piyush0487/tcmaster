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

public class topnavigation{
   
     WebDriver driver;
     propertiesutils topnavigationutils = null;
 
    
 
     public topnavigation(){     
		
         this.topnavigationutils =  new propertiesutils("locators/topnavigation.properties");
     }
   
    public void topnavigationlinks()throws FileNotFoundException, IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        JSONObject jsonObject;
        Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/topnavigation.json"));
        jsonObject = (JSONObject) obj;
        JSONArray array = (JSONArray) jsonObject.get("topnavigation_ofzenottahpmepage");
        JSONObject object = (JSONObject) array.get(0);
    
        // String expresearchtopnavigation = (String) (object.get("researchtopnavigation"));
        // String expdeveloperdocumentationtopnavigation = (String) (object.get("developerdocumentationtopnavigation"));
        // String expusefullinkstopnavigation = (String) (object.get("usefullinkstopnavigation"));
        // String exptestnetsignuptopnavigation = (String) (object.get("testnetsignuptopnavigation"));

        // driverutils.clickelement(this.topnavigationutils.getproperty("researchtopnavigation"));driverutils.backbrowser();  
        // String actresearchtopnavigation = driverutils.gettext(this.topnavigationutils.getproperty("researchtopnavigation")); 
        // Assert.assertEquals(expresearchtopnavigation, actresearchtopnavigation);    

        // driverutils.clickelement(this.topnavigationutils.getproperty("developerdocumentationtopnavigation"));driverutils.backbrowser(); 
        // String actdeveloperdocumentationtopnavigation = driverutils.gettext(this.topnavigationutils.getproperty("developerdocumentationtopnavigation")); 
        // Assert.assertEquals(expdeveloperdocumentationtopnavigation, actdeveloperdocumentationtopnavigation); 

        // driverutils.clickelement(this.topnavigationutils.getproperty("usefullinkstopnavigation"));driverutils.backbrowser();   
        // String actusefullinkstopnavigation = driverutils.gettext(this.topnavigationutils.getproperty("usefullinkstopnavigation")); 
        // Assert.assertEquals(expusefullinkstopnavigation, actusefullinkstopnavigation);    

        // driverutils.clickelement(this.topnavigationutils.getproperty("testnetsignuptopnavigation"));driverutils.backbrowser();   
        // String acttestnetsignuptopnavigation = driverutils.gettext(this.topnavigationutils.getproperty("testnetsignuptopnavigation")); 
        // Assert.assertEquals(exptestnetsignuptopnavigation, acttestnetsignuptopnavigation); 

        driverutils.clickelement(this.topnavigationutils.getproperty("switchtodaymode")); 
        String actswitchtodaymode = driverutils.gettext(this.topnavigationutils.getproperty("switchtodaymode"));
        // WebElement actswitchtodaymode = driverutils.getCssValue(this.topnavigationutils.getproperty("switchtodaymode"));
        // Assert.assertTrue(actswitchtodaymode.contains("white"));
        // theme-map-dark
        System.out.println(actswitchtodaymode);

        // driverutils.clickelement(this.topnavigationutils.getproperty("switchtonightmode")); 
        // String actswitchtonightmode = driverutils.gettext(this.topnavigationutils.getproperty("switchtodaymode")); 
        // Assert.assertTrue(actswitchtonightmode.contains("halite blue")); 

        // driverutils.clickelement(this.topnavigationutils.getproperty("languageselectordropdown")); 
        
        // driverutils.scrolltillelement(this.topnavigationutils.getproperty("francais_language")); 
        // WebElement actfrancais_language = driverutils.getCssValue(this.topnavigationutils.getproperty("francais_language")); 
        // Assert.assertEquals(true, actfrancais_language.isDisplayed()); 

        // driverutils.clickelement(this.topnavigationutils.getproperty("languageselectordropdown")); 
        // driverutils.clickelement(this.topnavigationutils.getproperty("deutsch_language")); 
        // WebElement actdeutsch_language = driverutils.getCssValue(this.topnavigationutils.getproperty("deutsch_language")); 
        // Assert.assertEquals(true, actdeutsch_language.isDisplayed()); 

        // driverutils.clickelement(this.topnavigationutils.getproperty("languageselectordropdown")); 
        // driverutils.clickelement(this.topnavigationutils.getproperty("italiano_language")); 
        // WebElement actitaliano_language = driverutils.getCssValue(this.topnavigationutils.getproperty("italiano_language")); 
        // Assert.assertEquals(true, actitaliano_language.isDisplayed()); 

        // driverutils.clickelement(this.topnavigationutils.getproperty("languageselectordropdown")); 
        // driverutils.clickelement(this.topnavigationutils.getproperty("english_language")); 
        // WebElement actenglish_language = driverutils.getCssValue(this.topnavigationutils.getproperty("english_language")); 
        // Assert.assertEquals(true, actenglish_language.isDisplayed()); 
    }
}
