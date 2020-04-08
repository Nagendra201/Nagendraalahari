#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@OrangeHRM
Feature: OrangeHRM Website

  @TC01_0
 Scenario Outline: Login in the OrangeHRM Website
 	Given the user launch the chrome application
	When the user open the OrangeHRM Home page
	Then the user login using <username> and <password>
	And click on the login button user nagivate to the next page



    Examples: 
      | username  | password | status  |
      | name1 |     5 | success |
      
@TC01_0
 Scenario Outline: TC01_02Login in the OrangeHRM Website
 	Given TC01_02the user launch the chrome application
	When TC01_02the user open the OrangeHRM Home page
	Then TC01_02the user login using <username> and <password>
	Then TC01_02click on the login button user nagivate to the next page
	And TC01_02Using actions move to admin job categories from admin then move to next page
	And TC01_02click on professionals check box
	 Examples: 
      | username  | password | status  |
      | name1 |     5 | success |
@TC01_0
Scenario Outline: TC01_03Login in the OrangeHRM Website
 	Given TC01_03the user launch the chrome application
	When TC01_03the user open the OrangeHRM Home page
	Then TC01_03the user login using <username> and <password>
	And TC01_03click on the login button user nagivate to the next page
	Then TC01_03Using actions move to leave types from leaves then move to next page
	And TC01_03click on Add
	Then TC01_03wrote the leave type
	Then TC01_03click on save the user moves to next page
	 Examples: 
      | username  | password | status  |
      | name1 |     5 | success |
@TC01_0
Scenario Outline: TC01_04Login in the OrangeHRM Website
 	Given TC01_04the user launch the chrome application
	When TC01_04the user open the OrangeHRM Home page
	Then TC01_04the user login using <username> and <password>
	And TC01_04click on the login button user nagivate to the next page
	Then TC01_04click on Dashboard to move to the next page
	And TC01_04click on Timesheets
	Then TC01_04wrote the employee name
	Then TC01_04click on view the user moves to next page
	 Examples: 
      | username  | password | status  |
      | name1 |     5 | success |
@TC01_0
Scenario Outline: TC01_05Login in the OrangeHRM Website
 	Given TC01_05the user launch the chrome application
	When TC01_05the user open the OrangeHRM Home page
	Then TC01_05the user login using <username> and <password>
	And TC01_05click on the login button user nagivate to the next page
	Then TC01_05Using actions move to candidate records from maintenance then move to next page
	And TC01_05write verify passoword
	Then TC01_05click verify
	And TC01_05write the content in vacancy column
	Then TC01_05click on search button
	 Examples: 
      | username  | password | status  |
      | name1 |     5 | success |
@TC01_0
Scenario Outline: TC01_05Login in the OrangeHRM Website
 	Given TC01_06the user launch the chrome application
	When TC01_06the user open the OrangeHRM Home page
	Then TC01_06the user login using <username> and <password>
	And TC01_06click on the login button user nagivate to the next page
	Then TC01_06click on welcome admin
	And TC01_06click on about
	Then TC01_06click on logout the user moves to home page
	Examples: 
      | username  | password | status  |
      | name1 |     5 | success |