package testcases;

import org.testng.annotations.Test;

import pages.IcustLogin;


import base.IcustSpecificMethods;

public class LoginTestcases extends IcustSpecificMethods{
	@Test
	public void runLoginTestcases() {
		IcustLogin login= new IcustLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton();
		
		
	}

}
