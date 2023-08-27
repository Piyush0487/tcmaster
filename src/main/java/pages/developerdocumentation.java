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

public class developerdocumentation {

  WebDriver driver;
  public propertiesutils developerdocumentationutils = null;

  public developerdocumentation() {
    this.developerdocumentationutils = new propertiesutils("locators/developerdocumentation.properties");
  }

  public void developer_documentation_homePage() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/developerdocumentationhomepage.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("developerdocumentation_homepage");
    JSONObject object = (JSONObject) array.get(0);

    String expdeveloperdocumentationtopnav = (String) (object.get("developerdocumentationtopnav"));
    String expgettingstartedinhomepage = (String) (object.get("gettingstartedinhomepage")); 
    String exptutorialsinhomepage = (String) (object.get("tutorialsinhomepage")); 
    String expdeepdivedocumentationinhomepage = (String) (object.get("deepdivedocumentationinhomepage")); 

    driverutils.clickelement(this.developerdocumentationutils.getproperty("developer_documentation_top"));
    String actdeveloperdocumentationtopnav = driverutils.gettext(this.developerdocumentationutils.getproperty("developer_documentation_top"));
    Assert.assertEquals(expdeveloperdocumentationtopnav, actdeveloperdocumentationtopnav);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("getting_started_home"));driverutils.backbrowser();
    String actgettingstartedinhomepage = driverutils.gettext(this.developerdocumentationutils.getproperty("getting_started_side"));
    Assert.assertEquals(expgettingstartedinhomepage, actgettingstartedinhomepage);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("developerdoc_sidenav_home"));
    driverutils.clickelement(this.developerdocumentationutils.getproperty("tutorials_home"));driverutils.backbrowser();
    String acttutorialsinhomepage = driverutils.gettext(this.developerdocumentationutils.getproperty("send_and_receive_Payments_side"));
    Assert.assertEquals(exptutorialsinhomepage, acttutorialsinhomepage);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("developerdoc_sidenav_home"));
    driverutils.clickelement(this.developerdocumentationutils.getproperty("deep_dive_documentation"));
    String actdeepdivedocumentationinhomepage = driverutils.gettext(this.developerdocumentationutils.getproperty("the_zenotta_network_protocol"));
    Assert.assertEquals(expdeepdivedocumentationinhomepage, actdeepdivedocumentationinhomepage);
  }

  public void developer_documentation_gettingstarted() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/gettingstarted.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("getting_started_module");
    JSONObject object = (JSONObject) array.get(0);

    String expgettingstartedsidenav = (String) (object.get("gettingstartedsidenav"));
    String expgettingstartedToc = (String) (object.get("gettingstartedToc"));
    String exphelloworldToc = (String) (object.get("helloworldToc"));
    String expinitnewToc = (String) (object.get("initnewToc"));
    String expinitfrommasterkeyToc = (String) (object.get("initfrommasterkeyToc"));
    String expinitfrommasterseed = (String) (object.get("initfrommasterseed"));
    String expsignuphere = (String) (object.get("signuphere"));
    String expdevelopmentteamlink = (String) (object.get("developmentteamlink"));
    String exptypescriptlinkbutton = (String) (object.get("typescriptlinkbutton"));
    String expherelinkofcontactdev = (String) (object.get("herelinkofcontactdev"));
    String expsendandrecivepaymentslink = (String) (object.get("sendandrecivepaymentslink")); 
    String expdevzenottamaillink = (String) (object.get("devzenottamaillink"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("developer_documentation_top"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("getting_started_side"));
    String actgettingstartedsidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("getting_started_side"));
    Assert.assertEquals(expgettingstartedsidenav, actgettingstartedsidenav);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("getting_started_toc"));
    String actgettingstartedToc = driverutils.gettext(this.developerdocumentationutils.getproperty("getting_started_toc"));
    Assert.assertEquals(expgettingstartedToc, actgettingstartedToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("toc_hello_world"));
    String acthelloworldToc = driverutils.gettext(this.developerdocumentationutils.getproperty("toc_hello_world"));
    Assert.assertEquals(exphelloworldToc, acthelloworldToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("toc_initNew"));
    String actinitnewToc = driverutils.gettext(this.developerdocumentationutils.getproperty("toc_initNew"));
    Assert.assertEquals(expinitnewToc, actinitnewToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("toc_initFromMasterKey"));
    String actinitfrommasterkeyToc = driverutils.gettext(this.developerdocumentationutils.getproperty("toc_initFromMasterKey"));
    Assert.assertEquals(expinitfrommasterkeyToc, actinitfrommasterkeyToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("toc_initFromSeed"));
    String actinitfrommasterseed = driverutils.gettext(this.developerdocumentationutils.getproperty("toc_initFromSeed"));
    Assert.assertEquals(expinitfrommasterseed, actinitfrommasterseed);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("signup_here"));driverutils.backbrowser();
    String actsignuphere = driverutils.gettext(this.developerdocumentationutils.getproperty("signup_here"));
    Assert.assertEquals(expsignuphere, actsignuphere);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("close_X_icon"));
    WebElement actclosebuttoningettingstartedisclickable = driverutils.getCssValue(this.developerdocumentationutils.getproperty("close_X_icon")); 
    Assert.assertEquals(false, actclosebuttoningettingstartedisclickable.isSelected());

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("contact_development_team"));driverutils.backbrowser();
    String actdevelopmentteamlink = driverutils.gettext(this.developerdocumentationutils.getproperty("contact_development_team"));
    Assert.assertEquals(expdevelopmentteamlink, actdevelopmentteamlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("typeScript"));driverutils.focusmainbrowser();
    String acttypeScript = driverutils.gettext(this.developerdocumentationutils.getproperty("typeScript"));
    Assert.assertEquals(exptypescriptlinkbutton, acttypeScript);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("herelinkofcontactdev"));driverutils.backbrowser();
    String actherelinkofcontactdev = driverutils.gettext(this.developerdocumentationutils.getproperty("herelinkofcontactdev"));
    Assert.assertEquals(expherelinkofcontactdev, actherelinkofcontactdev);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("send_and_receive_payments"));driverutils.backbrowser();
    String actsendandrecivepaymentslink = driverutils.gettext(this.developerdocumentationutils.getproperty("send_and_receive_payments"));
    Assert.assertEquals(expsendandrecivepaymentslink, actsendandrecivepaymentslink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("mail_link"));
    String actdevzenottamaillink = driverutils.gettext(this.developerdocumentationutils.getproperty("mail_link"));
    Assert.assertEquals(expdevzenottamaillink, actdevzenottamaillink);

    // to tick the buttons
    for (int i = 1; i <= 7; i++) {
      driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("svgclick"));driverutils.windowscrolldown();
    }
    // to unctick the buttons
    for (int i = 1; i <= 7; i++) {
      driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("svguntick"));driverutils.windowscrollup();
    }
  }
   
