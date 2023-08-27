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


public class references{
    
    WebDriver driver;
    public propertiesutils referencesutils = null;

    public references(){
        this.referencesutils=  new propertiesutils("locators/references.properties");
    }  

    public void zscriptopcodesreference() throws FileNotFoundException, IOException, ParseException, InterruptedException{

      JSONParser jsonparser = new JSONParser();
      JSONObject jsonObject;     
      Object obj = jsonparser.parse(new FileReader("/home/ubuntu/qualityassurance/zenottaio_automation/jsonfiles/references.json"));      
      jsonObject = (JSONObject) obj;
      JSONArray a = (JSONArray)jsonObject.get("references_module");
      JSONObject o = (JSONObject)a.get(0);

      String expdeveloper_documentation_top =(String) (o.get("developer_documentation_top"));
      String expreferences =(String) (o.get("references")); 
      String expzscript_opcodes_reference_side =(String) (o.get("zscript_opcodes_reference_side")); 
      String expflow_control =(String) (o.get("flow_control")); 
      String expnumeric =(String) (o.get("numeric")); 
      String expstack =(String) (o.get("stack")); 
      String expcrypto =(String) (o.get("crypto")); 
      String expbit_logic =(String) (o.get("bit_logic")); 
      String exppush_values =(String) (o.get("push_values")); 
      String expzscript_opcodes_reference =(String) (o.get("zscript_opcodes_reference")); 
         
      driverutils.clickelement(this.referencesutils.getproperty("developer_documentation_top"));
      String actdeveloper_documentation_top = driverutils.gettext(this.referencesutils.getproperty("developer_documentation_top"));
      Assert.assertEquals(expdeveloper_documentation_top, actdeveloper_documentation_top);  
     
      driverutils.clickelement(this.referencesutils.getproperty("references"));
      String actreferences = driverutils.gettext(this.referencesutils.getproperty("references"));
      Assert.assertEquals(expreferences, actreferences);

      driverutils.clickelement(this.referencesutils.getproperty("zscriptopscodereferences"));
      String actzscript_opcodes_reference_side = driverutils.gettext(this.referencesutils.getproperty("zscript_opcodes_reference_side"));
      Assert.assertEquals(expzscript_opcodes_reference_side, actzscript_opcodes_reference_side);

      driverutils.scrolltillelement(this.referencesutils.getproperty("flowcontrolToc"));
      String actflow_control = driverutils.gettext(this.referencesutils.getproperty("flow_control"));
      Assert.assertEquals(expflow_control, actflow_control);

      driverutils.scrolltillelement(this.referencesutils.getproperty("numericToc"));
      String actnumeric = driverutils.gettext(this.referencesutils.getproperty("numeric"));
      Assert.assertEquals(expnumeric, actnumeric);
      
      driverutils.scrolltillelement(this.referencesutils.getproperty("stackToc"));
      String actstack = driverutils.gettext(this.referencesutils.getproperty("stack"));
      Assert.assertEquals(expstack, actstack);

      driverutils.scrolltillelement(this.referencesutils.getproperty("cryptoToc"));
      String actcrypto = driverutils.gettext(this.referencesutils.getproperty("crypto"));
      Assert.assertEquals(expcrypto, actcrypto);
      
      driverutils.scrolltillelement(this.referencesutils.getproperty("bitlogicToc"));
      String actbit_logic = driverutils.gettext(this.referencesutils.getproperty("bit_logic"));
      Assert.assertEquals(expbit_logic, actbit_logic);
      
      driverutils.scrolltillelement(this.referencesutils.getproperty("pushvaluesToc"));
      String actpush_values = driverutils.gettext(this.referencesutils.getproperty("push_values"));
      Assert.assertEquals(exppush_values, actpush_values);
     
      driverutils.scrolltillelement(this.referencesutils.getproperty("zscriptopscodereferencesToc"));driverutils.windowscrollup(); 
      String actzscript_opcodes_reference = driverutils.gettext(this.referencesutils.getproperty("zscriptopscodereferencesToc"));
      Assert.assertEquals(expzscript_opcodes_reference, actzscript_opcodes_reference);

          // to tick the buttons
          for (int i = 1; i <= 48; i++) {
            driverutils.scrolltillelement(this.referencesutils.getproperty("coppybutton"));driverutils.windowscrolldown();
          }         
          // to unctick the buttons
          for (int i = 1; i <= 48; i++) {
            driverutils.scrolltillelement(this.referencesutils.getproperty("coppybuttonuntick")); driverutils.windowscrollup();
          }
    } 
}
