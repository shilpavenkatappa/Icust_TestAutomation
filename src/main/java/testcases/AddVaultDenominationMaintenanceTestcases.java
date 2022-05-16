package testcases;

import org.testng.annotations.Test;




import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class AddVaultDenominationMaintenanceTestcases extends IcustSpecificMethods{
	@Test
	public void runAddVaultDenominationMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultDenominationMaintenance()
	.clickAddnew()
	.clickEntitycodeDropdown()
	.clickVaultDenominationMaintenanceEntitycodeValue()
	.clickVaultDenominationMaintenanceBankcodeDropdown()
	.clickVaultDenominationMaintenanceBankcodeValue()
	.clickBranchCode()
	.clickBranchCodeValue()
	.clickTillId()
	.clickTillIdValue()
	.clickCurrency()
	.clickCurrencyValue()
	.enterDenominationCode()
	.enterUnits()
	.clickSave();
}
}
