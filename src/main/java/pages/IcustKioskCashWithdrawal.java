package pages;
import base.ICUSTKIOSKMethods;


public class IcustKioskCashWithdrawal extends ICUSTKIOSKMethods{

	public IcustKioskCashWithdrawal enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMobile_LoginPage.PhoneNumber.Xpath")),props.getProperty("PhoneNumber"));	
		return this;
	}
	
	public IcustKioskCashWithdrawal clickLoginContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile_LoginPage.Continue.Xpath")));
		wait(15000);
		return this;
	}
	
	public IcustKioskCashWithdrawal clickNext() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_LoginPage.Next.Xpath")));
		wait(10000);
		return this;
	}
	public IcustKioskCashWithdrawal clickSkip() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_LoginPage.fing_auth_skip")));
		wait(10000);
		return this;
	}
	
	public IcustKioskCashWithdrawal selectWithdraw() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_DashBoard.Cash_Withdrawal")));
		return this;
	}
	public IcustKioskCashWithdrawal clickDashboardContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_DashBoard.Continue")));
		wait(2000);
		return this;
	}
	
	public IcustKioskCashWithdrawal clickSavings() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_type_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_type_Dropdown_Savings")));
		return this;
	}
	
	public IcustKioskCashWithdrawal selectAccounNumber() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_Number_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Account_Number_Dropdown_77306")));
		return this;
	}
	
	public IcustKioskCashWithdrawal selectTransactionBranch() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transaction_Branch_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transaction_Branch_Bangalore")));
		return this;
	}
	public IcustKioskCashWithdrawal enterAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transaction_Amount")),props.getProperty("Amount"));	
		return this;
	}
	public IcustKioskCashWithdrawal selectDenomination() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Denomination100")),props.getProperty("Denomination"));	
		return this;
	}
	
	public IcustKioskCashWithdrawal completeTransaction() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Transcontinue")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.continue")));
		wait(10000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Logout")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CashWithdraw.Logout_confirmation_Yes")));
		wait(1000);
		return this;
	}

	
	
	
	
}
