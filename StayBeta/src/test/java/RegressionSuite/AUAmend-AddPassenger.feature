Feature: Hotel booking and Amend by Add Passengers to the booking

Scenario Outline: User Book a hotel through <Data Source>
	Given User launches the au application 
	And User enters Valid AU Credentials 
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
	And Exclude On Request Rooms 
	And Click Search Button 
	And Clicks on Add to cart on a hotel from search results 
	And Check for Cancellation Condition <Condition> 
	And Verify if Quote is selected by default 
	And Clicks On Book Radio Button
	And Clicks on Complete Booking 
	And Accepts the Terms and Conditions 
	And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge>
	And Click On Insurance Details
	And Click On save in Additional info box 
	And Click on Book Button 
	Then Booking has been done successfully and Booking reference Text is stored in a file 
	Given User clicks On Logout 
	Then User should be logged out and driver is closed 
	
	Examples: 
	|Country                         |CountrySearchString |Data Source           |Start Day|Duration Of Stay|Rooms|Adults  |Children  |ChildrenAge  |Condition	|
	|Singapore (SIN), Singapore (SG) | SIN                | Qantas Holidays CSG  | 40      | 2              | 1   | 2      | 0        | 0           | Outside   |
	
	
Scenario Outline: Add Passengers after Bookings 
	Given User launches the au application 
	And User enters Valid AU Credentials
	Then User logged into application 
	And User Selects any agency 
	Given User Clicks on My Bookings 
	And User Enters Booking Refnumber 
	And Clicks on Complete Booking 
	And Select Amend this item Option 
	And Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
	And Click Search Button 
	And Click on Add to Cart 
	And Clicks on Complete Booking 
	And Provied Amended Adults <Adults> Details and <Children> details with <ChildrenAge>	
	And Accepts the Terms and Conditions 
	And Click On Details icon during amendments	
	And Click on Update button
	And Takes The Screenshot And Add to Report 
	Then Get updated Booking Details
	Then User should be logged out and driver is closed
	
	
	Examples: 	
	| Rooms | Adults | Children | ChildrenAge | 
    | 1     | 3      | 0        | 0           |
   
	
	