package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KIOSKGenericWrapper {

	public static RemoteWebDriver driver;
	public static String firstWindow, secondWindow;

	public void lanuchBrowser(String browser, String url) {

		try {

			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "D:\\TestLeaf\\Workspace\\Maven\\ICUST_Automation\\drivers\\chromedriver.exe"
			 * );
			 * 
			 * 
			 * HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			 * chromePrefs.put("profile.default_content_settings.popups", 1); // 0,1,2
			 * 
			 * ChromeOptions options = new ChromeOptions(); options.addArguments(
			 * "--disable-web-security", "--ignore-certificate-errors",
			 * "--allow-running-insecure-content", "--allow-insecure-localhost",
			 * "--disable-gpu" );
			 * 
			 * //options.setExperimentalOption("prefs", chromePrefs); options.
			 * addArguments("user-data-dir=C:/Users/NPR1002/AppData/Local/Google/Chrome/User Data"
			 * );
			 * 
			 * driver = new ChromeDriver(options);
			 */

			
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			driver.get(url);
			webDriverWait("Session > Login | Rumango");
			wait(4000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public WebElement locateElement(String locator, String locatorValue) {
		switch (locator) {
		case "id":
			return driver.findElementById(locatorValue);
		case "xpath":
			return driver.findElementByXPath(locatorValue);
		case "class":
			return driver.findElementByClassName(locatorValue);
		case "linktext":
			return driver.findElementByLinkText(locatorValue);
		case "name":
			return driver.findElementByName(locatorValue);
		case "partialtext":
			return driver.findElementByPartialLinkText(locatorValue);
		case "cssselector":
			return driver.findElementByCssSelector(locatorValue);
		case "tagname":
			return driver.findElementByTagName(locatorValue);
		}
		return null;
	}

	public void enterValue(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clickElement(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clearElement(WebElement ele) {
		try {
			ele.clear();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void wait(int mSec) {
		try {
			Thread.sleep(mSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String webDriverWait(String str) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.titleContains(str));
		return str;
	}

	public void jsExecutor(WebElement ele) {
		try {
			wait(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			wait(3000);
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			wait(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void windowsHandling() {
		firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);
		System.out.println("***************************************");
		Set<String> windowHandles = driver.getWindowHandles(); // copy the data from set to list
		List<String> listHandles = new ArrayList<String>(windowHandles);
		secondWindow = listHandles.get(1);
		// to switch from first to second window
		driver.switchTo().window(secondWindow);
		System.out.println(secondWindow);
	}

	public static void setClipBoard(String file) {
		StringSelection obj = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}

	public static void uploadFile(String filePath) throws AWTException {
		setClipBoard(filePath);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

	public String str;

	public String readValue(WebElement ele) {
		try {
			str = ele.getText();
		} catch (Exception e) {
			System.out.println(e);
		}
		return str;
	}

}
