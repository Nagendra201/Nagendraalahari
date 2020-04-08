package com.cts.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BasePage;
import com.cts.pages.CucumbLoginPage;
import com.cts.pages.LogoutPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDLogoutPage extends BasePage {

	final static Logger logger = LogManager.getLogger(SDLogoutPage.class);
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	CucumbLoginPage CucumbLoginPage = null;
	LogoutPage LogoutPage;

	@Given("^TC01_06the user launch the chrome application$")
	public void tc0106the_user_launch_the_chrome_application() throws Throwable {

		driver = launchApp("chrome");
		CucumbLoginPage = new CucumbLoginPage(driver);
		LogoutPage = new LogoutPage(driver);
		logger.info("browser opens");
	}

	@When("^TC01_06the user open the OrangeHRM Home page$")
	public void tc0106the_user_open_the_orangehrm_home_page() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com");
		logger.info("website opens");
	}

	@Then("^TC01_06the user login using (.+) and (.+)$")
	public void tc0106the_user_login_using_and(String username, String password) throws Throwable {

		Excelllogin excellogin = new Excelllogin();
		CucumbLoginPage.username(excellogin.excel_username(0));
		CucumbLoginPage.password(excellogin.excel_password(0));

		logger.info("login successfully");
	}

	@And("^TC01_06click on the login button user nagivate to the next page$")
	public void tc0106click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		CucumbLoginPage.loginbtn();
	}

	@Then("^TC01_06click on welcome admin$")
	public void tc0106click_on_welcome_admin() throws Throwable {
		LogoutPage.welcomeadmin();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@And("^TC01_06click on about$")
	public void tc0106click_on_about() throws Throwable {
		LogoutPage.about();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^TC01_06click on logout the user moves to home page$")
	public void tc0106click_on_logout_the_user_moves_to_home_page() throws Throwable {
		LogoutPage.logout();
		logger.warn("browser is logged out");
		ScreenShot util = new ScreenShot(driver);
		util.takeSnapShot("C:\\Users\\Raja\\git\\Nagendraalahari\\OrangeHRMDemo\\src\\test\\resources\\screenshots(BDD)\\SDLogoutPage.png");
		logger.warn("browser closed");
		driver.close();
	}

}
