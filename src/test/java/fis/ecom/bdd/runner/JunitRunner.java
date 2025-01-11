package fis.ecom.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/fis/ecom/bdd/features",
glue = {"fis.ecom.bdd.stepdefiniations", 
		"fis.ecom.bdd.hooks"},
plugin = {"html:target/htmlReport"},
tags = "@Ebay",
dryRun = false)
public class JunitRunner {

}
