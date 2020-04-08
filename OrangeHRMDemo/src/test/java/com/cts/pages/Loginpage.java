package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.BasePage;

public class Loginpage extends BasePage {

	

	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement username;
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
//user login using valid username and password
	public void username(String values) {
		username.sendKeys(values);
	}

	public void password(String values) {

		password.sendKeys(values);
	}
//user clicks on login button
	public void loginbtn() {

		loginbtn.click();
	}

}
