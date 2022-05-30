package pages;

import base.IcustSpecificMethods;

public class RecentTransaction360 extends IcustSpecificMethods{

	public Dashboard360 clickClose() {
		clickElement(locateElement("xpath", props.getProperty("RecentTransaction360.Close.Xpath")));
		return new Dashboard360();
		}

}
