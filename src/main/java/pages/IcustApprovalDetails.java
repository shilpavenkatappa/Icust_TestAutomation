package pages;

import base.IcustSpecificMethods;

public class IcustApprovalDetails extends IcustSpecificMethods {

	public IcustApprovalDetails clickApprovalViewDetails() {
		wait(10000);
		clickElement(locateElement("xpath", props.getProperty("IcustApprovalDetails.ViewDetails.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustApprovalDetails clickEdit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustApprovalDetails.Edit.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustApprovalDetails selectRecommendationType() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("approvalDetails.userRecomendationDropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("approvalDetails.userRecomendationDropdown.recommendedForApproval.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustDigitalSigning clickNext() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("approvalDetails.next.Xpath")));
		wait(2000);
		return new IcustDigitalSigning();
	}
}
