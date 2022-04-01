package testcases;


import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustTellerDashboardSearchAndViewProfile extends IcustSpecificMethods{
	
	@Test
	public void IcustTellerDashboardSearchAndView(){
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickSearch()
		.enterName()
		.clickOnFirstSearchedResult();
		//.clickOnViewProfileIn360Dashboard();
		
}
}
