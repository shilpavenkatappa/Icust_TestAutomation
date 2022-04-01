package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.IcustSpecificMethods;

public class IcustApplicationAssesment extends IcustSpecificMethods {
	
	public IcustApplicationAssesment clickAssessmentAddDetails() {
		wait(2000);
		WebElement appAssessmentt = locateElement("xpath", props.getProperty("IcustApplicationAssesment.applicationassesmentlink.Xpath"));
	//	jsExecutor(appAssessmentt);
		clickElement(appAssessmentt);
		wait(5000);
		WebElement summary = locateElement("xpath", props.getProperty("IcustApplicationAssesment.applicationassesmentsummarylink.Xpath"));
		/*
		 * wait(2000); jsExecutor(summary);
		 */
		wait(2000);
		clickElement(summary);
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustApplicationAssesment.addDetails.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustApplicationAssesment selectMonthDropdown() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("ApplicationAssessment.qualitativeScoreboard.bornMonthDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("ApplicationAssessment.qualitativeScoreboard.bornMonthDropdownFeb.Xpath")));
		wait(1000);
		return this;
	}
	public IcustApplicationAssesment selectPlanDropDown() {
		wait(2000);
		WebElement planDropdown = locateElement("xpath", props.getProperty("ApplicationAssessment.qualitativeScoreboard.selectPlan.Xpath"));
		jsExecutor(planDropdown);
		clickElement(planDropdown);
		wait(1000);
		WebElement plan = locateElement("xpath", props.getProperty("ApplicationAssessment.qualitativeScoreboard.selectPlatinum.Xpath"));
		
		clickElement(plan);
		Actions act = new Actions(driver);
		wait(1000);
		/*
		 * WebElement name = locateElement("xpath", props.getProperty(
		 * "ApplicationAssessment.qualitativeScoreboard.inputName.Xpath"));
		 * 
		 * clickElement(name);
		 */
		act.sendKeys(Keys.TAB).build().perform();
		//plan.sendKeys(Keys.TAB);
		wait(1000);
		return this;
	}
	public IcustApplicationAssesment enterName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("ApplicationAssessment.qualitativeScoreboard.inputName.Xpath")), props.getProperty("ScoreboardName"));
		wait(2000);
		return this;
	}
	public IcustApprovalDetails clickNext() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("ApplicationAssessment.qualitativeScoreboard.nextButton.Xpath")));
		wait(2000);
		return new IcustApprovalDetails();
	}

}
