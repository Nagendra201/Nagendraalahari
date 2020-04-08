$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/OrangeHRMdemo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 36,
  "name": "TC01_02Login in the OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website;tc01-02login-in-the-orangehrm-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@TC01_02"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "TC01_02the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "TC01_02the user open the OrangeHRM Home page",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "TC01_02the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "TC01_02click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "TC01_02Using actions move to admin job categories from admin then move to next page",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "TC01_02click on professionals check box",
  "keyword": "And "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "orangehrm-website;tc01-02login-in-the-orangehrm-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ],
      "line": 44,
      "id": "orangehrm-website;tc01-02login-in-the-orangehrm-website;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ],
      "line": 45,
      "id": "orangehrm-website;tc01-02login-in-the-orangehrm-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 45,
  "name": "TC01_02Login in the OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website;tc01-02login-in-the-orangehrm-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@TC01_02"
    },
    {
      "line": 19,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "TC01_02the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "TC01_02the user open the OrangeHRM Home page",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "TC01_02the user login using name1 and 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "TC01_02click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "TC01_02Using actions move to admin job categories from admin then move to next page",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "TC01_02click on professionals check box",
  "keyword": "And "
});
formatter.match({
  "location": "SDAdminjobcatPage.tc0102the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 20358171500,
  "status": "passed"
});
formatter.match({
  "location": "SDAdminjobcatPage.tc0102the_user_open_the_orangehrm_home_page()"
});
formatter.result({
  "duration": 1217022700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name1",
      "offset": 28
    },
    {
      "val": "5",
      "offset": 38
    }
  ],
  "location": "SDAdminjobcatPage.tc0102the_user_login_using_and(String,String)"
});
formatter.result({
  "duration": 6274828200,
  "status": "passed"
});
formatter.match({
  "location": "SDAdminjobcatPage.tc0102click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 7306680100,
  "status": "passed"
});
formatter.match({
  "location": "SDAdminjobcatPage.tc0102using_actions_move_to_admin_job_categories_from_admin_then_move_to_next_page()"
});
formatter.result({
  "duration": 7527296600,
  "status": "passed"
});
formatter.match({
  "location": "SDAdminjobcatPage.tc0102click_on_professionals_check_box()"
});
formatter.result({
  "duration": 1456639800,
  "status": "passed"
});
});