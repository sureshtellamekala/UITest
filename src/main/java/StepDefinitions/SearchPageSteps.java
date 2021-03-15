package StepDefinitions;

import org.apache.log4j.Logger;
import org.junit.Assert;

import PageObjects.SearchScreenPage;
import cucumber.api.java.en.Then;

public class SearchPageSteps {
	
	SearchScreenPage searchScreenPage = new SearchScreenPage();
	static Logger log = Logger.getLogger(MainPageSteps.class.getName());
	
	@Then("^Verify search results available$")
	public void verifyRecordsAvailable() {
		if(searchScreenPage.validateresultAvailable()) {
			log.info(searchScreenPage.countSearchResults()+" results available");
			searchScreenPage.storePriceFromSearch();
		}else {
			Assert.assertTrue(searchScreenPage.validateresultAvailable());
		}
	}

	@Then("^Store price of \\\"([^\\\"]*)\\\" search option and click$")
	public void storePriceandClick(int cnt) {
		log.info(searchScreenPage.storePriceFromSearch() +" is the price on search result screen of the item");
		searchScreenPage.clickDesiredOption(cnt);
	}
}
