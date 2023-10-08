Feature: Home page Feature

Background:
Given user has already logged in application
|username|password|
|standard_user|secret_sauce|

Scenario: Add to cart option
Given user is on the home page
When User click on tshirt

Then we can thshirt window

Scenario: Add to secondcart option
Given user is on the home page
When User click second tshirt
Then we can  second thshirt window