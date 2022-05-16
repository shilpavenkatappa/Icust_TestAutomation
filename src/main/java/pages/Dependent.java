package pages;

import java.awt.List;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class Dependent extends IcustSpecificMethods{
	public Dependent clickCustomerPrefixdd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.CustPrefixdd.Xpath")));
		return this;
		}
	
	public Dependent clickCustomerPrefix() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.CustPrefix.Xpath")));
		return this;
		}
	public Dependent enterFirstName() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.FirstName.Xpath")),props.getProperty("Firstname"));
		return this;
	}
	public Dependent enterLastName() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.LastName.Xpath")),props.getProperty("Lastname"));
		return this;
	}
	public Dependent clickGenderdd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.Genderdd.Xpath")));
		return this;
		}
	public Dependent clickGender() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.Gender.Xpath")));
		return this;
		}
	public Dependent selectDateofBirth() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("Dependent.DateofBirth.Xpath"));
		wait(2000);
		jsExecutor(datepickIcon);
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		java.util.List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
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
	public Dependent enterBirthPlace() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.BirthPlace.Xpath")),props.getProperty("BirthPlace"));
		return this;
	}
	public Dependent clickResidentStatusdd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.ResidentStatusdd.Xpath")));
		return this;
		}
	public Dependent clickResidentStatus() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.ResidentStatus.Xpath")));
		return this;
		}
	public Dependent clickCitizenshipBydd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.CitizenshipBydd.Xpath")));
		return this;
		}
	public Dependent clickCitizenshipBy() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.CitizenshipBy.Xpath")));
		return this;
		}
	public Dependent clickCountryofResidencedd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.CountryofResidencedd.Xpath")));
		return this;
		}
	public Dependent clickCountryofResidence() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.CountryofResidence.Xpath")));
		return this;
		}
	public Dependent enterOccupationType() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.OccupationType.Xpath")),props.getProperty("OccupationType"));
		return this;
	}
	public Dependent enterUniqueIdNumber() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.UniqueIdNumber.Xpath")),props.getProperty("UniqueIdNumber"));
		return this;
	}
	public Dependent clickIdTypedd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.IdTypedd.Xpath")));
		return this;
		}
	public Dependent clickIdType() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.IdType.Xpath")));
		return this;
		}
	public Dependent selectIdvalidTill() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("Dependent.IdvalidTill.Xpath"));
		wait(2000);
		jsExecutor(datepickIcon);
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		java.util.List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
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
	public Dependent enterAddressLine1() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.AddressLine1.Xpath")),props.getProperty("AddressLine1"));
		return this;
	}
	public Dependent enterAddressLine2() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.AddressLine2.Xpath")),props.getProperty("AddressLine2"));
		return this;
	}
	public Dependent enterResidenceType() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.ResidenceType.Xpath")),props.getProperty("ResidenceType"));
		return this;
	}
	public Dependent clickCountrydd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.Countrydd.Xpath")));
		return this;
		}
	public Dependent clickCountry() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.Country.Xpath")));
		return this;
		}
	public Dependent clickStatedd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.Statedd.Xpath")));
		return this;
		}
	
	public Dependent clickState() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.State.Xpath")));
		return this;
		}
	public Dependent clickCitydd() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.Citydd.Xpath")));
		return this;
		}
	public Dependent clickCity() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.City.Xpath")));
		return this;
		}
	public Dependent enterZipcode() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.Zipcode.Xpath")),props.getProperty("Zipcode"));
		return this;
	}
	public Dependent enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.MobileNumber.Xpath")),props.getProperty("MobileNumber"));
		return this;
	}
	public Dependent enterLandlineNumber() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.LandlineNumber.Xpath")),props.getProperty("LandlineNumber"));
		return this;
	}
	public Dependent enterEmail() {
		enterValue(locateElement("xpath", props.getProperty("Dependent.Email.Xpath")),props.getProperty("Email"));
		return this;
	}
	public Dependent clickSaveApplicant() {
		clickElement(locateElement("xpath", props.getProperty("Dependent.SaveApplicant.Xpath")));
		return this;
		}
	
	}
