package zenotta.io;

import org.testng.annotations.Test;
import Pages.research;
import Pages.testnet_sign_up;
import Pages.useful_links_;
import utils.configutils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.driverutils;

public class testplan{
    configutils configutils = new configutils();

    @BeforeTest
    public void opendriver(){
        driverutils.geturl(configutils.getUrl());
    }

    @Test
    public void signuptestnet(){
       testnet_sign_up testnetSignUp = new testnet_sign_up();
       testnetSignUp.signup();
    }

    @Test
    public void homeresearch(){
        research research = new research();
        research.research_home();
        research.philosophy();
        research.economics();
        research.computer_science();
    }

    @Test
    public void usefullinks(){ 
        useful_links_ usefullink = new useful_links_();
        usefullink.useful_links();
      }   

    @AfterTest
    public void closedriver(){
        driverutils.close();
    }
    
}