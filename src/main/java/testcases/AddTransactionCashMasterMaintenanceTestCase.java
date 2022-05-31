package testcases;

import org.testng.annotations.Test;



import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class AddTransactionCashMasterMaintenanceTestCase extends IcustSpecificMethods{
	@Test
	public void runAddTransactionCashMasterMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickTransactionCashMasterMaintenance()
	.clickAddnew()
	.clickEntityCode()
	.selectEntityValue()
	.clickBankCode()
	.selectBankCode()
	.clickBranchCode()
	.selectBranchCode()
	.clickTillId()
	.selectTillId()
	.enterTransactionProduct()
	.enterTransactionReference()
	.enterAmount()
	.clickAccountCurrency()
	.selectAccountCurrency()
	.enterAccountBalance()
	.enterInstrument()
	.clickTransactionCurrency()
	.selectTransactionCurrency()
	.enterTransactionAmount()
	.clickOfsCurrency()
	.selectOfsCurrency()
	.enterOfsAmount()
	.clickTransactionDate()
	.selectTransactionDate()
	.enterForexRate()
	.enterForexNegotiationRate()
	.enterChargeAmount()
	.enterRemark()
	.clickSave();
	}
}
