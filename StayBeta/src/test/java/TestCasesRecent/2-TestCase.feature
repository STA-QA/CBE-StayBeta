Feature: Hotel booking - au for few data sources 


	
Scenario Outline: User Book a hotel through <Data Source> 

    Given User launches the au application
	And User enters Valid AU Credentials
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
		|Country                                       |CountrySearchString|Start Day|Duration Of Stay|Rooms|Data Source      |Guests|Children|Condition|
	#	|Sydney (SYD), Australia (AU)	|SYD                      |20            |2                      |1        |AOT AU - New   |2        |0           | Outside |
	#	|Bangkok (BKK), Thailand (TH)		|BKK						 |2			  |5						|1		  |Diethelm Travel		  |1			|0			|Inside		|
		|Anchorage, United States (US)|ANC					 |31			  |2                       |1       |Qantas             |2			|0         |Outside    |
		
		
		

					
		

	
	