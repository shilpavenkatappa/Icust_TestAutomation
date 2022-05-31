package testcases;

import org.testng.annotations.Test;



import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class AddTransactionChargesMaintenanceTestCase extends IcustSpecificMethods{
	
	@Test
	public void runAddTransactionChargeMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickTransactionChargesMaintenance()
	.clickAddnew()
	.enterChargeAmount()
	.clickChargeCurrency()
	.SelectChargeCurrency()
	.enterChargeDescription()
	.clickTransactionDate()
	.SelectTransactionDate()
	.enterTransactionReference()
	.ClickSaveButton();
}
}
