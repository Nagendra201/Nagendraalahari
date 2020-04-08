package com.cts.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BasePage;
import com.cts.pages.AdminJobCategories;
import com.cts.pages.CucumbLoginPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDAdminjobcatPage extends BasePage {

	final static Logger logger = LogManager.getLogger(SDAdminjobcatPage.class);
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	CucumbLoginPage CucumbLoginPage = null;
	AdminJobCategories AdminJobCategories = null;

	@Given("^TC01_02the user launch the chrome application$")
	public void tc0102the_user_launch_the_chrome_application() throws Throwable {

		driver = launchApp("chrome");
		CucumbLoginPage = new CucumbLoginPage(driver);
		AdminJobCategories = new AdminJobCategories(driver);

		logger.info("browser opens");
	}

	@When("^TC01_02the user open the OrangeHRM Home page$")
	public void tc0102the_user_open_the_orangehrm_home_page() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com");
		logger.info("website opens");
	}

	@Then("^TC01_02the user login using (.+) and (.+)$")
	public void tc0102the_user_login_using_and(String username, String password) throws Throwable {
		Excelllogin excellogin = new Excelllogin();
		CucumbLoginPage.username(excellogin.excel_username(0));
		CucumbLoginPage.password(excellogin.excel_password(0));

		logger.info("login successfully");
	}

	@Then("^TC01_02click on the login button user nagivate to the next page$")
	public void tc0102click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		CucumbLoginPage.loginbtn();
	}

	@And("^TC01_02Using actions move to admin job categories from admin then move to next page$")
	public void tc0102using_actions_move_to_admin_job_categories_from_admin_then_move_to_next_page() throws Throwable {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AdminJobCategories.admin();

	}

	@And("^TC01_02click on professionals check box$")
	public void tc0102click_on_professionals_check_box() throws Throwable {
		AdminJobCategories.professionals();
		ScreenShot util = new ScreenShot(driver);
		util.takeSnapShot("C:\\Users\\Raja\\git\\Nagendraalahari\\OrangeHRMDemo\\src\\test\\resources\\screenshots(BDD)\\SDAdminjobcatPage.png");
		logger.warn("browser is closed");
		driver.close();
	}

}
