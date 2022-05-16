package pages;

import base.IcustSpecificMethods;

public class IcustTellerDashboardSearchAndViewProfile extends IcustSpecificMethods{
	
	public IcustTellerDashboardSearchAndViewProfile enterName() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.enterName.Xpath")), props.getProperty("Profile_Name"));
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.clickProfileSearch.Xpath")));
		wait(5000);
		return this;

	}
	public IcustTellerDashboardSearchAndViewProfile clickOnFirstSearchedResult() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.clickOnFirstSearchedResult.Xpath")));
		wait(5000);
		return this;

	}
	
	public IcustTellerDashboardSearchAndViewProfile clickOnViewProfileIn360Dashboard() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.clickOnViewProfile.Xpath")));
		wait(8000);
		return this;

	}
	public IcustTellerDashboardSearchAndViewProfile enterAccountId() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.AccountId.Xpath")),props.getProperty("AccountId"));
		return new IcustTellerDashboardSearchAndViewProfile();
	}
	

}
