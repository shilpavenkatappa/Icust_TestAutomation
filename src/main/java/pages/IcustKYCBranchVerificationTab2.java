package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.IcustSpecificMethods;

public class IcustKYCBranchVerificationTab2 extends IcustSpecificMethods{

	public IcustKYCBranchVerificationTab2 selectDocType() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Dopdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab2.DocType.Xpath")));
		return this;
	}
	
	public IcustKYCBranchVerificationTab2 uploadFrontSide() throws AWTException {
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",
				props.getProperty("IcustKYCBranchVerificationTab2.FrontSideUpload.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("D:\\icust\\JayaAadhar_Frontside.jpg");
		wait(12000);
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab2.AcceptConfirmation.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab2 clickAddNew() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab2.AddNew.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab2 uploadBackSide() throws AWTException {
		Actions action = new Actions(driver);
		WebElement chooseFile = locateElement("xpath",
				props.getProperty("IcustKYCBranchVerificationTab2.BackSideUpload.Xpath"));
		action.moveToElement(chooseFile).click().perform();
		wait(2000);
		uploadFile("D:\\icust\\JayaAadhar_Backside.JPEG");
		wait(12000);
		return this;
	}
	
	public IcustKYCBranchVerificationTab3 clickNext() {
		WebElement nextButton =locateElement("xpath", props.getProperty("IcustKYCBranchVerificationTab1.Next.Xpath"));
		jsExecutor(nextButton);
		clickElement(nextButton);
		wait(2000);
		return  new IcustKYCBranchVerificationTab3();
	}
}
