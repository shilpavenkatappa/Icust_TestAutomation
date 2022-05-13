package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustLoanAccountAdmissionDetails extends IcustSpecificMethods {
	
	public IcustLoanAccountAdmissionDetails loanRequestFor() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.loanRequestFor.xpath")));
		wait(2000);
		return this;
	} 
	
	public IcustLoanAccountAdmissionDetails loanRequestForEducation() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.loanRequestFor.education.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustLoanAccountAdmissionDetails admissionStatus() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.admissionStatus.Xpath")));
		wait(2000);
		return this;
	} 
	
	public IcustLoanAccountAdmissionDetails admissionStatusConfirmed() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.admissionStatus.confirmed.Xpath")));
		wait(2000);
		return this;
	} 
	
	public IcustLoanAccountAdmissionDetails modeOfStudy() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.modeOfStudy.Xpath")));
		wait(2000);
		return this;
	} 
	
	public IcustLoanAccountAdmissionDetails modeOfStudyFullTime() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.modeOfStudy.fullTime.Xpath")));
		wait(2000);
		return this;
	} 
	
	public IcustLoanAccountAdmissionDetails proposedCourseOfStudy() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.proposedCourseOfStudy.Xpath")), props.getProperty("IcustLoanAccountAdmissionDetails.proposedCourseOfStudy"));
		return this;
	}
	
	public IcustLoanAccountAdmissionDetails Institution() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.Institution.Xpath")), props.getProperty("IcustLoanAccountAdmissionDetails.Institution"));
		return this;
	}
	
	public IcustLoanAccountAdmissionDetails university() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.university.Xpath")), props.getProperty("IcustLoanAccountAdmissionDetails.university"));
		return this;
	}
	
	public IcustLoanAccountAdmissionDetails country() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.country.Xpath")));
		wait(2000);
		return this;
	} 
	
	public IcustLoanAccountAdmissionDetails countryIndia() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.country.India.Xpath")));
		wait(2000);
		return this;
	}
	
	public IcustLoanAccountAdmissionDetails institutionRanking() {
		enterValue(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.institutionRanking.Xpath")), props.getProperty("IcustLoanAccountAdmissionDetails.institutionRanking"));
		return this;
	}
	
	
	public IcustLoanAccountAdmissionDetails courseDuration () {
		WebElement courseDurationDatePicker =driver.findElementByXPath("//button[@aria-label='Open calendar']");
		wait(2000);
		clickElement(courseDurationDatePicker);
		wait(2000);
		List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
		for(WebElement ele:allDates)
		{			
			String date=ele.getText();
			if(date.equalsIgnoreCase("11"))
			{
				ele.click();
			}	
			if(date.equalsIgnoreCase("15")) ele.click();
			break;
		}
		wait(2000);
		return this;
	}
	
	
	public IcustLoanAccountAdmissionDetails courseCommencementDate () {
		WebElement courseCommencementDatePicker =driver.findElementByXPath("//mat-datepicker-toggle[@class='mat-datepicker-toggle ng-tns-c109-19']//span[@class='mat-button-wrapper']//*[name()='svg']//*[name()='path' and contains(@d,'M19 3h-1V1')]");
		wait(2000);
		clickElement(courseCommencementDatePicker);
		wait(2000);
		List<WebElement> allDates=driver.findElementsByXPath("//table[@class='mat-calendar-table']//td");
		for(WebElement ele:allDates)
		{			
			String date=ele.getText();
			if(date.equalsIgnoreCase("11"))
			{
				ele.click();
				break;
			}			
		}
		wait(2000);
		return this;
	}

}
