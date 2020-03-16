Feature: Hotel Amendment by changing the itinerary

@GB @Amend
Scenario Outline: User Book a hotel through <Data Source> and Change itinerary through Amend Option  <SC Name> for GB
	Given User launches the application 
	And User enters Valid Credentials 
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
    And Add the screenshot of the Hotel Cancellation Conditions to Report 
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
	|Country                                          |SearchString|DataSource           |StartDay|NoOfNights|Rooms|Adults|Children|ChildrenAge|Condition	     |NewStartDay|NewNoOfNights|SC name|
	| Cape Town (CPT), South Africa (ZA) | CPT            | followme2AFRICA | 32        | 3              | 1      | 2       | 2         |7,9            | Outside           | 31              |3                    |Amend NoOfNights|
	| Cape Town (CPT), South Africa (ZA) | CPT            | followme2AFRICA | 32        | 2              | 1      | 2       | 0         |0        		 | Outside           | 1                |2                    |Amend StartDate|
#	| Cape Town (CPT), South Africa (ZA) | CPT            | followme2AFRICA | 32        | 2              | 1      | 2       | 0         |0        		 | Outside           | 1                |2                    |Amend Date|
			

@AU @Amend
Scenario Outline: User Book a hotel through <Data Source> and Change itinerary through Amend Option for AU
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
    And Add the screenshot of the Hotel Cancellation Conditions to Report 
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
	| Cape Town (CPT), South Africa (ZA) | CPT            | followme2AFRICA | 32        | 2              | 1      | 2       | 0         |0        		 | Outside           | 1                |2                    |
	| Cape Town (CPT), South Africa (ZA) | CPT            | followme2AFRICA | 32        | 3              | 1      | 2       | 2         |7,9            | Outside           | 31              |3                    |
#	|Sydney (SYD), Australia (AU)| SYD          |STA | 20        | 3            | 1      | 2      | 0        | 0            | Outside   |21		    |1            |
#	|Melbourne (MEL), Australia (AU)| MEL       | AOT AU              | 23          | 2           | 1      | 2      | 0        | 0            | Outside   |9            |2            |
	
	
	
	
	
	