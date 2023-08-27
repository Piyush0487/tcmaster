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


public class footer{
        
     WebDriver driver;
     propertiesutils footerutils = null;
 
     public footer(){		
         this.footerutils =  new propertiesutils("locators/footer.properties");
     }
    
    public void footer_page()throws FileNotFoundException, IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        JSONObject jsonObject;
        Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/footer.json"));
        jsonObject = (JSONObject) obj;
        JSONArray array = (JSONArray) jsonObject.get("footer_module");
        JSONObject object = (JSONObject) array.get(0);
    
        String expresearchhome = (String) (object.get("researchhome"));
        String exppeertopeerelectronictrade = (String) (object.get("peertopeerelectronictrade"));
        String expbalances = (String) (object.get("balances"));
        String exprandomreductionofminers = (String) (object.get("randomreductionofminers"));
        String expdeveloperdocumentationhome = (String) (object.get("developerdocumentationhome"));
        String expgettingstarted = (String) (object.get("gettingstarted"));
        String expzenottanetworkprotocol = (String) (object.get("zenottanetworkprotocol"));
        String exptutorials = (String) (object.get("tutorials"));
        String expcontactus = (String) (object.get("contactus"));
        String expsupport = (String) (object.get("support"));
        String expprivacypolicy = (String) (object.get("privacypolicy"));
        String expimprint = (String) (object.get("imprint"));
        String expmorelink = (String) (object.get("morelink"));
        String expreportabug = (String) (object.get("reportabug"));
        
        driverutils.scrolltillelement(this.footerutils.getproperty("research_home"));driverutils.backbrowser();  
        String actresearchhome = driverutils.gettext(this.footerutils.getproperty("research_home"));
        Assert.assertEquals(expresearchhome, actresearchhome);

        driverutils.scrolltillelement(this.footerutils.getproperty("peer_to_peer_electronic_trade"));driverutils.backbrowser();  
        String actpeertopeerelectronictrade = driverutils.gettext(this.footerutils.getproperty("peer_to_peer_electronic_trade"));
        Assert.assertEquals(exppeertopeerelectronictrade, actpeertopeerelectronictrade);

        driverutils.scrolltillelement(this.footerutils.getproperty("balances"));driverutils.backbrowser();  
        String actbalances = driverutils.gettext(this.footerutils.getproperty("balances"));
        Assert.assertEquals(expbalances, actbalances);

        driverutils.scrolltillelement(this.footerutils.getproperty("random_reduction_of_miners"));driverutils.backbrowser();  
        String actrandomreductionofminers = driverutils.gettext(this.footerutils.getproperty("random_reduction_of_miners"));
        Assert.assertEquals(exprandomreductionofminers, actrandomreductionofminers);

        driverutils.scrolltillelement(this.footerutils.getproperty("developer_documentation_home"));driverutils.backbrowser();  
        String actdeveloperdocumentationhome = driverutils.gettext(this.footerutils.getproperty("developer_documentation_home"));
        Assert.assertEquals(expdeveloperdocumentationhome, actdeveloperdocumentationhome);

        driverutils.scrolltillelement(this.footerutils.getproperty("getting_started"));driverutils.backbrowser();  
        String actgettingstarted = driverutils.gettext(this.footerutils.getproperty("getting_started"));
        Assert.assertEquals(expgettingstarted, actgettingstarted);

        driverutils.scrolltillelement(this.footerutils.getproperty("tutorials"));driverutils.backbrowser();  
        String acttutorials = driverutils.gettext(this.footerutils.getproperty("tutorials"));
        Assert.assertEquals(exptutorials, acttutorials);

        driverutils.scrolltillelement(this.footerutils.getproperty("zenotta_network_protocol"));driverutils.backbrowser();  
        String actzenottanetworkprotocol = driverutils.gettext(this.footerutils.getproperty("zenotta_network_protocol"));
        Assert.assertEquals(expzenottanetworkprotocol, actzenottanetworkprotocol);

        driverutils.scrolltillelement(this.footerutils.getproperty("contact_us"));driverutils.backbrowser(); 
        String actcontactus = driverutils.gettext(this.footerutils.getproperty("contact_us"));
        Assert.assertEquals(expcontactus, actcontactus); 

        driverutils.scrolltillelement(this.footerutils.getproperty("support"));driverutils.focusmainbrowser();  
        String actsupport = driverutils.gettext(this.footerutils.getproperty("support"));
        Assert.assertEquals(expsupport, actsupport); 

        driverutils.scrolltillelement(this.footerutils.getproperty("privacy_policy"));driverutils.backbrowser();  
        String actprivacypolicy = driverutils.gettext(this.footerutils.getproperty("privacy_policy"));
        Assert.assertEquals(expprivacypolicy, actprivacypolicy); 

        driverutils.scrolltillelement(this.footerutils.getproperty("imprint"));driverutils.backbrowser();  
        String actimprint = driverutils.gettext(this.footerutils.getproperty("imprint"));
        Assert.assertEquals(expimprint, actimprint);

        driverutils.scrolltillelement(this.footerutils.getproperty("linktr"));driverutils.focusmainbrowser(); 
        String actmorelink = driverutils.gettext(this.footerutils.getproperty("linktr"));
        Assert.assertEquals(expmorelink, actmorelink);

        driverutils.scrolltillelement(this.footerutils.getproperty("report_a_bug")); 
        String actreportabug = driverutils.gettext(this.footerutils.getproperty("report_a_bug"));
        Assert.assertEquals(expreportabug, actreportabug);

        driverutils.scrolltillelement(this.footerutils.getproperty("linkedin")); 
        WebElement actlinkedin = driverutils.getCssValue(this.footerutils.getproperty("linkedin"));
        Assert.assertEquals(true, actlinkedin.isDisplayed());
        
        driverutils.scrolltillelement(this.footerutils.getproperty("twitter"));driverutils.focusmainbrowser();  
        WebElement acttwitter = driverutils.getCssValue(this.footerutils.getproperty("twitter"));
        Assert.assertEquals(true, acttwitter.isDisplayed());
        
        driverutils.scrolltillelement(this.footerutils.getproperty("youtube"));driverutils.focusmainbrowser();  
        WebElement actyoutube = driverutils.getCssValue(this.footerutils.getproperty("youtube"));
        Assert.assertEquals(true, actyoutube.isDisplayed());
       
        driverutils.scrolltillelement(this.footerutils.getproperty("facebook"));driverutils.focusmainbrowser();  
        WebElement actfacebook = driverutils.getCssValue(this.footerutils.getproperty("facebook"));
        Assert.assertEquals(true, actfacebook.isDisplayed());
    }
}
