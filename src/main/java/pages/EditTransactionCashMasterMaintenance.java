package pages;

import base.IcustSpecificMethods;

public class EditTransactionCashMasterMaintenance extends IcustSpecificMethods{
	
	
	public EditTransactionCashMasterMaintenance editRemark() {
		enterValue(locateElement("xpath", props.getProperty("EditTransactionCashMasterMaintenance.editRemark.Xpath")), props.getProperty("EditRemark"));
		return this;
      }
	
	public EditTransactionCashMasterMaintenance clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditTransactionCashMasterMaintenance.clickSave.Xpath")));
		return this;
      }
}
