package pages;
import base.ICUSTKIOSKMethods;
import base.IcustSpecificMethods;


public class IcustKioskLogin extends ICUSTKIOSKMethods{
	
	public IcustKioskLogin enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMobile_LoginPage.PhoneNumber.Xpath")),props.getProperty("PhoneNumber"));	
		return this;
	}
	
	public IcustKioskLogin clickContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile_LoginPage.Continue.Xpath")));
		wait(30000);
		return this;
	}
	
	public IcustKioskLogin clickNext() {
		wait(20000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_LoginPage.Next.Xpath")));
		wait(10000);
		return this;
	}
	public IcustKioskLogin clickSkip() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_LoginPage.fing_auth_skip")));
		wait(10000);
		return this;
	}

	
	
}
