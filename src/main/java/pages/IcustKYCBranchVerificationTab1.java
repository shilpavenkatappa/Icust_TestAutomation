package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustKYCBranchVerificationTab1 extends IcustSpecificMethods{

	public IcustKYCBranchVerificationTab1 selectPrefix() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Dopdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Prefix.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 enterFirstName() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.FirstName.Xpath")), props.getProperty("KYC_FirstName"));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 enterLastName() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.LastName.Xpath")), props.getProperty("KYC_LastName"));
		return this;
	}
	public IcustKYCBranchVerificationTab1 enterDateOfBirth() {
		//enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.DOB.Xpath")), props.getProperty("KYC_DOB"));
		WebElement datepickIcon =driver.findElementByXPath("//button[@aria-label='Open calendar']");
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
		for(WebElement ele:allDates)
		{			
			String date=ele.getText();
			if(date.equalsIgnoreCase("11"))
			{
				ele.click();
				break;
			}			
		}
		wait(2000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 selectMaritalStatus() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.MaritalStatus.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 selectGender() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Gender.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 selectNationality() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Nationality.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 enterEmailAddress() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Email.Xpath")), props.getProperty("KYC_EmailAddress"));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.MobileNo.Xpath")), props.getProperty("KYC_MobileNumber"));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 enterAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Address1.Xpath")), props.getProperty("KYC_Address1"));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 enterAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Address2.Xpath")), props.getProperty("KYC_Address2"));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 selectResidence() {
		WebElement residenceType =locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Dopdown.Xpath"));
		jsExecutor(residenceType);
		clickElement(residenceType);
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Residence.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Country.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.StateDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.State.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.CityDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.City.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 enterZipcode() {
		enterValue(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Zipcode.Xpath")), props.getProperty("KYC_ZipCode"));
		return this;
	}
	
	public IcustKYCBranchVerificationTab2 clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustKYCBranchVerificationTab2();
	}
}
