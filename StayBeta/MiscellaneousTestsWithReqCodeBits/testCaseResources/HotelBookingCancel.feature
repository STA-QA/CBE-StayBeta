Feature: Cancelling a Hotel Booking By Retrieving latest Booking 

Scenario: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	
Scenario Outline: User Book a hotel through <Data Source> 

	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Exclude dorm beds 
	And Select Number of <Rooms> 
	And Select Hotel <Data Source> 
	And Click Search Button
	And Clicks on Add to cart on a hotel from search results 
	And Verify if Quote is selected by default 
	And Clicks On Book Radio Button 
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the <Guests> Details 
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	
	Examples: 
		|Country                                         |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source|Guests|
		|Buenos Aires (BUE), Argentina (AR)|	BUE                        |2            |1                      |1        |Tourico        |1        |
		
		
Scenario: Cancel Booking By Retrieving latest Booking

	Given User Clicks on My Bookings 
	And Clicks on Retrieve latest booking 
	And Clicks on Complete Booking 
	And User selects cancel item 
	And Accepts the Terms and Conditions 
	And Click on Update button
	Then Booking is Cancelled 
	
	
	