package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustPickAToken extends IcustSpecificMethods {
	
	public String transactionAmount;
	
	public IcustPickAToken clickViewButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.PickAToken.clickView.Xpath")));
		return this;
	}
	
	public IcustPickAToken readTransactionAmountValue() {
		 transactionAmount=  readValue(locateElement("xpath",props.getProperty("IcustTellerDashboard.PickAToken.readTransactionAmount.Xpath")));
		System.out.println(transactionAmount);
	    return this;
	}
	
	public IcustPickAToken fillDenomination() {
		wait(3000);
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.PickAToken.enterDenomination.Xpath")),props.getProperty("Amount"));
		wait(3000);
		return this;
	}
		
		public IcustPickAToken clickConfirm(){
			clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.PickAToken.clickConfirm.Xpath")));
			wait(3000);
				return this;	
		}
		public IcustPickAToken clickScan(){
			clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.PickAToken.clickScan.Xpath")));
			wait(2000);
			return this;
		}
		public IcustPickAToken clickDone(){
			clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.PickAToken.clickDone.Xpath")));
			wait(2000);
			return this;
		}

	}
	
	
	
	

	

	


