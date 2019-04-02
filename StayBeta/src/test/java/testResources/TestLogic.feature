Feature: New Hotel Booking through Different Data Sources through LB

Scenario Outline: Login into Application 

	Given User launches the application 
	And User enters Valid <Username> and <password>
	Then User logged into application 
    Given User clicks On Logout
	Then User should be logged out and driver is closed
	
Examples:
|Username|password|
|gbzq4|1srzq4|