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

public class imprint {

    WebDriver driver;
    public propertiesutils privacypolicyutils = null;

    public imprint() {
        this.privacypolicyutils = new propertiesutils("locators/imprint.properties");
    }

    public void imprintpage() throws FileNotFoundException, IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        JSONObject jsonObject;
        Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/imprint.json"));
        jsonObject = (JSONObject) obj;
        JSONArray a = (JSONArray) jsonObject.get("imprint_module");
        JSONObject o = (JSONObject) a.get(0);

        String expimprint = (String) (o.get("imprint"));
        System.out.println(expimprint);
        String expemail = (String) (o.get("email"));
        System.out.println(expemail);
        String expdevzenotta = (String) (o.get("devzenotta"));
        System.out.println(expdevzenotta);
        String expourprivacypolicy = (String) (o.get("ourprivacypolicy"));
        System.out.println(expourprivacypolicy);

        driverutils.scrolltillelement(this.privacypolicyutils.getproperty("imprint"));
        String actimprint = driverutils.gettext(this.privacypolicyutils.getproperty("imprint"));
        System.out.println(actimprint);
        Assert.assertEquals(expimprint, actimprint);

        driverutils.clickelement(this.privacypolicyutils.getproperty("email"));
        String actemail = driverutils.gettext(this.privacypolicyutils.getproperty("email"));
        System.out.println(actemail);
        Assert.assertEquals(expemail, actemail);

        driverutils.clickelement(this.privacypolicyutils.getproperty("devzenotta"));driverutils.windowscrolldown();
        String actdevzenotta = driverutils.gettext(this.privacypolicyutils.getproperty("devzenotta"));
        System.out.println(actdevzenotta);
        Assert.assertEquals(expdevzenotta, actdevzenotta);

        driverutils.clickelement(this.privacypolicyutils.getproperty("ourprivacypolicy"));
        String actourprivacypolicy = driverutils.gettext(this.privacypolicyutils.getproperty("privacy_policy"));
        Assert.assertEquals(expourprivacypolicy, actourprivacypolicy);
        System.out.println(actourprivacypolicy); 
    }   
}
