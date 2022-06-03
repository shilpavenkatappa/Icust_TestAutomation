package pages;

import base.IcustSpecificMethods;

/**
 * @author Shilpa Venkatappa
 *
 */
public class EditDenomination extends IcustSpecificMethods {

	public EditDenomination editDenomCode() {
		enterValue(locateElement("xpath", props.getProperty("EditDenomination.EditDenomcode.Xpath")),
				props.getProperty("EditDenomcode"));
		return this;
	}

	public EditDenomination editDenomDesc() {
		enterValue(locateElement("xpath", props.getProperty("EditDenomination.EditDenomdesc.Xpath")),
				props.getProperty("EditDenomdesc"));
		return this;
	}

	public EditDenomination clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditDenomination.save.Xpath")));
		return this;
	}
}
