package com.cts.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cts.baseclass.BasePage;
import com.cts.pages.Loginpage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

public class TestLoginPage extends BasePage {

	final static Logger logger = LogManager.getLogger(TestLoginPage.class);
	WebDriver driver = null;
	Excelllogin data = new Excelllogin();
	Loginpage Loginpage = null;
	// AdminJobCategories ajc=new AdminJobCategories(driver);

	@Parameters({ "browser" })
	@BeforeTest
	public void initDriver(String browser) {
		driver = launchApp(browser);
		logger.info("browser opens");
		Loginpage = new Loginpage(driver);

	}

	@DataProvider(name = "UserDetails")
	public Object[][] getUsers() throws IOException {
////		return new Object[][] {
////			{"nagendra","nagendra201"},
////			{"Groot","Groot123"}
////		};
		return data.getData();
	}

	@Test(dataProvider = "UserDetails")
	public void login(String username, String password) throws IOException {

		Loginpage.username(username);
		Loginpage.password(password);
		Loginpage.loginbtn();
		logger.error("login successfully");
	}

	@AfterTest
	public void close() {
		ScreenShot util = new ScreenShot(driver);
		util.takeSnapShot("C:\\Users\\Raja\\git\\Nagendraalahari\\OrangeHRMDemo\\src\\test\\resources\\screenshots(TDD)\\TestLoginPage.png");
		logger.warn("browser is closed");
		driver.close();
	}
}
