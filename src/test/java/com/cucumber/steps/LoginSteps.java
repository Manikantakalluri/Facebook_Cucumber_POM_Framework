package com.cucumber.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("^I launch chrome browser with valid url$")
	public void iLaunchChromeBrowserWithValidUrl() throws Throwable {
		System.out.println("Launch brwoser with valid url");
	}

	@Given("^I enter username$")
	public void iEnterUsername() throws Throwable {
		System.out.println("Enter valid username");
	}

	@Given("^I enter password$")
	public void iEnterPassword() throws Throwable {
		System.out.println("Enter valid password");
	}

	@When("^I submit login button$")
	public void iSubmitLoginButton() throws Throwable {
		System.out.println("Click on submit button");
	}

	@Then("^I verify login is success$")
	public void iVerifyLoginIsSuccess() throws Throwable {
		System.out.println("Verify login is success");
	}

	@Then("^I close the browser$")
	public void iCloseTheBrowser() throws Throwable {
		System.out.println("close the browser");
	}

	@Then("^I enter user firstname$")
	public void iEnterUserFirstname() throws Throwable {
		System.out.println("Aditional step defs");
	}

	@Given("^I enter valid \"([^\"]*)\"$")
	public void iEnterValid(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@Given("^I enter valid user \"([^\"]*)\"$")
	public void iEnterValidUser(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@Then("^I enter below data in required fields$")
	public void iEnterBelowDataInRequiredFields(DataTable table) throws Throwable {
		List<List<String>> tableData = table.asLists(String.class);
		System.out.println(tableData);
		for (List<String> data : tableData) {
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println("---------------------------");
		}

	}

	@Then("^I enter below map data in required fields$")
	public void iEnterBelowMapDataInRequiredFields(DataTable map) throws Throwable {
		List<Map<String, String>> data = map.asMaps(String.class, String.class);
		System.out.println(data);
		for (Map<String, String> tableData : data) {
			System.out.println(tableData.get("userName"));
			System.out.println(tableData.get("Password"));
			System.out.println("**************************");
		}
		Assert.assertTrue(false);

	}

}
