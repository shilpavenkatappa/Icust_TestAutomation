package testcases;

import org.testng.annotations.Test;


import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class EditVaultCurrencybalanceMaintenanceTestcases extends IcustSpecificMethods{
	@Test
	public void runEditVaultCurrencybalanceMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultCurrencybalanceMaintenance()
	.clickEdit()
	.editOpenbalnceinLCY()
	.editBalnceinACY()
	.clickSave();

}
}
