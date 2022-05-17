package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustEditState extends IcustSpecificMethods{

	@Test
	public void runEditState()
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
