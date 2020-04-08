package com.cts.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BasePage;
import com.cts.pages.CucumbLoginPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDLoginPage extends BasePage {

	final static Logger logger = LogManager.getLogger(SDLoginPage.class);
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	CucumbLoginPage CucumbLoginPage = null;

	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {

		driver = launchApp("chrome");
		CucumbLoginPage = new CucumbLoginPage(driver);

		logger.info("browser opens");

	}

	@When("^the user open the OrangeHRM Home page$")
	public void the_user_open_the_orangehrm_home_page() throws Throwable {

		driver.get("https://opensource-demo.orangehrmlive.com");
		logger.info("website opens");

	}

//	    @Then("^the user login using \"([^\"]*)\" and \"([^\"]*)\"$")
	@Then("^the user login using (.+) and (.+)$")
	public void the_user_login_using_username_and_password(String strArg1, String strArg2) throws Throwable {

//	    	System.out.println("username " +strArg1+ "password" +strArg2);

		Excelllogin excellogin = new Excelllogin();
		CucumbLoginPage.username(excellogin.excel_username(0));
		CucumbLoginPage.password(excellogin.excel_password(0));

		logger.info("login successfully");

	}

	@And("^click on the login button user nagivate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_pag() throws Throwable {
		CucumbLoginPage.loginbtn();
		ScreenShot util = new ScreenShot(driver);
		util.takeSnapShot("C:\\Users\\Raja\\git\\Nagendraalahari\\OrangeHRMDemo\\src\\test\\resources\\screenshots(BDD)\\SDLoginPage.png");
		logger.error("browser is closed");
		driver.close();

	}
}
