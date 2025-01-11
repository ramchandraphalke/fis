package fis.ecom.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:/fis/ecom/bdd/features",
glue = {"fis.ecom.bdd.stepdefiniations", 
		"fis.ecom.bdd.hooks"},
plugin = {"html:target/htmlReport"},
tags = "@Ebay",
dryRun = false)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
