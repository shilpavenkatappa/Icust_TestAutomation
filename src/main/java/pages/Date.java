package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class Date {

	public static RemoteWebDriver driver;
	public static String firstWindow, secondWindow;
	public void windowsHandling()
	{
		firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);
		System.out.println("***************************************");
		Set<String> windowHandles = driver.getWindowHandles(); // copy the data from set to list
		List<String> listHandles = new ArrayList<String>(windowHandles);
	 secondWindow = listHandles.get(1);
		//to switch from first to second window
		driver.switchTo().window(secondWindow);
		System.out.println(secondWindow);
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.get("http://192.168.0.14:8081/iCust-Teller/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
		wait.until(ExpectedConditions.titleContains("Session > Signin | Rumango"));
		driver.findElementByXPath("//input[@name='user_Id']").sendKeys("Vikas");
		driver.findElementByXPath("//input[@name='password']").sendKeys("Password@12");
		driver.findElementByXPath("//span[text()='Sign In']").click();
		wait.until(ExpectedConditions.titleContains("Rumango"));
		driver.findElementByXPath("//div[text()=' Create Deposit ']").click();
		Date d = new Date();
		d.windowsHandling();
		driver.findElementByXPath("//span[text()=' Add Details ']").click();
		WebElement cif = driver.findElementByXPath("//input[@name='cif']");
		cif.sendKeys("102385");
		cif.sendKeys(Keys.TAB);
		Thread.sleep(20000);
		WebElement datepickIcon = driver.findElementByXPath("(//button[@class='mat-focus-indicator mat-icon-button mat-button-base'])[2]");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", datepickIcon);
		Thread.sleep(2000);
		datepickIcon.click();
		List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
		for(WebElement ele:allDates)
		{			
			String date=ele.getText();
			if(date.equalsIgnoreCase("15"))
			{
				ele.click();
				break;
			}			
		}
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(firstWindow);
		Thread.sleep(2000);
		driver.close();
	}
}
