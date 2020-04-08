package com.cts.runnerclasses;

import org.junit.runner.RunWith;

import com.cts.baseclass.BasePage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature/OrangeHRMdemo.feature", plugin = { "pretty",
		"html:reports/cucumber-html-report" }, tags = {
				" @TC01_02" }, glue = { "com.cts.stepdefinition" }, monochrome = true)

public class AdminjobcatPageRunnerClass extends BasePage {

}
