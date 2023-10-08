Feature: Hit Get Request and Validate response
  
Scenario: Validate response for Users
    Given Fetch the details of Users
    Then Check Response Body
    And Validate response code as 200
    And Validate response line as "HTTP/1.1 200 OK"
    And Validate response time less than  3000
    And Validate header type as "application/json; charset=utf-8"
    And Validate server type as "cloudflare"
    
Scenario Outline: Validate response for perticular 
		Given Fetch the details of <user>
		Then Check Response Body
		And Validate response code as 200
    And Validate response line as "HTTP/1.1 200 OK"
    And Validate response time less than  3000
    And Validate header type as "application/json; charset=utf-8"
    And Validate server type as "cloudflare"
Examples:
    |user|
    |1|
    |2|
    |3|
    |4|
    |5|
    |6|
    |7|
    
    
    

  
