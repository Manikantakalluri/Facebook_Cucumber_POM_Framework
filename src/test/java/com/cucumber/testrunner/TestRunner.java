package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\features",
				 glue = {"com.cucumber.steps","com.cucumber.hooks"},
				 snippets = SnippetType.CAMELCASE,
				 monochrome = true,
				 tags = { "@LoginOperation" },
				 dryRun = false,
				 plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber-reports/cucumber.json",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentcucumberAdapter:"}
	
		)
public class TestRunner {

}
