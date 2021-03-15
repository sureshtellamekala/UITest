package StepDefinitions;

import org.apache.log4j.Logger;

import PageObjects.ApplicationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MainPageSteps{
	
	ApplicationPage applicationPage = new ApplicationPage();
	static Logger log = Logger.getLogger(MainPageSteps.class.getName());

	@Given("^Read the URL and navigate$") 
	public void getUrlandNavigate() {
		applicationPage.navigateToUrl();
		log.info("Navigating to Amazon Main Page");
	}

	@Then("^Verify title of Main page is \"([^\"]*)\"$")
	public void verifyMainpageTitle(String expPageTitle) {
		Assert.assertEquals(applicationPage.returnMainPageTitle(), expPageTitle);
	}

	@Then("^Search for the text \"([^\"]*)\"$")
	public void searchForText(String toSearch) {
		applicationPage.searchforText(toSearch);
		log.info("Search performed successfully");
	}

}
