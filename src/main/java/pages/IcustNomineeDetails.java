package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustNomineeDetails extends IcustSpecificMethods{

	public IcustNomineeDetails selectPrefix() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.PrefixDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.Prefix.Xpath")));
		return this;
	}
	
	public IcustNomineeDetails enterFirstName() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.FirstName.Xpath")), props.getProperty("FirstName"));
		return this;
	}
	
	public IcustNomineeDetails enterLastName() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.LastName.Xpath")), props.getProperty("LastName"));
		return this;
	}
	
	public IcustNomineeDetails selectRelationshipType() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.RelationDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.Relationship.Xpath")));
		return this;
	}
	
	public IcustNomineeDetails selectDateOfBirth() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("IcustNomineeDetails.DateOfBirth.Xpath"));
		wait(2000);
		jsExecutor(datepickIcon);
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
		for(WebElement ele:allDates)
		{			
			String date=ele.getText();
			if(date.equalsIgnoreCase("10"))
			{
				ele.click();
				break;
			}			
		}
		wait(2000);
		return this;
	}
	
	public IcustNomineeDetails clickAddress() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.Address.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustNomineeDetails clickAddressToggle() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.AddressToggle.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustNomineeDetails enterStreet() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.Street.Xpath")), props.getProperty("Street"));
		return this;
	}
	
	public IcustNomineeDetails enterBuilding() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.Building.Xpath")), props.getProperty("Building"));
		return this;
	}
	
	public IcustNomineeDetails enterLocality() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.Locality.Xpath")), props.getProperty("Locality"));
		return this;
	}
	
	public IcustNomineeDetails selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.CountryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.Country.Xpath")));
		return this;
	}
	
	public IcustNomineeDetails selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.StateDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.State.Xpath")));
		return this;
	}
	
	public IcustNomineeDetails selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.CityDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.City.Xpath")));
		return this;
	}
	
	public IcustNomineeDetails enterZipCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.Zipcode.Xpath")), props.getProperty("Zipcode"));
		return this;
	}
	
	public IcustNomineeDetails clickContactInfm() {
		clickElement(locateElement("xpath", props.getProperty("IcustNomineeDetails.ContactInfm.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustNomineeDetails enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.MobileNumber.Xpath")), props.getProperty("NomineeMobNum"));
		wait(2000);
		return this;
	}
	
	public IcustNomineeDetails enterEmail() {
		enterValue(locateElement("xpath", props.getProperty("IcustNomineeDetails.EmailAddress.Xpath")), props.getProperty("NomineeEmailId"));
		return this;
	}
	
	public IcustFinancialDetails clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("GenericWrapper.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustFinancialDetails();
	}
}
