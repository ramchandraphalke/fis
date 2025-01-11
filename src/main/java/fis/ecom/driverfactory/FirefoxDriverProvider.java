package fis.ecom.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverProvider extends DriverProvider {

	public WebDriver createDriver() {
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\browserExwcutables\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
}
