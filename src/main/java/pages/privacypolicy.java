package pages;

import org.openqa.selenium.WebDriver;
import utils.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;


public class privacypolicy{
     
    WebDriver driver;
    public propertiesutils privacypolicyutils = null;

    public privacypolicy(){
        this.privacypolicyutils=  new propertiesutils("locators/privacypolicy.properties");
    }

    public void privacypolicypage() throws FileNotFoundException, IOException, ParseException{

        JSONParser jsonparser = new JSONParser();
        JSONObject jsonObject;      
        Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/privacy_policy.json"));      
        jsonObject = (JSONObject) obj;
        JSONArray a = (JSONArray)jsonObject.get("privacy_policy_module");
        JSONObject o = (JSONObject)a.get(0);

        String Expprivacy_policy =(String) (o.get("privacy_policy"));     
        String Expemail =(String) (o.get("email"));      
        String Expwebsite=(String) (o.get("website"));       
        String Expprivacy_policy_1 =(String) (o.get("privacy_policy_1"));       
        String Expgoogle_analytics_terms =(String) (o.get("google_analytics_terms"));        
        String Expanalytics =(String) (o.get("analytics"));       
        String Expguest_controls =(String) (o.get("guest_controls"));        
        String Expcookie_policy =(String) (o.get("cookie_policy"));        
        String Expprivacy_policy_2 =(String) (o.get("privacy_policy_2"));        
        String Expcookie_policy_1 =(String) (o.get("cookie_policy_1"));        
        String Exptwitter_privacy =(String) (o.get("twitter_privacy"));       
        String Expgoogle_privacy =(String) (o.get("google_privacy"));        
        String Expexternaldataprotectionofficers =(String) (o.get("externaldataprotectionofficers"));       
        String Expmedialawlawyers =(String) (o.get("medialawlawyers"));
        
 //=======================================================================//==================================================================       
        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("privacy_policy"));
        String Actprivacy_policy = driverutils.gettext(this.privacypolicyutils.getproperty("privacy_policy"));
        Assert.assertEquals(Expprivacy_policy, Actprivacy_policy);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("email"));
        String Actemail = driverutils.gettext(this.privacypolicyutils.getproperty("email"));
        Assert.assertEquals(Expemail, Actemail);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("website"));driverutils.focusmainbrowser();
        String Actwebsite = driverutils.gettext(this.privacypolicyutils.getproperty("website"));
        Assert.assertEquals(Expwebsite, Actwebsite);
        
        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("privacy_policy_1"));driverutils.focusmainbrowser();
        String Actprivacy_policy_1 = driverutils.gettext(this.privacypolicyutils.getproperty("privacy_policy_1"));
        Assert.assertEquals(Expprivacy_policy_1, Actprivacy_policy_1);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("google_analytics_terms"));driverutils.focusmainbrowser();
        String Actgoogle_analytics_terms = driverutils.gettext(this.privacypolicyutils.getproperty("google_analytics_terms"));
        Assert.assertEquals(Expgoogle_analytics_terms, Actgoogle_analytics_terms);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("analytics"));driverutils.focusmainbrowser();
        String Actanalytics = driverutils.gettext(this.privacypolicyutils.getproperty("analytics"));
        Assert.assertEquals(Expanalytics, Actanalytics);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("guest_controls"));driverutils.focusmainbrowser();
        String Actguest_controls = driverutils.gettext(this.privacypolicyutils.getproperty("guest_controls"));
        Assert.assertEquals(Expguest_controls, Actguest_controls);
        
        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("cookie_policy"));driverutils.focusmainbrowser();
        String Actcookie_policy = driverutils.gettext(this.privacypolicyutils.getproperty("cookie_policy"));
        Assert.assertEquals(Expcookie_policy, Actcookie_policy);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("privacy_policy_2"));driverutils.focusmainbrowser();
        String Actprivacy_policy_2 = driverutils.gettext(this.privacypolicyutils.getproperty("privacy_policy_2"));
        Assert.assertEquals(Expprivacy_policy_2, Actprivacy_policy_2);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("cookie_policy_1"));driverutils.focusmainbrowser();
        String Actcookie_policy_1 = driverutils.gettext(this.privacypolicyutils.getproperty("cookie_policy_1"));
        Assert.assertEquals(Expcookie_policy_1, Actcookie_policy_1);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("twitter_privacy"));driverutils.focusmainbrowser();
        String Acttwitter_privacy = driverutils.gettext(this.privacypolicyutils.getproperty("twitter_privacy"));
        Assert.assertEquals(Exptwitter_privacy, Acttwitter_privacy);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("google_privacy"));driverutils.focusmainbrowser();
        String Actgoogle_privacy = driverutils.gettext(this.privacypolicyutils.getproperty("google_privacy"));
        Assert.assertEquals(Expgoogle_privacy, Actgoogle_privacy);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("externaldataprotectionofficers"));driverutils.focusmainbrowser();
        String Actexternaldataprotectionofficers = driverutils.gettext(this.privacypolicyutils.getproperty("externaldataprotectionofficers"));
        Assert.assertEquals(Expexternaldataprotectionofficers, Actexternaldataprotectionofficers);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("medialawlawyers"));driverutils.focusmainbrowser();
        String Actmedialawlawyers = driverutils.gettext(this.privacypolicyutils.getproperty("medialawlawyers"));
        Assert.assertEquals(Expmedialawlawyers, Actmedialawlawyers); 
    }
}
