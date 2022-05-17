package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustAddNewState extends IcustSpecificMethods{

	@Test
	public void runAddNewState()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectMaintenance()
		.enterStateCode()
		.enterStateCode2()
		.enterStateName()
		.enterStateNumericCode()
		.enterRecordStatus()
		.selectSave();
	}
}
