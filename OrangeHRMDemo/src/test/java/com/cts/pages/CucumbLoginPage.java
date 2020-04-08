package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.BasePage;

public class CucumbLoginPage extends BasePage {

	WebDriver driver = null;
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement username;
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	public CucumbLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//login with valid username and password 
	public void username(String username) {
		this.username.sendKeys(username);
	}

	public void password(String password) {

		this.password.sendKeys(password);
	}

	public void loginbtn() {

		loginbtn.click();
	}

}
