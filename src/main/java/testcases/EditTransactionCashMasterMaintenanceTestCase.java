package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class EditTransactionCashMasterMaintenanceTestCase extends IcustSpecificMethods{
	@Test
	public void runAddTransactionCashMasterMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickTransactionCashMasterMaintenance()
	.clickEdit()
	.editRemark()
	.clickSave();
}
}