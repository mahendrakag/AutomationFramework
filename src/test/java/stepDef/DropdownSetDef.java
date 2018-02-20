package stepDef;

import cucumber.api.java.en.Then;
import pageObject.Dropdown;

public class DropdownSetDef {

	Dropdown dp=new Dropdown();
	
	@Then("^select value form dropdown \"([^\"]*)\" by \"([^\"]*)\"$")
	public void select_value_form_dropdown_by(String value, String type) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dp.selectFromDropdown(value, type);
	}

}
