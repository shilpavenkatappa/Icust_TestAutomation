package pages;

import base.IcustSpecificMethods;

public class IcustChargeDetails extends IcustSpecificMethods {

	public IcustChargeDetails enterAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustChargeDetails.Amount.Xpath")), props.getProperty("ChargeAmount"));
		wait(1000);
		return this;
	}
	
	public IcustApplicationAssesment clickNext() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustChargeDetails.Next.Xpath")));
		wait(2000);
		return new IcustApplicationAssesment();
	}
	
}
