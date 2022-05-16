package testcases;

import org.testng.annotations.Test;



import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class LoginTestcases extends IcustSpecificMethods{
	@Test
	public void runLoginTestcases() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton();
		
		
	}

}
