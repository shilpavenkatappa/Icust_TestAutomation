package testcases;

import org.testng.annotations.Test;



import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class EditTransactionChargesMaintenanceTestCase extends IcustSpecificMethods{
	@Test
	public void runAddTransactionChargeMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickTransactionChargesMaintenance()
	.clickEdit()
	.editChargeDescription()
	.clickUpdateButton()
;
}
}
