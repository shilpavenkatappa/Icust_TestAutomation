package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.IcustSpecificMethods;

public class IcustCorporateOtherInformation extends IcustSpecificMethods{

	public IcustCorporateOtherInformation selectOrganisationType() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.OrganisationTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectOrganisationType.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation selectTypeOfOwnership() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.TypeOfOwnershipDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectTypeOfOwnership.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation selectOtherInformationAddressType() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.AddressTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.OtherInformationAddressType.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation enterOtherInformationAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorAddress1.Xpath")), props.getProperty("RegistrationAddress1"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation enterOtherInformationAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DirectorAddress2.Xpath")), props.getProperty("RegistrationAddress2"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation selectOtherInformationCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CountryDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCountry.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation selectOtherInformationState() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.StateDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectState.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation selectOtherInformationCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.CityDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectCity.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation enterOtherInformationZipcode() {
		enterValue(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.OtherInformationZipCode.Xpath")), props.getProperty("RegistrationZipCode"));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation selectDocumentType() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.DocumentTypeDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboarding.SelectDocumentType.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustCorporateOtherInformation uploadDocument() throws AWTException {
		Actions action = new Actions(driver);
		WebElement browseFile = locateElement("xpath",
				props.getProperty("IcustCorporateCustomerOnboarding.BrowseDocumentName.Xpath"));
		action.moveToElement(browseFile).click().perform();
		wait(2000);
		uploadFile("D:\\icust\\Susmitha_Pan.png");
		wait(4000);
		return this;
	}
	
	public IcustCorporateOtherInformation clickCorporateFinish() {
		clickElement(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding4.Finish.Xpath")));
		wait(5000);
		return this;
	}
}
