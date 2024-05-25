Feature: Login Functionality Verification

@smoke
Scenario: Login as a Customer
Given I am in Landing Home Page
When I click on Login menu
Then I am in the employee Login Page
And I click Customer Login menu
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login Button
Then I will see Customer Home Page
