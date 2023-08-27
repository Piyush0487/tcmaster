package utils;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverutils {
	static WebDriver driver = null;
	static configutils configUtils = new configutils();
	propertiesutils putils = new propertiesutils("config.properties");

	public static WebDriver getdriver() {
		if (driver == null) {
			if (configUtils.getbrowsertype().equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
		}
		return driver;
	}

	public static void close() {
		driver.quit();
	}

	public static By getelement(String eleStr) {
		String eleLocatorType = eleStr.split("-->")[0];
		String eleLocatorValue = eleStr.split("-->")[1];

		if (eleLocatorType.equalsIgnoreCase("xpath")) {
			return By.xpath(eleLocatorValue);
		} else if (eleLocatorType.equalsIgnoreCase("id")) {
			return By.id(eleLocatorValue);
		}
		return null;
	}

	public static String sendkeys(String eleStr, String textToInput) {
		WebDriverWait wait = new WebDriverWait(getdriver(), configUtils.getdefault_timeout());
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(getelement(eleStr)));
		ele.sendKeys(textToInput);
		return textToInput;
	}

	public static void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Window in Middle
		js.executeScript("window.scrollBy(0,15800)");
		// Window down
		js.executeScript("window.scrollBy(0,50000)");
		// Window Up
		js.executeScript("window.scrollBy(0,-59999)");
	}

	public static void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,15800)");
		js.executeScript("window.scrollBy(0,-59999)");
	}

	public static void iframe_scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('div.PdfViewer_dropdownMenu__3bvsh.dropdown-menu.show').scrollTop=3000");
	}

	public static void iframe_scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('div.PdfViewer_dropdownMenu__3bvsh.dropdown-menu.show').scrollTop=0");
	}

	public static void iframe_scrollmiddle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('div.PdfViewer_dropdownMenu__3bvsh.dropdown-menu.show').scrollTop=500");
	}

	public static void backtotab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		{
			driver.switchTo().window(tab.get(1));
			js.executeScript("window.close()");
			driver.switchTo().window(tab.get(0));
		}
	}

	public static void geturl(String url) {
		getdriver().get(url);
	}

	public static void focusmainbrowser() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		{
			driver.switchTo().window(tab.get(1));
			js.executeScript("window.close()");
			driver.switchTo().window(tab.get(0));
		}
	}

	public static void backbrowser() {
		driver.navigate().back();
	}

	public static void backtothepage(){
		driver.navigate().back();
	}

	public static void windowscrolldown(){
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,70000)"); 
	}

	public static void windowscrollmiddle(){
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,800)");
	}

	public static void windowscrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,-70000)"); 
	}

	public static void clickelement(String eleStr) {
		WebDriverWait wait = new WebDriverWait(getdriver(), configUtils.getdefault_timeout());
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(getelement(eleStr)));
		ele.click();		
	}

	public static void scrolltillelement(String eleStr) {
		WebDriverWait wait = new WebDriverWait(getdriver(), configUtils.getdefault_timeout());
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(getelement(eleStr)));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
	}

	public static String gettext(String eleStr) {
		WebDriverWait wait = new WebDriverWait(getdriver(), configUtils.getdefault_timeout());
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(getelement(eleStr)));
		String gettext = ele.getText();
		return gettext;
	}

    // public static WebElement getCssValue(String eleStr) {
	// 	WebDriverWait wait = new WebDriverWait(getdriver(), configUtils.getdefault_timeout());
	// 	WebElement getCssValue = wait.until(ExpectedConditions.elementToBeClickable(getelement(eleStr)));
    //     return getCssValue;
    // }

    public static WebElement getCssValue(String eleStr) {
		WebDriverWait wait = new WebDriverWait(getdriver(), configUtils.getdefault_timeout());
		WebElement getCssValue = wait.until(ExpectedConditions.elementToBeClickable(getelement(eleStr)));
        return getCssValue;
    }
}
