package fis.ecom.commonutilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class CommonUtility {

	private WebDriver driver;

	public CommonUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void waitTillPageLoads() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	public WebElement waitForElement(final WebElement webElement) {
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);

		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (webElement != null) {
					if (webElement.isDisplayed() && webElement.isEnabled()) {
						return webElement;
					}
				}
				return null;
			}
		});
	}
	
	public void scrollToBottomOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	protected void printMap(Map<String, String> iPhoneWithPrice) {
		for (Map.Entry<String, String> entry : iPhoneWithPrice.entrySet()) {
	            System.out.println("Name: "+entry.getKey() + " And Price is: " + entry.getValue());
	        }
	}
	
	protected Map<String, String> createMap(List<WebElement> numberOfIphone15, List<WebElement> phonePrices) {
		Map<String, String> iPhoneWithPrice = new HashMap<>();
		 for (int i = 0; i < numberOfIphone15.size(); i++) {
			 iPhoneWithPrice.put(numberOfIphone15.get(i).getText(), phonePrices.get(i).getText());
	        }
		return iPhoneWithPrice;
	}
}
