package fis.ecom.web.base;

import org.openqa.selenium.WebDriver;

import fis.ecom.config.Config;
import fis.ecom.config.Constants;
import fis.ecom.driverfactory.DriverProviderFactory;

public class BaseClass extends Config {
	private WebDriver driver;

	public void launchDriver() {
		DriverProviderFactory driverProviderFactory = new DriverProviderFactory();
		driver = driverProviderFactory.getWebDriverInstanceOf(getPropertyInstance().getProperty(Constants.getBrowser()));
		//driver = driverProviderFactory.getWebDriverInstanceOf(System.getProperty(Constants.getBrowser()) != null ? System.getProperty(Constants.getBrowser())	: getPropertyInstance().getProperty(Constants.getBrowser()));
		driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void tearDown() {
		driver.quit();
	}

}
