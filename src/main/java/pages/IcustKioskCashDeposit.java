package pages;
import base.ICUSTKIOSKMethods;
import base.IcustSpecificMethods;
public class IcustKioskCashDeposit extends ICUSTKIOSKMethods {
	
	
	public IcustKioskCashDeposit enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMobile_LoginPage.PhoneNumber.Xpath")),props.getProperty("PhoneNumber"));
		wait(2000);
		return this;
	}
	
	public IcustKioskCashDeposit clickLoginContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile_LoginPage.Continue.Xpath")));
		wait(30000);
		return this;
	}
	
	public IcustKioskCashDeposit clickNext() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_LoginPage.Next.Xpath")));
		wait(10000);
		return this;
	}
	public IcustKioskCashDeposit clickSkip() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_LoginPage.fing_auth_skip")));
		wait(10000);
		return this;
	}
	
	public IcustKioskCashDeposit selectDeposit() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_DashBoard.Cash_Deposit")));
		return this;
	}
	public IcustKioskCashDeposit clickDashboardContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_DashBoard.Continue")));
		wait(1000);
		return this;
	}
	
	public IcustKioskCashDeposit clickSavings() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_type_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_type_Dropdown_Savings")));
		return this;
	}
	
	public IcustKioskCashDeposit selectAccounNumber() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_Number_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_Number_Dropdown_77306")));
		return this;
	}
	
	public IcustKioskCashDeposit selectTransactionBranch() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transaction_Branch_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transaction_Branch_Bangalore")));
		return this;
	}
	public IcustKioskCashDeposit enterAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transaction_Amount")),props.getProperty("Amount"));	
		return this;
	}
	public IcustKioskCashDeposit selectDenomination() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Denomination100")),props.getProperty("Denomination"));
		wait(2000);
		return this;
	}
	
	public IcustKioskCashDeposit completeTransaction() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transcontinue")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.continue")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Logout")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Logout_confirmation_Yes")));
		wait(1000);
		return this;
	}

}
