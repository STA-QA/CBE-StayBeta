Feature: Amend a Hotel Booking By Retrieving latest Booking 


		
Scenario: Amend Booking By Searching BRN from My Bookings 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User Clicks on My Bookings 
	And Clicks on Retrieve latest booking 
	And Clicks on Complete Booking 
	And Select Amend this item Option 
	And Fetch the From date and move it few days further 
	And Click Search Button 
	And Click on Add to Cart 
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Click on Update button 
	
	