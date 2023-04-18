Feature: Login Functionality Verification

@smoke
Scenario Outline: Login as a Customer 
Given I am using "<browser>" browser
When I am in Landing Home Page
Then I Click on Login
Then I will be in Login Page
And Click Customer Login
Then I enter User Id "david3@gmail.com"
And I enter Password "12343"
When I click Login Button
Then I will see Customer Home Page
