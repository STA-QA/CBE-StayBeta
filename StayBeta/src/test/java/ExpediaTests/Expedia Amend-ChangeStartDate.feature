Feature: Hotel booking and Amend by Changing the Start Date - Expedia Rapid

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
	And Click On Insurance Details
	And Click On save in Additional info box
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file
	Given User clicks On Logout 
	Then User should be logged out and driver is closed 
	
	
	
	
	Examples: 
	|Country                          |CountrySearchString|Data Source      |Start Day|Duration Of Stay|Rooms|Adults   |Children|ChildrenAge|
	|London (LON), United Kingdom (GB)|	LON               |Expedia Rapid Package    |100      |2               |1    |1        |0       |0	        |
	
Scenario: Amend Booking By Searching BRN from My Bookings 
Given User launches the application 
	And User enters Valid Credentials 
	Then User logged into application 
	And User Selects any agency 
	Given User Clicks on My Bookings 
	And User Enters Booking Refnumber
	And Clicks on Complete Booking 
	And Select Amend this item Option 
	And Fetch the From date and move it few days further 
	#Hardcoded to change 1 day further
	And Click Search Button 
	And Click on Add to Cart 
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions
	And Click On Insurance Details
	And Click On save in Additional info box 
	And Click on Update button 