package pages;

import base.IcustSpecificMethods;

public class ICustCorporateBasicInformation  extends IcustSpecificMethods{

	public ICustCorporateBasicInformation enterCompanyName() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CompanyName.Xpath")), props.getProperty("CompanyName"));
		wait(2000);
		return this;
	}
	
	public ICustCorporateBasicInformation selectCategory() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CategoryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCategory.Xpath")));
		wait(2000);
		return this;
	}
	
	public ICustCorporateBasicInformation selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CountryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCountry.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateDirectorDetails clickNext1() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.ClickNext.Xpath")));
		wait(2000);
		return new IcustCorporateDirectorDetails();
	}
}
