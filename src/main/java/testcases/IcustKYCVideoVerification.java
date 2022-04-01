package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustKYCVideoVerification extends IcustSpecificMethods{
	
	@Test
	public void runKYCVideoVerification() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickKYCScreening()
		.clickKYCVideoVerification()
		.clickVideoProceedButton()
		.enterCIFNumber()
		.clickFetchButton()
		.clickNextButton()
		.selectDate()
		.selectTime()
		.clickFinish()
		.clickDone();
	}
}
