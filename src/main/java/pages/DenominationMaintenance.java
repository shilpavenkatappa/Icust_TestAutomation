package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.IcustSpecificMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DenominationMaintenance extends IcustSpecificMethods {
public AddDenomination clickAddnew(){
	clickElement(locateElement("xpath", props.getProperty("DenominationMaintenance.Addnew.Xpath")));
	return new AddDenomination();	
}
public EditDenomination clickEdit() {
	clickElement(locateElement("xpath", props.getProperty("DenominationMaintenance.Edit.Xpath")));
	return new EditDenomination();
}
}


