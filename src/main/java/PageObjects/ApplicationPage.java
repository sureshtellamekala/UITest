package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.BasePage;
import Utils.GeneralUtils;


public class ApplicationPage {
	
	BasePage basePage = new BasePage();

	private WebDriver driver = BasePage.driver;
	GeneralUtils generalUtils = new GeneralUtils();

	private static String searchBoxId = "twotabsearchtextbox";
	private static String searchBtnId = "nav-search-submit-button";
	
	public void navigateToUrl() {
		driver.get(generalUtils.getUrl());
		driver.manage().window().maximize();
	}

	public String returnMainPageTitle() {
		return driver.getTitle();
	}

	public void searchforText(String text) {
		driver.findElement(By.id(searchBoxId)).clear();
		driver.findElement(By.id(searchBoxId)).sendKeys(text);
		driver.findElement(By.id(searchBtnId)).click();
	}

}
