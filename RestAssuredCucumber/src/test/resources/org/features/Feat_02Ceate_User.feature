Feature:Create user and Validate 

Scenario:Create User and Validate Response Body
Given Create User with the help of POJO 
|name0|Pratik|
|UserName1|Shatgar|
|email2|pratik.shatgar@nag.com|
|street3|Solapur|
|suit4|apt123|
|city5|akkalkot|
|zipcode6|4005263|
|lat7|-37.3159|
|lan8|56.56|
|phone9|89563263|
|website10|www.gog.com|
|companyName11|nagarro|
|catchPhrase12|Multi-Layered|
|bs13|Harness|
Then Check Response Body
And Validate response code as 201
And Validate response line as "HTTP/1.1 201 Created"
And Validate response time less than  3000
And Validate header type as "application/json; charset=utf-8"
And Validate server type as "cloudflare" 