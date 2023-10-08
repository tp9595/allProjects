
Feature: Delete User

 Scenario Outline: Title of your scenario outline
    Given Delete <User>
    Then Check Response Body
    And Validate response code as 200
    And Validate response line as "HTTP/1.1 200 OK"
    And Validate response time less than  3000
    And Validate header type as "application/json; charset=utf-8"
    And Validate server type as "cloudflare"
   

 Examples: 
     |User|
     |1|
     |2|
     |3|
     |4|
     
