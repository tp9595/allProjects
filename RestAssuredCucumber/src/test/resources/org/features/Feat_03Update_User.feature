Feature: Update User and validate

Scenario: Upade User by using Excel data and validate Response
    Given Upadte the detail of "user"  
    Then Check Response Body
		Then Check Response Body
		And Validate response code as 200
    And Validate response line as "HTTP/1.1 200 OK"
    And Validate response time less than  3000
    And Validate header type as "application/json; charset=utf-8"
    And Validate server type as "cloudflare"
		


  
