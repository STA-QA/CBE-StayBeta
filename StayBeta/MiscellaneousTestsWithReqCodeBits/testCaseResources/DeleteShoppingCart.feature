Feature: Delete the Product from the shopping cart

Scenario: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	Given User Selects any agency 
	Then Click on Hotel Menu 

@mainTest
Scenario Outline: User try to Book a hotel through <Data Source> and delete it in the cart 

	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Exclude dorm beds 
	And Select Number of <Rooms> 
	And Select Hotel <Data Source> 
	And Click Search Button
	And Select a Random Hotel
	And Clicks on Add to cart
	And Click on Delete button
	Then Product should be deleted from cart
		
	
Examples: 
		|Country                                         |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source|Guests|
		|Buenos Aires (BUE), Argentina (AR)|	BUE                        |2            |1                      |2        |Tourico        |2        |
		

Scenario: User Logs out of application and closes Browser

	Given User clicks On Logout
	Then User should be logged out and driver is closed	