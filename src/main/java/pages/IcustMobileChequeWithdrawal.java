package pages;

import org.openqa.selenium.WebElement;

import base.IcustMobileSpecificMethods;

public class IcustMobileChequeWithdrawal extends IcustMobileSpecificMethods{
	
	public IcustMobileChequeWithdrawal clickChequeWithdrawal() {
		WebElement withdrawal = locateElement("xpath", props.getProperty("IcustMobile_DashBoard.ChequeWithdrawal"));
		jsExecutor(withdrawal);
		wait(2000);
		clickElement(withdrawal);
		wait(5000);
		return new IcustMobileChequeWithdrawal();
	}
	
	public IcustMobileChequeWithdrawal enterTransactionAmount() {
		WebElement tranAmount= locateElement("xpath", props.getProperty("IcustMobile_DashBoard.CashDeposit.TransactionAmount"));
		jsExecutor(tranAmount);
		enterValue(tranAmount,props.getProperty("CashDeposit.TransactionAmount"));
		wait(5000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal enterChequeNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMobile.ChequeWithdrawal.ChequeNumber")), props.getProperty("ChequeNumber"));
		wait(10000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickNext1(){
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.ChequeWithdrawal.Next")));
		wait(4000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickCalendar() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.Calendar")));
		wait(4000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal selectDate() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.Calendar.Date")));
		wait(4000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickDone1() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.Done")));
		wait(3000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickTime() {
		WebElement Time=locateElement("xpath", props.getProperty("IcustMobile.Time"));
		jsExecutor(Time);
		clickElement(Time);
		wait(3000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickTimeSlot() {
		WebElement TimeSlot=locateElement("xpath", props.getProperty("IcustMobile.TimeSlot"));
		clickElement(TimeSlot);
		wait(3000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickTimeSlotDone() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.TimeSlot.Done")));
		wait(3000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickTimeSlotClose() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.TimeSlot.Close")));
		wait(3000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickNext2() {
		clickElement(locateElement("xpath", props.getProperty("IcustMobile.CashDeposit.TranNext")));
		wait(3000);
		return this;
	}
	
	public IcustMobileChequeWithdrawal clickAddToWallet() {
		WebElement addWallet=locateElement("xpath", props.getProperty("IcustMobile.CashDeposit.AddtoWallet"));
		jsExecutor(addWallet);
		clickElement(addWallet);
		wait(3000);
		return this;
	}

}
