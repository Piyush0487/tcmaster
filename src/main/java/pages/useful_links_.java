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

public class useful_links_{  
    WebDriver driver;
    propertiesutils useful_linksutils = null;
 
     public useful_links_(){		
        this.useful_linksutils =  new propertiesutils("locators/useful_links_.properties");
     }

    public void useful_links()throws FileNotFoundException, IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        JSONObject jsonObject;
        Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/usefullinks.json"));
        jsonObject = (JSONObject) obj;
        JSONArray array = (JSONArray) jsonObject.get("usefullinks_top_navigation");
        JSONObject object = (JSONObject) array.get(0);
    
        String expusefullinkstop = (String) (object.get("usefullinkstop"));
        String expblockchaindemolink = (String) (object.get("blockChainLink"));
        String expnickszabosunenumeratedbloglink = (String) (object.get("nickszabosunenumeratedbloglink"));
        String expblockchainandmoneylink = (String) (object.get("blockchainandmoneylink"));
        String expandreasantonopoulosbloglink = (String) (object.get("andreasantonopoulosbloglink"));

        driverutils.scrolltillelement(this.useful_linksutils.getproperty("useful_links_top")); 
        String actusefullinkstop = driverutils.gettext(this.useful_linksutils.getproperty("useful_links_top"));
        Assert.assertEquals(expusefullinkstop, actusefullinkstop);

        driverutils.scrolltillelement(this.useful_linksutils.getproperty("blockchaindemolink")); driverutils.backtotab();
        String actblockchaindemolink = driverutils.gettext(this.useful_linksutils.getproperty("blockchaindemolink"));
        Assert.assertEquals(expblockchaindemolink, actblockchaindemolink);

        driverutils.scrolltillelement(this.useful_linksutils.getproperty("nickszabosunenumeratedbloglink")); driverutils.backtotab();
        String actnickszabosunenumeratedbloglink = driverutils.gettext(this.useful_linksutils.getproperty("nickszabosunenumeratedbloglink"));
        Assert.assertEquals(expnickszabosunenumeratedbloglink, actnickszabosunenumeratedbloglink);

        driverutils.scrolltillelement(this.useful_linksutils.getproperty("blockchainandmoneylink")); driverutils.backtotab();
        String actblockchainandmoneylink = driverutils.gettext(this.useful_linksutils.getproperty("blockchainandmoneylink"));
        Assert.assertEquals(expblockchainandmoneylink, actblockchainandmoneylink);

        driverutils.scrolltillelement(this.useful_linksutils.getproperty("andreasantonopoulosbloglink")); driverutils.backtotab();
        String actandreasantonopoulosbloglink = driverutils.gettext(this.useful_linksutils.getproperty("andreasantonopoulosbloglink"));
        Assert.assertEquals(expandreasantonopoulosbloglink, actandreasantonopoulosbloglink);
    }
}
