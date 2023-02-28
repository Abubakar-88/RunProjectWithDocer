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
