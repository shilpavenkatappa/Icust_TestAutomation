package pages;

import base.IcustSpecificMethods;

public class IcustInterestDetails extends IcustSpecificMethods{
	public IcustInterestDetails clickInterestAddDetails() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustInterestDetails.addDetails.Xpath")));
		wait(2000);
		return this;
	}
	public IcustChargeDetails clickNext() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustInterestDetails.next.Xpath")));
		wait(2000);
		return new IcustChargeDetails();
	}


}
