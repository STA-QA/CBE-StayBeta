Feature: Manage Booking through Different Data Sources 

Scenario: Login 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	
Scenario Outline: Book Though Different Data Sources 

	Given User Selects any agency 
	And Click on Hotel Menu 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Exclude dorm beds 
	And Select Rooms And Number of guests 
	And Select Hotel <Data Source> 
	And Click Search Button 
	When User Searches with a <HotelSearchString>and Selects a <Hotel> 
		And Clicks on Add to cart 
		And Clicks on Complete Booking 
	And Clicks On Book Radio Button 
		And Accepts the Terms and Conditions 
		And Provides the Person details 
		And Click on Book Button 
		Then Booking has been done successfully 
	
	
	Examples: 
		|Country|CountrySearchString|Start Day||Duration Of Stay|Data Source|Guests|
		|Buenos Aires (BUE), Argentina (AR)|BUE|2||1|Tourico|1|
		
		Scenario: Cancel Booking By Searching BRN from My Bookings 
		
		Given User Clicks on My Bookings 
		And Clicks on Search Booking 
		And Enters the search parameter 
			And Selects the Related Booking 
			And Click on Continue Booking 
		And Click on Cancel Item 
			And Accepts the Terms and Conditions 
		And Click On Update 
		
		
		
		
		
		
		
 