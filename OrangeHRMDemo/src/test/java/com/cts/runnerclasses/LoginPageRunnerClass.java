package com.cts.runnerclasses;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cts.baseclass.BasePage;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/OrangeHRMdemo.feature", plugin = { "pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, tags = {
				" @TC01_01" }, glue = { "com.cts.stepdefinition" }, monochrome = true)

public class LoginPageRunnerClass extends BasePage {
	@AfterClass
	public static void extentreport() {
		Reporter.loadXMLConfig(prop.getProperty("extent-report(cucumber)"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "windows");
		Reporter.setTestRunnerOutput("all at one go output message");
	}

}
