package pages;

import base.IcustSpecificMethods;

public class EditTransactionChargesMaintenance extends IcustSpecificMethods{
	
	public EditTransactionChargesMaintenance editChargeDescription() {
		enterValue(locateElement("xpath", props.getProperty("EditTransactionChargesMaintenance.ChargeDescription.Xpath")), props.getProperty("EditChargeDescription"));
		return this;
      }	
	public EditTransactionChargesMaintenance clickUpdateButton() {
		clickElement(locateElement("xpath", props.getProperty("EditTransactionChargesMaintenance.UpdateButton.Xpath")));
		return this;
      }	
	
	
}
