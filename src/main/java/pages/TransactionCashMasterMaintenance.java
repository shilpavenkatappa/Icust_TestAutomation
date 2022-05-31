package pages;

import base.IcustSpecificMethods;

public class TransactionCashMasterMaintenance extends IcustSpecificMethods{

	
	public AddTransactionCashMasterMaintenance clickAddnew(){
		clickElement(locateElement("xpath", props.getProperty("TransactionCashMasterMaintenance.Addnew.Xpath")));
		return new AddTransactionCashMasterMaintenance();	
	}
	public EditTransactionCashMasterMaintenance clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("TransactionCashMasterMaintenance.Edit.Xpath")));
		return new EditTransactionCashMasterMaintenance();
	}	


}
