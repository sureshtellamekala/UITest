package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.BasePage;

public class ProductDetaisPage {
	
	private WebDriver driver = BasePage.driver;
	private static String productCostId = "newBuyBoxPrice";
	private static String addToCartId = "add-to-cart-button";
	private static String navigateToCartId = "nav-cart-count-container";
	//private static String proceedToCheckoutId = "hlb-ptc-btn-native";
	private static String pricefromCartXpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']";
	
	public static String productPageCost;
	
	public String returnPriceFromstorePrice() {
		productPageCost = driver.findElement(By.id(productCostId)).getText();
		return productPageCost;
	}
	
	public void clickAddtoCartButton() {
		driver.findElement(By.id(addToCartId)).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	public void clickNavigateToCartButton() {
		driver.findElement(By.id(navigateToCartId)).click();
	}
	
	public String returnPricefromCart() {
		return driver.findElement(By.xpath(pricefromCartXpath)).getText();
	}

	public void closeBrowser() {
		driver.close();
		//driver.quit();		
	}
	
}
