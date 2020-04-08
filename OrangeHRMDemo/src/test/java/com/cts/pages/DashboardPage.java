package com.cts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	@FindBy(linkText = "Dashboard")
	WebElement dashboard;
	@FindBy(xpath = "//span[contains(text(),'Timesheets')]")
	WebElement timesheet;
	@FindBy(xpath = "//input[@id=\"employee\" and @type=\"text\" ]")
	WebElement employeename;
	@FindBy(xpath = "//input[@type=\"button\" and @id=\"btnView\" ]")
	WebElement viewbtn;

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// user clicks on dashboard
	public void dashboard() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dashboard.click();
	}

	// user clicks on timesheet
	public void timesheet() {

		timesheet.click();
	}

	// user gives employee details
	public void employeename() {

		employeename.sendKeys("Hannah Flores");
	}

	// user clicks on view button
	public void viewbtn() {

		viewbtn.click();
	}

}
