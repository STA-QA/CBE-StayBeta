Feature: Amending Hotel Booking through Searching Booking from the list 

Scenario: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	
	
Scenario: Amend Booking By Searching BRN from My Bookings 

	Given User Clicks on My Bookings 
	And Clicks on Search Booking 
	And Enters the search parameter 
	And Selects the Related Booking 
	And Click on Continue Booking In Search
	And Select Amend this item Option
	
	
	