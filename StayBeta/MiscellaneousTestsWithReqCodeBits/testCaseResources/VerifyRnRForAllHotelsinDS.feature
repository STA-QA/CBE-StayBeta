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
	Then Verify if Reviews are present for each hotel
	And Verify if Ratings are present for each hotel
	
	Examples: 
		|Country                                         |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source|
		|Buenos Aires (BUE), Argentina (AR)|	BUE                        |2            |1                      |1        |Tourico        |
	
	