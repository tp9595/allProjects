Feature: Test cases for login functionality

Scenario: Login into application
Given user is on login page
When user get the title of the page
Then page title should be "Swag Labs"


Scenario: Login into correct crendials
Given user is on login page
When click on username "standard_user"
And click on password  "secret_sauce"
And user click on thelogin buton
Then user gets the title of the home page 
And page title should be "Swag Labs"