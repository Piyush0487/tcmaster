package Pages;

import org.openqa.selenium.WebDriver;
import utils.driverutils;
import utils.pdfutils;
import utils.propertiesutils;

public class research{ 
  WebDriver driver;
  propertiesutils researchutils = null;
  pdfutils pdf_utils = new pdfutils();

    public research(){
      this.researchutils =  new propertiesutils("locators/research.properties");
        
    }

    public void research_home(){
    driverutils.clickElement(this.researchutils.getproperty("reSearch")); 
    }
    
    public void philosophy(){
    //Peer-to-peer PDF
    driverutils.clickElement(this.researchutils.getproperty("philosophy"));
    driverutils.clickElement(this.researchutils.getproperty("peer-to-peer_pdf")); 
    pdf_utils.pdf_file();
    }

    public void economics(){
    // Economics Element
    driverutils.clickElement(this.researchutils.getproperty("economics"));
    driverutils.clickElement(this.researchutils.getproperty("balancePdf")); 
    pdf_utils.pdf_file();
    }

    public void computer_science(){
    //This starts the Computer Science
    driverutils.clickElement(this.researchutils.getproperty("computerScince"));     
    driverutils.clickElement(this.researchutils.getproperty("randomReductionPdf"));    
    pdf_utils.computer_sciencepdf();
    driverutils.clickElement(this.researchutils.getproperty("transactionPdf"));   
    pdf_utils.computer_sciencepdf();
    driverutils.clickElement(this.researchutils.getproperty("merkle"));     
    driverutils.clickElement(this.researchutils.getproperty("mDocument"));   
    pdf_utils.pdf_formerkleandbitML();
    driverutils.clickElement(this.researchutils.getproperty("mNotebook"));  
    driverutils.scrolldown();   
    driverutils.clickElement(this.researchutils.getproperty("bitMl"));     
    driverutils.clickElement(this.researchutils.getproperty("bitMlOverview"));    
    driverutils.clickElement(this.researchutils.getproperty("aCalculasPdf")); 
    pdf_utils.pdfForBitML();
    driverutils.clickElement(this.researchutils.getproperty("bitMlOverview")); 
    driverutils.clickElement(this.researchutils.getproperty("aCalculashere")); 
    driverutils.backToTab();
    driverutils.clickElement(this.researchutils.getproperty("bitcoinCUPdf")); 
    pdf_utils.pdf_formerkleandbitML();
    driverutils.clickElement(this.researchutils.getproperty("bitMlOverview")); 
    driverutils.clickElement(this.researchutils.getproperty("bitcoinCUhere"));    
    driverutils.backToTab();  
    }
    
}