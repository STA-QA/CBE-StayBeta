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
	And Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
	And Select Number of Child Guests <Children> into <Rooms> in automatic order 
	And Enter the ChildrenAge <ChildrenAge> 
	And Select Hotel <Data Source> 
	And Click Search Button 
	And Clicks on Add to cart on a hotel from search results 
	And Check for Cancellation Condition <Condition> 
	And Verify if Quote is selected by default 
	And Clicks On Book Radio Button 
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge> 
	
	And Click on Book Button 
	Then Booking has been done successfully
	#Given User clicks On Logout
	#Then User should be logged out and driver is closed	
	
	Examples: 
		|Country                           |CountrySearchString|Data Source      |Start Day|Duration Of Stay|Rooms|Adults   |Children|ChildrenAge|Condition|
		|Cape Town (CPT), South Africa (ZA)|	CPT            |Expedia Affiliate - Package Rate|10       |6               |3    |2,3,1    |2,1,1   |5,6,7,8	   |Ignore   |
		
		
		
		
		
		#|New York (NYC), United States (US)	|	NYC             |15       |5               |1    |Tourico         |2        |0		|Outside|
		
		
		
		
	