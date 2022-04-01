package pages;

import base.IcustSpecificMethods;

public class IcustCorporateContactInformation extends IcustSpecificMethods{
	
	public IcustCorporateContactInformation selectContactAddressType() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.AddressTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ContactSelectAddressType.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation enterContactAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorAddress1.Xpath")), props.getProperty("DirectorAddress1"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation enterContactAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorAddress2.Xpath")), props.getProperty("DirectorAddress2"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation selectContactCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CountryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCountry.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation selectContactState() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.StateDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectState.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation selectContactCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CityDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCity.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation enterContactZipcode() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorZipCode.Xpath")), props.getProperty("DirectorZipCode"));
		wait(2000);
		return this;
	}

	public IcustCorporateContactInformation enterContactEmail() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ContactEmail.Xpath")), props.getProperty("ContactEmail"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateContactInformation enterContactMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ContactMobileNumber.Xpath")), props.getProperty("ContactMobileNumber"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateProofOfIdentity clickNext3() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ClickNext.Xpath")));
		wait(2000);
		return new IcustCorporateProofOfIdentity();
	}
}
