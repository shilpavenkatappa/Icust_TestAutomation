package pages;

import base.IcustSpecificMethods;

public class LoanAEChargeDetails extends IcustSpecificMethods{
	public LoanAEChargeDetails enterItchargeInterestRate() {
		enterValue(locateElement("xpath", props.getProperty("LoanAEChargeDetails.ItchargeInterestRate.Xpath")),props.getProperty("ItchargeInterestRate"));
		return this;
	}
	public LoanAEChargeDetails enterHandlingchargeInterestRate() {
		enterValue(locateElement("xpath", props.getProperty("LoanAEChargeDetails.HandlingchargeInterestRate.Xpath")),props.getProperty("HandlingchargeInterestRate"));
		return this;
	}
}
