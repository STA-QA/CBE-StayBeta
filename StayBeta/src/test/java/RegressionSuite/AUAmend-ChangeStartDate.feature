Feature: Hotel booking and Amend by Changing the Start Date inside Cancellation Period

@AU
Scenario Outline: User Book a hotel through <Data Source> and Change itinerary through Amend Option
	Given User launches the au application 
	And User enters Valid AU Credentials
	Then User logged into application 
	And User Selects any agency 
	Given User is in the Hotel Search Page 
	And Search for a <Country> with particular <SearchString> 
	And Select the <StartDay> and <NoOfNights> 
	And Select Number of Rooms <Rooms> 
	And Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
	And Select Number of Child Guests <Children> into <Rooms> in automatic order 
	And Enter the ChildrenAge <ChildrenAge> 
	And Deselect SelectAll DataSources 
	And Select DataSource <DataSource> 
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
	Given User Clicks on My Bookings 
	And User Enters Booking Refnumber  
	And Clicks on Complete Booking 
	And Select Amend this item Option 
	And Select the <NewStartDay> and <NewNoOfNights>
	And Click Search Button 
	And Click on Add to Cart
	And Clicks on Complete Booking
	And Takes The Screenshot And Add to Report	
	And Accepts the Terms and Conditions
	And Click On Details icon during amendments  
	And Click on Update button
	And Takes The Screenshot And Add to Report 
	Then Get updated Booking Details
	
	Examples: 
	|Country                             |SearchString|DataSource         |StartDay|NoOfNights|Rooms|Adults|Children|ChildrenAge|Condition	|NewStartDay|NewNoOfNights|
	|Sydney (SYD), Australia (AU)| SYD          |Sunlover Australia | 20        | 3            | 1      | 2      | 0        | 0            | Outside   |21		    |1            |
#	|Melbourne (MEL), Australia (AU)| MEL       | AOT AU              | 7          | 2           | 1      | 2      | 0        | 0            | Outside   |9            |2            |


	
	