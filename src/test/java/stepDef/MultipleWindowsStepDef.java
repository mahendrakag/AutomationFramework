package stepDef;

import cucumber.api.java.en.Then;
import pageObject.MultipleWindows;

public class MultipleWindowsStepDef {
	
	MultipleWindows mw=new MultipleWindows();
	
	@Then("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mw.ClickHere(arg1);
	}

	@Then("^switch to another window with title as \"([^\"]*)\"$")
	public void switch_to_another_window_with_title_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mw.switchWindow(arg1);
	}

	@Then("^verify text as \"([^\"]*)\"$")
	public void verify_text_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	String actual = mw.getTextFromElement();
	mw.assertResult(actual, arg1);
	}
}
