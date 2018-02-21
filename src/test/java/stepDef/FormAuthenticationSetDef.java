package stepDef;

import cucumber.api.java.en.Then;
import pageObject.FormAuthentication;

public class FormAuthenticationSetDef {

FormAuthentication fp=new FormAuthentication();
	
	@Then("^enter the username \"([^\"]*)\" in username field$")
	public void enter_the_username_in_username_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  fp.EnterUserName(arg1);
	}

	@Then("^enter the password \"([^\"]*)\" in password field$")
	public void enter_the_password_in_password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fp.EnterPassword(arg1);
	}

	@Then("^click on Login button \"([^\"]*)\"$")
	public void click_on_Login_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fp.clickonLogin(arg1);
	}

}
