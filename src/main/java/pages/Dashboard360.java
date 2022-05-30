package pages;

import base.IcustSpecificMethods;

public class Dashboard360 extends IcustSpecificMethods{
	public Dependent clickAddnew() {
		clickElement(locateElement("xpath", props.getProperty("Dashboard360.AddNew.Xpath")));
			return new Dependent();
			}
	public ViewProfile360 clickViewProfile() {
		clickElement(locateElement("xpath", props.getProperty("Dashboard360.ViewProfile.Xpath")));
		return new ViewProfile360();
		}
	public RecentTransaction360 clickViewReport() {
		clickElement(locateElement("xpath", props.getProperty("Dashboard360.ViewReport.Xpath")));
		return new RecentTransaction360();
		}
	}


