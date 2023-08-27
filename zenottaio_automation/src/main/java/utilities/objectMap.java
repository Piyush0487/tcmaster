package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;


public class objectMap {
    Properties properties;
    public static String elementname;


// This is Constructor methods accept Absolute path of an object map file and load it into memory.

public objectMap(String filepath){
    properties = new Properties();
    try{
        FileInputStream fileinputstream = new FileInputStream(filepath);
        properties.load(fileinputstream);
    } catch (IOException e){
        e.printStackTrace();
    }
}



public By getlocator(String elementname){
    String loctor = properties.getProperty(elementname);
    String loctortype = loctor.split("~")[0];
    String loctorvalue = loctor.split("~")[1];
    switch (loctortype.toUpperCase()){
        case "ID":
        return By.id(loctorvalue);
        case "NAME":
        return By.name(loctorvalue);
        case "CLASSNAME":
        return By.className(loctorvalue);
        case "XPATH":
        return By.xpath(loctorvalue);
    }
    
    return null;
    



// public By getlocator(String locatortype, String elementname){
//     switch (locatortype.toUpperCase()) {
//         case "ID":
//             return By.id(elementname);
//         case "NAME":
//             return By.name(elementname);
//         case "XPATH":
//         return By.xpath(elementname); 
//         }
//     return null;
// }
}
}
