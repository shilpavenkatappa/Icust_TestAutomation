package testcases;

import org.testng.annotations.Test;




import pages.IcustTellerLogin;
import base.IcustSpecificMethods;


	public class AddVaultCurrencyDenominationTestcases extends IcustSpecificMethods{
		@Test
		public void runAddVaultCurrencyDenominationTestcases() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickProfileIcon()
		.clickMaintenance()
		.clickVaultCurrencyMaintenance()
		.clickAddNew()
		.enterDenominationcode()
		.enterOpenunitsbalance()
		.enterUnitsbalance()
		.clickSave();

}
	}
