Feature: Hotel Cost Quoting for few data sources 

@GB 
Scenario Outline: User validated Cost Quote and booked it for ref no GB <BookingRef>
	Given User launches the application 
	And User enters Valid Credentials 
		Then User logged into application 
	And User Selects any agency
	Given User Clicks on My Bookings 
	And Through scenario outline User Enters the BookingRefnumber <BookingRef>
	And Clicks on Complete Booking
	Given User clicks on Actions and selects validate Cost Quote
	And Clicks Book rb during changing from quote to book
	#Then Verify if the quote has been validated successfully
	And Accepts the Terms and Conditions 
And Click on Update button  
 Then Booking has been done successfully and Booking reference Text is stored in a file 

	
	Examples: 
 |BookingRef|
	|1556219|
	|1556222|
	
	@AU 
Scenario Outline: User validated Cost Quote and booked it for ref no AU <BookingRef>
	Given User launches the au application 
	And User enters Valid AU Credentials 
		Then User logged into application 
	And User Selects any agency
	Given User Clicks on My Bookings 
	And Through scenario outline User Enters the BookingRefnumber <BookingRef>
	And Clicks on Complete Booking
	Given User clicks on Actions and selects validate Cost Quote
	And Clicks Book rb during changing from quote to book
	#Then Verify if the quote has been validated successfully
	And Accepts the Terms and Conditions 
And Click on Update button  
 Then Booking has been done successfully and Booking reference Text is stored in a file 

	
	Examples: 
    |BookingRef|
	|1556224|
	|1556226|
	
	
	
#		| Country                            | CountrySearchString | Data Source     | Start Day | Duration Of Stay | Rooms | Adults | Children | ChildrenAge | Condition | 
#		| Cape Town (CPT), South Africa (ZA) | CPT                 | followme2AFRICA | 100        | 6                | 1     | 2      | 0        | 0           | Outside    | 
#		
#		Then User logged into application 
#	And User Selects any agency 
#	Given User is in the Hotel Search Page 
#	And Search for a <Country> with particular <CountrySearchString> 
#	And Select the <Start Day> and <Duration Of Stay> 
#	And Select Number of Rooms <Rooms> 
#	And Select Number of Adult Guests <Adults> into <Rooms> in automatic order 
#	And Select Number of Child Guests <Children> into <Rooms> in automatic order 
#	And Enter the ChildrenAge <ChildrenAge> 
#	And Deselect SelectAll DataSources 
#	And Select DataSource <Data Source> 
#	And Exclude On Request Rooms 
#	And Click Search Button 
#	And Clicks on Add to cart on a hotel from search results 
#	And Check for Cancellation Condition <Condition>
#	And Clicks on Add to cart on a hotel from search results 
#	And Verify if Quote is selected by default
#	And Add the screenshot of the Hotel Cancellation Conditions to Report 
#	And Clicks on Complete Booking 
#	And Accepts the Terms and Conditions 
#	And Provides the Adults <Adults> Details and <Children> details with <ChildrenAge> 
#	And Click on Book Button 
#	Then Booking has been done successfully and Booking reference Text is stored in a file 
#	Given User Clicks on My Bookings 
#	And User Enters Booking Refnumber  