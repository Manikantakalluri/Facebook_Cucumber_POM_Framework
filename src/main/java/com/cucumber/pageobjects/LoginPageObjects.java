package com.cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.testbase.TestBase;

public class LoginPageObjects extends TestBase {

	@FindBy(xpath = "//*[@class='login']")
	private WebElement btn_SignIn;

	@FindBy(id = "email")
	private WebElement txt_EmailAddress;

	@FindBy(id = "passwd")
	private WebElement txt_Password;

	@FindBy(name = "SubmitLogin")
	private WebElement btn_LoginSignIn;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonSignIn() {
		btn_SignIn.click();
	}

	public void enterEmail() {
		txt_EmailAddress.sendKeys("user1@gmail.com");
	}

	public void enterPassword() {
		txt_Password.sendKeys("password@123");
	}

	public void clickSubmitButton() {
		btn_SignIn.click();
	}

}
