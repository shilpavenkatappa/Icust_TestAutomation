package testcases;

import org.testng.annotations.Test;

import pages.IcustTellerLogin;



public class EditVaultStatusMaintenanceTestcases {
	@Test
	public void runEditVaultStatusMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultStatusMaintenance()
	.clickEdit()
	.editUserid()
	.editTillvaultstatus()
	.clickSave();
	}

}
