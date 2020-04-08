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
import com.cts.pages.LeavesPage;
import com.cts.pages.Loginpage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

public class TestLeavesPage extends BasePage {

	final static Logger logger = LogManager.getLogger(TestLeavesPage.class);
	WebDriver driver;
	LeavesPage LeavesPage;
	Excelllogin data = new Excelllogin();
	Loginpage Loginpage = null;

	@Parameters({ "browser" })
	@BeforeTest
	public void initDriver(String browser) {
		driver = launchApp(browser);
		logger.info("browser openes");
		LeavesPage = new LeavesPage(driver);
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
		logger.error("login sucessfully");
	}

	@Test
	public void testleaves() {

		LeavesPage.leave();
		logger.info("leavepage opens sucessfully");
		// lp.paternity();
		LeavesPage.add();
		LeavesPage.textleave();
		LeavesPage.savebtn();
		logger.info("saved sucessfully");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void close() {
		ScreenShot util = new ScreenShot(driver);
		util.takeSnapShot("C:\\Users\\Raja\\git\\Nagendraalahari\\OrangeHRMDemo\\src\\test\\resources\\screenshots(TDD)\\TestLeavesPage.png");
		logger.error("browser closed");
		driver.close();
	}

}
