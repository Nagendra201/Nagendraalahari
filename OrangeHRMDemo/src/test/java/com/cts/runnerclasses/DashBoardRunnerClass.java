package com.cts.runnerclasses;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/OrangeHRMdemo.feature", plugin = { "pretty",
		"html:reports/cucumber-html-report" }, tags = {
				" @TC01_04" }, glue = { "com.cts.stepdefinition" }, monochrome = true)

public class DashBoardRunnerClass {

}