// ===========================================================================================================
  public void developer_documentation_tutorials_sendandreceivepayments() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/tutorials.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("tutorials_module");
    JSONObject object = (JSONObject) array.get(0);

    String exptutorialssidenav = (String) (object.get("tutorialssidenav"));
    String expsendandreceivepayments = (String) (object.get("sendandreceivepayments"));
    String expsignuphereforsendandrecivepage = (String) (object.get("signuphere"));
    String expherelink = (String) (object.get("herelink"));
    String expgettingstartedlink = (String) (object.get("gettingstartedlink"));
    String expnexttutorialpage = (String) (object.get("nexttutorialpage"));
    String expsendandreceivepaymentsmaillink = (String) (object.get("maillink"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("developer_documentation_top"));
    driverutils.clickelement(this.developerdocumentationutils.getproperty("tutorialssidenav"));
    String acttutorialssidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("tutorialssidenav"));
    Assert.assertEquals(exptutorialssidenav, acttutorialssidenav);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("send_and_receive_Payments_side"));
    String actsendandreceivepayments = driverutils.gettext(this.developerdocumentationutils.getproperty("send_and_receive_Payments_side"));
    Assert.assertEquals(expsendandreceivepayments, actsendandreceivepayments);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("signup_here"));driverutils.backbrowser();
    String actsignuphereforsendandrecivepage = driverutils.gettext(this.developerdocumentationutils.getproperty("signup_here"));
    Assert.assertEquals(expsignuphereforsendandrecivepage, actsignuphereforsendandrecivepage);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("close_X_icon"));
    WebElement actclosebuttoninsendreceiptisclickable = driverutils.getCssValue(this.developerdocumentationutils.getproperty("close_X_icon")); 
    Assert.assertEquals(false, actclosebuttoninsendreceiptisclickable.isSelected());

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("here_link"));driverutils.backbrowser();
    String actherelink = driverutils.gettext(this.developerdocumentationutils.getproperty("here_link"));
    Assert.assertEquals(expherelink, actherelink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("getting_started_link"));driverutils.backbrowser();
    String actgettingstartedlink = driverutils.gettext(this.developerdocumentationutils.getproperty("getting_started_link"));
    Assert.assertEquals(expgettingstartedlink, actgettingstartedlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("next_tutorial"));driverutils.backbrowser();
    String actnexttutorialpage = driverutils.gettext(this.developerdocumentationutils.getproperty("next_tutorial"));
    Assert.assertEquals(expnexttutorialpage, actnexttutorialpage);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("mail_link"));
    String actsendandreceivepaymentsmaillink = driverutils.gettext(this.developerdocumentationutils.getproperty("mail_link"));
    Assert.assertEquals(expsendandreceivepaymentsmaillink, actsendandreceivepaymentsmaillink);
      // to tick the buttons
      for (int i = 1; i <= 3; i++) {
        driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("svgclick"));driverutils.windowscrolldown();
      }
      // to unctick the buttons
      for (int i = 1; i <= 3; i++) {
        driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("svguntick"));driverutils.windowscrollup();
      }
  }

  public void developer_documentation_tutorials_receiptbasedpayments() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/tutorials.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("tutorials_module");
    JSONObject object = (JSONObject) array.get(0);

    String expreceiptbasedpaymentssidenav = (String) (object.get("receiptbasedpaymentssidenav"));
    String expsignuphereforreceiptbasedpage = (String) (object.get("signuphere"));
    String expreceiptbasedpaymentsherelink = (String) (object.get("herelink"));
    String expherenorefferlink = (String) (object.get("herelinkfornoreffer"));
    String expreceiptbasedpaymentsToc = (String) (object.get("receiptbasedpaymentsToc"));
    String expsettingupanRBPToc= (String) (object.get("settingupanRBPToc"));
    String expfetchingpendingRBPsToc = (String) (object.get("fetchingpendingRBPsToc"));
    String expreceiptbasedpaymentsmaillink = (String) (object.get("maillink"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("receipt_based_payments_side"));
    String actreceiptbasedpaymentssidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("receipt_based_payments_side"));
    Assert.assertEquals(expreceiptbasedpaymentssidenav, actreceiptbasedpaymentssidenav);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("signup_here"));driverutils.backbrowser();
    String actsignuphereforreceiptbasedpage = driverutils.gettext(this.developerdocumentationutils.getproperty("signup_here"));
    Assert.assertEquals(expsignuphereforreceiptbasedpage, actsignuphereforreceiptbasedpage);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("close_X_icon"));
    WebElement actclosebuttoninreceiptbasedisclickable = driverutils.getCssValue(this.developerdocumentationutils.getproperty("close_X_icon")); 
    Assert.assertEquals(false, actclosebuttoninreceiptbasedisclickable.isSelected());

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("here_link"));driverutils.backbrowser(); 
    String actreceiptbasedpaymentsherelink = driverutils.gettext(this.developerdocumentationutils.getproperty("signup_here"));
    Assert.assertEquals(expreceiptbasedpaymentsherelink, actreceiptbasedpaymentsherelink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("herenorefferlink"));driverutils.focusmainbrowser();
    String actherenorefferlink = driverutils.gettext(this.developerdocumentationutils.getproperty("herenorefferlink"));
    Assert.assertEquals(expherenorefferlink, actherenorefferlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("receiptbasedpaymentsToc"));
    String actreceiptbasedpaymentsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("receiptbasedpaymentsToc"));
    Assert.assertEquals(expreceiptbasedpaymentsToc, actreceiptbasedpaymentsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("settingupanRBPToc"));
    String actsettingupanRBPToc = driverutils.gettext(this.developerdocumentationutils.getproperty("settingupanRBPToc"));
    Assert.assertEquals(expsettingupanRBPToc, actsettingupanRBPToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("fetchingpendingRBPsToc"));
    String actfetchingpendingRBPsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("fetchingpendingRBPsToc"));
    Assert.assertEquals(expfetchingpendingRBPsToc, actfetchingpendingRBPsToc);
    
    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("mail_link"));
    String actreceiptbasedpaymentsmaillink = driverutils.gettext(this.developerdocumentationutils.getproperty("mail_link"));
    Assert.assertEquals(expreceiptbasedpaymentsmaillink, actreceiptbasedpaymentsmaillink);
     // to tick the buttons
     for (int i = 1; i <= 5; i++) {
      driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("svgclick"));driverutils.windowscrolldown();
    }
    // to unctick the buttons
    for (int i = 1; i <= 5; i++) {
      driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("svguntick"));driverutils.windowscrollup();
    }
  }

  // =======================================================Deep Dive Doc Module

  public void developer_docimentation_deep_dive_documentation() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/zenotta_network_protocol.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("zenotta_network_protocol");
    JSONObject object = (JSONObject) array.get(0);

    String expdevloper_doc = (String) (object.get("developerdocumentation"));
    String expdeepdivedoc = (String) (object.get("deepdivesidenavigation"));
    
    driverutils.clickelement(this.developerdocumentationutils.getproperty("developer_documentation_top"));
    String actdevloper_doc = driverutils.gettext(this.developerdocumentationutils.getproperty("developer_documentation_top"));
    Assert.assertEquals(expdevloper_doc, actdevloper_doc);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("deepdivedocumentation"));
    String actdeepdivedoc = driverutils.gettext(this.developerdocumentationutils.getproperty("deepdivedocumentation"));
    Assert.assertEquals(expdeepdivedoc, actdeepdivedoc);
  }

  public void deep_divedoc_computational_overview() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/computational.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("computational_overview");
    JSONObject object = (JSONObject) array.get(0);

    String expcomputational = (String) (object.get("computationalview"));
    String expcmodelToc = (String) (object.get("comptationalmodel"));
    String exptransactionToc = (String) (object.get("transaction"));
    String expsmartdataToc = (String) (object.get("smartdata"));
    String expbitlink = (String) (object.get("bitcoinlink"));
    String expforthlink = (String) (object.get("forthlink"));
    String exppowershellink = (String) (object.get("powershell"));
    String expherelink = (String) (object.get("herelink"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("computationaloverview_sidenav"));
    String actcomputational = driverutils.gettext(this.developerdocumentationutils.getproperty("computationaloverview_sidenav"));
    Assert.assertEquals(expcomputational, actcomputational);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("computationalmodelToc"));
    String actcmodelToc = driverutils.gettext(this.developerdocumentationutils.getproperty("computationalmodelToc"));
    Assert.assertEquals(expcmodelToc, actcmodelToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("transactionToc"));
    String acttransactionToc = driverutils.gettext(this.developerdocumentationutils.getproperty("transactionToc"));
    Assert.assertEquals(exptransactionToc, acttransactionToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("smartdataToc"));
    String actsmartdataToc = driverutils.gettext(this.developerdocumentationutils.getproperty("smartdataToc"));
    Assert.assertEquals(expsmartdataToc, actsmartdataToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("bitcoinscriptlink"));driverutils.backtotab();
    String acpbitlink = driverutils.gettext(this.developerdocumentationutils.getproperty("bitcoinscriptlink"));
    Assert.assertEquals(expbitlink, acpbitlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("forthlink"));driverutils.backtotab();
    String actforthlink = driverutils.gettext(this.developerdocumentationutils.getproperty("forthlink"));
    Assert.assertEquals(expforthlink, actforthlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("powershellink"));driverutils.backtotab();
    String actpowershellink = driverutils.gettext(this.developerdocumentationutils.getproperty("powershellink"));
    Assert.assertEquals(exppowershellink, actpowershellink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("computationalherelink"));driverutils.backtotab();
    String actherelink = driverutils.gettext(this.developerdocumentationutils.getproperty("computationalherelink"));
    Assert.assertEquals(expherelink, actherelink);
  }

  public void deep_divedoc_zenotta_network_protocol_homepage()throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/zenotta_network_protocol.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("zenotta_network_protocol");
    JSONObject object = (JSONObject) array.get(0);

    String expzenottasidenav = (String) (object.get("zenottaSidenav"));
    String expgettinstartedToc = (String) (object.get("gettingstartedToc"));
    String expsystemarchToc = (String) (object.get("systemarchToc"));
    String expcodedesignToc = (String) (object.get("codedesign"));
    String expzenottaToc = (String) (object.get("zenottaToc"));
    String expnodetype = (String) (object.get("nodetypeslink"));
    String expmempoolnodelink = (String) (object.get("mempoolnodelink"));
    String expminernodelink = (String) (object.get("minernodelink"));
    String expstoragenodelink = (String) (object.get("storagenodelink"));
    String expunicornlink = (String) (object.get("unicornslink"));
    String exptransactionslink = (String) (object.get("transactionslink"));
    String expminingblockprocesslink = (String) (object.get("blockminingprocesslink"));
    String expdualdoublentrylink = (String) (object.get("dualdoublentrylink"));
    String expshurikenauditinglink = (String) (object.get("shurikenlink"));
    String expherelink = (String) (object.get("herelink"));
    String expthreetierarchlink = (String) (object.get("threetierarchlink"));
    String expjohnjdlink = (String) (object.get("johnjdlink"));
    String expnodetypenextbutton = (String) (object.get("nodetypenextbutton"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("zenottanetworkprotocol"));
    String actzenottasidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("thezenottanetworkprotocolToc"));
    Assert.assertEquals(expzenottasidenav, actzenottasidenav);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("gettingstartedToc"));
    String actgettinstartedToc = driverutils.gettext(this.developerdocumentationutils.getproperty("gettingstartedToc"));
    Assert.assertEquals(expgettinstartedToc, actgettinstartedToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("systemarchToc"));
    String actsystemarchToc = driverutils.gettext(this.developerdocumentationutils.getproperty("systemarchToc"));
    Assert.assertEquals(expsystemarchToc, actsystemarchToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("codedesignToc"));
    String actcodedesignToc = driverutils.gettext(this.developerdocumentationutils.getproperty("codedesignToc"));
    Assert.assertEquals(expcodedesignToc, actcodedesignToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("thezenottanetworkprotocolToc"));
    String actzenottaToc = driverutils.gettext(this.developerdocumentationutils.getproperty("thezenottanetworkprotocolToc"));
    Assert.assertEquals(expzenottaToc, actzenottaToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("nodetypeslink"));driverutils.backtothepage();
    String actnodetype = driverutils.gettext(this.developerdocumentationutils.getproperty("nodetypeslink"));
    Assert.assertEquals(expnodetype, actnodetype);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("mempoolnodelink"));driverutils.backtothepage();
    String actmempoolnodelink = driverutils.gettext(this.developerdocumentationutils.getproperty("mempoolnodelink"));
    Assert.assertEquals(expmempoolnodelink, actmempoolnodelink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("minernodelink"));driverutils.backtothepage();
    String actminernodelink = driverutils.gettext(this.developerdocumentationutils.getproperty("minernodelink"));
    Assert.assertEquals(expminernodelink, actminernodelink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("storagenodelink"));driverutils.backtothepage();
    String actstoragenodelink = driverutils.gettext(this.developerdocumentationutils.getproperty("storagenodelink"));
    Assert.assertEquals(expstoragenodelink, actstoragenodelink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("unicornslink"));driverutils.backtothepage();
    String actunicornlink = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornslink"));
    Assert.assertEquals(expunicornlink, actunicornlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("transactionslink"));driverutils.backtothepage();
    String acttransactionslink = driverutils.gettext(this.developerdocumentationutils.getproperty("transactionslink"));
    Assert.assertEquals(exptransactionslink, acttransactionslink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("blockminingprocesslink"));driverutils.backtothepage();
    String actminingblockprocesslink = driverutils.gettext(this.developerdocumentationutils.getproperty("blockminingprocesslink"));
    Assert.assertEquals(expminingblockprocesslink, actminingblockprocesslink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("dualdoubleentrylink"));driverutils.backtothepage();
    String actdualdoublentrylink = driverutils.gettext(this.developerdocumentationutils.getproperty("dualdoubleentrylink"));
    Assert.assertEquals(expdualdoublentrylink, actdualdoublentrylink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("shurikenauditinglink"));driverutils.backtothepage();driverutils.windowscrollmiddle();
    String actshurikenauditinglink = driverutils.gettext(this.developerdocumentationutils.getproperty("shurikenauditinglink"));
    Assert.assertEquals(expshurikenauditinglink, actshurikenauditinglink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("zenottahomepageherelink"));driverutils.backtothepage();driverutils.windowscrolldown();
    String actherelink = driverutils.gettext(this.developerdocumentationutils.getproperty("zenottahomepageherelink"));
    Assert.assertEquals(expherelink, actherelink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("zenottahomepagettelink"));driverutils.backtotab();
    String actthreetierarchlink = driverutils.gettext(this.developerdocumentationutils.getproperty("zenottahomepagettelink"));
    Assert.assertEquals(expthreetierarchlink, actthreetierarchlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("zenottahomepagejjdlink"));driverutils.backtotab();
    String actjohnjdlink = driverutils.gettext(this.developerdocumentationutils.getproperty("zenottahomepagejjdlink"));
    Assert.assertEquals(expjohnjdlink, actjohnjdlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("nextbutton"));driverutils.backtothepage();
    String actnodetypenextbutton = driverutils.gettext(this.developerdocumentationutils.getproperty("nextbutton"));
    Assert.assertEquals(expnodetypenextbutton, actnodetypenextbutton);
  }

  public void the_zenotta_network_protocol_nodetypes() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/nodetypes.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("nodetypes_module");
    JSONObject object = (JSONObject) array.get(0);

    String expnode_types = (String) (object.get("node_types"));
    String expmempool_node = (String) (object.get("mempool_node"));
    String expminer_node = (String) (object.get("miner_node"));
    String expstorage_node = (String) (object.get("storage_node"));
    String exptypes_at_glance = (String) (object.get("types_at_glance"));
    String expwhy_different_nodetypes = (String) (object.get("why_different_nodetypes"));
    String expgeographic_diversity = (String) (object.get("geographic_diversity"));
    String expstorage_requirements = (String) (object.get("storage_requirements"));
    String expznp_node_types = (String) (object.get("znp_node_types"));
    String expasset_payments = (String) (object.get("asset_payments"));
    String expznp_button = (String) (object.get("znp_button"));
    String expmempoolnode_button = (String) (object.get("mempoolnode_button"));
    String exppayment_settlement = (String) (object.get("payment_settlement"));
    
    driverutils.clickelement(this.developerdocumentationutils.getproperty("node_types"));
    String actnode_types = driverutils.gettext(this.developerdocumentationutils.getproperty("node_types"));
    Assert.assertEquals(expnode_types, actnode_types);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("mempool_node"));driverutils.backbrowser();
    String actmempool_node = driverutils.gettext(this.developerdocumentationutils.getproperty("mempoolnode"));
    Assert.assertEquals(expmempool_node, actmempool_node);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("miner_node"));driverutils.backbrowser();
    String actminer_node = driverutils.gettext(this.developerdocumentationutils.getproperty("minernodesidenav"));
    Assert.assertEquals(expminer_node, actminer_node);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("storage_node"));driverutils.backbrowser();
    String actstorage_node = driverutils.gettext(this.developerdocumentationutils.getproperty("storagenodesidenav"));
    Assert.assertEquals(expstorage_node, actstorage_node);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("types_at_glance"));
    String acttypes_at_glance = driverutils.gettext(this.developerdocumentationutils.getproperty("types_at_glance"));
    Assert.assertEquals(exptypes_at_glance, acttypes_at_glance);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("why_different_nodetypes"));
    String actwhy_different_nodetypes = driverutils.gettext(this.developerdocumentationutils.getproperty("why_different_nodetypes"));
    Assert.assertEquals(expwhy_different_nodetypes, actwhy_different_nodetypes);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("geographic_diversity"));
    String actgeographic_diversity = driverutils.gettext(this.developerdocumentationutils.getproperty("geographic_diversity"));
    Assert.assertEquals(expgeographic_diversity, actgeographic_diversity);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("storage_requirements"));
    String actstorage_requirements = driverutils.gettext(this.developerdocumentationutils.getproperty("storage_requirements"));
    Assert.assertEquals(expstorage_requirements, actstorage_requirements);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("znp_node_types"));
    String actznp_node_types = driverutils.gettext(this.developerdocumentationutils.getproperty("znp_node_types"));
    Assert.assertEquals(expznp_node_types, actznp_node_types);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("asset_payments"));
    String actasset_payments = driverutils.gettext(this.developerdocumentationutils.getproperty("asset_payments"));
    Assert.assertEquals(expasset_payments, actasset_payments);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("znp_button"));driverutils.backbrowser();
    String actznp_button = driverutils.gettext(this.developerdocumentationutils.getproperty("znp_button"));
    Assert.assertEquals(expznp_button, actznp_button);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("mempoolnode_button"));driverutils.backbrowser();
    String actmempoolnode_button = driverutils.gettext(this.developerdocumentationutils.getproperty("mempoolnode_button"));driverutils.backbrowser();
    Assert.assertEquals(expmempoolnode_button, actmempoolnode_button);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("payment_settlement"));
    String actpayment_settlement = driverutils.gettext(this.developerdocumentationutils.getproperty("payment_settlement"));
    Assert.assertEquals(exppayment_settlement, actpayment_settlement);
  }

  public void the_zenotta_network_protocol_mempoolnode() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/mempoolnode.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("mempoolnode_module");
    JSONObject object = (JSONObject) array.get(0);

    String expmempoolnode = (String) (object.get("mempoolnode"));
    String exptoc_mempoolnode = (String) (object.get("toc_mempoolnode"));
    String expunicorn = (String) (object.get("unicorn"));
    String expwikipage = (String) (object.get("wikipage"));
    String expnodetype = (String) (object.get("nodetype"));
    String expminernode = (String) (object.get("minernode"));
    String expbalanceofpower = (String) (object.get("balanceofpower"));
    String expstructure = (String) (object.get("structure"));
    String expConstructingblocks = (String) (object.get("Constructingblocks"));
    String expmempoolandminernode = (String) (object.get("mempoolandminernode"));
    String expmempoolandstoragenode = (String) (object.get("mempoolandstoragenode"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("mempoolnode"));
    String actmempoolnode = driverutils.gettext(this.developerdocumentationutils.getproperty("mempoolnode"));
    Assert.assertEquals(expmempoolnode, actmempoolnode);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("balanceofpower"));
    String actbalanceofpower = driverutils.gettext(this.developerdocumentationutils.getproperty("balanceofpower"));
    Assert.assertEquals(expbalanceofpower, actbalanceofpower);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("structure"));
    String actstructure = driverutils.gettext(this.developerdocumentationutils.getproperty("structure"));
    Assert.assertEquals(expstructure, actstructure);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("constructingblocks"));
    String actConstructingblocks = driverutils.gettext(this.developerdocumentationutils.getproperty("constructingblocks"));
    Assert.assertEquals(expConstructingblocks, actConstructingblocks);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("mempoolandminernode"));
    String actmempoolandminernode = driverutils.gettext(this.developerdocumentationutils.getproperty("mempoolandminernode"));
    Assert.assertEquals(expmempoolandminernode, actmempoolandminernode);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("mempoolandstoragenode"));
    String actmempoolandstoragenode = driverutils.gettext(this.developerdocumentationutils.getproperty("mempoolandstoragenode"));
    Assert.assertEquals(expmempoolandstoragenode, actmempoolandstoragenode);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("toc_mempoolnode"));
    String acttoc_mempoolnode = driverutils.gettext(this.developerdocumentationutils.getproperty("toc_mempoolnode"));
    Assert.assertEquals(exptoc_mempoolnode, acttoc_mempoolnode);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("unicorn"));driverutils.backbrowser();
    String actunicorn = driverutils.gettext(this.developerdocumentationutils.getproperty("unicorn"));
    Assert.assertEquals(expunicorn, actunicorn);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("wikipage"));driverutils.backbrowser();
    String actwikipage = driverutils.gettext(this.developerdocumentationutils.getproperty("wikipage"));
    Assert.assertEquals(expwikipage, actwikipage);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("nodetype"));driverutils.backbrowser();
    String actnodetype = driverutils.gettext(this.developerdocumentationutils.getproperty("nodetype"));
    Assert.assertEquals(expnodetype, actnodetype);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("minernode"));driverutils.backbrowser();
    String actminernode = driverutils.gettext(this.developerdocumentationutils.getproperty("minernode"));
    Assert.assertEquals(expminernode, actminernode);
  }

  public void the_zenotta_network_protocol_miner_node() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/miner.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("miner_node");
    JSONObject object = (JSONObject) array.get(0);

    String expminernodesidenavigation = (String) (object.get("miner"));
    String expminernodeToc = (String) (object.get("minerToc"));
    String expbalanceofpowerToc = (String) (object.get("balanceofpower"));
    String exppartitioningToc = (String) (object.get("partitioningToc"));
    String exppowlink = (String) (object.get("powlink"));
    String expunicornlink = (String) (object.get("unicornlink"));
    String exppreviousbuttonmempoolnode = (String) (object.get("previousbutton_mempoolnode"));
    String expnextbuttonstoragenode = (String) (object.get("nextbutton_storagenode"));

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("minernodesidenav"));
    String actminernodesidenavigation = driverutils.gettext(this.developerdocumentationutils.getproperty("minernodesidenav"));
    Assert.assertEquals(expminernodesidenavigation, actminernodesidenavigation);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("minernodeToc"));
    String actminernodeToc = driverutils.gettext(this.developerdocumentationutils.getproperty("minernodeToc"));
    Assert.assertEquals(expminernodeToc, actminernodeToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("balanceofpowerToc"));
    String actbalanceofpowerToc = driverutils.gettext(this.developerdocumentationutils.getproperty("balanceofpowerToc"));
    Assert.assertEquals(expbalanceofpowerToc, actbalanceofpowerToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("partitioningToc"));
    String actpartitioningToc = driverutils.gettext(this.developerdocumentationutils.getproperty("partitioningToc"));
    Assert.assertEquals(exppartitioningToc, actpartitioningToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("proofofworklink"));driverutils.backtotab();
    String actpowlink = driverutils.gettext(this.developerdocumentationutils.getproperty("proofofworklink"));
    Assert.assertEquals(exppowlink, actpowlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("unicornlink"));driverutils.backtothepage();
    String actunicornlink = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornlink"));
    Assert.assertEquals(expunicornlink, actunicornlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("previousbutton"));driverutils.backtothepage();
    String actpreviousbuttonmempoolnode = driverutils.gettext(this.developerdocumentationutils.getproperty("previousbutton"));
    Assert.assertEquals(exppreviousbuttonmempoolnode, actpreviousbuttonmempoolnode);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("nextbutton"));driverutils.backtothepage();
    String actnextbuttonstoragenode = driverutils.gettext(this.developerdocumentationutils.getproperty("nextbutton"));driverutils.backtothepage();
    Assert.assertEquals(expnextbuttonstoragenode, actnextbuttonstoragenode);
  }

  public void the_zenotta_network_protocol_storage_node() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/storage.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("storage_node");
    JSONObject object = (JSONObject) array.get(0);

    String expstoragenodesidenav = (String) (object.get("storagenodesidenav"));
    String expstoragenodeToc = (String) (object.get("storagenodeToc"));
    String expstoragestructureToc = (String) (object.get("storagestructureToc"));
    String expreceivingblocksToc = (String) (object.get("receivingblocksToc"));
    String expreceivingvaluesToc = (String) (object.get("receivingvaluesToc"));
    String expreceivingdruidsToc = (String) (object.get("receivingdruidsToc"));
    String expstoragenodeconsToc = (String) (object.get("storagenodeconsToc"));
    String expraftconsensuslink = (String) (object.get("raftconsensuslink"));
    String expunicornlink = (String) (object.get("unicornlink"));
    String expdruidslink = (String) (object.get("druidslink"));
    String exppreviousbuttonminernode = (String) (object.get("previousbuttonminernode"));
    String expnextbuttonunicorns = (String) (object.get("nextbuttonunicorns"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("storagenodesidenav"));
    String actstoragenodesidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("storagenodesidenav"));
    Assert.assertEquals(expstoragenodesidenav, actstoragenodesidenav);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("storagenodeToc"));
    String actstoragenodeToc = driverutils.gettext(this.developerdocumentationutils.getproperty("storagenodeToc"));
    Assert.assertEquals(expstoragenodeToc, actstoragenodeToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("storagenodestructureToc"));
    String actstoragestructureToc = driverutils.gettext(this.developerdocumentationutils.getproperty("storagenodestructureToc"));
    Assert.assertEquals(expstoragestructureToc, actstoragestructureToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("receivingblocksToc"));
    String actreceivingblocksToc = driverutils.gettext(this.developerdocumentationutils.getproperty("receivingblocksToc"));
    Assert.assertEquals(expreceivingblocksToc, actreceivingblocksToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("receivingunicornvaluesToc"));
    String actreceivingvaluesToc = driverutils.gettext(this.developerdocumentationutils.getproperty("receivingunicornvaluesToc"));
    Assert.assertEquals(expreceivingvaluesToc, actreceivingvaluesToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("receivingdruidsToc"));
    String actreceivingdruidsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("receivingdruidsToc"));
    Assert.assertEquals(expreceivingdruidsToc, actreceivingdruidsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("storagenodeconsensusToc"));
    String actstoragenodeconsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("storagenodeconsensusToc"));
    Assert.assertEquals(expstoragenodeconsToc, actstoragenodeconsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("raftlink"));driverutils.backtotab();
    String actraftconsensuslink = driverutils.gettext(this.developerdocumentationutils.getproperty("raftlink"));
    Assert.assertEquals(expraftconsensuslink, actraftconsensuslink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("unicornlink"));driverutils.backtothepage();
    String actunicornlink = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornlink"));
    Assert.assertEquals(expunicornlink, actunicornlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("druidslink"));driverutils.backtotab();driverutils.windowscrolldown();
    String actdruidslink = driverutils.gettext(this.developerdocumentationutils.getproperty("druidslink"));
    Assert.assertEquals(expdruidslink, actdruidslink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("previousbutton"));driverutils.backtothepage();
    String actpreviousbuttonminernode = driverutils.gettext(this.developerdocumentationutils.getproperty("previousbutton"));
    Assert.assertEquals(exppreviousbuttonminernode, actpreviousbuttonminernode);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("nextbutton"));driverutils.backtothepage();
    String actnextbuttonunicorns = driverutils.gettext(this.developerdocumentationutils.getproperty("nextbutton"));
    Assert.assertEquals(expnextbuttonunicorns, actnextbuttonunicorns);
  }  

  public void the_zenotta_network_protocol_unicorns() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/unicorns.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("unicorns");
    JSONObject object = (JSONObject) array.get(0);

    String expunicornsidenav = (String) (object.get("unicornsidenav"));
    String expunicornlink = (String) (object.get("unicornlink"));
    String exppreviousbuttonstoragenode = (String) (object.get("previousbuttonstoragenode"));
    String expnextbuttontransactions = (String) (object.get("nextbuttontransactions"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("unicornsidenav"));
    String actunicornsidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornsidenav"));
    Assert.assertEquals(expunicornsidenav, actunicornsidenav);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("unicornlink"));driverutils.backtotab();
    String actunicornlink = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornlink"));
    Assert.assertEquals(expunicornlink, actunicornlink);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("previousbutton"));driverutils.backtothepage();
    String actpreviousbuttonstoragenode = driverutils.gettext(this.developerdocumentationutils.getproperty("previousbutton"));
    Assert.assertEquals(exppreviousbuttonstoragenode, actpreviousbuttonstoragenode);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("nextbutton"));driverutils.backtothepage();
    String actnextbuttontransactions = driverutils.gettext(this.developerdocumentationutils.getproperty("nextbutton"));
    Assert.assertEquals(expnextbuttontransactions, actnextbuttontransactions);
  }

  public void the_zenotta_network_protocol_transactions() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/transactions.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("transactions");
    JSONObject object = (JSONObject) array.get(0);

    String exptransactionssidenav = (String) (object.get("transactionssidenav"));
    String expstructureToc = (String) (object.get("structureToc"));
    String expactinputsToc = (String) (object.get("inputsToc"));
    String expoutputsToc = (String) (object.get("outputsToc"));
    String exptransactionsToc = (String) (object.get("transactionsToc"));
    String exppreviousbuttonunicorns = (String) (object.get("previousbuttonunicorns"));
    String expnextbuttonblockminingprocess = (String) (object.get("nextbuttonblockminingprocess"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("transactionssidenav"));
    String acttransactionssidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("transactionssidenav"));
    Assert.assertEquals(exptransactionssidenav, acttransactionssidenav);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("structureToc"));
    String actstructureToc = driverutils.gettext(this.developerdocumentationutils.getproperty("structureToc"));
    Assert.assertEquals(expstructureToc, actstructureToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("inputsToc"));
    String actinputsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("inputsToc"));
    Assert.assertEquals(expactinputsToc, actinputsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("outputsToc"));
    String actoutputsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("outputsToc"));
    Assert.assertEquals(expoutputsToc, actoutputsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("transactionsToc"));driverutils.windowscrolldown();
    String acttransactionsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("transactionsToc"));
    Assert.assertEquals(exptransactionsToc, acttransactionsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("previousbutton"));driverutils.backtothepage();
    String actpreviousbuttonunicorns = driverutils.gettext(this.developerdocumentationutils.getproperty("previousbutton"));
    Assert.assertEquals(exppreviousbuttonunicorns, actpreviousbuttonunicorns);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("nextbutton"));driverutils.backtothepage();
    String actnextbuttonblockminingprocess = driverutils.gettext(this.developerdocumentationutils.getproperty("nextbutton"));
    Assert.assertEquals(expnextbuttonblockminingprocess, actnextbuttonblockminingprocess);
  }

  public void the_zenotta_network_protocol_blockminingprocess() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/blockminingprocess.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("blockminingprocess_module");
    JSONObject object = (JSONObject) array.get(0);
    
    String expblockminingprocess = (String) (object.get("blockminingprocess"));
    String exptransactions = (String) (object.get("transactions"));
    String expdualdoubleentrytransactions = (String) (object.get("dualdoubleentrytransactions"));
    String expmempool = (String) (object.get("mempool"));
    String expminers = (String) (object.get("miners"));
    String expstorage = (String) (object.get("storage"));
    String expunicorn = (String) (object.get("unicorn"));
    String expunicornconstruction = (String) (object.get("unicornconstruction"));
    String expprocessforasingleblock = (String) (object.get("processforasingleblock"));
    String exptoc_blockminingprocess = (String) (object.get("toc_blockminingprocess"));
    String expparallelpipelineforallblocks = (String) (object.get("parallelpipelineforallblocks"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("blockminingprocess"));
    String actblockminingprocess = driverutils.gettext(this.developerdocumentationutils.getproperty("blockminingprocess"));
    Assert.assertEquals(expblockminingprocess, actblockminingprocess);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("transactions"));driverutils.backbrowser();
    String acttransactions = driverutils.gettext(this.developerdocumentationutils.getproperty("transactions"));
    Assert.assertEquals(exptransactions, acttransactions);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("dualdoubleentrytransactions"));driverutils.backbrowser();
    String actdualdoubleentrytransactions = driverutils.gettext(this.developerdocumentationutils.getproperty("dualdoubleentrytransactions"));
    Assert.assertEquals(expdualdoubleentrytransactions, actdualdoubleentrytransactions);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("mempool"));driverutils.backbrowser();
    String actmempool = driverutils.gettext(this.developerdocumentationutils.getproperty("mempoolnode"));
    Assert.assertEquals(expmempool, actmempool);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("miners"));driverutils.backbrowser();
    String actminers = driverutils.gettext(this.developerdocumentationutils.getproperty("minernodesidenav"));
    Assert.assertEquals(expminers, actminers);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("storage"));driverutils.backbrowser();
    String actstorage = driverutils.gettext(this.developerdocumentationutils.getproperty("storagenodesidenav"));
    Assert.assertEquals(expstorage, actstorage);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("unicorn"));driverutils.backbrowser();
    String actunicorn = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornsidenav"));
    Assert.assertEquals(expunicorn, actunicorn);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("unicornconstruction"));
    String actunicornconstruction = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornconstruction"));
    Assert.assertEquals(expunicornconstruction, actunicornconstruction);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("processforasingleblock"));
    String actprocessforasingleblock = driverutils.gettext(this.developerdocumentationutils.getproperty("processforasingleblock"));
    Assert.assertEquals(expprocessforasingleblock, actprocessforasingleblock);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("toc_blockminingprocess"));
    String acttoc_blockminingprocess = driverutils.gettext(this.developerdocumentationutils.getproperty("toc_blockminingprocess"));
    Assert.assertEquals(exptoc_blockminingprocess, acttoc_blockminingprocess);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("parallelpipelineforallblocks"));
    String actparallelpipelineforallblocks = driverutils.gettext(this.developerdocumentationutils.getproperty("parallelpipelineforallblocks"));
    Assert.assertEquals(expparallelpipelineforallblocks, actparallelpipelineforallblocks);
  }

  public void the_zenotta_network_protocol_dualdoubleentrytransactions() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/dualdoubleentry.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("dual_double_entry");
    JSONObject object = (JSONObject) array.get(0);

    String expdualdoubleentrytransactionssidenav = (String) (object.get("dualdoubleentrytransactions"));
    String expdualdoubleentrytransactionsToc = (String) (object.get("dualdoubleentrytransactionsToc")); 
    String expddetransactionworksToc = (String) (object.get("ddetransactionToc"));
    String expreceiptbasedpaymentsToc = (String) (object.get("receiptbasedToc"));
    String expfutureconsiderationsandimprovementsToc = (String) (object.get("futureconsiderationsandimprovementsToc"));
    String exppreviousbuttonblockminingprocess = (String) (object.get("previousbuttonblockminingprocess"));
    String expnextbuttonshurikenauditing = (String) (object.get("nextbuttonshurikenauditing"));

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("dualdoubleentrytransactionssidenav")); 
    String actdualdoubleentrytransactionssidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("dualdoubleentrytransactionssidenav"));
    Assert.assertEquals(expdualdoubleentrytransactionssidenav, actdualdoubleentrytransactionssidenav);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("dualdoubleentrytransactionsToc"));
    String actdualdoubleentrytransactionsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("dualdoubleentrytransactionsToc"));
    Assert.assertEquals(expdualdoubleentrytransactionsToc, actdualdoubleentrytransactionsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("dde_transactionworksToc"));
    String actddetransactionworksToc = driverutils.gettext(this.developerdocumentationutils.getproperty("dde_transactionworksToc"));
    Assert.assertEquals(expddetransactionworksToc, actddetransactionworksToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("receiptbasedpaymentsToc"));
    String actreceiptbasedpaymentsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("receiptbasedpaymentsToc"));
    Assert.assertEquals(expreceiptbasedpaymentsToc, actreceiptbasedpaymentsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("futureconsiderationsandimprovementsToc"));
    String actfutureconsiderationsandimprovementsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("futureconsiderationsandimprovementsToc"));
    Assert.assertEquals(expfutureconsiderationsandimprovementsToc, actfutureconsiderationsandimprovementsToc);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("previousbutton"));driverutils.backtothepage();
    String actpreviousbuttonblockminingprocess = driverutils.gettext(this.developerdocumentationutils.getproperty("previousbutton"));
    Assert.assertEquals(exppreviousbuttonblockminingprocess, actpreviousbuttonblockminingprocess);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("nextbutton"));driverutils.backtothepage();
    String actnextbuttonshurikenauditing = driverutils.gettext(this.developerdocumentationutils.getproperty("nextbutton"));
    Assert.assertEquals(expnextbuttonshurikenauditing, actnextbuttonshurikenauditing);  
  }

  public void the_zenotta_network_protocol_shuriken_auditing() throws FileNotFoundException, IOException, ParseException {
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/shurikenauditing.json"));
    jsonObject = (JSONObject) obj;
    JSONArray array = (JSONArray) jsonObject.get("shuriken_auditing");
    JSONObject object = (JSONObject) array.get(0);

    String expshurikenauditingsidenav = (String) (object.get("shurikenauditingsidenav"));
    String expauditingnewassetsToc = (String) (object.get("auditingnewassetsToc"));
    String expprocessflowToc = (String) (object.get("processflowToc"));
    String expdiagramToc = (String) (object.get("diagramToc"));
    String expshurikenauditingToc = (String) (object.get("shurikenauditingToc"));
    String expshurikenauditingmempoollink = (String) (object.get("shurikenauditingmempoollink"));
    String expshurikenauditingunicornlink = (String) (object.get("unicornlink"));
    String expshurikenauditingstorageLink = (String) (object.get("shurikenauditingstorageLink"));
    String exppreviousbuttondualdoublentry = (String) (object.get("previousbuttondualdoublentry"));
    
    driverutils.clickelement(this.developerdocumentationutils.getproperty("shurikenauditingsidenav"));
    String actshurikenauditingsidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("shurikenauditingsidenav"));
    Assert.assertEquals(expshurikenauditingsidenav, actshurikenauditingsidenav); 

    driverutils.clickelement(this.developerdocumentationutils.getproperty("auditingnewassetsToc"));
    String actauditingnewassetsToc = driverutils.gettext(this.developerdocumentationutils.getproperty("auditingnewassetsToc"));
    Assert.assertEquals(expauditingnewassetsToc, actauditingnewassetsToc); 

    driverutils.clickelement(this.developerdocumentationutils.getproperty("processflowToc"));
    String actprocessflowToc = driverutils.gettext(this.developerdocumentationutils.getproperty("processflowToc"));
    Assert.assertEquals(expprocessflowToc, actprocessflowToc); 

    driverutils.clickelement(this.developerdocumentationutils.getproperty("diagramToc"));
    String actdiagramToc = driverutils.gettext(this.developerdocumentationutils.getproperty("diagramToc"));
    Assert.assertEquals(expdiagramToc, actdiagramToc); 

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("shurikenauditingToc"));
    String actshurikenauditingToc = driverutils.gettext(this.developerdocumentationutils.getproperty("shurikenauditingToc"));
    Assert.assertEquals(expshurikenauditingToc, actshurikenauditingToc); 

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("shurikenauditingmempoollink"));driverutils.backtothepage();
    String actshurikenauditingmempoollink = driverutils.gettext(this.developerdocumentationutils.getproperty("shurikenauditingmempoollink"));
    Assert.assertEquals(expshurikenauditingmempoollink, actshurikenauditingmempoollink); 

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("unicornlink"));driverutils.backtothepage();
    String actshurikenauditingunicornlink = driverutils.gettext(this.developerdocumentationutils.getproperty("unicornlink"));
    Assert.assertEquals(expshurikenauditingunicornlink, actshurikenauditingunicornlink); 

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("shurikenauditingstorageLink"));driverutils.backtothepage();driverutils.windowscrolldown();
    String actshurikenauditingstorageLink = driverutils.gettext(this.developerdocumentationutils.getproperty("shurikenauditingstorageLink"));
    Assert.assertEquals(expshurikenauditingstorageLink, actshurikenauditingstorageLink); 

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("previousbutton"));driverutils.backtothepage();
    String actpreviousbuttondualdoublentry = driverutils.gettext(this.developerdocumentationutils.getproperty("previousbutton"));
    Assert.assertEquals(exppreviousbuttondualdoublentry, actpreviousbuttondualdoublentry); 
  }


  public void developer_documentation_tools_zscriptemulator()throws FileNotFoundException, IOException, ParseException, InterruptedException{
    JSONParser jsonparser = new JSONParser();
    JSONObject jsonObject;     
    Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/tools.json"));      
    jsonObject = (JSONObject) obj;
    JSONArray a = (JSONArray)jsonObject.get("tools_module");
    JSONObject o = (JSONObject)a.get(0);

    String exptoolssidenav =(String) (o.get("tools"));
    String expzscriptemulatorsidenav =(String) (o.get("zscript_emulator"));  
    String expdropdown =(String) (o.get("dropdownbutton"));  
    String expnightly =(String) (o.get("nightly"));
    String expstable =(String) (o.get("stable"));
    String expzscriptemulatorbitcoinlink =(String) (o.get("zscriptemulatorbitcoinlink"));
    String exponefoundinbitcoinlink =(String) (o.get("onefoundinbitcoinlink"));

    driverutils.clickelement(this.developerdocumentationutils.getproperty("developer_documentation_top"));
    driverutils.clickelement(this.developerdocumentationutils.getproperty("toolssidenav"));
    String acttoolssidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("toolssidenav"));
    Assert.assertEquals(exptoolssidenav, acttoolssidenav);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("zscriptemulatorsidenav"));
    String actzscriptemulatorsidenav = driverutils.gettext(this.developerdocumentationutils.getproperty("zscriptemulatorsidenav"));
    Assert.assertEquals(expzscriptemulatorsidenav, actzscriptemulatorsidenav);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("dropdown"));
    String actdropdown = driverutils.gettext(this.developerdocumentationutils.getproperty("dropdown"));
    Assert.assertEquals(expdropdown, actdropdown);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("nightly"));
    String actnightly = driverutils.gettext(this.developerdocumentationutils.getproperty("nightlydropdown"));
    Assert.assertEquals(expnightly, actnightly);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("dropdown"));
    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("stable"));
    String actstable = driverutils.gettext(this.developerdocumentationutils.getproperty("stabledropdown"));
    Assert.assertEquals(expstable, actstable);

    driverutils.clickelement(this.developerdocumentationutils.getproperty("zscriptemulatorbitcoinlink"));driverutils.focusmainbrowser();
    String actzscriptemulatorbitcoinlink = driverutils.gettext(this.developerdocumentationutils.getproperty("zscriptemulatorbitcoinlink"));
    Assert.assertEquals(expzscriptemulatorbitcoinlink, actzscriptemulatorbitcoinlink);

    driverutils.scrolltillelement(this.developerdocumentationutils.getproperty("onefoundinbitcoinlink"));driverutils.focusmainbrowser();
    String actonefoundinbitcoinlink = driverutils.gettext(this.developerdocumentationutils.getproperty("onefoundinbitcoinlink"));
    Assert.assertEquals(exponefoundinbitcoinlink, actonefoundinbitcoinlink);
  } 

}
