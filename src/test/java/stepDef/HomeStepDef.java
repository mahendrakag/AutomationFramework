package stepDef;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObject.HomePage;

public class HomeStepDef {
	HomePage hp = new HomePage();

	@Given("^writing  data to sheet$")
	public void writing_data_to_sheet(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		 List<String> ll= arg1.asList(String.class);
		hp.writeFileData("abc.xlsx",ll);
		hp.readFileData("abc.xlsx");
		
		
	
	}

	@Given("^launch \"([^\"]*)\" browser$")
	public void launch_browser(String browserName) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		hp.launchBrowser(browserName);		
	}

	@Then("^launch url \"([^\"]*)\"$")
	public void launch_url(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("launching browser");
		hp.lanuchUrl(url);
	}

	@Then("^verify page by \"([^\"]*)\" with \"([^\"]*)\"$")
	public void verify_page_by_with(String type, String expected) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("launching browser");
		String actual=hp.getPageDetails(type);
		hp.assertResult(actual,expected);
		
	}
		@Then("^click on homepage link \"([^\"]*)\"$")
		public void click_on_homepage_link(String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    hp.clickHomePageLink(arg2);
		    
		}
	
	@After
	public void closeBrowserTakeScreenshot(Scenario sce)
	{
		hp.TakeScreenshot(sce.getName());
		hp.closeBrowser();
	}

}
