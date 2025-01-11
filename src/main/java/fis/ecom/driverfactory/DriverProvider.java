package fis.ecom.driverfactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverProvider {
	protected WebDriver driver;
	protected abstract WebDriver createDriver();

    public WebDriver getDriver() {
    	return createDriver();
    }
}
