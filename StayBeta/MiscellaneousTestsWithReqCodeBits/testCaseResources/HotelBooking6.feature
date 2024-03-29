Feature: New Hotel Booking through Different Data Sources by selecting a single room
               from the expanded room list randomly from Table Source

Scenario: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	
	
Scenario: User Navigates to Hotel Page 

	Given User Selects any agency 
	Then Click on Hotel Menu 
	
Scenario Outline: User Book a hotel through <Data Source> 

	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Exclude dorm beds 
	And Select Number of <Rooms> 
	And Select Hotel <Data Source> 
	And Click Search Button 
	And Expand room list of any hotel 
	And Select a room from the list and add to cart 
	And Verify if Quote is selected by default 
	And Clicks On Book Radio Button 
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the <Guests> Details 
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	
	
	Examples: 
		|Country                                         |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source|Guests|
		|Buenos Aires (BUE), Argentina (AR)|	BUE                        |2            |1                      |1        |Tourico        |1|
		
		
Scenario: User Logs out of application and closes Browser 

	Given User clicks On Logout 
	Then User should be logged out and driver is closed	