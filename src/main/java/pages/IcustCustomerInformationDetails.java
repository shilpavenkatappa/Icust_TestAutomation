package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustCustomerInformationDetails extends IcustSpecificMethods{

	public IcustCustomerInformationDetails enterBirthPlace() {
		
		WebElement birthPlace =locateElement("xpath", props.getProperty("IcustCustomerInformation.BirthPlace.Xpath"));
		wait(2000);
		enterValue(birthPlace, "Place1");
		return this;
	}
	
	public IcustCustomerInformationDetails selectResidentType() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.ResidentTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.ResidentType.Xpath")));
			return this;
		}
	
public IcustCustomerInformationDetails selectResident() {
		
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.ResidentDropdown.Xpath")));
	wait(2000);
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.Resident.Xpath")));
		return this;
	}

public IcustCustomerInformationDetails selectCitizenship() {
	
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.CitizenDropdown.Xpath")));
	wait(2000);
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.Citizen.Xpath")));
		return this;
	}

public IcustCustomerInformationDetails enterOccupationType() {
	enterValue(locateElement("xpath", props.getProperty("IcustCustomerInformation.Occupation.Xpath")), props.getProperty("Occupation"));
	return this;
}
public IcustCustomerInformationDetails selectIDType() {
	
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.CitizenDropdown.Xpath")));
	wait(2000);
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.Citizen.Xpath")));
		return this;
	}

public IcustCustomerInformationDetails enterUniqueID() {
	WebElement uniqueId = locateElement("xpath", props.getProperty("IcustCustomerInformation.UniqueID.Xpath"));
	uniqueId.clear();
	enterValue(uniqueId, props.getProperty("CreateAccountUniqueID"));
	return this;
}

public IcustCustomerInformationDetails enterZipCode() {
	enterValue(locateElement("xpath", props.getProperty("IcustCustomerInformation.Zipcode.Xpath")), props.getProperty("CreateAccountZipCode"));
	return this;
}

public IcustCustomerInformationDetails selectIDValidDate() {
	WebElement datepickIcon =locateElement("xpath", props.getProperty("IcustCreateDeposit.ApplicationDate.Xpath"));
	wait(2000);
	jsExecutor(datepickIcon);
	wait(2000);
	clickElement(datepickIcon);
	wait(2000);
	List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
	for(WebElement ele:allDates)
	{			
		String date=ele.getText();
		if(date.equalsIgnoreCase("12"))
		{
			ele.click();
			break;
		}			
	}
	wait(2000);
	return this;
}

public IcustCustomerInformationDetails selectState() {
	
	WebElement state = locateElement("xpath", props.getProperty("IcustCustomerInformation.StateDropdown.Xpath"));
	wait(2000);
	clickElement(state);
	wait(2000);
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.State.Xpath")));
		return this;
	}

public IcustCustomerInformationDetails enterLandlineNumber() {
	wait(2000);
	enterValue(locateElement("xpath", props.getProperty("IcustCustomerInformation.LandlineNumber.Xpath")), props.getProperty("LandlineNumber"));
	return this;
}

public IcustMandateDetails clickSaveApplicant() {
	wait(3000);
	clickElement(locateElement("xpath", props.getProperty("IcustCustomerInformation.SaveApplicant.Xpath")));
	wait(5000);
		return new IcustMandateDetails();
	}
}
