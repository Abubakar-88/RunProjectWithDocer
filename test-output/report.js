$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login%20Functionality%20Verification.feature");
formatter.feature({
  "name": "Login Functionality Verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Landing Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.i_am_in_Landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.i_Click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be in Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.i_will_be_in_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Customer Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.click_Customer_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter User Id \"david@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.i_enter_User_Id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Password \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.i_enter_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.i_click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will see Customer Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Login_Functionality_Verification.i_will_see_Customer_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});