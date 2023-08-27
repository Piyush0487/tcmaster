package Pages;

import org.openqa.selenium.WebDriver;
import utils.driverutils;
import utils.propertiesutils;

public class useful_links_{  
    WebDriver driver;
    propertiesutils useful_linksutils = null;
 
     public useful_links_(){		
        this.useful_linksutils =  new propertiesutils("locators/useful_links_.properties");
     }

    public void useful_links(){
        driverutils.scrolltillelement(this.useful_linksutils.getproperty("useful_links_top")); 
        driverutils.scrolltillelement(this.useful_linksutils.getproperty("blockChainLink")); 
        driverutils.backToTab();
        driverutils.scrolltillelement(this.useful_linksutils.getproperty("nickBlogLink")); 
        driverutils.backToTab();
        driverutils.scrolltillelement(this.useful_linksutils.getproperty("blockChainAndMoneyLink")); 
        driverutils.backToTab();
        driverutils.scrolltillelement(this.useful_linksutils.getproperty("anderasLink")); 
        driverutils.backToTab();
    }

}
