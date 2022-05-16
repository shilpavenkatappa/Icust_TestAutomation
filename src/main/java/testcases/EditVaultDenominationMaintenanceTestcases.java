package testcases;

import org.testng.annotations.Test;


import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class EditVaultDenominationMaintenanceTestcases extends IcustSpecificMethods{
	@Test
	public void runEditVaultDenominationMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultDenominationMaintenance()
	.clickEdit()
	.editDenominationCode()
	.editUnits()
	.clickSave();

}
}
