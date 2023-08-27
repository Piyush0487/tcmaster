package zenotta.io;

import org.testng.annotations.Test;
import utils.configutils;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.driverutils;
import pages.*;

public class testplan {
  configutils configutils = new configutils();

  @BeforeTest
  public void opendriver() {
    driverutils.geturl(configutils.getUrl());
  }

  @Test
  public void homeresearch() {
    research research = new research();
    research.research_home();
    research.philosophy();
    research.economics();
    research.computer_science();
  }

  @Test
  public void usefullinks() throws FileNotFoundException, IOException, ParseException {
    useful_links_ usefullink = new useful_links_();
    usefullink.useful_links();
  }

  @Test
  public void signuptestnet() throws FileNotFoundException, IOException, ParseException {
    testnetsignup testnetSignUp = new testnetsignup();
    testnetSignUp.signup();
  }

  @Test
  public void zenottahome() throws FileNotFoundException, IOException, ParseException {
    zenottahome zenottahome = new zenottahome();
    zenottahome.zenottahomepage();
  }

  @Test
  public void footerpage() throws FileNotFoundException, IOException, ParseException {
    footer footerpage = new footer();
    footerpage.footer_page();
  }

  @Test
  public void topnavigation() throws FileNotFoundException, IOException, ParseException {
    topnavigation top_navigation = new topnavigation();
    top_navigation.topnavigationlinks();
  }

  @Test
  public void developer_documentation_homePage() throws FileNotFoundException, IOException, ParseException {
    developerdocumentation developer_documentation = new developerdocumentation();
    developer_documentation.developer_documentation_homePage();
  }

  @Test
  public void developer_documentation_gettingstarted() throws FileNotFoundException, IOException, ParseException {
    developerdocumentation developer_documentation = new developerdocumentation();
    developer_documentation.developer_documentation_gettingstarted();
  }

  @Test
  public void developer_documentation_tutorials() throws FileNotFoundException, IOException, ParseException {
    developerdocumentation developer_documentation = new developerdocumentation();
    developer_documentation.developer_documentation_tutorials_sendandreceivepayments();
    developer_documentation.developer_documentation_tutorials_receiptbasedpayments();
  }


  @Test
  public void contact_page() throws FileNotFoundException, IOException, ParseException  {
    contactus contactus = new contactus();
    contactus.contact_page();
    contactus.contactdev_page();
  }

  @Test
  public void privacypolicy() throws FileNotFoundException, IOException, ParseException {
    privacypolicy privacy_policy = new privacypolicy();
    privacy_policy.privacypolicypage();
  }

  @Test
  public void imprint() throws FileNotFoundException, IOException, ParseException {
    imprint imprint = new imprint();
    imprint.imprintpage();
  }
 
  @Test
  public void references()throws FileNotFoundException, IOException, ParseException, InterruptedException{
  references references = new references();
  references.zscriptopcodesreference();
  }
 
  @Test
  public void developerdocumentation_deep_dive_documentation() throws FileNotFoundException, IOException, ParseException, InterruptedException {
    developerdocumentation deepdivedocumentation = new developerdocumentation();
    deepdivedocumentation.developer_docimentation_deep_dive_documentation();
    deepdivedocumentation.deep_divedoc_computational_overview();
    deepdivedocumentation.deep_divedoc_zenotta_network_protocol_homepage();
    deepdivedocumentation.the_zenotta_network_protocol_nodetypes();
    deepdivedocumentation.the_zenotta_network_protocol_mempoolnode();
    deepdivedocumentation.the_zenotta_network_protocol_miner_node();
    deepdivedocumentation.the_zenotta_network_protocol_storage_node();
    deepdivedocumentation.the_zenotta_network_protocol_unicorns();
    deepdivedocumentation.the_zenotta_network_protocol_transactions();
    deepdivedocumentation.the_zenotta_network_protocol_blockminingprocess();
    deepdivedocumentation.the_zenotta_network_protocol_dualdoubleentrytransactions();
    deepdivedocumentation.the_zenotta_network_protocol_shuriken_auditing();
    deepdivedocumentation.developer_documentation_tools_zscriptemulator();
  }
  
  @AfterTest
  public void closedriver() {
    driverutils.close();
  }

}
