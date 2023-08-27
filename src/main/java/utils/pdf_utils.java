package utils;

import org.openqa.selenium.WebDriver;

public class pdf_utils {
    
     WebDriver driver;
     propertiesutils pdfsutils = null;

    public pdf_utils(){
        this.pdfsutils =  new propertiesutils("locators/research.properties");
      }
    
    public void pdf_file(){
      driverutils.scrolldown();
      driverutils.clickelement(this.pdfsutils.getproperty("list"));      
      driverutils.clickelement(this.pdfsutils.getproperty("page"));   
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));  
      //This is for iFramescroll down
      driverutils.iframe_scrolldown();
      //This is for scrollup 
      driverutils.iframe_scrollup();
      driverutils.clickelement(this.pdfsutils.getproperty("page3"));
      //opens dropdown and scroll middle
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));     
      driverutils.iframe_scrollmiddle();
      driverutils.clickelement(this.pdfsutils.getproperty("page25"));
      //for down
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));    
      driverutils.iframe_scrolldown();
      driverutils.clickelement(this.pdfsutils.getproperty("page40"));     
      driverutils.clickelement(this.pdfsutils.getproperty("leftPage"));   
      driverutils.clickelement(this.pdfsutils.getproperty("rightPage"));    
      driverutils.clickelement(this.pdfsutils.getproperty("downloadThePdf"));
      
    }

    public void computer_sciencepdf(){  
      driverutils.scrolldown(); 
      driverutils.clickelement(this.pdfsutils.getproperty("list")); 
      driverutils.clickelement(this.pdfsutils.getproperty("page"));    
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));    
      driverutils.clickelement(this.pdfsutils.getproperty("page2"));      
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));     
      driverutils.clickelement(this.pdfsutils.getproperty("page3"));     
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));     
      driverutils.clickelement(this.pdfsutils.getproperty("page4"));     
      driverutils.clickelement(this.pdfsutils.getproperty("leftPage"));    
      driverutils.clickelement(this.pdfsutils.getproperty("rightPage"));     
      driverutils.clickelement(this.pdfsutils.getproperty("downloadThePdf"));
      
    }

    public void pdf_formerkleandbitML(){ 
      driverutils.scrolldown();
      driverutils.clickelement(this.pdfsutils.getproperty("list"));  
      driverutils.clickelement(this.pdfsutils.getproperty("page"));     
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));
      driverutils.clickelement(this.pdfsutils.getproperty("page3")); 
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));
      driverutils.iframe_scrollmiddle();
      driverutils.iframe_scrollup();
      driverutils.clickelement(this.pdfsutils.getproperty("page10"));
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));  
      driverutils.iframe_scrollmiddle();   
      driverutils.clickelement(this.pdfsutils.getproperty("page18"));
      driverutils.clickelement(this.pdfsutils.getproperty("leftPage"));     
      driverutils.clickelement(this.pdfsutils.getproperty("rightPage"));   
      driverutils.clickelement(this.pdfsutils.getproperty("downloadThePdf"));
     
    }

    public void pdfForBitML(){  
      driverutils.scrolldown();
      driverutils.clickelement(this.pdfsutils.getproperty("list"));  
      driverutils.clickelement(this.pdfsutils.getproperty("page"));     
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));    
      //This is for iFramescroll down
      driverutils.iframe_scrolldown();
      //This is for scrollup 
      driverutils.iframe_scrollup();
      driverutils.clickelement(this.pdfsutils.getproperty("page3"));  
      //opens dropdown and scroll middle
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));     
      driverutils.iframe_scrollmiddle();
      driverutils.clickelement(this.pdfsutils.getproperty("page16")); 
      //for down
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));
      driverutils.iframe_scrolldown();
      driverutils.clickelement(this.pdfsutils.getproperty("page25"));
      driverutils.clickelement(this.pdfsutils.getproperty("dropdown"));
      driverutils.clickelement(this.pdfsutils.getproperty("leftPage"));     
      driverutils.clickelement(this.pdfsutils.getproperty("rightPage"));    
      driverutils.clickelement(this.pdfsutils.getproperty("downloadThePdf"));
     
    }

}

