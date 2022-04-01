package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustCorporateDirectorDetails extends IcustSpecificMethods{
	
	public IcustCorporateDirectorDetails enterCIFNumber() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CIFNumberToggle.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectPrefix() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.PrefixDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectPrefix.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterFirstName() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.FirstName.Xpath")), props.getProperty("CorporateFirstName"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterLastName() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.LastName.Xpath")), props.getProperty("CorporateLastName"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectGender() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.GenderDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectGender.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectDateOfBirth() {
		WebElement dob =locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectDateOfBirth.Xpath"));
		wait(2000);
		clickElement(dob);
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectDateOfBirth.Date.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectPlaceOfBirth() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.PlaceOfBirthDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectPlaceOfBirth.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectResidenceType() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ResidenceTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectResidenceType.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectCitizenshipBy() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CitizenshipDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCitizenship.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectCountryOfResidence() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CountryOfResidenceipDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCountryOfResidence.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectIDType() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.IDTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectIDType.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterUniqueIdNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.IDNumber.Xpath")), props.getProperty("UniqueIDNumber"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectValidTill() {
		WebElement datepickIcon =locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectValidTill.Xpath"));
		wait(2000);
		clickElement(datepickIcon);
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectValidTill.Date.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterDirectorAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorAddress1.Xpath")), props.getProperty("DirectorAddress1"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterDirectorAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorAddress2.Xpath")), props.getProperty("DirectorAddress2"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CountryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCountry.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.StateDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectState.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CityDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCity.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterZipcode() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorZipCode.Xpath")), props.getProperty("DirectorZipCode"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectAddressType() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.AddressTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectAddressType.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorMobileNumber.Xpath")), props.getProperty("DirectorMobileNumber"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterLandlineNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorLandlineNumber.Xpath")), props.getProperty("DirectorLandlineNumber"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterEmail() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorEmail.Xpath")), props.getProperty("DirectorEmail"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails enterTaxid() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorTaxId.Xpath")), props.getProperty("DirectorTaxId"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails selectCountryOfIssue() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CountryOfIssueDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCountryOfIssue.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails clickSaveDirector() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ClickSaveDirector.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation clickNext2() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ClickNext.Xpath")));
		wait(2000);
		return new IcustCorporateContactInformation();
	}
}
