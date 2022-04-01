package pages;

import org.openqa.selenium.WebElement;
import base.IcustSpecificMethods;

public class IcustApplicationEnrichment extends IcustSpecificMethods {
	
	public IcustApplicationEnrichment summaryAddDetails() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("ApplicationEnrichment.summary.interestDetails.addDetails.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustApplicationEnrichment clickInterestNext() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustInterestDetails.next.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustApplicationEnrichment enterAmmount() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustChargeDetails.ammount.Xpath")), props.getProperty("Ammount"));
		wait(2000);
		return this;
	}
	
	public IcustApplicationEnrichment clickChargeNext() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustChargeDetails.next.Xpath")));
		wait(2000);
		return this;
	}

}
