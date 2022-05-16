package pages;

import base.IcustSpecificMethods;

public class LoanCollateralDetails extends IcustSpecificMethods{
	public LoanCollateralDetails clickCollateralTypeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.CollateralTypeDropdown.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickCollateralTypeValue() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.CollateralType.Xpath")));
		return this;
	}
	public LoanCollateralDetails clickCurrencyDropdown() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.CurrencyDropdown.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickCurrencyValue() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.CurrencyValue.Xpath")));
		return this;
		}
	public LoanCollateralDetails enterCollateralValue() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.CollateralValue.Xpath")),props.getProperty("CollateralValue"));
		return this;
	}
	public LoanCollateralDetails clickAttributesDropdown() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.AttributesDropdown.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickAttributeValue() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.Attributes.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickThirdpartyCollateral() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.ThirdpartyCollateral.Xpath")));
		return this;
		}

	public LoanCollateralDetails enterDimensions() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.Dimensions.Xpath")),props.getProperty("Dimensions"));
		return this;
	}
	
	public LoanCollateralDetails enterBuilding() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.Building.Xpath")),props.getProperty("Building"));
		return this;
	}
	public LoanCollateralDetails enterStreet() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.Street.Xpath")),props.getProperty("Street"));
		return this;
	}
	public LoanCollateralDetails enterLocality() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.Locality.Xpath")),props.getProperty("Locality"));
		return this;
	}
	public LoanCollateralDetails clickCountryDropdown() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.CountryDropdown.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickCountry() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.Country.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickStateDropdown() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.StateDropdown.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickState() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.State.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickCityDropdown() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.CityDropdown.Xpath")));
		return this;
		}
	public LoanCollateralDetails clickCity() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.City.Xpath")));
		return this;
		}
	public LoanCollateralDetails enterZipcode() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.Zipcode.Xpath")),props.getProperty("Zipcode"));
		return this;
	}
	public LoanCollateralDetails clickCollateral1() {
		clickElement(locateElement("xpath", props.getProperty("LoanCollateralDetails.Collateral1.Xpath")));
		return this;
		}
	public LoanCollateralDetails enterNumbofCollateral() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.NumberofCollateral.Xpath")),props.getProperty("NumberofCollateral"));
		return this;
	}
	public LoanCollateralDetails enterTotalCollateralValue() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.TotalCollateralValue.Xpath")),props.getProperty("TotalCollateralValue"));
		return this;
	}
	public LoanCollateralDetails enterUtilizedPreviously() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.UtilizedPreviously.Xpath")),props.getProperty("UtilizedPreviously"));
		return this;
	}
	public LoanCollateralDetails enterCoveravailable() {
		enterValue(locateElement("xpath", props.getProperty("LoanCollateralDetails.Coveravailable.Xpath")),props.getProperty("Coveravailable"));
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
