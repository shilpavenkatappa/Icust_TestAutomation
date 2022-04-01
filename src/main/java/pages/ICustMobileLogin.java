package pages;

import base.IcustMobileSpecificMethods;

public class ICustMobileLogin extends IcustMobileSpecificMethods{

	public ICustMobileLogin enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMobile_PhoneNumber")),props.getProperty("MobileNumber"));	
		wait(5000);
		return this;
	}
	
	public ICustMobileLogin clickContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile_Login.Continue")));
		wait(5000);
		return this;
	}
	
	public ICustMobileCashDeposit clickCashDepositLogin() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile_Login")));
		wait(4000);
		return new ICustMobileCashDeposit();
	}
	
	public IcustMobileChequeWithdrawal clickChequeWithdrawalLogin() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile_Login")));
		wait(4000);
		return new IcustMobileChequeWithdrawal();
	}
}
