package fis.ecom.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriverProvider extends DriverProvider {

	public WebDriver createDriver() {
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\browserExwcutables\\geckodriver.exe");
		WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
	}
}
