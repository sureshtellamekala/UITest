package StepDefinitions;

import org.apache.log4j.Logger;
import org.junit.Assert;

import PageObjects.ProductDetaisPage;
import PageObjects.SearchScreenPage;
import cucumber.api.java.en.Then;

public class ProductDetailsSteps {

	ProductDetaisPage productDetailsPage = new ProductDetaisPage();
	static Logger log = Logger.getLogger(MainPageSteps.class.getName());


	@Then("^Verify price on Product page is same as Search page$")
	public void verifyRecordsAvailable() {
		String serPrice = SearchScreenPage.searchScreenPrice.replaceAll("\\n", ".");
		String proPrice = productDetailsPage.returnPriceFromstorePrice();
		Assert.assertEquals(serPrice, proPrice);
	}

	@Then("^Click AddToCard and validate price in cart$")
	public void addTocartAndValidatePrice() {
		productDetailsPage.clickAddtoCartButton();
		productDetailsPage.clickNavigateToCartButton();
		Assert.assertEquals(productDetailsPage.productPageCost, productDetailsPage.returnPricefromCart());
	}

	@Then("^Close Browser$")
	public void closeBrowser() {
		productDetailsPage.closeBrowser();
	}

}
