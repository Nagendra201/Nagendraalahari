package com.cts.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BasePage;
import com.cts.pages.CucumbLoginPage;
import com.cts.pages.MaintanancePage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDMaintenancePage extends BasePage {

	final static Logger logger = LogManager.getLogger(SDMaintenancePage.class);
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	CucumbLoginPage CucumbLoginPage = null;
	MaintanancePage MaintanancePage;

	@Given("^TC01_05the user launch the chrome application$")
	public void tc0105the_user_launch_the_chrome_application() throws Throwable {
		driver = launchApp("chrome");
		CucumbLoginPage = new CucumbLoginPage(driver);
		MaintanancePage = new MaintanancePage(driver);
		logger.info("browser opens");
	}

	@When("^TC01_05the user open the OrangeHRM Home page$")
	public void tc0105the_user_open_the_orangehrm_home_page() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com");
		logger.info("website opens");
	}

	@Then("^TC01_05the user login using (.+) and (.+)$")
	public void tc0105the_user_login_using_and(String username, String password) throws Throwable {
		Excelllogin excellogin = new Excelllogin();
		CucumbLoginPage.username(excellogin.excel_username(0));
		CucumbLoginPage.password(excellogin.excel_password(0));

		logger.info("login successfully");
	}

	@And("^TC01_05click on the login button user nagivate to the next page$")
	public void tc0105click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		CucumbLoginPage.loginbtn();
	}

	@Then("^TC01_05Using actions move to candidate records from maintenance then move to next page$")
	public void tc0105using_actions_move_to_candidate_records_from_maintenance_then_move_to_next_page()
			throws Throwable {
		MaintanancePage.Maintenance();
		logger.info("maintenance page is opened successfully");
	}

	@And("^TC01_05write verify passoword$")
	public void tc0105write_verify_passoword() throws Throwable {
		MaintanancePage.verifypwd();
	}

	@Then("^TC01_05click verify$")
	public void tc0105click_verify() throws Throwable {
		MaintanancePage.verifybtn();
	}

	@And("^TC01_05write the content in vacancy column$")
	public void tc0105write_the_content_in_vacancy_column() throws Throwable {
		MaintanancePage.textvacancy();
	}

	@Then("^TC01_05click on search button$")
	public void tc0105click_on_search_button() throws Throwable {
		MaintanancePage.searchbtn();
		ScreenShot util = new ScreenShot(driver);
		util.takeSnapShot("C:\\Users\\Raja\\git\\Nagendraalahari\\OrangeHRMDemo\\src\\test\\resources\\screenshots(BDD)\\SDMaintenancePage.png");
		logger.warn("browser closed");
		driver.close();
	}
}
