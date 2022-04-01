package pages;

import base.IcustSpecificMethods;

public class IcustKYCVerification extends IcustSpecificMethods{

	public IcustKYCVerification clickKYCBranchVerification() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.BranchVerification.Xpath")));
		wait(1000);
		return this;
	}
	
	public IcustKYCVerification clickKYCVideoVerification() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.VideoVerification.Xpath")));
		wait(1000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab1 clickBranchProceedButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.Proceed.Xpath")));
		wait(5000);
		return new IcustKYCBranchVerificationTab1();
	}
	
	public IcustKYCVideoVerificationTab1 clickVideoProceedButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.Proceed.Xpath")));
		wait(10000);
		return new IcustKYCVideoVerificationTab1();
	}
	
}
