package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustTokenServicesCashDeposit extends IcustSpecificMethods{
	
	@Test
	public void TokenServicesCashDeposit() throws IOException, AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickServicesToggleButtonforCashDeposit()
		.clickCashDeposit()
		.enterAccountNumber()
		.clickFetchlink()
		.enterTransactionAmount()
		.selectAccountBranch() 
				/*
				 * .selectAccountBranch() .selectTransactionBranch()
				 */	
		.clickSaveButton();	
	}
}
