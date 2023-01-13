package com.cucumber.steps;

import com.cucumber.pageobjects.LoginPageObjects;
import com.cucumber.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginOperationSteps extends TestBase {

	@Given("^I launch firefox browser with valid url$")
	public void iLaunchFirefoxBrowserWithValidUrl() throws Throwable {
		selectBrowser("firefox");
		enterURL("http://automationpractice.com/index.php");

	}

	@Given("^I enter login Username$")
	public void iEnterLoginUsername() throws Throwable {
		LoginPageObjects obj = new LoginPageObjects(driver);
		obj.clickonSignIn();
		obj.enterEmail();
	}

	@Given("^I enter login password$")
	public void iEnterLoginPassword() throws Throwable {
		LoginPageObjects obj = new LoginPageObjects(driver);
		obj.enterPassword();
	}

	@When("^I click on submit button$")
	public void iClickOnSubmitButton() throws Throwable {
		LoginPageObjects obj = new LoginPageObjects(driver);
		obj.clickSubmitButton();
	}

	@Then("^I verify login opertion is success$")
	public void iVerifyLoginOpertionIsSuccess() throws Throwable {
		System.out.println("Login Operation is success");
	}

	@Then("^I close the firefox browser$")
	public void iCloseTheFirefoxBrowser() throws Throwable {
		closeBrowser();
	}

}
