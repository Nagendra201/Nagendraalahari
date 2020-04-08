package com.cts.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BasePage;
import com.cts.pages.CucumbLoginPage;
import com.cts.pages.DashboardPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDDashBoardPage extends BasePage {

	final static Logger logger = LogManager.getLogger(SDDashBoardPage.class.getName());
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	CucumbLoginPage CucumbLoginPage = null;
	DashboardPage DashboardPage;
	ScreenShot util;

	@Given("^TC01_04the user launch the chrome application$")
	public void tc0104the_user_launch_the_chrome_application() throws Throwable {
		driver = launchApp("chrome");
		CucumbLoginPage = new CucumbLoginPage(driver);
		DashboardPage = new DashboardPage(driver);
		logger.error("browser opens");
	}

	@When("^TC01_04the user open the OrangeHRM Home page$")
	public void tc0104the_user_open_the_orangehrm_home_page() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com");
		logger.error("website opens");
	}

	@Then("^TC01_04the user login using (.+) and (.+)$")
	public void tc0104the_user_login_using_and(String username, String password) throws Throwable {

		Excelllogin excellogin = new Excelllogin();
		CucumbLoginPage.username(excellogin.excel_username(0));
		CucumbLoginPage.password(excellogin.excel_password(0));

		logger.info("login successfully");
	}

	@And("^TC01_04click on the login button user nagivate to the next page$")
	public void tc0104click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		CucumbLoginPage.loginbtn();
	}

	@Then("^TC01_04click on Dashboard to move to the next page$")
	public void tc0104click_on_dashboard_to_move_to_the_next_page() throws Throwable {
		DashboardPage.dashboard();
	}

	@And("^TC01_04click on Timesheets$")
	public void tc0104click_on_timesheets() throws Throwable {
		DashboardPage.timesheet();
	}

	@Then("^TC01_04wrote the employee name$")
	public void tc0104wrote_the_employee_name() throws Throwable {
		DashboardPage.employeename();
	}

	@Then("^TC01_04click on view the user moves to next page$")
	public void tc0104click_on_view_the_user_moves_to_next_page() throws Throwable {
		DashboardPage.viewbtn();
		util = new ScreenShot(driver);
		util.takeSnapShot("C:\\Users\\Raja\\git\\Nagendraalahari\\OrangeHRMDemo\\src\\test\\resources\\screenshots(BDD)\\SDDashBoardPage.png");
		logger.warn("driver is closing");
		driver.close();
	}
}
