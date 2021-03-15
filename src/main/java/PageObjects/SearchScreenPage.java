package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.BasePage;

public class SearchScreenPage {
	
	private WebDriver driver = BasePage.driver;
	private static String resultsListXpath = "//div[@class='a-section aok-relative s-image-square-aspect']";
	private static String priceStoreXpath = "//a[@class='a-size-base a-link-normal a-text-normal']";
	
	public static String searchScreenPrice;
	
	public int countSearchResults() {
		int cnt = driver.findElements(By.xpath(resultsListXpath)).size();
		return cnt;
	}
	public boolean validateresultAvailable() {
		if(countSearchResults()>1) {
			return true;
		}else {
			return false;
		}
	}
	
	public String storePriceFromSearch() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchScreenPrice = driver.findElement(By.xpath(priceStoreXpath+"[1]")).getText();
		return searchScreenPrice;
	}
	
	public void clickDesiredOption(int optNum) {
		driver.findElement(By.xpath(resultsListXpath+"["+optNum+"]")).click();
	}
	
	

}
