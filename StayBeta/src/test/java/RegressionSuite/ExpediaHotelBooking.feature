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
	And Deselect SelectAll DataSources 
	And Select DataSource <Data Source> 
	And User Click Search Button on Hotel Searchpage 
	And Clicks on Add to cart on a hotel from search results for Expedia 
	And Clicks On Book Radio Button
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions
	And Provides the Expedia Adults <Adults> Details and <Children> details with <ChildrenAge> 
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Given User clicks On Logout 
	Then User should be logged out and driver is closed 
	Then User confirms Booking
	
	
	
	Examples: 
		|Country                             |CountrySearchString|Data Source                |Start Day|Duration Of Stay|Rooms|Adults   |Children|ChildrenAge|pendingprocess |
		|London (LON), United Kingdom (GB)|	LON             |Expedia Affiliate - Package Rate|100         |2                     |1        |1         |0         |0	     |Book|
		
	
		
		
		

		
		
		
		
	