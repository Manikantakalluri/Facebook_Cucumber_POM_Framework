package com.cucumber.hooks;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import edu.emory.mathcs.backport.java.util.concurrent.SynchronousQueue;

public class Hooks {
	public WebDriver driver;

//	@Before
//	public void testStart(Scenario scenario) {
//		String Sname = scenario.getName();
//		System.out.println(Sname);
//
//	}
/*
	@After
	public void testFinish(Scenario scenario) {
		System.out.println(scenario.getStatus());

	}*/

}
