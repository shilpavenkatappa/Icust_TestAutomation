package pages;

import base.IcustSpecificMethods;

public class LoanCreditRatingDetails extends IcustSpecificMethods{
	public LoanCreditRatingDetails clickScore() {
		clickElement(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.Score.Xpath")));
		return this;
		}
	public LoanCreditRatingDetails clickSelectAgencydd() {
		clickElement(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.SelectAgencydd.Xpath")));
		return this;
		}
	public LoanCreditRatingDetails clickSelectAgency() {
		clickElement(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.SelectAgency.Xpath")));
		return this;
		}
	public LoanCreditRatingDetails enterRatings() {
		enterValue(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.Ratings.Xpath")),props.getProperty("Ratings"));
		return this;
	}
	public LoanCreditRatingDetails enterRemarks() {
		enterValue(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.Remarks.Xpath")),props.getProperty("Remarks"));
		return this;
	}

}
