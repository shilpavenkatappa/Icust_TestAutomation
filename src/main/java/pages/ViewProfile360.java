package pages;

import base.IcustSpecificMethods;

public class ViewProfile360 extends IcustSpecificMethods{
	
	public Dashboard360 clickClose() {
		clickElement(locateElement("xpath", props.getProperty("ViewProfile360.Close.Xpath")));
		return new Dashboard360();
		}
}
