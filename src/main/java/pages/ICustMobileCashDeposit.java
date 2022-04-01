package pages;

import org.openqa.selenium.WebElement;

import base.IcustMobileSpecificMethods;

public class ICustMobileCashDeposit extends IcustMobileSpecificMethods{
	
	public ICustMobileCashDeposit clickCashDeposit() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile_DashBoard.CashDeposit")));
		wait(5000);
		return this;
	}
	
	public ICustMobileCashDeposit enterTransactionAmount() {
		WebElement tranAmount= locateElement("xpath", props.getProperty("IcustMobile_DashBoard.CashDeposit.TransactionAmount"));
		jsExecutor(tranAmount);
		enterValue(tranAmount,props.getProperty("CashDeposit.TransactionAmount"));
		wait(5000);
		return this;
	}
	
	public ICustMobileCashDeposit clickNext1() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.CashDeposit.Next")));
		wait(4000);
		return this;
	}
	
	public ICustMobileCashDeposit enterChequeNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustNewCustomerOnboarding1.KYCID.Xpath")), props.getProperty("KYCID"));
		wait(3000);
		return this;
	}
	
	public ICustMobileCashDeposit clickCalendar() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.Calendar")));
		wait(4000);
		return this;
	}
	
	public ICustMobileCashDeposit selectDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.Calendar.Date")));
		wait(4000);
		return this;
	}
	
	public ICustMobileCashDeposit clickDone1() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.Done")));
		wait(3000);
		return this;
	}
	
	public ICustMobileCashDeposit clickTime() {
		WebElement Time=locateElement("xpath", props.getProperty("IcustMobile.Time"));
		jsExecutor(Time);
		clickElement(Time);
		wait(3000);
		return this;
	}
	
	public ICustMobileCashDeposit clickTimeSlot() {
		WebElement TimeSlot=locateElement("xpath", props.getProperty("IcustMobile.TimeSlot"));
		clickElement(TimeSlot);
		wait(3000);
		return this;
	}
	
	public ICustMobileCashDeposit clickTimeSlotDone() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.TimeSlot.Done")));
		wait(3000);
		return this;
	}
	
	public ICustMobileCashDeposit clickTimeSlotClose() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.TimeSlot.Close")));
		wait(3000);
		return this;
	}
	
	public ICustMobileCashDeposit clickNext2() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.CashDeposit.TranNext")));
		wait(3000);
		return this;
	}
	
	public ICustMobileCashDeposit clickAddToWallet() {
		WebElement addWallet=locateElement("xpath", props.getProperty("IcustMobile.CashDeposit.AddtoWallet"));
		jsExecutor(addWallet);
		clickElement(addWallet);
		wait(3000);
		return this;
	}
}
