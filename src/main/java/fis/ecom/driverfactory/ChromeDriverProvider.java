package fis.ecom.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverProvider extends DriverProvider {

	public WebDriver createDriver() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\browserExwcutables\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
}
