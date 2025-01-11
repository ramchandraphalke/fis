package fis.ecom.bdd.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fis.ecom.web.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	BaseClass baseClass;
	
	public Hooks(BaseClass baseClass) {
		this.baseClass = baseClass;
	}
	
	@Before
	public void setup() {
		baseClass.launchDriver();
	}
	
	@After
	public void tearDown() {
		baseClass.tearDown();
	}
	
	@AfterStep
	public void captureScreenshotOnFailure(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) baseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
}
