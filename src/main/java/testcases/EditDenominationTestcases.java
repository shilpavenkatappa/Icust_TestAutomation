package testcases;

import org.testng.annotations.Test;




import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class EditDenominationTestcases extends IcustSpecificMethods{
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickProfileIcon()
		.clickMaintenance()
		.clickDenominationMaintenance()
		.clickEdit()
		.editDenomCode()
		.editDenomDesc()
		.clickSave();
	}
		
		
	    

	}
