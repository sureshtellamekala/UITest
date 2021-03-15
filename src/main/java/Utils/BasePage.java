package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {

	public static WebDriver driver;
	GeneralUtils generalUtils = new GeneralUtils();

	public BasePage() {
		driver = openBrowser(generalUtils.getBrowserName());
	}

	public static WebDriver openBrowser(String browser) {

		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
			driver =  new ChromeDriver();
		}
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//resources//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//resources//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

}
