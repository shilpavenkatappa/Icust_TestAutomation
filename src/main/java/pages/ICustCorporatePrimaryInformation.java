package pages;

import base.IcustSpecificMethods;

public class ICustCorporatePrimaryInformation  extends IcustSpecificMethods{

	public ICustCorporatePrimaryInformation enterCompanyName() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CompanyName.Xpath")), props.getProperty("CompanyName"));
		wait(2000);
		return this;
	}
	
	public ICustCorporatePrimaryInformation selectCategory() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CategoryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCategory.Xpath")));
		wait(2000);
		return this;
	}
	
	public ICustCorporatePrimaryInformation selectCountry() {
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
