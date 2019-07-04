Feature: Hotel booking - gb for few data sources


	
Scenario Outline: User Book a hotel through <Data Source> 

    Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <CountrySearchString> 
	And Select the <Start Day> and <Duration Of Stay> 
	And Select Number of Rooms <Rooms>
	And Select Number of Adults <Guests>
	And Select Number of Children <Children>
	And Select Hotel <Data Source> 
	And Click Search Button 
	And Clicks on Add to cart on a hotel from search results
	And Check for Cancellation Condition <Condition>
	And Verify if Quote is selected by default 
	And Clicks On Book Radio Button 
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the <Guests> and <Children> Details
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file
	Given User clicks On Logout
	Then User should be logged out and driver is closed	
	
	Examples: 
		|Country                                           |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source           |Guests|Children|Condition|
#		|New York (NYC), United States (US)	|	NYC                      |15            |5                      |1        |Tourico                 |2        |0|Outside|
		|Cape Town (CPT), South Africa (ZA)  	|	CPT                      |10            |6                      |1        |followme2AFRICA  |2        |2|Ignore|

		

	
	