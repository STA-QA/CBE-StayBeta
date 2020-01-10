Feature: New Hotel Booking through Different Data Sources  through Adding hotel to cart from tabular results directly 

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
	When User verify the Search Results of <Data Source> 
	And Clicks on Add to cart on a hotel from search results 
	And Verify if Quote is selected by default 
	And Get the Cancellation Conditions from Shopping Cart Page
	And Clicks On Book Radio Button 
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the <Guests> Details 
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	
	Examples: 
		|Country                                         |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source|Guests|
		|Buenos Aires (BUE), Argentina (AR)|	BUE                        |4            |1                      |2        |Tourico        |2        |
#		|Buenos Aires (BUE), Argentina (AR)|	BUE                        |2            |1                      |1        |Tourico        |1        |
		
		
Scenario: User Logs out of application and closes Browser 

	Given User clicks On Logout 
	Then User should be logged out and driver is closed 
	
	
	
	
	
	
	