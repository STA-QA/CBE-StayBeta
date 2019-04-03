Feature: Verify the Hotel Search results info when search doesn't fetch reults

Scenario: Login into Application 

	Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	
	
Scenario: User Navigates to Hotel Page 

	Given User Selects any agency 
	Then Click on Hotel Menu 
	
Scenario Outline: User Searches for hotel through <Data Source> 

	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Exclude dorm beds 
	And Select Number of <Rooms> 
	And Select Hotel <Data Source> 
	And Click Search Button
	Then Verify the SuccessWithInfo Message
	
	Examples: 
		|Country                                         |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source|
		|Buenos Aires (BUE), Argentina (AR)|	BUE                        |2            |55                      |1        |Tourico        |

Scenario: User Logs out of application and closes Browser

	Given User clicks On Logout
	Then User should be logged out and driver is closed	
			