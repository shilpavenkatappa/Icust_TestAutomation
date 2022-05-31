package pages;

import base.IcustSpecificMethods;

public class TransactionChargesMaintenance extends IcustSpecificMethods{
	
	
	public AddTransactionChargesMaintenance clickAddnew(){
		clickElement(locateElement("xpath", props.getProperty("TransactionChargesMaintenance.Addnew.Xpath")));
		return new AddTransactionChargesMaintenance();	
	}
	public EditTransactionChargesMaintenance clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("TransactionChargesMaintenance.Edit.Xpath")));
		return new EditTransactionChargesMaintenance();
	}	


}
