package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustKYCBranchVerificationTab3 extends IcustSpecificMethods{

	public IcustKYCBranchVerificationTab3 selectBioName() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab3.BioName.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab3.Biometric.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab3 clickBioScan() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab3.Scan.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab3 clickFingerprintScan() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab3.FingerprintScan.Xpath")));
		wait(5000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab3 clickScanClose() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab3.ScanClose.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab3 clickFinishButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab3.Finish.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustTellerDashboard clickKYCDone() {
		WebElement  kycid = locateElement("xpath",props.getProperty("IcustKYCBranchVerificationTab3.KYCID.Xpath"));
		String id = kycid.getText();
		System.out.println(id);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab3.Done.Xpath")));
		wait(2000);
		driver.close();
		driver.switchTo().window(firstWindow);
		return new IcustTellerDashboard();
	}
}
