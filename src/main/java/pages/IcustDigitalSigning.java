package pages;

import base.IcustSpecificMethods;

public class IcustDigitalSigning extends IcustSpecificMethods {

	public IcustDigitalSigning clickDigitalSignAddDetails() {
		wait(15000);
		clickElement(locateElement("xpath", props.getProperty("digitalSigning.addDetails.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustDigitalSigning clickSignNow() {
		wait(15000);
		clickElement(locateElement("xpath", props.getProperty("digitalSigning.signNow.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustDigitalSigning enterSignature() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("digitalSigning.signNow.signCanvas.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustDigitalSigning clickDone() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("digitalSigning.signNow.done.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("digitalSigning.signNow.done.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustDigitalSigning ClickFinishButton() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("digitalSigning.finish.Xpath")));
		wait(2000);
		return this;
	}
}
