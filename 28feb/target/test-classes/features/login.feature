Feature: Test cases for login functionality

Scenario: Login into application
Given user open the application 
When user enter the username and password 
And user click on the login button
Then User navigated to home page

Scenario: Login with invalid credential
Given user open the application 
When user enter the username and password 
And user click on the login button
Then It shows the error message