package pages;

import org.openqa.selenium.WebDriver;
import utils.driverutils;
import utils.pdf_utils;
import utils.propertiesutils;

public class research{ 
  WebDriver driver;
  propertiesutils researchutils = null;
  pdf_utils pdfutils = new pdf_utils();

    public research(){
      this.researchutils =  new propertiesutils("locators/research.properties");
    }

    public void research_home(){
    driverutils.clickelement(this.researchutils.getproperty("reSearch")); 
    }
    
    public void philosophy(){
    //Peer-to-peer PDF
    driverutils.clickelement(this.researchutils.getproperty("philosophy"));
    driverutils.clickelement(this.researchutils.getproperty("peer-to-peer_pdf")); 
    pdfutils.pdf_file();
    }

    public void economics(){
    // Economics Element
    driverutils.clickelement(this.researchutils.getproperty("economics"));
    driverutils.clickelement(this.researchutils.getproperty("balancePdf")); 
    pdfutils.pdf_file();
    }

    
    public void computer_science(){
      //This starts the Computer Science
      driverutils.clickelement(this.researchutils.getproperty("computerScince"));     
      driverutils.clickelement(this.researchutils.getproperty("randomReductionPdf"));pdfutils.computer_sciencepdf();
      driverutils.clickelement(this.researchutils.getproperty("transactionPdf"));pdfutils.computer_sciencepdf();
      driverutils.clickelement(this.researchutils.getproperty("merkle"));     
      driverutils.clickelement(this.researchutils.getproperty("mDocument"));pdfutils.pdf_formerkleandbitML();
      driverutils.clickelement(this.researchutils.getproperty("mNotebook"));driverutils.scrolldown();   
      driverutils.clickelement(this.researchutils.getproperty("bitMl"));     
      driverutils.clickelement(this.researchutils.getproperty("bitMlOverview"));    
      driverutils.clickelement(this.researchutils.getproperty("aCalculasPdf"));pdfutils.pdfForBitML();
      driverutils.clickelement(this.researchutils.getproperty("bitMlOverview")); 
      driverutils.clickelement(this.researchutils.getproperty("aCalculashere")); driverutils.backtotab();
      driverutils.clickelement(this.researchutils.getproperty("bitcoinCUPdf"));pdfutils.pdf_formerkleandbitML();
      driverutils.clickelement(this.researchutils.getproperty("bitMlOverview")); 
      driverutils.clickelement(this.researchutils.getproperty("bitcoinCUhere"));driverutils.backtotab();  
      }   

    }   
