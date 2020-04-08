package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.BasePage;

public class AdminJobCategories extends BasePage {
	WebDriver driver;
	@FindBy(linkText = "Admin")
	WebElement admin;
	@FindBy(linkText  = "Job")
	WebElement job;
	@FindBy(linkText  = "Job Categories")
	WebElement jobcategory;
	@FindBy(xpath = "//input[@type='checkbox' and @name=\"chkSelectRow[]\" and @value=\"2\"]")
	WebElement professionals;

	public AdminJobCategories(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;

	}
	public void admin() {
	//on mouse move to admin then goto job then click job category.	
		Actions action = new Actions(driver);
		action.moveToElement(admin).perform();
		action.moveToElement(job).perform();

		Actions seriesofactions = action.moveToElement(jobcategory).click();
		seriesofactions.build().perform();
	}
	public void professionals() {
		
		professionals.click();
	}
}
