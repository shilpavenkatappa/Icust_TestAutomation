package testcases;

import org.testng.annotations.Test;




import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class EditVaultCurrencyDenominationTestcases extends IcustSpecificMethods {
	@Test
	public void runEditVaultCurrencyDenominationTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultCurrencyMaintenance()
	.clickEdit()
	.enterDenominationcode()
	.clickUpdate();
	}

}
