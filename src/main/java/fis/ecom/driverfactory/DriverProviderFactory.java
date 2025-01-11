package fis.ecom.driverfactory;

import org.openqa.selenium.WebDriver;

public class DriverProviderFactory {
	public WebDriver getWebDriverInstanceOf(String browser) {
		WebDriver driver;
		browser = browser.toLowerCase();
		DriverProvider driverProvider;
		
		switch (browser) {
		case "chrome":
			driverProvider = new ChromeDriverProvider();
			driver = driverProvider.getDriver();
			break;
			
		case "firefox":
			driverProvider = new FirefoxDriverProvider();
			driver = driverProvider.getDriver();
			break;
			
		case "edge":
			driverProvider = new EdgeDriverProvider();
			driver = driverProvider.getDriver();
			break;

		default:
			driverProvider = new ChromeDriverProvider();
			driver = driverProvider.getDriver();
			break;
		}
		
		return driver;
	}
}
